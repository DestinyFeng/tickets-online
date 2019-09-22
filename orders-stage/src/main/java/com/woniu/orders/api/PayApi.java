package com.woniu.orders.api;

import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.Product;
import com.alipay.api.internal.util.AlipaySignature;
import com.woniu.orders.entity.Order;
import com.woniu.orders.service.AlipayService;
import com.woniu.orders.service.OrderService;
import com.woniu.orders.util.AlipayConfig;
import com.woniu.orders.util.Result;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-17 16:14
 **/
@Controller
@RequestMapping("pay")
public class PayApi {
    @Autowired
    private AlipayService alipayService;
    @Autowired
    private OrderService orderService;

    @PostMapping ("topay")
    @ResponseBody
    public String toPay(String oid) throws Exception {
        //跟据订单查询订单金额等
        System.out.println(oid);
        Order order = orderService.selectDatail(oid);
        //订单号
        String outTradeNo = oid;
        //订单金额
        String totalAmount = order.getMoney().toString();
        //商品名
        String subject = order.getMovieName()+"-订单号："+oid;
        String pay = alipayService.webPagePay(outTradeNo, totalAmount, subject);
        System.out.println(pay);
        return pay;
    }
    //这是异步通知
    @RequestMapping("alipay_callback")
    @ResponseBody
    public Object personal( HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("异步请求进来了");
               Map<String, String[]> aliParams = request.getParameterMap();
        //用以存放转化后的参数集合
        Map<String, String> conversionParams = new HashMap<String, String>();
	    for (Iterator<String> iter = aliParams.keySet().iterator(); iter.hasNext();) {
	        String key = iter.next();
	        String[] values = aliParams.get(key);
	        String valueStr = "";
	        for (int i = 0; i < values.length; i++) {
	            valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
	        }
	        // 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
	        // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "uft-8");
	        conversionParams.put(key, valueStr);
	    }

        System.out.println(conversionParams);
	     conversionParams.remove("sign_type");
        try {
            boolean alipayRSACheckedV2 = AlipaySignature.rsaCheckV2(conversionParams, AlipayConfig.ALIPAY_PUBLIC_KEY,"utf-8",AlipayConfig.SIGN_TYPE);

            if(!alipayRSACheckedV2){
                return "非法请求,验证不通过,再恶意请求我就报警找网警了";
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
            System.out.println("支付宝验证回调异常");

        }
         String serverResponse = alipayService.insertAliCallback(conversionParams);
        System.out.println(serverResponse);
        return serverResponse;
	}
	//退款
    @RequestMapping("refund")
    @ResponseBody
    public Result refund(String oid ,String refundReason) throws Exception {
        System.out.println(oid);
        System.out.println(refundReason);
        Order order = orderService.selectDatail(oid);
        String msg = alipayService.insertRefund(oid, refundReason, order.getMoney().toString(), "HZ01RF001");
        return new Result("200",msg,null,null);
    }


}

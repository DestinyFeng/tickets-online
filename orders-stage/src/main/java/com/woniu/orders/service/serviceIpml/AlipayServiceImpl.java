/**
 * FunName:  函数名
 * Description :   描述这个方法是干嘛的
 * Create Date:
 *
 * @exception Exception   异常没有处理
 * @param 参数名(如果没有删除改行)  参数说明
 * @return 返回值类型, 如没有, 删除该行 返回是否找到
 * @author LIUTAO
 */
package com.woniu.orders.service.serviceIpml;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.*;
/*import com.woniu.common.ServerResponse;*/
import com.sun.javafx.binding.StringConstant;
import com.woniu.orders.constant.Constant;
import com.woniu.orders.entity.Alipayinfo;

import com.woniu.orders.entity.Order;
import com.woniu.orders.mapper.AlipayinfoMapper;
import com.woniu.orders.service.AlipayService;
import com.woniu.orders.service.OrderService;
import com.woniu.orders.util.AlipayConfig;

import com.woniu.orders.util.AlipayConfig;
import com.woniu.orders.util.DateUtil;
import com.woniu.orders.util.Result;
import org.apache.tomcat.jni.Mmap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.net.URLDecoder;
import java.text.ParseException;
import java.util.Map;


@Service("alipayService")
public class AlipayServiceImpl implements AlipayService {
    @Autowired
    private OrderService orderService;

    @Autowired
    private AlipayinfoMapper alipayinfoMapper;

    /**
     * 调取支付宝接口 web端支付
     */
    DefaultAlipayClient alipayClient = new DefaultAlipayClient(
            AlipayConfig.GATEWAYURL, AlipayConfig.APP_ID, AlipayConfig.MERCHANT_PRIVATE_KEY, "json", AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGN_TYPE);

    /**
     * 调取支付宝接口app端支付
     */
    AlipayClient alipayClients = new DefaultAlipayClient(
            AlipayConfig.GATEWAYURL, AlipayConfig.APP_ID, AlipayConfig.MERCHANT_PRIVATE_KEY, "json", AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGN_TYPE);


    @Override
    public String webPagePay(String outTradeNo, String totalAmount, String subject) throws Exception {

        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        /** 同步通知，支付完成后，支付成功页面*/
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        /** 异步通知，支付完成后，需要进行的异步处理*/
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);


        alipayRequest.setBizContent("{\"out_trade_no\":\"" + outTradeNo + "\","
                + "\"total_amount\":\"" + totalAmount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"1235\","
                + "\"timeout_express\":\"90m\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        /**转换格式*/
        String result = alipayClient.pageExecute(alipayRequest).getBody().replace('\"', '\'').replace('\n', ' ');

        return result;
    }


    @Override
    public String insertRefund(String outTradeNo, String refundReason, String refundAmount, String outRequestNo) throws Exception {
        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();

        /** 调取接口*/
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + outTradeNo + "\","
                + "\"refund_amount\":\"" + refundAmount + "\","
                + "\"refund_reason\":\"" + refundReason + "\","
                + "\"out_request_no\":\"" + outRequestNo + "\"}");
        String result = alipayClient.execute(alipayRequest).getBody();
        //对返回数据进行解析
        Map map = (Map) JSONObject.parse(result);
        Map<String, String> map1 = (Map<String, String>) map.get("alipay_trade_refund_response");
        map1.put("sign", map.get("sign").toString());
        System.out.println(map1);
      /*  try {
            boolean alipayRSACheckedV2 = AlipaySignature.rsaCheckV2(map1, AlipayConfig.ALIPAY_PUBLIC_KEY, "utf-8", AlipayConfig.SIGN_TYPE);
            if (!alipayRSACheckedV2) {
                return "非法请求,验证不通过,再恶意请求我就报警找网警了";
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
            System.out.println("支付宝验证回调异常");

        }*/
        int i = 0;
        int out_trade_no = 0;
        if ("Success".equals(map1.get("msg"))) {
            Alipayinfo alipayinfo = new Alipayinfo();
            alipayinfo.setOutTradeNo(map1.get("out_trade_no"));
            alipayinfo.setTradeStatus((byte) Constant.OrderStatusEnum.ORDER_CLOSE.getCode());
            alipayinfo.setRefundFee(Double.parseDouble(map1.get("refund_fee")));
            alipayinfo.setGmtRefund(DateUtil.strToDate(map1.get("gmt_refund_pay")));
            i = alipayinfoMapper.updateByPrimaryKeySelective(alipayinfo);
            out_trade_no = orderService.updateStateByOid(map1.get("out_trade_no"), new Byte("40"));
        }

        if (i == 1 && out_trade_no == 1) {
            System.out.println("退款成功");
            return "退款成功";
        } else {
            return "退款失败";
        }

    }

    @Override
    public String query(String outTradeNo) throws AlipayApiException {
        AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest();
        /**请求接口*/
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + outTradeNo + "\"," + "\"trade_no\":\"" + "" + "\"}");
        /**转换格式*/
        String result = alipayClient.execute(alipayRequest).getBody();
        return result;
    }

    @Override
    public String close(String outTradeNo) throws AlipayApiException {
        AlipayTradeCloseRequest alipayRequest = new AlipayTradeCloseRequest();

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + outTradeNo + "\"," + "\"trade_no\":\"" + "" + "\"}");

        String result = alipayClient.execute(alipayRequest).getBody();

        return result;
    }

    @Override
    public String refundQuery(String outTradeNo, String outRequestNo) throws Exception {
        AlipayTradeFastpayRefundQueryRequest alipayRequest = new AlipayTradeFastpayRefundQueryRequest();

        /** 请求接口*/
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + outTradeNo + "\","
                + "\"out_request_no\":\"" + outRequestNo + "\"}");

        /** 格式转换*/
        String result = alipayClient.execute(alipayRequest).getBody();

        return result;
    }

    @Override
    public String insertAliCallback(Map<String, String> conversionParams) throws Exception {
        //logger.info("==================支付宝异步请求逻辑处理");
        //获取需要保存的数据
        String appId = conversionParams.get("app_id");//支付宝分配给开发者的应用Id
        String notifyTime = conversionParams.get("notify_time");//通知时间:yyyy-MM-dd HH:mm:ss
        String gmtCreate = conversionParams.get("gmt_create");//交易创建时间:yyyy-MM-dd HH:mm:ss
        String gmtPayment = conversionParams.get("gmt_payment");//交易付款时间
        /*String gmtRefund = conversionParams.get("gmt_refund_pay");//交易退款时间*/
        /*String gmtClose = conversionParams.get("gmt_close");//交易结束时间*/
        String tradeNo = conversionParams.get("trade_no");//支付宝的交易号
        String outTradeNo = conversionParams.get("out_trade_no");//获取商户之前传给支付宝的订单号（商户系统的唯一订单号）
        String outBizNo = conversionParams.get("out_biz_no");//商户业务号(商户业务ID，主要是退款通知中返回退款申请的流水号)
        String buyerLogonId = conversionParams.get("buyer_id");//买家支付宝账号
        String sellerId = conversionParams.get("seller_id");//卖家支付宝用户号
//       // String sellerEmail = conversionParams.get("seller_email");//卖家支付宝账号
        String totalAmount = conversionParams.get("total_amount");//订单金额:本次交易支付的订单金额，单位为人民币（元）
        String receiptAmount = conversionParams.get("receipt_amount");//实收金额:商家在交易中实际收到的款项，单位为元
        String invoiceAmount = conversionParams.get("invoice_amount");//开票金额:用户在交易中支付的可开发票的金额
        String buyerPayAmount = conversionParams.get("buyer_pay_amount");//付款金额:用户在交易中支付的金额
        String tradeStatus = conversionParams.get("trade_status");// 获取交易状态

        //支付宝官方建议校验的值（out_trade_no、订单号，total_amount，金额、sellerId，卖家支付宝用户号、app_id）
        Order order = orderService.selectDatail(outTradeNo);
        System.out.println(order.getMoney());
        System.out.println(order.getMoney().toString());
        System.out.println(totalAmount.equals(String.valueOf(order.getMoney())));

        if (order != null && totalAmount.equals(order.getMoney().toString()) && AlipayConfig.APP_ID.equals(appId)) {
            //修改数据库支付宝订单表(因为要保存每次支付宝返回的信息到数据库里，以便以后查证)
            Alipayinfo alipayinfo = new Alipayinfo();
            alipayinfo.setNotifyTime(DateUtil.strToDate(notifyTime));
            alipayinfo.setGmtCreate(DateUtil.strToDate(gmtCreate));
            alipayinfo.setGmtPayment(DateUtil.strToDate(gmtPayment));
            /* alipayinfo.setGmtRefund(DateUtil.strToDate(gmtRefund));*/
            /*alipayinfo.setGmtClose(DateUtil.strToDate(gmtClose));*/
            alipayinfo.setTradeno(tradeNo);
            alipayinfo.setOutTradeNo(outTradeNo);
            alipayinfo.setOutBizno(outBizNo);
            alipayinfo.setBuyerLogonId(buyerLogonId);
            alipayinfo.setSellerId(sellerId);
            /* alipayinfo.setSellerEmail(sellerEmail);*/
            alipayinfo.setTotalAmount(Double.parseDouble(totalAmount));
            alipayinfo.setReceiptAmount(Double.parseDouble(receiptAmount));
            alipayinfo.setInvoiceAmount(Double.parseDouble(invoiceAmount));
            alipayinfo.setBuyerPayAmount(Double.parseDouble(buyerPayAmount));
            switch (tradeStatus) // 判断交易结果
            {
                case "TRADE_FINISHED": // 交易结束并不可退款
                    alipayinfo.setTradeStatus((byte) 30);
                    break;
                case "TRADE_SUCCESS": // 交易支付成功
                    alipayinfo.setTradeStatus((byte) 20);
                    break;
                case "TRADE_CLOSED": // 未付款交易超时关闭或支付完成后全额退款
                    alipayinfo.setTradeStatus((byte) 0);
                    break;
                case "WAIT_BUYER_PAY": // 交易创建并等待买家付款
                    alipayinfo.setTradeStatus((byte) 10);
                    break;
                default:
                    break;
            }

            int returnResult = this.updateByPrimaryKey(alipayinfo);    //更新交易表中状态
            orderService.updatebyOid(alipayinfo.getOutTradeNo(), alipayinfo.getTradeStatus(), returnResult);
            if (tradeStatus.equals("TRADE_SUCCESS")) {    //只处理支付成功的订单: 修改交易表状态,支付成功
                if (returnResult > 0) {
                    System.out.println(2);
                    return "success";
                } else {
                    System.out.println(3);
                    return "fail";
                }
            } else {
                System.out.println(4);
                return "fail";
            }
        } else {
            System.out.println(5);
            return "fail";

        }
    }

    //返回支付信息id
    private int updateByPrimaryKey(Alipayinfo alipayinfo) {
        return alipayinfoMapper.insert(alipayinfo);
    }


    @Override

    public String appPagePay(String outTradeNo, String totalAmount, String subject) throws Exception {
        AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();

        /** 同步通知，支付完成后，支付成功页面*/
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        /** 异步通知，支付完成后，需要进行的异步处理*/
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        /**销售产品码（固定）*/
        String productCode = "QUICK_WAP_WAY";

        /** 进行赋值 */
        AlipayTradeWapPayModel wapPayModel = new AlipayTradeWapPayModel();
        wapPayModel.setOutTradeNo(outTradeNo);
        wapPayModel.setSubject(subject);
        wapPayModel.setTotalAmount(totalAmount.toString());
        wapPayModel.setBody("商品名称");
        wapPayModel.setTimeoutExpress("2m");
        wapPayModel.setProductCode(productCode);
        alipayRequest.setBizModel(wapPayModel);

        /** 格式转换*/
        String result = alipayClients.pageExecute(alipayRequest).getBody().replace('\"', '\'').replace('\n', ' ');
        return result;
    }


}



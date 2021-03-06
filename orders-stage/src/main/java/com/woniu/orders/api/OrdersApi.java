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
package com.woniu.orders.api;

import com.woniu.orders.constant.Constant;
import com.woniu.orders.entity.Order;
import com.woniu.orders.entity.User;
import com.woniu.orders.service.OrderService;
import com.woniu.orders.util.Page;
import com.woniu.orders.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("profile/orders")
public class OrdersApi {
    //查询用户所有订单
    @Autowired
    private OrderService orderService;
    //创建订单
    @RequestMapping("confirm")
    @ResponseBody
    public  Result createOrders (String seat[],Integer msid,HttpSession session) throws Exception {
//     User user =(User)session.getAttribute("user");
//     user.getId();
     if (seat.length<=0||msid==null){
         return new Result("500","选座失败",null,null);
     }
        String orderId = orderService.insertCreateOrders(seat, 1, 2);

        return new Result("500","选座成功","/web/profile/detail.html?oid="+orderId,null);


    }
    @GetMapping
    @ResponseBody
    public Result selectOrders(Integer uid, Integer pageIndex) throws Exception {
        System.out.println(pageIndex);
        if (pageIndex ==null){
            pageIndex=1;
        }
        List<Order> orders = orderService.selectOrder(1, pageIndex);
        int count = orderService.selectCount(1);
        Page page = new Page();
        page.setDataCount(count);
        page.setPageCount(count%Constant.Page.PAGE_DISPLAYED.getpageData()==0?count/Constant.Page.PAGE_DISPLAYED.getpageData():count/Constant.Page.PAGE_DISPLAYED.getpageData()+1);
        page.setPageIndex(pageIndex);
        Result result = new Result("200","success",page,orders);
        return result;
    }


    //查看订单详情
    @RequestMapping("detail")
    //根据订单号参看详情
    @ResponseBody
    public Result  detail( String oid) throws Exception {

        Order order = orderService.selectDatail(oid);
        return new Result("200",null,order,null);
    }
    //用户删除订单，改变数据库字段，不物理删除，方便统计数据
    @DeleteMapping
    @ResponseBody
    public Result  del(String oid) throws Exception {
        if (oid==null){
            return new Result("500","删除失败",null,null);
        }
        int i = orderService.deleteByOid(oid);
        if(i==1){
              return new Result("200","删除成功",null,null);
        }
       return new Result("500","删除失败",null,null);
    }
}
  

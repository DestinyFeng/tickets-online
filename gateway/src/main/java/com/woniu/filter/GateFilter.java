package com.woniu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.woniu.entity.User;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
public class GateFilter extends ZuulFilter {
    @Override
    //定义该过滤器的执行时机
    public String filterType() {
        return "pre";
    }

    @Override
    //定义该过滤器在多个过滤器之间的执行顺序（数字越小优先级越高）
    public int filterOrder() {
        return 0;
    }

    @Override
    //是否启用该过滤器
    public boolean shouldFilter() {
        return true;
    }

    @Override
    //编写过滤逻辑
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        //获取request
        HttpServletRequest request = context.getRequest();
        //获取session
        HttpSession session = request.getSession();
        User user=new User();
        user.setId(1);
        user.setUsername("xiaoming");
        session.setAttribute("user",user);
        //登录验证信息可以存入session中
        //可以通过下述代码响应错误信息
        //requestContext.setSendZuulResponse(false);
        //requestContext.setResponseBody("{\"code\":\"500\",\"message\":\"no login\"}");
        return null;
    }
}

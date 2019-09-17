package com.woniu.exception;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class GlobalException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        //判断异常的类型
        if(e instanceof UnknownAccountException){
            //用户名不存在
            modelAndView.setViewName("login");
            modelAndView.addObject("message", "用户名不存在");
        }else if(e instanceof IncorrectCredentialsException){
            //密码错误
            modelAndView.setViewName("login");
            modelAndView.addObject("message", "密码错误");
        }else{
            modelAndView.setViewName("500");
            modelAndView.addObject("message", "服务器异常，请稍后再试");
        }
        return modelAndView;
    }
}

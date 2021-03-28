package com.yangjun.springboot.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yangjun6
 * @date 2021-03-28 21:54
 */
public class MyHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截器拦截未登录的用户，不能随便切换其他页面
        Object loginSession = request.getSession().getAttribute("login");
        if(loginSession == null){
            request.setAttribute("msg","请先登录");
            //重定向
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        }else {
            return true;
        }
    }
}

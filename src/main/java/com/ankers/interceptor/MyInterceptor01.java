package com.ankers.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyInterceptor01 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("=====preHandle");
        String uri = request.getRequestURI();
        String query = request.getQueryString();
        String ip = request.getRemoteAddr();
        String method = request.getMethod();
        String cookie = request.getHeader("Cookie");
        String sessionId = request.getSession().getId();
        String userAgent = request.getHeader("User-Agent");
        System.out.println("query: " + query + "\nip" + ip + " \nmethod: " + method + "\nuri: " + uri + "\ncookie: " + cookie + "\nsessionId: " + sessionId + "\nuserAgent: " + userAgent);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("=====postHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("=====afterCompletion");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}

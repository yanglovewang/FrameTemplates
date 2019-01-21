package com.yang.springboottest.config.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * springboot 测试拦截器案例
 * 注意：修改拦截器项目要重新启动
 */
@Component
public class MyInterceptor implements HandlerInterceptor  {

    private Logger log = LoggerFactory.getLogger(MyInterceptor.class);

    /**
     *请求处理前调用
     * 返回true才做后续操作
     *
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRequestURI());
        log.info("loging = {}");
        return false;
    }

    /**
     *
     * 请求处理后，视图处理前调用
     * 可以对ModelAndVeiw进行处理
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    /**
     * 要在preHandle放回true调用
     * DispatcherServlet 渲染了对应的视图之后执行。用于进行资源清理
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}

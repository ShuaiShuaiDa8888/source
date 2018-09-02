package com.weishuai.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * 使用AOP统一处理Web请求日志（请求任意的controller即可）
 * 放开注释
 * Created by WS on 2018/9/2.
 */
@Aspect
@Component
public class WebLogAspect {

//    private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
//
//    /**
//     * 定义切点Pointcut
//     * 第一个*号：表示返回类型， *号表示所有的类型
//     * 第二个*号：表示类名，*号表示所有的类
//     * 第三个*号：表示方法名，*号表示所有的方法
//     * 后面括弧里面表示方法的参数，两个句点表示任何参数
//     */
////    @Pointcut("execution(public * com.weishuai.controller.*.*(..))")
//    public void webLog() {
//    }
//
//    @Before("webLog()")
//    public void doBefore(JoinPoint joinPoint) throws Throwable {
//        // 接收到请求，记录请求内容
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        // 记录下请求内容
//        logger.info("URL : " + request.getRequestURL().toString());
//        logger.info("HTTP_METHOD : " + request.getMethod());
//        logger.info("IP : " + request.getRemoteAddr());
//        Enumeration<String> enu = request.getParameterNames();
//        while (enu.hasMoreElements()) {
//            String name = (String) enu.nextElement();
//            logger.info("name:{},value:{}", name, request.getParameter(name));
//        }
//    }
//
//    @AfterReturning(returning = "ret", pointcut = "webLog()")
//    public void doAfterReturning(Object ret) throws Throwable {
//        // 处理完请求，返回内容
//        logger.info("RESPONSE : " + ret);
//    }

}


package com.web.listener;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * @Author: HayLi pwx520500
 * @Date: 2021/7/21 21:48
 */
@WebListener
public class MyContextListener implements ServletContextListener {
    private static final Logger logger = LoggerFactory.getLogger(MyContextListener.class);
    public static final String INIT_CONTEXT = "Content  created in servlet Context";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("ContextInitialized in");
        // 这里在容器初始化时，往 ServletContext 上下文设置了参数名称为 INITIAL_CONTENT，可以全局直接访问。
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("content", INIT_CONTEXT);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("Destroy servlet Context");
    }
}

package com.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.String.format;

/**
 * @Author: HayLi pwx520500
 * @Date: 2021/7/21 22:41
 */

/**
 * 配置 @WebServlet 注解用于注册这个 Servlet，@WebServlet 注解的 各个参数 分别对应 web.xml 中的配置：
 *
 * <servlet-mapping>
 *     <servlet-name>IndexHttpServlet</servlet-name>
 *     <url-pattern>/index/IndexHttpServlet</url-pattern>
 * </servlet-mapping>
 * <servlet>
 *     <servlet-name>IndexHttpServlet</servlet-name>
 *     <servlet-class>io.ostenant.springboot.sample.servlet.IndexHttpServlet</servlet-class>
 *     <init-param>
 *         <param-name>createdBy</param-name>
 *         <param-value>Icarus</param-value>
 *     </init-param>
 *     <init-param>
 *         <param-name>createdOn</param-name>
 *         <param-value>2018-06-20</param-value>
 *     </init-param>
 * </servlet>
 *
 */
@WebServlet(name = "MyServlet",
        displayName = "MyServlet",
        urlPatterns = {"/index/MyServlet"},
        initParams = {
                @WebInitParam(name = "createdBy", value = "pdemo"),
                @WebInitParam(name = "createdOn", value = "2018-06-20")
        }
)
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.getWriter().println(format("Created by %s", getInitParameter("createdBy")));
        resp.getWriter().println(format("Created on %s", getInitParameter("createdOn")));
        resp.getWriter().println(format("Servlet context param: %s",
                req.getServletContext().getAttribute("content")));
    }

}

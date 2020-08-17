package com.itheima.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(value = "/*",initParams={@WebInitParam(name = "encoding",value = "UTF-8")})
public class CharacterEncodingFilter implements Filter {

    private FilterConfig filterConfig;

    /**
     * 初始化方法，获取过滤器的配置对象
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        //1.定义和协议相关的请求和响应对象
        HttpServletRequest request ;
        HttpServletResponse response;
        try{
            //2.把参数转换成协议相关的对象
            request = (HttpServletRequest)req;
            response = (HttpServletResponse)resp;
            //3.获取配置的字符集
            String encoding = filterConfig.getInitParameter("encoding");
            //4.设置请求参数的字符集
            request.setCharacterEncoding(encoding);
            //5.设置响应对象输出响应正文时的字符集
            response.setContentType("text/html;charset=UTF-8");
            //6.放行
            chain.doFilter(request,response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        //可以做一些清理操作
    }
}

package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("/S/*")
public class filter3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String username = (String) ((HttpServletRequest) servletRequest).getSession().getAttribute("username");
        if ("admin".equals(username)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            servletResponse.setContentType("text/html;charset=UTF-8");
            servletResponse.getWriter().write("对不起权限不足，无法登陆。2秒后跳转到登陆页面");
            ((HttpServletResponse) servletResponse).setHeader("Refresh","2,URL=/Test3/index.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}

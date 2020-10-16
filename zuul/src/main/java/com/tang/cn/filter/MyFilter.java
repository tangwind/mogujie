package com.tang.cn.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tangchaochao
 * @create 2020-2020-10-15 15:22
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        request.getParameter("");
        requestContext.setSendZuulResponse(false);
        requestContext.setResponseStatusCode(500);
        return "redirect:9090/doc.html";
    }
}

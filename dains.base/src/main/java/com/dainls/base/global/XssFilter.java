package com.dainls.base.global;

import java.io.IOException;

import javax.servlet.Filter; 
import javax.servlet.FilterChain; 
import javax.servlet.FilterConfig; 
import javax.servlet.ServletException; 
import javax.servlet.ServletRequest; 
import javax.servlet.ServletResponse; 
import javax.servlet.http.HttpServletRequest; 


import org.springframework.http.client.support.HttpRequestWrapper;

public class XssFilter implements Filter{
	
	public FilterConfig filterConfig;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig=filterConfig; 
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		chain.doFilter(request, response);

		
	}

	@Override
	public void destroy() {
		 filterConfig=null; 
		
	} 

}

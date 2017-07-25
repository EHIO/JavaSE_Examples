package behavior.chainofresponsibility.impl;

import chainofresponsibility_责任链.Filter;
import chainofresponsibility_责任链.Request;
import chainofresponsibility_责任链.Response;


public class HTMLFilter implements Filter {


	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		 request.setRequestStr(request.getRequestStr().replace("<", "[").replace(">", "]"));
		 request.requestStr += "-----HTMLFilter";
		chain.doFilter(request, response, chain);
		response.responseStr += "-----HTMLFilter";
	}

}

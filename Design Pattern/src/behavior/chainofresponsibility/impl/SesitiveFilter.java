package behavior.chainofresponsibility.impl;

import chainofresponsibility_责任链.Filter;
import chainofresponsibility_责任链.Request;
import chainofresponsibility_责任链.Response;


public class SesitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequestStr(request.getRequestStr().replace("潜规则", "***"));
		request.requestStr += "-----SesitiveFilter";
		chain.doFilter(request, response, chain);
		response.responseStr += "-----SesitiveFilter";
	}
}

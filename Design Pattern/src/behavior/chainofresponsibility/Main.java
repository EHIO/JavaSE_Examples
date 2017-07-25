package behavior.chainofresponsibility;

import chainofresponsibility_责任链.impl.FilterChain;
import chainofresponsibility_责任链.impl.HTMLFilter;
import chainofresponsibility_责任链.impl.SesitiveFilter;

public class Main {
	public static void main(String[] args) {
		String msg = "大家好:)，<script>，敏感，潜规则，网络授课没感觉，因为看不见大家伙儿";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("神的旨意。不容质疑");
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SesitiveFilter());
		
		fc.doFilter(request, response, fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}
	
	
}

package behavior.chainofresponsibility.impl;


import behavior.chainofresponsibility.Filter;
import behavior.chainofresponsibility.Request;
import behavior.chainofresponsibility.Response;

public class SesitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setRequestStr(request.getRequestStr().replace("潜规则", "***"));
        request.requestStr += "-----SesitiveFilter";
        chain.doFilter(request, response, chain);
        response.responseStr += "-----SesitiveFilter";
    }
}

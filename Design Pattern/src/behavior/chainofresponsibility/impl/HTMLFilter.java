package behavior.chainofresponsibility.impl;


import behavior.chainofresponsibility.Filter;
import behavior.chainofresponsibility.Request;
import behavior.chainofresponsibility.Response;

public class HTMLFilter implements Filter {


    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setRequestStr(request.getRequestStr().replace("<", "[").replace(">", "]"));
        request.requestStr += "-----HTMLFilter";
        chain.doFilter(request, response, chain);
        response.responseStr += "-----HTMLFilter";
    }

}

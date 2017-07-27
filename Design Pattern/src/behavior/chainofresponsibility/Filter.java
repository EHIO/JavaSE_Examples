package behavior.chainofresponsibility;


import behavior.chainofresponsibility.impl.FilterChain;

/**
 * 过滤器
 *
 * @author wg
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain chain);

}

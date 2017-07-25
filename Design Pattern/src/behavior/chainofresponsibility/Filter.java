package behavior.chainofresponsibility;

import chainofresponsibility_责任链.impl.FilterChain;

/**
 * 过滤器
 * @author Administrator
 *
 */
public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}

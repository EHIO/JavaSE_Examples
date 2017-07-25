package org.wg.generic.p3;

/*
 * 泛型类：把泛型定义在类上
 */
public class ObjectTool<W> {
	private W obj;

	public W getObj() {
		return obj;
	}

	public void setObj(W obj) {
		this.obj = obj;
	}
	
	/**
	 * 当方法静态时，不能访问类上定义的泛型。如果静态方法使用泛型，
	 * 只能将泛型定义在方法上。 
	 * @param obj
	 */
	public static <T> void method(T obj){
		System.out.println("method:"+obj);
	}
}

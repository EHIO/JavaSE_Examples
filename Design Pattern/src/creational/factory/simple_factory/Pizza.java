package creational.factory.simple_factory;

import java.util.ArrayList;

public abstract class Pizza {
	/** 名称 */
	String name;
	/** 面团类型 */
	String dough;
	/** 酱料类型 */
	String sauce;
	/** 一套佐料 */
	ArrayList toppings = new ArrayList();

	public String getName() {
		return name;
	}

	/**
	 * 准备
	 */
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}

	/**
	 * 烘烤
	 */
	public void bake() {
		System.out.println("在350度的温度下烤25分钟" );
				
	}

	/**
	 * 切片
	 */
	public void cut() {
		System.out.println("把披萨切成斜片");
	}

	/**
	 * 装盒
	 */
	public void box() {
		System.out.println("披萨装在官方匹萨商店盒子");
	}

}

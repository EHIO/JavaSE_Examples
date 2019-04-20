package demo;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式。
 * <p>
 * 正则表达式用于操作字符串数据。
 * 通过一些特定的符号来体现的。
 * 所以我们为了掌握正则表达式，必须要学习一些符号。
 * <p>
 * 虽然简化了，但是阅读性差。
 */
public class RegexDemo {

	public static void main(String[] args) {
//		functionDemo1();
//		functionDemo2();
//		functionDemo3();
		functionDemo4();
	}

	/**
	 * 获取
	 * 将正则规则进行对象的封装。
	 * Pattern p = Pattern.compile("a*b");
	 * 通过正则对象的matcher方法字符串相关联。获取要对字符串操作的匹配器对象Matcher .
	 * Matcher m = p.matcher("aaaaab");
	 * 通过Matcher匹配器对象的方法对字符串进行操作。
	 * boolean b = m.matches();
	 */
	public static void functionDemo4() {

		String str = "da jia hao,ming tian bu fang jia!";

		String regex = "\\b[a-z]{3}\\b";

		//1,将正则封装成对象。
		Pattern p = Pattern.compile(regex);
		//2, 通过正则对象获取匹配器对象。
		Matcher m = p.matcher(str);

		//使用Matcher对象的方法对字符串进行操作。
		//既然要获取三个字母组成的单词
		//查找。 find();
		System.out.println(str);
		while (m.find()) {
			System.out.println(m.group());//获取匹配的子序列

			System.out.println(m.start() + ":" + m.end());
		}
	}

	/**
	 * 替换
	 */
	public static void functionDemo3() {

		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";

		str = str.replaceAll("(.)\\1+", "$1");

		System.out.println(str);

		String tel = "15800001111";//158****1111;

		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");

		System.out.println(tel);
	}

	/**
	 * 切割。
	 * <p>
	 * 组：((A)(B(C)))
	 */
	public static void functionDemo2() {

		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";

		String[] names = str.split("(.)\\1+");

		for (String name : names) {
			System.out.println(name);
		}
	}

	/**
	 * 演示匹配。
	 */
	public static void functionDemo1() {
		//匹配手机号码是否正确。
		String tel = "15800001111";
		String regex = "1[358]\\d{9}";
		boolean b = tel.matches(regex);
		System.out.println(tel + ":" + b);
	}
}


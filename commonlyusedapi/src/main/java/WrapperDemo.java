
public class WrapperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 基本数据类型对象包装类。
		 * 为了方便操作基本数据类型值，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作。
		 * 用于描述该对象的类就称为基本数据类型对象包装类。
		 *
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 *
		 * 该包装对象主要用基本类型和字符串之间的转换。
		 *
		 * 基本类型--->字符串
		 * 		1,基本类型数值+""
		 * 		2,用String类中的静态方法valueOf(基本类型数值);
		 * 		3,用Integer的静态方法valueO(基本类型数值);
		 *
		 * 字符串--->基本类型
		 * 		1,使用包装类中的静态方法   xxx parseXxx("xxx类型的字符串");*****
		 * 			int parseInt("intstring");
		 * 			long parseLong("longstring");
		 * 			boolean parseBoolean("booleanstring");
		 * 			只有Character没有parse方法
		 * 		2,如果字符串被Integer进行对象的封装。
		 * 			可使用另一个非静态的方法，intValue();
		 * 			将一个Integer对象转成基本数据类型值。
		 *
		 *
		 */


//		System.out.println(Integer.MAX_VALUE);

//		System.out.println(Integer.toBinaryString(-6));

//		int num = 4;
//		Integer i = new Integer(5);

//		int x = Integer.parseInt("123");
//		System.out.println(Integer.parseInt("123")+1);

//		Integer i = new Integer("123");
//		System.out.println(i.intValue());


		/*
		 * 整数具备不同的进制体现。
		 *
		 * 十进制-->其他进制。
		 * 		toBinaryString
		 * 		toOctalString
		 * 		toHexString
		 *
		 * 其他进制-->十进制。
		 * 		parseInt("string",radix)
		 *
		 */

//		十进制-->其他进制。
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));


//		System.out.println(Integer.toString(60,16));
//		其他进制-->十进制。
//		System.out.println(Integer.parseInt("3c",16));


		Integer a = new Integer("89");
		Integer b = new Integer(300);

		System.out.println(a==b);

		System.out.println(a.equals(b));

//		System.out.println(3>3);
		System.out.println(a.compareTo(b));



	}


	public static void demo2(String[] args) {

		int num = 4;
		num = num + 5;

		Integer i =  4;//i = new Integer(4);自动装箱  简化书写。
		i = i + 6;// i = new Integer(i.intValue() + 6); //i.intValue() 自动拆箱


//		show(55);//


		Integer a = new Integer(128);
		Integer b = new Integer(128);

		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true

		Integer x = 129;//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
		Integer y = 129;
		System.out.println(x==y);//
		System.out.println(x.equals(y));//true


	}

	public static void show(Object a){//Object a = new Integer(55);
		System.out.println("a="+a);
	}
}
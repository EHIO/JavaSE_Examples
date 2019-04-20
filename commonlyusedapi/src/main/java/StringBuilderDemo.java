public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
			/*
		 * jdk1.5以后出现了功能和StringBuffer一模一样的对象。就是StringBuilder
		 *
		 * 不同的是：
		 * StringBuffer是线程同步的。通常用于多线程。
		 * StringBuilder是线程不同步的。通常用于单线程。 它的出现提高效率。
		 *
		 * jdk升级：
		 * 1，简化书写。
		 * 2，提高效率。
		 * 3，增加安全性。
		 */



	}

	public static String arrayToString_2(int[] arr){

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				sb.append(arr[i]+", ");
			else
				sb.append(arr[i]+"]");
		}
		return sb.toString();
	}

	/**
	 * 将一个int数组变成字符串。
	 */
	public static String arrayToString(int[] arr){

		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				str+=arr[i]+", ";
			else
				str+=arr[i]+"]";
		}

		return str;
	}

}
/*

class StringBuffer jdk1.0
{
	object lock;
	public   StirngBuffer append(int x)
	{
		synchronized(lock)
		{
		}
	}
	
	
	public synchronized StringBuffer delete(int start,int end)
	{
		synchronized(lock)
		{
		}
	}
}









*/


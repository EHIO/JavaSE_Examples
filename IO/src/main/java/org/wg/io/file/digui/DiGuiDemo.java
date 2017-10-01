package org.wg.io.file.digui;

public class DiGuiDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

		/*
         * �ݹ飺 ��������ֱ�ӻ��߼�ӵĵ��õ�������
		 * 
		 * һ�������ڱ��ظ�ʹ�ã���ÿ��ʹ��ʱ����������Ľ������һ�ε����йء� ��ʱ�����õݹ���������⡣
		 * 
		 * 
		 * ע�⣺ 1���ݹ�һ����ȷ��������������ջ����� 2��ע��һ�µݹ�Ĵ�����
		 * 3:���췽�����ܵݹ�ʹ��
		 */
        // show();
        // toBin(6);
        int sum = getSum(9000);

        System.out.println(sum);
    }

    public static int getSum(int num) {

        int x = 9;
        if (num == 1)
            return 1;

        return num + getSum(num - 1);

    }

    public static void toBin(int num) {
        if (num > 0) {

            toBin(num / 2);
            System.out.println(num % 2);

        }
    }

	/*
	 * public static void show(){
	 * 
	 * method();
	 * 
	 * } public static void method(){ show(); }
	 */

}

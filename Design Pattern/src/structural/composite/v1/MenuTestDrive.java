package structural.composite.v1;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("����ݲ˵�", "���");
		MenuComponent dinerMenu = new Menu("�����˵�", "���");
		MenuComponent dessertMenu = new Menu("���˵�", "���!");

//		����һ�����Ĳ˵�		
		MenuComponent allMenus = new Menu("���в˵�", "���в˵����");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		
		dinerMenu.add(new MenuItem("��ʳBLT", "(Fakin)������˺���������ȫ��", true, 2.99));
		dinerMenu.add(new MenuItem("�ȹ�", "һ���ȹ�,saurkraut����ֵ�,���,���������", false, 3.05));
		
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("ƻ����", "ƻ���ɷ����ĵؿ�,������ݱ����", true, 1.59));
		
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}

package behavior.iterator.example_v2;

public class MenuTestDrive {
	public static void main(String[] args) {
		//�������ֲ˵�
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		//����Ů�д�
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
	}

}


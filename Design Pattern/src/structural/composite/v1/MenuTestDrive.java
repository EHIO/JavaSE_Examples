package structural.composite.v1;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("煎饼屋菜单", "早餐");
		MenuComponent dinerMenu = new Menu("餐厅菜单", "午餐");
		MenuComponent dessertMenu = new Menu("甜点菜单", "甜点!");

//		创建一个最顶层的菜单		
		MenuComponent allMenus = new Menu("所有菜单", "所有菜单组件");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		
		dinerMenu.add(new MenuItem("素食BLT", "(Fakin)培根生菜和西红柿在全麦", true, 2.99));
		dinerMenu.add(new MenuItem("热狗", "一个热狗,saurkraut津津乐道,洋葱,上面加奶酪", false, 3.05));
		
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("苹果派", "苹果派疯疯癫癫的地壳,加上香草冰淇淋", true, 1.59));
		
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}

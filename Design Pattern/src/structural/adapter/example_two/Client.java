package structural.adapter.example_two;

public class Client {
	public static void main(String[] args) {
        // ʹ����ͨ������  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request(); 
        // ʹ�����⹦���࣬��������  
		Target adapter = new Adapter();
		adapter.request();
	}
}

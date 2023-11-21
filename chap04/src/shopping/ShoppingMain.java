package shopping;

public class ShoppingMain {

	public static void main(String[] args) {
		
		Customer me = new Customer();
		me.id = "qwerty";
		me.name = "dkdkd";
		me.email = "dasfafa";
		me.address = "어쩌구 ";
		me.mileage = 123;
		
		me.print();
		
		Customer Friend = new Customer("adasd", "adasd", "afsa", "dasadas", 1);
	
		Friend.print();
	}

}

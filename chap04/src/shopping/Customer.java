package shopping;

public class Customer {
	String id;
	String name;
	String email;
	String address;
	int mileage;

	public Customer() {
		
	}
	
	public Customer(String id, String name, String email, String address, int mileage) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mileage = mileage;
	}

	public void print() {
		System.out.println("ID : " + this.id);
		System.out.println("NAME : " + this.name);
		System.out.println("E-MAIL : " + this.email);
		System.out.println("ADDRESS : " + this.address);
		System.out.println("POINT : " + this.mileage);
	}

	

	void setMileage(int mileage) {
		this.mileage = mileage;
	}

}

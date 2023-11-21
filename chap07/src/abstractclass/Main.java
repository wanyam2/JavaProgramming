package abstractclass;

public class Main {
	
	public static void main(String[] args) {
		car myCar = new car();
		
		myCar.tires[0] = new HankookTire();
		myCar.tires[1] = new HankookTire();
		myCar.tires[2] = new HankookTire();
		myCar.tires[3] = new HankookTire();
		
		myCar.run();
		
		myCar.tires[0] = new HankookTire();
		myCar.tires[1] = new HankookTire();
		myCar.tires[2] = new GumhoTire();
		myCar.tires[3] = new GumhoTire();
		
		myCar.run();
	}
}

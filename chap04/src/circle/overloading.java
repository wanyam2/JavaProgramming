package circle;

public class overloading {
	public static void main(String[] args) {
		
		MethodSample ms = new MethodSample();
		
		System.out.println(ms.getSum(1,  2));
		System.out.println(ms.getSum(1, 2, 3));
		System.out.println(ms.getSum(1.12, 1.34));
		System.out.println(ms.getSum(123.2, 12.4));
	}

}

package staticex;

public class Main {

	public static void main(String[] args) {
//		Calc calc = new Calc();
//		
//		System.out.println(calc.max(10, 20));
//		System.out.println(calc.min(10, 20));
		
		System.out.println(Calc.max(10, 20));
		Calc.enable = true;
		
		Calc calc = new Calc();
		calc.value = 100;
		
		Calc calc2 = new Calc();
		calc2.value = 200;
		
		System.out.println(calc.value);
		System.out.println(Calc.value);
		
		calc.print();
		calc.printStatic();

	}

}

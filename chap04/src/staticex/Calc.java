package staticex;

public class Calc {
	
	static boolean enable;
	static int value;
	int other; // 객체가 만들어질 때 생성 
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int min (int a, int b) {
		return (a > b) ? b : a;
	}
	
	
	public void print() {
		System.out.println(this.enable);
		System.out.println(this.value);
		System.out.println(this.other); // 객체가 본인을 가리키는 참조 변수 this. 객체가 있어야만 사용 가능
	}
	
	public static void printStatic() { // 객체가 만들어지기 이전에 사용가능 
		System.out.println(enable);
		System.out.println(value);
		//System.out.println(other);
	}
	
	
}

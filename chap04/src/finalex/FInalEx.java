package finalex;

public class FInalEx {
	int normal;
	final int finalValue; // 1. 한 번만 초기화 하는 방식
	
	final static int STATIC_FINAL_VALUE = 100; // 2. 처음부터 초깃값을 주는 방식 (단점 : 값이 고정)
											   //다 대문자로 작성하면 상수라고 생각
		
	
	void f() {
		this.normal = 100;
//		this.finalValue = 20;
	}
	
	public FInalEx(final int normal, final int finalValue) { // 매개변수는 별 일 아니면 그냥 final을 붙인다
		this.normal = normal;
		this.finalValue = finalValue;
		// normal = 200;
	}
}

package abstractclass;

public abstract class animal {
	private String name;
	
	public animal(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public abstract void sound();

	// 추상 메소드를 포함한다면 추상 클래스여야 한다	
}
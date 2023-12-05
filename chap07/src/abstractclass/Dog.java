package abstractclass;

public class Dog extends animal {
//	private String type;
	
	public Dog(final String name) {
		super(name);
//		this.type = type;
	}

	@Override
	public void sound() {
		System.out.println(this.getName() + "멍");
	}
}

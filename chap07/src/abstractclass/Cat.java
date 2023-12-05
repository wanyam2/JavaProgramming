package abstractclass;

public class Cat extends animal {
//	private String type;
	
	public Cat(final String name) {
		super(name);
//		this.type = type;
	}

	@Override
	public void sound() {
		System.out.println(this.getName() + "냥");
	}
}

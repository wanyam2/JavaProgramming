package abstractclass;

public class Sheep extends animal {
//	private String type;
	
	public Sheep(final String name, final String type) {
		super(name);
//		this.type = type;
	}

	@Override
	public void sound() {
		System.out.println(this.getName() + "메에");
	}
}

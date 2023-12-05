package animal;

public class Cat {

public class Cat extends Animal {
	public Cat(final String name) {
		super(name);
		this.type = type;
	}
	
	@Override
	public void sound() {
		System.out.println(this.getName() + "가 야옹합니다.");
	}
}
}

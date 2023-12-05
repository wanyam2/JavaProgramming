package abstractclass;

public class animalMain {
	public static void main(String[] args) {
		
		Cat cat = new Cat("이로");
		Dog dog = new Dog("효종이");
		
		Person me = new Person("공노",2);
		me.addCompanion(cat);
		me.addCompanion(dog);
		
		me.SoundAll(null);
	}
}

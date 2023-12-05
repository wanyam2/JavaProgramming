package abstractclass;

public class Person {
	
	
	//1. 배열 생성 같이 진행
//	private animal[] companions = new animal[5];
	private animal[] companions;
	private int companionCount;
	
	
	//2. 배열은 생성자에서 생성
	public Person(final int count) {
		this.name = name;
		this.companions = new animal[count];
		this.companionCount = 0;
	}
	
	public void addCompanion(final animal animal) {
		// aniaml을 삽입할 위치를 알아야함
		this.companions[this.companionCount]= animal;
		this.companionCount++;
	}
	
	public void SoundAll(final String name) {
		for(int i = 0; i < this.companionCount; i++) {
			animal comapanion = this.companions[i];
			companion.sound();
			
			
		}
	}
}

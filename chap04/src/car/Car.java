package car;

public class Car {
	// 멤버 변수는 private을 사용하는 것이 원칙
	private int speed;
	private boolean stop;
	
	public int getSpeed() { // getter
		return speed;
	}
	
	public void setSpeed(int speed) { // setter
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() { // getter 
		return stop; // 지금 상태가 stop임? 이라고 물어보는거라 더 코드가 예뻐짐
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

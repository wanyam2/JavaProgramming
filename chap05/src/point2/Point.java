package point2;

public class Point {
	protected int x;
	protected int y;
	
	
	
	public Point() {
		System.out.println();
	}
	public Point (final int x, final int y) {
		System.out.println("Point Full 생성자 호출");
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+ x + ", " + y + ")");
	}
}


package point3;

import point2.Point;

public class ColorPoint extends Point  {
	private String color;
	
	public ColorPoint() {
		super(); // 생성자의 첫 번째 문장으로만 나타날 수 있다
		System.out.println("ColorPoint 생성자 호출");
	}
	
	public ColorPoint(final int x, final int y, final String color) {
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint Full 생성자 호출");
		
	}
	void setColor(final String color) {
		this.color = color;
	}
	
	void set(final int x, final int y, final String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	void showColorPoint() {
		System.out.println(color + ",");
		showPoint();
	}
}

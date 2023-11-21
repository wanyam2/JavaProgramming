package object;

public class Point {
	private int x;
	private int y;
	
	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", "+ y + ")";
	}
	
	// @Override
	public boolean equals(Point point) {
		if (this.x == point.x && this.y == point.y) {
			return true;
		} else {
			return false;
		}
			
	}
}

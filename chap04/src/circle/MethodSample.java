package circle;

public class MethodSample {
	
	//method overloading
	int getSum(int i, int j) {
		return i + j;
	}
	
	int getSum(int i, int j, int k) {
		return i + j + k;
	}
	
	double getSum(double i, double j) {
		System.out.println("getSum double");
		return i + j;
	}
	
	double getSum(int i, int j) {
		System.out.println("getSum int double");
		return i + j;
	}
}

package OOPReview;

public class OOPReview2 {

	private final double PI = 3.141593;
	
	public double area(int a ) {
		double result = a * a* PI;
		return result;
		
	}
	public double area(int a, int b ) {
		double result = a * b;
		return result;
	}
	public double area(int a , int b, int c) {
		double result = (double) (a+ b)*c /2;
		return result;
	}
	
	public static void main(String[] args) {
		OOPReview2 ac = new OOPReview2();
		System.out.println("원의 넓이 : " + ac.area(3));
		System.out.println("사각형의 넓이 : " + ac.area(4, 5));
		System.out.println("사다리꼴의 넓이 : " + ac.area(3, 4, 7));
		
		
	}
}

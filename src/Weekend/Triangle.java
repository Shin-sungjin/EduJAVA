package Weekend;

public class Triangle extends Shape{
	private int under;
	private int high;
	
	public Triangle(int a, int b) {
		this.under =a;
		this.high =b;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double calculateArea() {
		double result = (under * high) / 2;
		return result;
	}
	
}

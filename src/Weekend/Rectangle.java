package Weekend;

public class Rectangle extends Shape{
	//Rectangle 클래스는 가로와 세로의 길이를 멤버 변수로 가지며, calculateArea() 메서드를 구현하여 사각형의 면적을 계산합니다.
	double x;
	double y;
	
	public Rectangle(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	
	}

	@Override
	double calculateArea() {
		double result = x * y;
		return result;
	}
}

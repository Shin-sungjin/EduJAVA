package Weekend;

public class Circle extends Shape{

	//Circle 클래스는 반지름을 멤버 변수로 가지며, calculateArea() 메서드를 구현하여 원의 면적을 계산합니다.
	private int r;
	private final double PI = 3.14;
	
	Circle(int r){
		this.r = r;
	}
	
	@Override
	double calculateArea() {
		double result = r * r * PI;
		return result;
	}

}

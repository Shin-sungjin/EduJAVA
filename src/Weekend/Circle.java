package Weekend;

public class Circle extends Shape{

	//Circle Ŭ������ �������� ��� ������ ������, calculateArea() �޼��带 �����Ͽ� ���� ������ ����մϴ�.
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

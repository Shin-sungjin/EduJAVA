package Weekend;

public class Rectangle extends Shape{
	//Rectangle Ŭ������ ���ο� ������ ���̸� ��� ������ ������, calculateArea() �޼��带 �����Ͽ� �簢���� ������ ����մϴ�.
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

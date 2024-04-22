package OOPReview;

public class OOPReview1 {
// ��ü ���� ����� ���������ڸ� �����ϴ� ��
// ��� �������� �������� ���°� �ƴ϶�� private�� ���
// �������� ���� ���� ��κ� ������� (���� ��)

	double base = 5.0;
	double height = 3.5;

	//�޼����� ���������ڷ� private�� �� ������ �幰��. 
	
	public double getArea() {
		double area= (base * height) / 2;
		return  area;
	}
	
	public double getHypotenuse() {
		double result = Math.sqrt(base* base + height * height);
		return result;
	}
	
	public double getPerimeter() {
		double result = base + height + getHypotenuse();
		return result;
		
	}
	
	
	// ��� ������ �޼���� ������� �����
	// ���� ���ο��� ���ؾ� ��?
	public static void main(String[] args) {
		OOPReview1 orv1 = new OOPReview1();
		System.out.println(orv1.getArea());
		System.out.println(orv1.getHypotenuse());
		System.out.println(orv1.getPerimeter());
	}
	
	
}

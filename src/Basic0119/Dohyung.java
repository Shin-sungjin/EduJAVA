package Basic0119;

public interface Dohyung {
	final double PI = 3.14; //���
	void draw(); //������ �׸��� �߻� �޼ҵ�
	double getArea(); //������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() { //����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}
	


//public interface Dohyung {
//final double PI = 3.14; //���
//void draw(); //������ �׸��� �߻� �޼ҵ�
//double getArea(); //������ ������ �����ϴ� �߻� �޼ҵ�
//default public void redraw() { //����Ʈ �޼ҵ�
//	System.out.print("--- �ٽ� �׸��ϴ�. ");
//	draw();
//}
//}

//public static void main(String[] args) {
//	Dohyung donut=new Circle(10); // �������� 10�� �� ��ü
//	donut.redraw();
//	System.out.println("������ "+donut.getArea());
//}
//
//--���--
//������ �׸�����! �������� 10�� ���� �׸���!.
//������ 314
//									  //���� = �������̽� 
//1. ���� �������� �����Ͽ� �������̽� Dohyung�� ������ Ŭ���� Circle�� �ۼ��غ�����
//
//2. Circle Ŭ���� �ۼ��� �Ϸ�Ǹ� �簢���� ������ ���ϴ� Rectangle Ŭ������ �����غ�����
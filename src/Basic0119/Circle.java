package Basic0119;

public class Circle implements Dohyung{

	private int r;
	private double size; //area;
	
	Circle(int a){
		 this.r = a;
		 draw();
	}
	
	@Override
	public void draw() {
		System.out.printf("������ �׸��� ��! �������� %s�� ���� �׸���.", r);
		System.out.println();
	}

	@Override
	public double getArea() {
		size = r * r * PI;
		return size;
	}

	public static void main(String[] args) {
		Dohyung donut=new Circle(10); // �������� 10�� �� ��ü
		donut.redraw();
		System.out.printf("������ %.0f", donut.getArea());
	}

}





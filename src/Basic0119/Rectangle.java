package Basic0119;

public class Rectangle implements Dohyung{

	private int  y;
	private int  x;
	private int size;
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
		draw();
		
	}
	@Override
	public void draw() {
		System.out.printf("������ �׸��� ��! ���ΰ� %s�̰� ���ΰ� %s�� �׸� �׸���.", x, y);
		System.out.println();
		
	}

	@Override
	public double getArea() {
		size = x*y;
		return size;
	}
	
	public static void main(String[] args) {
		Dohyung Rec=new Rectangle(10, 10); // �������� 10�� �� ��ü
		Rec.redraw();
		System.out.printf("������ %.0f", Rec.getArea());
	}
	
	
}

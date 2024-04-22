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
		System.out.printf("도형을 그리는 중! 가로가 %s이고 세로가 %s인 네모를 그린다.", x, y);
		System.out.println();
		
	}

	@Override
	public double getArea() {
		size = x*y;
		return size;
	}
	
	public static void main(String[] args) {
		Dohyung Rec=new Rectangle(10, 10); // 반지름이 10인 원 객체
		Rec.redraw();
		System.out.printf("면적은 %.0f", Rec.getArea());
	}
	
	
}

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
		System.out.printf("도형을 그리는 중! 반지름이 %s인 원을 그린다.", r);
		System.out.println();
	}

	@Override
	public double getArea() {
		size = r * r * PI;
		return size;
	}

	public static void main(String[] args) {
		Dohyung donut=new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.printf("면적은 %.0f", donut.getArea());
	}

}





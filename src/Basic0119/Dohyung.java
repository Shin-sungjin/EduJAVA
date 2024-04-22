package Basic0119;

public interface Dohyung {
	final double PI = 3.14; //상수
	void draw(); //도형을 그리는 추상 메소드
	double getArea(); //도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { //디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
	


//public interface Dohyung {
//final double PI = 3.14; //상수
//void draw(); //도형을 그리는 추상 메소드
//double getArea(); //도형의 면적을 리턴하는 추상 메소드
//default public void redraw() { //디폴트 메소드
//	System.out.print("--- 다시 그립니다. ");
//	draw();
//}
//}

//public static void main(String[] args) {
//	Dohyung donut=new Circle(10); // 반지름이 10인 원 객체
//	donut.redraw();
//	System.out.println("면적은 "+donut.getArea());
//}
//
//--출력--
//도형을 그리는중! 반지름이 10인 원을 그린다!.
//면적은 314
//									  //구현 = 인터페이스 
//1. 위의 실행결과를 참고하여 인터페이스 Dohyung를 구현한 클래스 Circle을 작성해보세요
//
//2. Circle 클래스 작성이 완료되면 사각형의 면적을 구하는 Rectangle 클래스도 구현해보세요
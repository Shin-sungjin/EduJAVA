package OOPReview;

public class OOPReview1 {
// 객체 지향 설계시 접근제어자를 지정하는 법
// 멤버 변수들은 전역에서 쓰는게 아니라면 private를 사용
// 전역에서 쓰는 경우는 대부분 상수형태 (고정 값)

	double base = 5.0;
	double height = 3.5;

	//메서드의 접근제어자로 private이 올 이유는 드물다. 
	
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
	
	
	// 멤버 변수랑 메서드는 어찌어찌 썼느데
	// 정작 메인에서 뭘해야 함?
	public static void main(String[] args) {
		OOPReview1 orv1 = new OOPReview1();
		System.out.println(orv1.getArea());
		System.out.println(orv1.getHypotenuse());
		System.out.println(orv1.getPerimeter());
	}
	
	
}

package Oop0109;

public class MethodOverExam {

	static double find_max ( double a, double b) {
		double result = (a > b) ? a : b;
		return result;
	}
	
	static int find_max ( int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
	
	// OverLoading 은 리턴타입에 영향을 받지 않는다. 
	static double find_max ( double a, int b) {
		double result = (a > b) ? a : b;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//퀴즈 
		// 임의의 변수 a,b 에는 정수나 실수가 입력 될 수 있음 
		// 두 변수 중 큰 값을 출력하는 메서드 find_max ㄹ를 만들어 ㅂ세요. 
		double a = 564.1123;
		double b = 563.1123445;
		int c = 10;
		int d = 50;
		System.out.println(MethodOverExam.find_max(a, b));
		System.out.println(MethodOverExam.find_max(c, d));
		System.out.println(MethodOverExam.find_max(c, a));
		
			
	
	}
}

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
	
	// OverLoading �� ����Ÿ�Կ� ������ ���� �ʴ´�. 
	static double find_max ( double a, int b) {
		double result = (a > b) ? a : b;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� 
		// ������ ���� a,b ���� ������ �Ǽ��� �Է� �� �� ���� 
		// �� ���� �� ū ���� ����ϴ� �޼��� find_max ���� ����� ������. 
		double a = 564.1123;
		double b = 563.1123445;
		int c = 10;
		int d = 50;
		System.out.println(MethodOverExam.find_max(a, b));
		System.out.println(MethodOverExam.find_max(c, d));
		System.out.println(MethodOverExam.find_max(c, a));
		
			
	
	}
}

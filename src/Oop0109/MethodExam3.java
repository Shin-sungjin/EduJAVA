package Oop0109;

public class MethodExam3 {
	
	static int sum(int num1, int num2) {
			int result = 0;   //���� ����   //local Variable
			for (int i = num1; i<= num2; i++ ) {
				result += i;
			}
		return result;
	}
	
	public static void main(String[] args) {
		
		
		// Method ���� ����� ���
		//a���� b������ ���� ���ϴ� �ڵ�
//		int result = 0;
//		int a= 1;
//		int b = 10;
//		for (int i = a; i<= b; i++ ) {
//			result += i;
//		}
		MethodExam3 me = new MethodExam3();
		System.out.println(me.sum(1, 10));
		System.out.println(MethodExam3.sum(1, 10));
	}
	
}

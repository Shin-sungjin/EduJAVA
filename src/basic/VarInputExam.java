package basic;            

import java.util.Scanner;

public class VarInputExam {
	public static void main(String[] args) {
		
		//����ڷκ��� ���� 2���� �Է¹޾� �� ���� ��Ģ ������ ��� 
		Scanner sc = new Scanner(System.in) ;
		System.out.println("ù ��° ���ڸ� �Է����ּ���.");
		int num1;
		num1 = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ���");
		int num2;
		num2 = sc.nextInt();
		 
		System.out.println( num1 + num2);
		System.out.println( num1 - num2);
		System.out.println( num1 * num2);
		System.out.println( num1 / num2);
	}
}



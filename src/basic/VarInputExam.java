package basic;            

import java.util.Scanner;

public class VarInputExam {
	public static void main(String[] args) {
		
		//사용자로부터 숫자 2개를 입력받아 두 수의 사칙 연산을 계산 
		Scanner sc = new Scanner(System.in) ;
		System.out.println("첫 번째 숫자를 입력해주세요.");
		int num1;
		num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요");
		int num2;
		num2 = sc.nextInt();
		 
		System.out.println( num1 + num2);
		System.out.println( num1 - num2);
		System.out.println( num1 * num2);
		System.out.println( num1 / num2);
	}
}



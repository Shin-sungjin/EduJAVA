package Wokr0125;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionWork {
	public static void main(String[] args) throws Exception{

		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� ���� ���� ����
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			
			try {
				input = new Scanner(System.in).nextInt();
			}
			catch (InputMismatchException e) {
				throw new SilsuException();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			

			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ��� .");
			} 
			else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ��� .");
			} 
			
			else {
				System.out.println("������ϴ� .");
				System.out.println("�õ�Ƚ���� " + count + "���Դϴ� .");
				break; // do-while���� �����
			}
		} while (true); 
		
	} 
}


class SilsuException extends Exception{
	
	SilsuException(){
		System.out.println("�Ǽ��� �Է��� �� ������");
	}
}
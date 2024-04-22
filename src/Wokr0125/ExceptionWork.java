package Wokr0125;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionWork {
	public static void main(String[] args) throws Exception{

		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			
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
				System.out.println("더 큰 수를 입력하세요 .");
			} 
			else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요 .");
			} 
			
			else {
				System.out.println("맞췄습니다 .");
				System.out.println("시도횟수는 " + count + "번입니다 .");
				break; // do-while문을 벗어난다
			}
		} while (true); 
		
	} 
}


class SilsuException extends Exception{
	
	SilsuException(){
		System.out.println("실수는 입력할 수 없서용");
	}
}
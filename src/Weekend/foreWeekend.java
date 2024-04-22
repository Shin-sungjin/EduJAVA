package Weekend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class waring extends Exception{
	waring(){
		
	}
}
class Operation {
//	문제: 사칙연산을 수행하는 계산기 프로그램을 작성해야 합니다. 
//	사용자로부터 두 개의 숫자와 연산자를 입력받아 계산 결과를 출력해야 합니다. 
//	예외 처리를 통해 0으로 나누는 경우를 처리해야 합니다.
//
//	요구사항:
//	사용자로부터 첫 번째 숫자, 연산자, 두 번째 숫자를 입력받아 계산 결과를 출력하는 계산기 프로그램을 작성해야 합니다.
//	입력한 연산자에 따라 덧셈, 뺄셈, 곱셈, 나눗셈 연산을 수행해야 합니다.
//	나눗셈 연산을 수행할 때, 두 번째 숫자가 0인 경우 ArithmeticException을 발생시켜야 합니다. 
//	이 경우 "0으로 나눌 수 없습니다!"라는 메시지를 출력하여 예외를 처리해야 합
	

	
	public  static double operation(int a, String b, int c) {
		
		double res = 0 ;
			//연산 결과가 이상하다
			switch(b){
				case("+"):
					res = a + c;
					break;
				case("-"):
					res = a - c;
					break;
				case("*"):
					res = a * c;
					break;
			
				case("/"):
					try {
						res = a / c;
						break;
					} catch (Exception e) {
						System.out.println("0으로 나눌 수 없습니다!");
					}
			}
			
		return res;
			
	}
		
}
public class foreWeekend{
	

	public static void main(String[] args) throws IOException, waring {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 =");
		int a = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 =");
		String cn = br.readLine();
		System.out.print("숫자 입력 =");
		int b = Integer.parseInt(br.readLine());
		
		Operation fix = new Operation();
		
		System.out.print(fix.operation(a, cn, b));
	}


}

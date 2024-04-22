package QuizAnswer;

import java.util.Scanner;

public class QAns122902 {
	public static void main(String[] args) {
		
		//문2
		// 두개의 숫자를 입력 받아 두수 중 큰 수를 출력하시오. 
//		Input a : 5
//		Input b :13
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("a가 b보다 크므로 a를 출력합니다. a의 값 :" + a);
		}
		else if(a<b) {   //else if가 else보다 확장성이 용이 *확장성: 코드가 언제든지 쉽게 추가 될 수 있어야 한다. 
			System.out.println("b가 a보다 크므로 b를 출력합니다. b의 값 :" + b);
		}
		
		String result = (a > b) ? "a가 b보다 크므로 a를 출력합니다. a의 값 :" + a :"b가 a보다 크므로 b를 출력합니다. b의 값 :" + b;
		System.out.println(result);
		// 출력되는 변수의 값은 , 정의한 형과 동일 해야 함
		
	}
}

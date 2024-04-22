package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class forExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//반복묵 
		// 똑같은 명령ㄹ을 일정 횟수 만큼 반복하여 수행하도록 제어하는 명령문
		// for, while, do/while, 향상된for문 (Enhanced for)
		
//		int[] a = {1, 2, 3};
//		
//		for(int i = 1; i <= 99999; i++) {
//			System.out.println("군침이 싹도노" + (i));
//		}
//		
		// 반복문 해석 
		// for(초기 값 ; 조건 값 (조건 식) ; 증감식) {
//				System.out.println("군침이 싹도노" + (i));
//			}
		//아래는 forEach, 향상된 for 문이라 부름
//		for (int i : 변수명) {
//			
//		}
		
		//for문의 예시 
		//아 집에가고 싶다 라는 문자를 10번 출력
		// i는 0부터 시작해, 10보다 작을 때까지 
		// i값을 투표가 끝날 때까지 1씩 증가. 
		// 루프 : 반복이 실행되는 동안.
		
		// 임시 변수 : 임시적으로 사용하는 변수 
		// 임시 변수는 언제까지 유효할까?
		// 반복문이 종료 될 때까지 유효  -> 반복문 종료시 사라짐 
		
//		for (int i=0; i<10; i++) {
//			System.out.println("아 집에가고 싶다 " + (i+1));
//			
//		}
		
		// for문의 실행 순서 
		// 1. 초기화 
		// 2. 조건식 확인 
		// 3. 반복문 내부의 코드를 실행 
		// 4. 증감식 수행
		// 5. 다시 조건식 확인 
		// 6. 조건식이 false 가 될 때까지 2~4과정을 반복
	
		
		
		// 반복문 활용 사례1
		// 퀴즈
		// 1~10까지의 합을 계산하는 프로그램
		// for 문을 활용하여 작성 
		// 합은 55
		// 반복문 내부 변수 선언시 초기화가 되어버린다. 
		// 합을 저장할 변수를 선언해두는 것이 편하다. 
		
//		int sum = 0;
//		
//		for (int i= 1 ; i <=100; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
//		
		

		
	
		//문제 
		//구구단 중 4단의 값만 출ㄹ
		
//		int base = 4;
//		for (int i = 1; i <= 9 ; i++ ) {			
//			System.out.println(base +"* " + i + " = " + (base * i));
//		}
//		
	
	
	 //문 1
	 
//		for  (int i= 1; i <=100; i++) {
//			if(i%3== 0 && i % 7== 0) {
//				System.out.println(i);
//			}
//		}
//		
		//문제 2번 
//		
//		BufferedReader br =
//				new BufferedReader(new InputStreamReader(System.in));
//		
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		
//		int result = x
//				;
//		
//		for ( int i = 1; i < y; i++) {
//			result *= x;
//		}
//		System.out.println( result);
//	
//		//문제 3번 
//		
//		System.out.println("배열의 갯수를 입력하시오");
//		
//		int a = Integer.parseInt(br.readLine());
//		
//		double[] arr = new double[a];   
//		//오류 수정 전 Index 1 out bounds for length 1의 오류가 떴다.
//		// 오류 수정 전 코드는 다음과 같다. 
//		// double[] arr = {a};
//		// 배열의 길이를 저장하는 코드가 아닌, 단순히 a를 배열에 집어넣는 요소로 사용했고, 
//		// 그렇기에 2번째 루프부터 Index 1 out bounds for length 
//		// 배열의 최대 인덱스는 0인데, 인덱스 [1]의 값을 받을 공간이 없다고 해석된다.
//		double sum = 0;
//		
//		for(int i= 0; i < a; i++) {
//			System.out.println(i+1 +"번 요소에 입력 할 값을 알려주세요");
//			double arr_Score = Double.parseDouble(br.readLine());
//			
//								
//			String userInput = String.format("%.2f\n", arr_Score) ;
//			arr[i] += Double.parseDouble(userInput) ;
//			sum += Double.parseDouble(userInput) ;
//		}
//		
//		double result3 = sum / a ;
//		System.out.println("평균 : " + result3);
		
		//반복문의 응용 
		//1. for 문과 배열 
//		String[] carbrand = {"마세라티", "에르메스", "렉서스", "현대", "롤스로이스"};
//		int len = carbrand.length;
//		
//		for(int i = 0; i< carbrand.length; i++) {
//			System.out.println(carbrand[i].length());
//		}
//	
		//퀴즈 2단부터 9단까지 쭉 출력해보세요
		
		for (int i = 2; i <=9; i++) {
			System.out.println("====================="+i + "단입니다==================");
			for(int j = 1; j<=9; j++) {
				System.out.println(i + "*"+ j + "=" + i*j);
			}
		}
		//이중 for 문 ㄴ실행 순서 
		// 1.외부 for문 실행(초기화)
		// 2.외부 for문 조건식 확인 
		// 3.외부 for문 코드 실행 (내부 for문을 만날때까지)
		// 4.내부 for문 실행 
		// 5.내부 for문 조건식 확인
		// 6.내부 for문 코드 실행 
		// 7.내부 for문 조건이 false 일때까지 반복
		// 8.내부 for문이 false가 되면 대기중이던 외부 for문이 실해 ㅇ
		// 9.이 과정을 외부 for문이 끝날 때까지 반복
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

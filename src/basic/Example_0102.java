package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_0102 {
	public static void main(String[] args) throws IOException {
		//문제 1번 성적처리 프로그램 
//		   중간고사를 입력하시오 : 90
//		   기말고사를 입력하시오 : 89
//		   레포트고사를 입력하시오 : 99
//		   출석고사를 입력하시오 : 100
//
//		   중간고사 : 90
//		   기말고사 : 89
//		   레포트 : 99
//		   출석 : 100
//
//		   성적=93.20      <---소수이하 2째자리까지
//		   학점=A              System.out.printf("성적 : %.2f", avg);
//		   평가=excellent
//
//
//		   조건1) (중간+기말)/2      ---> 60%
//		          레포트             ---> 20%
//		          출석               ---> 20%
//		     
//		   조건2)  90이상 'A'학점     (3)A,B학점  ---->"excellent"
//		           80이상 'B'학점        C,D학점  ---->"good"
//		           70이상 'C'학점        F학점    ---->"poor"
//		           60이상 'D'학점        (switch문이용) 
//		           나머지 'F'학점
//		           (if~else if문이용)
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		//해당 값 입력
		System.out.println("중간고사를 입력하시오 : ");
		System.out.println("기말고사를 입력하시오 : ");
		System.out.println("레포트 고사를 입력하시오 : ");
		System.out.println("출석 고사를 입력하시오 : ");
		
		int middleTest =Integer.parseInt( br.readLine());
		int finalTest = Integer.parseInt( br.readLine());
		int report	= Integer.parseInt( br.readLine());
		int check = Integer.parseInt( br.readLine());
		String grade = "";
		//학점을 점수를 주기 위해 공백 문자열 생성
		//성적 공식
		double finalScore = (((middleTest + finalTest)/2)*0.6) + report*0.2 + check *0.2 ;
		
		//성적 산출 값을 토대로 학점 부여 
		if (finalScore >= 90) {
			 grade = "A";
			
		}
		else if (finalScore >= 80) {
			grade = "B";
		}
		else if (finalScore >= 70) {
			grade = "C";
		}
		else if (finalScore >= 60) {
			grade = "D";
		}
		else {
			grade = "E";
		}
		//도출 된 성적을 소숫자리 2자리까지 변환
		String result = String.format("%.2f", finalScore);
		
		System.out.println("성적 =" + result);
		System.out.println("학점 = " + grade);
		//학점에 따라 평가 부여 
		switch (grade) {
				case "A":
				case "B":
					System.out.println("excellent");
					break;
					
				case "C":
				case "D":
					System.out.println("good");
					break;
				case "E":
					System.out.println("poor");
						
		}
				
		//문제 2번 
		
		System.out.println("A값을 입력하시오 : ");
		System.out.println("B값을 입력하시오 : ");
		System.out.println("연산자를 입력하시오 (+ , - , * , / ) : ");
		//사용자 입력
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		String X = br.readLine();   //Stirng 보다 char로 두는 것이 맞다.
		//사용자 입력 값에 따라 사칙 연산 수행 
		System.out.println(X);
		switch (X) {
			case "+":
				System.out.println("A + B = " + (A + B));
				break;
			case "-":
				System.out.println("A - B = " + (A - B));
				break;
			case "*" :
				System.out.println("A * B = " + (A * B));
				break;
			case "/" :
				double ans = A/ B;
				String resultS = String.format("%.2f", ans);
				System.out.println("A / B = " + resultS);
				break;
			default :
				System.out.println("연산자 Error");
		}
		if (X.equals("+")) { 
			System.out.println("A + B = " + (A + B));
		}
		else if(X.equals("-")) {
			System.out.println("A - B = " + (A - B));
		}
		else if (X.equals( "*" )) {
			System.out.println("A * B = " + (A * B));
		}
		else if (X.equals("/")){
			
			String resultS = String.format("%.2f", A/B);
			System.out.println("A / B = " + resultS);
		}
		else {
			System.out.println("연산자 Error");
		}
			
		
		//문제 3번
		System.out.println("연도 입력");
		int year = Integer.parseInt(br.readLine());
		
		if (year % 4 == 0) {
			if ((year % 100 != 0) || (year % 400 == 0) ) {
				System.out.println("윤년");
			}
			else {
				System.out.println("평년");
			}
		}
		else {
			System.out.println("평년");
		}
		
		
		
	 }
	
	
}

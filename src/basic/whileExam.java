package basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class whileExam {
	public static void main(String[] args) {
		// while
		// 특정한 조건을 만족할때까지 계속해서 주어진 명령문을 반복실행하는 코드
		// while vs for
		// while문은 주로 무한반복에서 많이 사용하는편
		// for문은 정해진 반복에서 많이 사용하는편.
		
		// while문 예시
		// while(true) {
			//조건식의 결과가 참인동안 반복적으로 실행하고자 하는 명령문.
		 //}
		
		// while문을 사용
		// 10번 찍어 안넘어가는 나무 없다.
		// for문으로 구현
		// 나무를 i번 찍었습니다.
		// 10번찍으면
		// 나무를 10번찍었습니다.
		// 나무가 쓰러지고 있습니다.
		//int i =0;
//		for(int i=1; i<11;i++) {
//			System.out.println("나무를"+i+"번 찍었습니다");
//			if(i==10) {
//				System.out.println("나무가 쓰러지고 있습니다.");
//			}
//		}
//		 int i =1;
//		 while(i<11) {
//			
//			System.out.println("빠따로 교수를"+i+"번 찍었습니다");
//			if(i==10) {
//				System.out.println("교수가 쓰러지고 있습니다.");
//			}
//			i++;
//		 }
		// while문 작성시 주의사항
		// 1. 참일 경우에는 무조건 실행하기 때문에
		//     - for문과는 다르게 조건 지정에 관대하여 무한루프에 빠지기 쉽다.
		// 아래의 코드는 종료조건을 만날수 없어 무한루프에 빠짐.
//		 int i =1;
//		 while(true) {// for(;;){
//			
//			System.out.println("빠따로 교수를"+i+"번 찍었습니다");
//			if(i==10) {
//				System.out.println("교수가 쓰러지고 있습니다.");
//			}
//			i++;
//		 }		
//		
//		종료조건 지정방법
//  	1. 조건을 명확하게 작성하기
//		int i =1;
//		 while(i<11) {   //while 문이 종료되도 i 값은 유지 됌
//			
//			System.out.println("빠따로 교수를"+i+"번 찍었습니다");
//			if(i==10) {
//				System.out.println("교수가 쓰러지고 있습니다.");
//				System.out.println("폭력 멈춰!");
//			}
//			i++;
//		 }	
//  	2. 키워드를 활용	
		//break는 하나의 반복문이나 조건문을 빠져 나올 때 사용하는 반복문, 조건문이다.
//		int i =1;			
//		while(true) {
//			System.out.println("빠따로 교수를"+i+"번 찍었습니다");
//			if(i == 10) {
//				System.out.println("교수가 쓰러지고 있습니다.");
//				System.out.println("폭력 멈춰!");
//				break ;
//			}	
//		i++;
//	 	}	
		
		//퀴즈 
		// 1~50 중 6의 배수만 출력, 
		// 조건: while문만 써볼것 
		
		int val = 6;
		int i = 1;
		while (i <50) {
			if( i % val == 0){
				System.out.println(i);
			}
			i++;
		}
		
		//continue
		// 자신이 포함된 반복문의 끝으로 이동
		// 현재 반복의 루프를 취소하고 처음으로 돌아감
		// continue 이후의 문장은 실행되지 않는다.
		// continue를 만나면 아래의 코드들은 절대로 실행되지 않음. 
		
		//do~while
		// 조건의 참 거짓 유무와는 무관하게 
		// 먼저 반복문 내부를 한번 실행한 후에 조건식을 검사
		
		//while 문과의 차이는 조건을 만족하지 못해도 무조건 한번은 실행하는 차이가 있음
		//즉 while문과 do/while 문은 상황에 맞게 사용할 것.
		
		int k =100;
		do {
			System.out.println("오늘도 가보자고!!");
			
		}
		while(k>200); 
		

		
		
		
		
		
		
		
		
	}
}

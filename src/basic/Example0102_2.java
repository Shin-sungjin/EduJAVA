package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Example0102_2 {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1~12월 중 하나를 입력하시오");
		int[] arr1 = {1, 3, 5, 7, 8, 10, 12};
		int[] arr2 = {4, 6, 9, 11} ;
		int i = 0;
		int one = 0;
		
		int month = Integer.parseInt(br.readLine());
		
//아래 주석은 수정 필요 	
		
//		for (i=0; i<13 ; i ++) {
//			if(arr1[i] == month) {
//					one = 1;
//			}
//			else if(arr2[i] == month) {
//				one = 2;
//			}
//			else {
//				one =3;
//			}	
//		switch (one) {
//		case 1:
//			System.out.println(month + "월은 31일까지 있습니다.");
//			break;
//		case 2:
//			System.out.println(month + "월은 30일까지 있습니다.");
//		case 3:
//			System.out.println(month + "그런 달은 없어요.");
//			break;
//		}
		
			if (month == 1 || month == 3 || month == 5 || month ==7 || month ==8 || month ==10 || month ==12 ) {
				System.out.println(month + "월은 31일까지 있습니다.");
			}
			else if(month== 4 || month == 6 ||month ==9 || month == 11) {
				System.out.println(month + "월은 30일까지 있습니다.");
			}
			else if( month ==2) {
				System.out.println(month + "월은 특별합니다.");
			}
			else { 
				System.out.println("그런달은 존재하지 않아요");
			}
		
			// switch 문의 case 에 문자를 쓸수 없을까?
			Scanner sc = new Scanner(System.in);
			int a=0, b=0 ;
			char oper;
			
			System.out.println("A 값 임력");
			System.out.println("B 값 일벽");
			System.out.println("연산자 입력");
			a=sc.nextInt();
			b=sc.nextInt();
			oper = sc.next().charAt(0);
			
			switch (oper){
				case '+' :
					System.out.println(a+b);
					break ;
				case '-' :
					System.out.println(a-b);
					break ;
				case '*' :
					System.out.println(a*b);
					break ;
				case '/' :
					System.out.println(a/b);
					break ;
  
			}
		}
}
			// switch 문의 case 에 문자를 쓸수 없을까? 쓸수 있었다 두둥탁

	
	



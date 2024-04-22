package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class IfController {
	
	public static void main(String[] args) throws IOException {
		// switch case 
		// 조건문 중의 하나, 주어진 조건 값의 결과에 따라 프로그램이
		// 다른 명령을 수행하도록 하는 조건문.
		// switch 조건문을 사용하는 경우!
		// switch 문은 if문 보다 가독성이 더 좋으며
		// 번역시 if문 보다 최적화가 좋기 때문에 성능에서도 우월.
		
		// 그럼에도 Switch문보다 IF문을 더 많이 쓰는가?
		// - 이유를 찾아보세요!
		// 1. switch 문이 if문보다 제한사항이 많았음. 
		// 2. if문을 통해 좀 더 유연한 조건을 만들 수 있음 .   
	   
		
		// 1~7까지의 숫자를 입력받아 숫자별로 다음의 문자를 리턴(출력) 하는 예제
	      // 1 : 월요일 
	       // 2 : 화요일
	      // 3 : 수요일
	      // 4 : 목요일
	      // 5 : 금요일
	      // 6 : 토요일
	      // 7 : 일요일
     
		int day = 3;
		System.out.println("요일입력 1.월요일 ~ 7.일요일");
		switch(day) {
			case 1:
				System.out.println("월요일");
				break; //해당 케이스가 종료될 때마다 break; 가 필요 
			case 2:
				System.out.println("월요일");
				break;
			case 3:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			case 5:
				System.out.println("금요일");
				break;
			case 6:
				System.out.println("토요일");
				break;
			case 7:
				System.out.println("일요일");
				break;
			default:
				System.out.println("입력한 값을 확인해보슌");
				break;
   }		

		
		
	}
}

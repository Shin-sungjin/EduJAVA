package Oop0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;

public class basicExam0109 {
	public static void main(String[] args) throws IOException {
//		문1 
//		숫자맞추기 게임
//		컴퓨터가 0~100사이의 임의의수 하나를 발생  
//		55     <----화면에 보이면 안됨
//		숫자입력(0~100) : 50
//		크다
//		숫자입력(0~100) : 60
//		작다
//		숫자입력(0~100) : 55
//		맞았다(3번)
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = (int)(Math.random()*100);
		Random random_Num1 =new Random();
//		int number = random_Num1.nextInt(100);
		int number = 58;
		System.out.println(" 숫자 맞추기 게임 시작!");
		boolean usermind = true	;
		int count = 0;
		
		while(usermind == true) {
			int userans = Integer.parseInt(br.readLine());
			
			if(userans < number) {
				System.out.println("작다");
				count ++;
			}
			else if(userans > number) {
				System.out.println("크다");
				count++;
			}
			else if( userans == number) {
				System.out.println(count + "번째로 맞췄다.");
			}
		
		}


//		계속(y/n) : y
//		숫자입력(0~100) : 

//		문2

//		배열을이용하여 날짜를 기억시킨후
//		int []month={31,28,31,30,31,30,31,31,30,31,30,31};

//		--입력/출력--

//		원하는 달 : 3
//		3월은 31일입니다...
	}
}

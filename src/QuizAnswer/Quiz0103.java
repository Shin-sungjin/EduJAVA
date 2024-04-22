package QuizAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;

public class Quiz0103 {
	public static void main(String[] args) throws IOException{
//      2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
//     
		//난수발생) 1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수
//                2. ① import java.util.Random;
//                   ② Random 변수1 = new Random();
//                   ③ int 변수2 = 변수1.nextInt(최대값); 
//                            ==>  0 ~ (최대값 - 1)사이의 임의의 수
//
//			[실행결과]
//
//			*** 난수가 발생하였습니다...맞추어 보세요...*** 
//
//				숫자 입력 : 50
//			컴퓨터의 숫자가 더 큽니다..
//
//			숫자 입력 : 90
//			컴퓨터의 숫자가 더 작습니다..
//
//   			    :
//
//			숫자 입력 : 83
//				추카추카...xx번만에 맞추셨습니다.
	
		
		 int a=(int)(Math.random()*100);
		 Random random_Num1 = new Random();
		 int num = random_Num1.nextInt(100); 
//       
		 System.out.println("난수가 발생했다요");
		 
		 BufferedReader br=
				 new BufferedReader(new InputStreamReader(System.in));
		 int count = 0;
		
		 
		 while(true) {
			 int user = Integer.parseInt(br.readLine());
			 
			 if(user > num) {  //유저의 입력이 더큰 경우
				 System.out.println("그것보다 작지롱");
				 count ++;
			 }
			 else if(user < num) { //유저의 입력이 더 작은 경우
				 System.out.println("그것보다 크지렁");
				 count ++;
			 }
			 else if(user == num) {
				 System.out.println( count + "번 째로 맞췄다요");
				 break ;
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}

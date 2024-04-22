package basic;



//1228 점심시간 과제 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Nomal1228 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int money = 97240;
		int 만원 = 10000;
		int 천원 = 1000;
		int 백원 = 100;
		int 십원 = 10;
		
		System.out.println("만원= " +money/만원);
		money = money % 만원;
		System.out.println("천원= " +money/천원);
		money = money % 천원;
		System.out.println("백원=" +money/백원);
		money = money % 백원;
		System.out.println("십원="+ money/십원);

		
		//gunchimcompany
		int 기본급 = 3500000;
		int 시간수당 = 85000;
		double 세금 = 기본급 * 0.1 ;
		double 실수령액 = 기본급 + 시간수당 - 세금;
		System.out.println(실수령액);
		
		//3번
		System.out.println("INPUTNAME:");
		System.out.println("KOR:");
		System.out.println("ENG:");
		System.out.println("MAT:");
		
		String 이름 =br.readLine() ;
		String str1 =br.readLine();
		String str2 =br.readLine();
		String str3 =br.readLine();
		
		int 국어점수 = Integer.parseInt(str1);
		int 영어점수 = Integer.parseInt(str2);
		int 수학점수 = Integer.parseInt(str3);
		
		int 합계점수 = 국어점수 + 영어점수 + 수학점수 ;
		double 평균점수 = (국어점수 + 영어점수 + 수학점수) /3 ;
		System.out.println("이름 : "+이름);
		System.out.println("합계점수: "+ 합계점수);
		System.out.println("평균점수 ㅣ " + 평균점수);
		
		
		
		//4번
		System.out.println("밑변:");
		System.out.println("높이:");
		
		String a =br.readLine() ;
		String b =br.readLine() ;

		int x = Integer.parseInt(a);
		int h = Integer.parseInt(b);
		
		
		int v = (x*h) /2 ;
		
		System.out.println("넓이:" + v);
		
			
	}
}

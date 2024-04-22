package QuizAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class Exam0105 {
	public static void computer(String itme, int qty, int price) throws IOException{
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		int sum = qty * price;
		
		System.out.println("품명 : "+ itme);
		System.out.println("금액 : "+ sum);
		
	}	
	
	public static void main(String[] args) throws IOException {
		//문제 1
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("품명 : ");
		String a = br.readLine();	
		
		System.out.print("수량 : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.print("단가: ");
		int c  =Integer.parseInt(br.readLine());
	 computer(a, b, c);
		
		
	
	 	//문제 2
	 	sum(3,5) ;
	 	sub(7,2) ;
	 	mul(4,5) ;
	 	div(7,3) ; 	
	}
	public static int sum(int a, int b) {
		int x = a + b;
		
		System.out.println("더하기 = "+x);
		return x;
	}
	
	public static int sub(int c, int d) {
		
		int brabo = c - d;
		System.out.println("빼기 = "+brabo);
		return brabo;	
	}
	
	public static int mul(int param1, int param2) {
		
		int omega = param1 * param2;
		System.out.println("곱하기 = "+omega);
		return omega;				
	}
	
	public static double div(double elm1, double elm2) {
		
		double result = elm1 / elm2;
		
		System.out.printf("나누기 = %.2f" , result );
		
		return result;	
	}
	
}

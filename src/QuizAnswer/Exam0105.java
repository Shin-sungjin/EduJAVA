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
		
		System.out.println("ǰ�� : "+ itme);
		System.out.println("�ݾ� : "+ sum);
		
	}	
	
	public static void main(String[] args) throws IOException {
		//���� 1
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("ǰ�� : ");
		String a = br.readLine();	
		
		System.out.print("���� : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.print("�ܰ�: ");
		int c  =Integer.parseInt(br.readLine());
	 computer(a, b, c);
		
		
	
	 	//���� 2
	 	sum(3,5) ;
	 	sub(7,2) ;
	 	mul(4,5) ;
	 	div(7,3) ; 	
	}
	public static int sum(int a, int b) {
		int x = a + b;
		
		System.out.println("���ϱ� = "+x);
		return x;
	}
	
	public static int sub(int c, int d) {
		
		int brabo = c - d;
		System.out.println("���� = "+brabo);
		return brabo;	
	}
	
	public static int mul(int param1, int param2) {
		
		int omega = param1 * param2;
		System.out.println("���ϱ� = "+omega);
		return omega;				
	}
	
	public static double div(double elm1, double elm2) {
		
		double result = elm1 / elm2;
		
		System.out.printf("������ = %.2f" , result );
		
		return result;	
	}
	
}

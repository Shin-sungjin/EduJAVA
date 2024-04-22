package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nomal1228_bouns {
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("원의 반지름을 입력해주세요.");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int r = Integer.parseInt(str);
		
		double pi = 3.14;
		double a =  Math.pow(r, 2) * pi ;  //a = 넓이
		double b = r * pi * 2 ;    // b = 둘레
		System
		.out.println("원의 넓이는 = " +  a + "cm");
		System.out.println("원의 둘레는  =" + b + "cm");
		
	
		//문제 2
		
		System.out.println("상품가격:");
		System.out.println("할인율 =");
		
		int price =Integer.parseInt(br.readLine());
		int dc = Integer.parseInt(br.readLine());
		
		double discount = dc * 0.01 ;
		double Price = price * (1-discount);
		int Fpc = (int) Price;
		System.out.println("최종가격은" + Fpc + "입니다");
	}
}

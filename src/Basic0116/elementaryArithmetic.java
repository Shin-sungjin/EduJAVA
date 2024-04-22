package Basic0116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import OOP0111.interFace;

public class elementaryArithmetic {

	
		public static void main(String[] args)throws IOException{
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			System.out.println("두개의 정수와 연산자를 순서대로 입력하세요");
//			int num1 = Integer.parseInt(br.readLine()); 
//			int num2 = Integer.parseInt(br.readLine());
			int num1 = sc.nextInt();
			int num2 =sc.nextInt();
			String ele = br.readLine();
			//개행 없이 값을 받고 싶은데,, 그게 잘 안되네요,,,
			// 어쩌면 한번에 적고, 공백을 기준으로 subString(" ")을 사용해 배열로 바꿔서 푼다면 그것도 가능해 보일 것 같습니다!
			switch ( ele) {
			case "+" :
				add ad = new add();
				ad.setValue(num1, num2);
				ad.calculate(num1, num2);
				break;
			case "-" :
				sub su = new sub();
				su.setValue(num1, num2);
				su.calculate(num1, num2);
				break;
				
			case "*":
				mul mu = new mul();
				mu.setValue(num1, num2);
				mu.calculate(num1, num2);
				break;
				
			case "/":
				div di = new div();
				di.setValue(num1, num2);
				di.calculate(num1, num2);
				break;
			}
			
		}
}

class add{
	int num1;
 	int num2;
 	
 	public void setValue(int num1, int num2) {
 		this.num1 = num1;
 		this.num2 = num2;
 	}
 	
 	public int calculate(int num1, int num2) {
 		int result =this.num1 + this.num2;
 		System.out.println(result);
 		return result;
 	}
}

class sub{
	int num1;
	int num2;
	
	
 	public void setValue(int num1, int num2) {
 		this.num1 = num1;
 		this.num2 = num2;
 	}
 	
 	public int calculate(int num1, int num2) {
 		int result =this.num1 - this.num2;
 		System.out.println(result);
 		return result;
 	}
}
 	
 	
 	
class mul{
	int num1;
	int num2;
 	public void setValue(int num1, int num2) {
 		this.num1 = num1;
 		this.num2 = num2;
 	}
 	public int calculate(int num1, int num2) {
 		int result =this.num1 * this.num2;
 		System.out.println(result);
 		return result;
 	}
}
class div{
	int num1;
	int num2;
	
 	public void setValue(int num1, int num2) {
 		this.num1 = num1;
 		this.num2 = num2;
 	}
 	
 	public double calculate(int num1, int num2) {
 		double result =(double) this.num1 / (double) this.num2;
 		System.out.println(result);
 		return result;
 	}
}

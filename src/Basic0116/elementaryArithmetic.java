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
			System.out.println("�ΰ��� ������ �����ڸ� ������� �Է��ϼ���");
//			int num1 = Integer.parseInt(br.readLine()); 
//			int num2 = Integer.parseInt(br.readLine());
			int num1 = sc.nextInt();
			int num2 =sc.nextInt();
			String ele = br.readLine();
			//���� ���� ���� �ް� ������,, �װ� �� �ȵǳ׿�,,,
			// ��¼�� �ѹ��� ����, ������ �������� subString(" ")�� ����� �迭�� �ٲ㼭 Ǭ�ٸ� �װ͵� ������ ���� �� �����ϴ�!
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

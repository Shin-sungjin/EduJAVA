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
		
		System.out.println("1~12�� �� �ϳ��� �Է��Ͻÿ�");
		int[] arr1 = {1, 3, 5, 7, 8, 10, 12};
		int[] arr2 = {4, 6, 9, 11} ;
		int i = 0;
		int one = 0;
		
		int month = Integer.parseInt(br.readLine());
		
//�Ʒ� �ּ��� ���� �ʿ� 	
		
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
//			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
//			break;
//		case 2:
//			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
//		case 3:
//			System.out.println(month + "�׷� ���� �����.");
//			break;
//		}
		
			if (month == 1 || month == 3 || month == 5 || month ==7 || month ==8 || month ==10 || month ==12 ) {
				System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			}
			else if(month== 4 || month == 6 ||month ==9 || month == 11) {
				System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			}
			else if( month ==2) {
				System.out.println(month + "���� Ư���մϴ�.");
			}
			else { 
				System.out.println("�׷����� �������� �ʾƿ�");
			}
		
			// switch ���� case �� ���ڸ� ���� ������?
			Scanner sc = new Scanner(System.in);
			int a=0, b=0 ;
			char oper;
			
			System.out.println("A �� �ӷ�");
			System.out.println("B �� �Ϻ�");
			System.out.println("������ �Է�");
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
			// switch ���� case �� ���ڸ� ���� ������? ���� �־��� �ε�Ź

	
	



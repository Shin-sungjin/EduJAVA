package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nomal1228_bouns {
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("���� �������� �Է����ּ���.");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int r = Integer.parseInt(str);
		
		double pi = 3.14;
		double a =  Math.pow(r, 2) * pi ;  //a = ����
		double b = r * pi * 2 ;    // b = �ѷ�
		System
		.out.println("���� ���̴� = " +  a + "cm");
		System.out.println("���� �ѷ���  =" + b + "cm");
		
	
		//���� 2
		
		System.out.println("��ǰ����:");
		System.out.println("������ =");
		
		int price =Integer.parseInt(br.readLine());
		int dc = Integer.parseInt(br.readLine());
		
		double discount = dc * 0.01 ;
		double Price = price * (1-discount);
		int Fpc = (int) Price;
		System.out.println("����������" + Fpc + "�Դϴ�");
	}
}

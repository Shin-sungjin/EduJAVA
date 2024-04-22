package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_0102 {
	public static void main(String[] args) throws IOException {
		//���� 1�� ����ó�� ���α׷� 
//		   �߰���縦 �Է��Ͻÿ� : 90
//		   �⸻��縦 �Է��Ͻÿ� : 89
//		   ����Ʈ��縦 �Է��Ͻÿ� : 99
//		   �⼮��縦 �Է��Ͻÿ� : 100
//
//		   �߰���� : 90
//		   �⸻��� : 89
//		   ����Ʈ : 99
//		   �⼮ : 100
//
//		   ����=93.20      <---�Ҽ����� 2°�ڸ�����
//		   ����=A              System.out.printf("���� : %.2f", avg);
//		   ��=excellent
//
//
//		   ����1) (�߰�+�⸻)/2      ---> 60%
//		          ����Ʈ             ---> 20%
//		          �⼮               ---> 20%
//		     
//		   ����2)  90�̻� 'A'����     (3)A,B����  ---->"excellent"
//		           80�̻� 'B'����        C,D����  ---->"good"
//		           70�̻� 'C'����        F����    ---->"poor"
//		           60�̻� 'D'����        (switch���̿�) 
//		           ������ 'F'����
//		           (if~else if���̿�)
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		//�ش� �� �Է�
		System.out.println("�߰���縦 �Է��Ͻÿ� : ");
		System.out.println("�⸻��縦 �Է��Ͻÿ� : ");
		System.out.println("����Ʈ ��縦 �Է��Ͻÿ� : ");
		System.out.println("�⼮ ��縦 �Է��Ͻÿ� : ");
		
		int middleTest =Integer.parseInt( br.readLine());
		int finalTest = Integer.parseInt( br.readLine());
		int report	= Integer.parseInt( br.readLine());
		int check = Integer.parseInt( br.readLine());
		String grade = "";
		//������ ������ �ֱ� ���� ���� ���ڿ� ����
		//���� ����
		double finalScore = (((middleTest + finalTest)/2)*0.6) + report*0.2 + check *0.2 ;
		
		//���� ���� ���� ���� ���� �ο� 
		if (finalScore >= 90) {
			 grade = "A";
			
		}
		else if (finalScore >= 80) {
			grade = "B";
		}
		else if (finalScore >= 70) {
			grade = "C";
		}
		else if (finalScore >= 60) {
			grade = "D";
		}
		else {
			grade = "E";
		}
		//���� �� ������ �Ҽ��ڸ� 2�ڸ����� ��ȯ
		String result = String.format("%.2f", finalScore);
		
		System.out.println("���� =" + result);
		System.out.println("���� = " + grade);
		//������ ���� �� �ο� 
		switch (grade) {
				case "A":
				case "B":
					System.out.println("excellent");
					break;
					
				case "C":
				case "D":
					System.out.println("good");
					break;
				case "E":
					System.out.println("poor");
						
		}
				
		//���� 2�� 
		
		System.out.println("A���� �Է��Ͻÿ� : ");
		System.out.println("B���� �Է��Ͻÿ� : ");
		System.out.println("�����ڸ� �Է��Ͻÿ� (+ , - , * , / ) : ");
		//����� �Է�
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		String X = br.readLine();   //Stirng ���� char�� �δ� ���� �´�.
		//����� �Է� ���� ���� ��Ģ ���� ���� 
		System.out.println(X);
		switch (X) {
			case "+":
				System.out.println("A + B = " + (A + B));
				break;
			case "-":
				System.out.println("A - B = " + (A - B));
				break;
			case "*" :
				System.out.println("A * B = " + (A * B));
				break;
			case "/" :
				double ans = A/ B;
				String resultS = String.format("%.2f", ans);
				System.out.println("A / B = " + resultS);
				break;
			default :
				System.out.println("������ Error");
		}
		if (X.equals("+")) { 
			System.out.println("A + B = " + (A + B));
		}
		else if(X.equals("-")) {
			System.out.println("A - B = " + (A - B));
		}
		else if (X.equals( "*" )) {
			System.out.println("A * B = " + (A * B));
		}
		else if (X.equals("/")){
			
			String resultS = String.format("%.2f", A/B);
			System.out.println("A / B = " + resultS);
		}
		else {
			System.out.println("������ Error");
		}
			
		
		//���� 3��
		System.out.println("���� �Է�");
		int year = Integer.parseInt(br.readLine());
		
		if (year % 4 == 0) {
			if ((year % 100 != 0) || (year % 400 == 0) ) {
				System.out.println("����");
			}
			else {
				System.out.println("���");
			}
		}
		else {
			System.out.println("���");
		}
		
		
		
	 }
	
	
}

package Oop0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;

public class basicExam0109 {
	public static void main(String[] args) throws IOException {
//		��1 
//		���ڸ��߱� ����
//		��ǻ�Ͱ� 0~100������ �����Ǽ� �ϳ��� �߻�  
//		55     <----ȭ�鿡 ���̸� �ȵ�
//		�����Է�(0~100) : 50
//		ũ��
//		�����Է�(0~100) : 60
//		�۴�
//		�����Է�(0~100) : 55
//		�¾Ҵ�(3��)
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int a = (int)(Math.random()*100);
		Random random_Num1 =new Random();
//		int number = random_Num1.nextInt(100);
		int number = 58;
		System.out.println(" ���� ���߱� ���� ����!");
		boolean usermind = true	;
		int count = 0;
		
		while(usermind == true) {
			int userans = Integer.parseInt(br.readLine());
			
			if(userans < number) {
				System.out.println("�۴�");
				count ++;
			}
			else if(userans > number) {
				System.out.println("ũ��");
				count++;
			}
			else if( userans == number) {
				System.out.println(count + "��°�� �����.");
			}
		
		}


//		���(y/n) : y
//		�����Է�(0~100) : 

//		��2

//		�迭���̿��Ͽ� ��¥�� ����Ų��
//		int []month={31,28,31,30,31,30,31,31,30,31,30,31};

//		--�Է�/���--

//		���ϴ� �� : 3
//		3���� 31���Դϴ�...
	}
}

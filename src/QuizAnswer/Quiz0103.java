package QuizAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;

public class Quiz0103 {
	public static void main(String[] args) throws IOException{
//      2�ڸ��� ������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷�
//     
		//�����߻�) 1. int a=(int)(Math.random()*100) : 0 - 99 ������ ����
//                2. �� import java.util.Random;
//                   �� Random ����1 = new Random();
//                   �� int ����2 = ����1.nextInt(�ִ밪); 
//                            ==>  0 ~ (�ִ밪 - 1)������ ������ ��
//
//			[������]
//
//			*** ������ �߻��Ͽ����ϴ�...���߾� ������...*** 
//
//				���� �Է� : 50
//			��ǻ���� ���ڰ� �� Ů�ϴ�..
//
//			���� �Է� : 90
//			��ǻ���� ���ڰ� �� �۽��ϴ�..
//
//   			    :
//
//			���� �Է� : 83
//				��ī��ī...xx������ ���߼̽��ϴ�.
	
		
		 int a=(int)(Math.random()*100);
		 Random random_Num1 = new Random();
		 int num = random_Num1.nextInt(100); 
//       
		 System.out.println("������ �߻��ߴٿ�");
		 
		 BufferedReader br=
				 new BufferedReader(new InputStreamReader(System.in));
		 int count = 0;
		
		 
		 while(true) {
			 int user = Integer.parseInt(br.readLine());
			 
			 if(user > num) {  //������ �Է��� ��ū ���
				 System.out.println("�װͺ��� ������");
				 count ++;
			 }
			 else if(user < num) { //������ �Է��� �� ���� ���
				 System.out.println("�װͺ��� ũ����");
				 count ++;
			 }
			 else if(user == num) {
				 System.out.println( count + "�� °�� ����ٿ�");
				 break ;
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}

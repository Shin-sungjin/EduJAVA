package method;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import basic.inputSc;

public class MethodExam {

	
	public  int[] mul1to9() {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("1~20 ������ ���� �Է��ϸ� 1~9���� ���Ѱ���� ����ص帲");
		      int j = sc.nextInt();
		      
		      for(int i=1; i<=9; i++) {
		         System.out.println(j + " * "+i+ " = "+ j * i);
		      }
		      
		      
		      int[] gunchim = {10, 20, 30};
			   // ���� �� �� ������ �ִ� ����� �ִ°�?
			   // return type���� arr �� �� �� �ֳ�?
		      // �迭 �̿��ϸ� ����      
		      return gunchim;

		   }
	
	public static void sungjin(){
		//public ĸ��ȭ�� �ٽ�. �̰� Ȱ�� ���ϸ�, �ڹ� �ȹ����� 	
		System.out.println("��ħ�� �ϵ���~");
	}
	
	public static void main(String[] args) throws IOException{
		// �Լ�
		// �Է¿� ���� �۾��� ����� ������ִ� ���(�ڵ�)�� ����
		// Ư���� �뵵�� �ڵ带 �Ѱ��� ��Ƶ� ��
		
		// �޼�(��)��
		// Ŭ���� ���ο� ������ �Լ� 
		
		//�Լ��� Method �� ������
		//Ŭ������ �����ϴ���, �ƴϳ�
		
		// �ڹٿ����� �Լ���� ���� ���� ���� ����. 
		// reason : �ڹ��� �ڵ�� Ŭ���� ���ο��� ����Ǵ� ��찡 ��κ�; 
		// -> �׷��ٸ� �츮�� ���ݱ��� ������ ����� main�� �޼���?
		// -> ����/ �׸��� �ڹٴ� �ڵ尡 ����� ��, ���� ���� main method ����. 
		
		
		// Java file ���� process
		// ������(user)�� �ڵ带 �ۼ��ϰ� �����ϴ� ����
		// ->�ڹ� �ҽ�(�ڵ�)����[.java file] -> �����Ϸ��� ���ؼ� 
		// -> byte �ڵ�� ������ byte �ڵ�� ��ȯ ��(.class) =>bin ���Ͽ� �����
		// ��ȯ�� byte �ڵ� ������ Class Loader�� ���� ���� �������� �Ѱ� // jvm �� Class Loader�� ����. / (jvm�� Class Loader / Execution ����)// Class Loader = > Runtime Data area ���� ����. 
		// byte �ڵ带 ���� �����ϵ��� �ؼ�  // �� �������� => Execution �� interpreter, compiler �� ����/  (�ش� ������ Garbage Collector �� ����)[�޸� ����]
		// -> ���� ������ ������ ������ ��Ÿ�� ������ �������� �Ѱ�  // Runtime Data Area =>  ���������� �����Ͱ� ���� �� ����
		/// �ü���� ���� �޸� ������ �Ҵ� �ް� ���α׷��� ���� 
						
		// JVM (�ڹ� ����� �ӽ�) 
		// �ڹٿ� �ü�� ���̿��� �޸� ���� �� �ڹ� �ڵ� ���� ���� ó�����ִ� 
		// S/W
		// ���� �ӽ� ��ü�� ���� �ִ� ���, ���� ���� �������� �����ع����� ��,. 
		// ����ȭ, �����̳� �̷� ������� ���� hot ���� 
		// ��� ��� ���� ���� ���� 
		
		
		//Method ���� 
		//Quiz 
		// ����ڷκ��� 1~20 ������ ���ڸ� �Է¹޾� 
		// �Է� ���� ������ 1~9 ������ ��������� ����ϴ� 
		// �ڵ带 �ۼ� 
		
		
//		System.out.println("1~20 ���� ���� �Է��ϼ���");
//		
//		BufferedReader br =
//				new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		
//		if(num>20){
//			System.err.println("20 ������ �Է��ϼ�");
//		}
//		else {
//			for(int i = 1; i <= 9;  i++ ) {
//				System.out.println(num+ " * " + i+ " = " +num * i);
//			}
//		}			
	
		// Method �� ���õ� ���
		// 1. ���뼺
		// 2. ** �μ�(argument), �Ķ����(�Ű�����) **
		// 3. return
		// 4. return type
		
		// Method Ư¡
		//  1. Method�� �θ� ���� �´�.
		//   - ȣ����� �ʴ� �� ���� ���� �ȵȴ�.
		//  2.�����̶�� ������ ������ ���� ��� ��ü�� �� ��ü�� �ٸ� �� ����.
		
		
		//���� ������			����Ÿ�� 		�Ķ���ʹ� ������ �� �� ���� 
		//public	 static  void 	methodName(�Ķ���� Ÿ�� �Ķ���� ��){
		// method ������
		//} 
		
		
		// �μ�, �Ķ����(����)
		// �μ�(argument) : �޼���� ������ ���� ���� �κ�
		// �Ķ����(����/ �Ű�����) : �ż��� ȣ�� �� �μ��κ��� ���޵� ���� �޾ƿ��� ���� 
		
		
		// return(��ȯ��)
		// return type �� void���� �ƴ����� ����, 
		
		// �޼��� ����Ⱑ ����� �е��� ���� tip
		// 1. �켱 Method ���� �� main ���� 
		//   Method�� ����� �ڵ���� �ۼ��ϰ� test �Ѵ�. 
		// 2. �����(������) �� �������� �������� �μ��� 
		//    ����� Ȯ���ϴ� ������ return value �� �ۼ��Ǵ� ��찡 ��κ��̴�. 
		// 3. Main �ٱ��� Method �� ������ code�� �ٿ��ְ�
		//	  ����� Ȯ���� ������ ���ϰ����� �д�. 
		//	=> �μ��� �� ������ Ÿ�԰� �Ķ���� Ÿ�� ���� ����� ��. 	
		// �ϴ� void�� Method �����, �� ���� �� void�� ���� ���� ����
		
		
		//quiz
		// ���� ������ ���� 
		// ���α׷��� �����ϸ�
		// ���� ������ ���� �Դϴ�. 
		// 3���̳��� ���� �����ּ��� 
		// 2�ܺ���~9�� ���� ���
		// ex)  4 * 8�� =?
		//       6 * 4 = ?
		// ���߸� �����Դϴ�. 
		// Ʋ���� �����Դϴ�. 
		
		
		
		
//		BufferedReader br =
//				new BufferedReader(new InputStreamReader(System.in));
//		
//		int cnt = 0;
//		// �� �ڵ忡�� 0�� ������ �� �ִ� ����� ������?
//		System.out.println("���� ������ �����Դϴ�.");
//		System.out.println("3�� �̳��� ���� �����ּ���");
//		
//		
//		for(int i =0; i < 5; i++) {
//		
//			int num1 = (int)(Math.random() * 8) + 2;
//			int num2 = (int)(Math.random() * 8) + 2;
//			
//			//0 ���� �ڵ�?
//			if (num1 == 0 || num2 ==0) {
//				--i ;
//				continue;
//			}
//			
//			System.out.print(num1 + " * "+ num2 + " = ");
//			
//			int ans = Integer.parseInt(br.readLine());
//			
//			int result = num1 * num2 ;
//			
//			if (ans == result) {
//				System.out.println("�����Դϴ�.");
//				cnt++;
//			}
//			else if(ans != result) {
//				System.out.println("�����Դϴ�." );
//			}
//		}
//		
//		System.out.println("���� ������" + cnt + "�� �Դϴ�.");
		
//		guguGame();
//		MethodExam me = new MethodExam();
//		me.mul1to9();
//		int[] result = me.mul1to9(); //mul1to9�� ���� ����� ������ �Ѿ��.
//		System.out.println(result);
		
		MethodExam2 me =new MethodExam2();
		// ���� ������� �ص� ��� Ŭ������ �ִ����� �˾ƾ� ��
		
		
		System.out.println(me.lupy);
		
		
		//������, Ȯ�强, ����������, ���뼺
		
		
		

	}
	
	public static void guguGame() throws IOException {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		// �� �ڵ忡�� 0�� ������ �� �ִ� ����� ������?
		System.out.println("���� ������ �����Դϴ�.");
		System.out.println("3�� �̳��� ���� �����ּ���");
		
		
		for(int i =0; i < 5; i++) {
		
			int num1 = (int)(Math.random() * 8) + 2;
			int num2 = (int)(Math.random() * 8) + 2;
			
//			0 , 1���� �ڵ�?
			if (num1 < 2 || num2 < 2) {
				--i ;
				continue;
			}
//			 ������ ��Һ��� �ݺ��� ���� �� �� ����
			
//			if(num1 < 2) {
//				num1 = 2;
//			}
//			if (num2 < 2) {
//				num2 = 2;
//			}
//			
			System.out.print(num1 + " * "+ num2 + " = ");
			
			int ans = Integer.parseInt(br.readLine());
			
			int result = num1 * num2 ;
			
			if (ans == result) {
				System.out.println("�����Դϴ�.");
				cnt++;
			}
			else if(ans != result) {
				System.out.println("�����Դϴ�." );
			}
		}
		
		System.out.println("���� ������" + cnt + "�� �Դϴ�.");
	}
	
	// ���� Ÿ�� ���� 
	// ���� Ÿ�� 
	// void  - �� ���� �� ���� �޼ҵ� 
	// ���� Ÿ�Կ� �� �� �ִ� ���� 
	// �Ϲ� Ÿ�� ���� ( int, boolean, byte[÷�� ���� ��], long ��) , ���� Ÿ�Ե� ���� 
	
	// ����Ÿ���� ���� 
	// ���� ��� return type�� int ��� = > return  ���� ������ ���� �Ѵ�. 
	//  ->  return (int)(Math.random() * 8) + 2; => �̷��Ե� ����� 
	//   return type �� ���� ���� �ٸ� �� ���� 
	
	







}



package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class forExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�ݺ��� 
		// �Ȱ��� ��ɤ��� ���� Ƚ�� ��ŭ �ݺ��Ͽ� �����ϵ��� �����ϴ� ��ɹ�
		// for, while, do/while, ����for�� (Enhanced for)
		
//		int[] a = {1, 2, 3};
//		
//		for(int i = 1; i <= 99999; i++) {
//			System.out.println("��ħ�� �ϵ���" + (i));
//		}
//		
		// �ݺ��� �ؼ� 
		// for(�ʱ� �� ; ���� �� (���� ��) ; ������) {
//				System.out.println("��ħ�� �ϵ���" + (i));
//			}
		//�Ʒ��� forEach, ���� for ���̶� �θ�
//		for (int i : ������) {
//			
//		}
		
		//for���� ���� 
		//�� �������� �ʹ� ��� ���ڸ� 10�� ���
		// i�� 0���� ������, 10���� ���� ������ 
		// i���� ��ǥ�� ���� ������ 1�� ����. 
		// ���� : �ݺ��� ����Ǵ� ����.
		
		// �ӽ� ���� : �ӽ������� ����ϴ� ���� 
		// �ӽ� ������ �������� ��ȿ�ұ�?
		// �ݺ����� ���� �� ������ ��ȿ  -> �ݺ��� ����� ����� 
		
//		for (int i=0; i<10; i++) {
//			System.out.println("�� �������� �ʹ� " + (i+1));
//			
//		}
		
		// for���� ���� ���� 
		// 1. �ʱ�ȭ 
		// 2. ���ǽ� Ȯ�� 
		// 3. �ݺ��� ������ �ڵ带 ���� 
		// 4. ������ ����
		// 5. �ٽ� ���ǽ� Ȯ�� 
		// 6. ���ǽ��� false �� �� ������ 2~4������ �ݺ�
	
		
		
		// �ݺ��� Ȱ�� ���1
		// ����
		// 1~10������ ���� ����ϴ� ���α׷�
		// for ���� Ȱ���Ͽ� �ۼ� 
		// ���� 55
		// �ݺ��� ���� ���� ����� �ʱ�ȭ�� �Ǿ������. 
		// ���� ������ ������ �����صδ� ���� ���ϴ�. 
		
//		int sum = 0;
//		
//		for (int i= 1 ; i <=100; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
//		
		

		
	
		//���� 
		//������ �� 4���� ���� �⤩
		
//		int base = 4;
//		for (int i = 1; i <= 9 ; i++ ) {			
//			System.out.println(base +"* " + i + " = " + (base * i));
//		}
//		
	
	
	 //�� 1
	 
//		for  (int i= 1; i <=100; i++) {
//			if(i%3== 0 && i % 7== 0) {
//				System.out.println(i);
//			}
//		}
//		
		//���� 2�� 
//		
//		BufferedReader br =
//				new BufferedReader(new InputStreamReader(System.in));
//		
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		
//		int result = x
//				;
//		
//		for ( int i = 1; i < y; i++) {
//			result *= x;
//		}
//		System.out.println( result);
//	
//		//���� 3�� 
//		
//		System.out.println("�迭�� ������ �Է��Ͻÿ�");
//		
//		int a = Integer.parseInt(br.readLine());
//		
//		double[] arr = new double[a];   
//		//���� ���� �� Index 1 out bounds for length 1�� ������ ����.
//		// ���� ���� �� �ڵ�� ������ ����. 
//		// double[] arr = {a};
//		// �迭�� ���̸� �����ϴ� �ڵ尡 �ƴ�, �ܼ��� a�� �迭�� ����ִ� ��ҷ� ����߰�, 
//		// �׷��⿡ 2��° �������� Index 1 out bounds for length 
//		// �迭�� �ִ� �ε����� 0�ε�, �ε��� [1]�� ���� ���� ������ ���ٰ� �ؼ��ȴ�.
//		double sum = 0;
//		
//		for(int i= 0; i < a; i++) {
//			System.out.println(i+1 +"�� ��ҿ� �Է� �� ���� �˷��ּ���");
//			double arr_Score = Double.parseDouble(br.readLine());
//			
//								
//			String userInput = String.format("%.2f\n", arr_Score) ;
//			arr[i] += Double.parseDouble(userInput) ;
//			sum += Double.parseDouble(userInput) ;
//		}
//		
//		double result3 = sum / a ;
//		System.out.println("��� : " + result3);
		
		//�ݺ����� ���� 
		//1. for ���� �迭 
//		String[] carbrand = {"������Ƽ", "�����޽�", "������", "����", "�ѽ����̽�"};
//		int len = carbrand.length;
//		
//		for(int i = 0; i< carbrand.length; i++) {
//			System.out.println(carbrand[i].length());
//		}
//	
		//���� 2�ܺ��� 9�ܱ��� �� ����غ�����
		
		for (int i = 2; i <=9; i++) {
			System.out.println("====================="+i + "���Դϴ�==================");
			for(int j = 1; j<=9; j++) {
				System.out.println(i + "*"+ j + "=" + i*j);
			}
		}
		//���� for �� ������ ���� 
		// 1.�ܺ� for�� ����(�ʱ�ȭ)
		// 2.�ܺ� for�� ���ǽ� Ȯ�� 
		// 3.�ܺ� for�� �ڵ� ���� (���� for���� ����������)
		// 4.���� for�� ���� 
		// 5.���� for�� ���ǽ� Ȯ��
		// 6.���� for�� �ڵ� ���� 
		// 7.���� for�� ������ false �϶����� �ݺ�
		// 8.���� for���� false�� �Ǹ� ������̴� �ܺ� for���� ���� ��
		// 9.�� ������ �ܺ� for���� ���� ������ �ݺ�
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

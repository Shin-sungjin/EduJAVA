package basic;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		//�迭, ���, ������
		
		//�迭
		// �Ȱ��� ������ Ÿ���� ���� ������ �ϳ��� ���� ó���ϴ� �ڷᱸ�� 
		// Ư���� �����͸� �ϳ��� ������ ǥ���ϴ� ��. 
		
		//10, 20, 30, 40 �̶�� ���� �����ϰ� 
		// �̵��� �հ� 
//		
//	int a= 10;
//	int b= 20;
//	int c= 30;
//	int d =40;
//	System.out.println(a+ b+c+d);
//	//���� �ڵ�� ������ 1���� �������� �����ϰ� �ִ� ��Ȳ 
	// ������ ������ ���� �� ������ �ϳ��� ������ �����Ͽ� �����ϴ� �͵� ����.
	// ���� �ڵ带 �����Ͽ� ����(�迭�� ����)
//	
	int[] gunchim = {10, 20, 30, 40};
	System.out.println(gunchim); //�ڹٿ��� �迭 ������ ���̷�Ʈ�� ��½ÿ��� �ּҰ��� ����Ѵ�. 
	
	//�迭 ��ȣ : �ε���
	System.out.println(gunchim[0]+gunchim[1]+gunchim[2]+gunchim[3]);
	System.out.println(gunchim[0]);
	System.out.println(gunchim[1]);
	System.out.println(gunchim[2]);
	System.out.println(gunchim[3]);
	// �迭�ȿ� �ִ� ���� : ��� (element)
		
	
	//�迭�� ����(�����)���
	// 1. ������ ���� �Ҵ��ϴ� ��.
	//	int[] a = {10, 20, 30, 40};
	// 2. ������ ���� �Ҵ��ϴ� �ٸ� ǥ����
//	int [] b = new int[] {10, 20, 30, 40};
	
	// 3. ������ �Ҵ��ϰ� �� ���� ���� �ִ� ��.
	int [] gunchimArray = new int[4];
	
	
	int a = 10;
	gunchimArray[0] = 15;
	gunchimArray[1] = 30;
	gunchimArray[2] = 45;
	gunchimArray[3] = 60;
	System.out.println(gunchimArray[0]);
	System.out.println(gunchimArray[1]);
	System.out.println(gunchimArray[2]);
	System.out.println(gunchimArray[3]);
	
	
	//�迭�� ��� �Ѳ����� ���� ���
	// Arrays.toString(�迭 ������)
	System.out.println(Arrays.toString(gunchimArray));
	
	
	// ���ڿ� �迭 �����ϱ� 
	String[] txtArray = new String[4];
	//txtArray 0�� �ε����� gohome�̶�� ���ڸ� ������
	txtArray[0] = "wannagohome";
	txtArray[1] = "gun";
	txtArray[2] = "chim";
	txtArray[3] = "ssak";
	System.out.println(Arrays.toString(txtArray));
	
	//�� ������
	// ������� - '����', 0, ����, => but �����̽��ٵ� �ƽ�Ű �ڵ� 
	// ���� ���� - null 
	//    0  = ���� �Ǿ���. �ٽ��. 
	//    null = ���ʿ� �����. �� �־��µ�? �ƴ� �����   => object type���� ���� 
	//    undefined =  Ÿ�Ե� ����, �׳� ����, null ���� ǥ�� 
	
	// �迭�� ũ��(����) ã�� ��. 
	// length 
	// �迭��.length   => �迭 ũ�� ����
	//  ->���� ����� ���� 
	
	System.out.println(gunchimArray.length);
	System.out.println(txtArray.length);
	
	// �迭�� �޸� 
	// �޸𸮴� �ּҸ� ������, �ּҺ���  ���� �� �ٸ� �������� ��Ҹ� �Ҵ�
	// �޼���, Ŭ����, Stack, heap = >
	// �޸� ������ �� �� ���� ������ ����, Ŭ���� ����, Stack ����, heap ����
	// ����

	// �迭�� �����ϰ� ��� ��ҵ��� 0���� �ʱ�ȭ
	// 20����Ʈ�� ������ �Ҵ��� �迭 gunchim2�� �����ϰ�
	// ��� ��ҵ��� 0���� �ʱ�ȭ 
	int[] gunchim2 = new int[5];  //4byte ��� 5�� �Ҵ� 
	
	// 12byte�� �迭 gunchim3�� ������ ��,
	// 10, 20, 30 �̶�� ��Ҹ� ���� �Ҵ��Ͽ� �ʱ�ȭ;
	int[] gunchim3 = new int[]{10, 20, 30} ;
	
	//
	int[] guchim4 = {20, 30, 40};
	
	
	
	
	}
}

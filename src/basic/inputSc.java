package basic;

import java.util.Scanner;

public class inputSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// user�� ���� ���� �Է¹ޱ� 
		// Scanner : �����(Ŭ���̾�Ʈ)�κ��� �Է� �ޱ� ���� Ŭ����
		
		//�Ʒ� sc = ��ü(�ν��Ͻ�), "." => method ȣ��,  
		Scanner in = new Scanner(System.in);  //��ü ���� ���α׷��� ���� �ִ� ���� ���� 
		
		// Scanner�� ���� ������� ���𰡸� ������ ����, ���α׷��� ������ ��� ��� �ȴ�. 
		// ������� �Է��� ���� ������ ����Ѵ�. 
//		int num = sc.nextInt();
//		System.out.println("����ڰ� �Է��� ����\t" +  num);
		
		// Scanner ���� ���ǻ��� 
		// 1.�ʿ��Ҷ��� ����Ѵ�. (�Ⱦ��� �ڵ�� �ּ�ó��) /���� �ܰ迡�� �������� input �� ��
		// 2. ���ڿ��� �Է¹��� �� �����ؾ��Ѵ�. 
		//    - ������ ������ Ÿ�� ���� �� �������.
		// 3. Scanner�� ��� �� ȣ���� �ʿ��ϴ�. (import �ʿ�)
		// 4. �����̳� ������ �������� ������ ó��, 
		
		// Scanner Method ���� 
		// Scanner ��ü��
		// ��ü��.nextInt();
		// nextByte()
		// nextInt()
		// nextLong()
		// nextFloat()
		// nextDouble()
		//  -----------�ش� Ÿ���� �Է� ���� �� ���.
		// next()    //���ڿ� Ÿ���� �Է� ����  (������ �������� �ܾ ����)
		// nextLine()  //���ڿ� Ÿ���� �Է� ����.  (������ �������� �� ���� ����)
		

//		byte a = in.nextByte();       // byte �� �Է� �� ����
//		short b = in.nextShort();       // short �� �Է� �� ����
//		int c = in.nextInt();          // int �� �Է� �� ����
//		long d = in.nextLong();       // long �� �Է� �� ����
//		
//		float e = in.nextFloat();       // float �� �Է� �� ����
//		double f = in.nextDouble();    // double �� �Է� �� ����
//		
//		boolean g = in.nextBoolean();    // boolean �� �Է� �� ����		
		String h = in.next();          // String �� �Է� �� ���� (������ �������� �� �ܾ ����)
		String i = in.nextLine();       // String �� �Է� �� ���� (������ �������� �� ���� ����)
			  
		System.out.println(h);
		System.out.println(i);
		
		
	}

}

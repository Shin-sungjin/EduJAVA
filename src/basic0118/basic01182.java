package basic0118;

import java.util.Scanner;

public class basic01182 {
	private int r;
	private double size;
	private final double PI = 3.141592;
	
	// Method ������ ���԰�
	// Method ���ο��� �ν��Ͻ��� ������� ����������. 
	public basic01182() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ : ");
		r = sc.nextInt();
		process();
		sc.close(); // �ν��Ͻ� ���� 
		
	}
	
	//���� ���� ���
	public double process() {
		size = r * r * PI;
		return size;
	}
	
	//���
	public void output() {
		
		System.out.printf("���� ���� : %.2f" ,size);
	}
	
	//����
	public static void main(String[] args) {	
		basic01182 sar = new basic01182();
		sar.process();
		sar.output();
	}
}

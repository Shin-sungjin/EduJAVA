package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class IfController {
	
	public static void main(String[] args) throws IOException {
		// switch case 
		// ���ǹ� ���� �ϳ�, �־��� ���� ���� ����� ���� ���α׷���
		// �ٸ� ����� �����ϵ��� �ϴ� ���ǹ�.
		// switch ���ǹ��� ����ϴ� ���!
		// switch ���� if�� ���� �������� �� ������
		// ������ if�� ���� ����ȭ�� ���� ������ ���ɿ����� ���.
		
		// �׷����� Switch������ IF���� �� ���� ���°�?
		// - ������ ã�ƺ�����!
		// 1. switch ���� if������ ���ѻ����� ������. 
		// 2. if���� ���� �� �� ������ ������ ���� �� ���� .   
	   
		
		// 1~7������ ���ڸ� �Է¹޾� ���ں��� ������ ���ڸ� ����(���) �ϴ� ����
	      // 1 : ������ 
	       // 2 : ȭ����
	      // 3 : ������
	      // 4 : �����
	      // 5 : �ݿ���
	      // 6 : �����
	      // 7 : �Ͽ���
     
		int day = 3;
		System.out.println("�����Է� 1.������ ~ 7.�Ͽ���");
		switch(day) {
			case 1:
				System.out.println("������");
				break; //�ش� ���̽��� ����� ������ break; �� �ʿ� 
			case 2:
				System.out.println("������");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("�����");
				break;
			case 5:
				System.out.println("�ݿ���");
				break;
			case 6:
				System.out.println("�����");
				break;
			case 7:
				System.out.println("�Ͽ���");
				break;
			default:
				System.out.println("�Է��� ���� Ȯ���غ���");
				break;
   }		

		
		
	}
}

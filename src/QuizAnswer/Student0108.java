package QuizAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Student0108 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			Student0108 gun = new Student0108();
		}
	
	String name = "gunchim";
	int sID;   //Student ID   =>> ���������� �� �ձ��� �ι���, �ڿ� ID �̷��� ���� ��� ���� 
	String �а�;
	int year;

	
	//�Ʒ��� �޼��带 �����ڶ� �ϴµ� 
	// �� �޼���� �������� �ʾƵ� �����Ϸ��� �˾Ƽ� ����

	
	
	// ����
	public  void Study() throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���θ� �ϰ� �ּ�");
		System.out.println(" ������ �̽ÿ�?");
		String a = br.readLine();
		System.out.println("�׷�����,, ������ �ϰڼ�");
	}
	
	// ���
	public  void Play() {
		System.out.println("���δ� ���� ������� ��� �ּ�");
		System.out.println("�������ÿ� ���� ������");
	}
	
	// �Ա�
	public void Eat() {
		System.out.println("���� �ؾ� �ص� ���� �԰� �ؾ� ���� �ʰڼ�");
	}
	
	
	//�ڱ� 
	public void sleep () {
		System.out.println("���� �ھ� ���� �ʰڼ�");
	}

}

package basic;



//1228 ���ɽð� ���� 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Nomal1228 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int money = 97240;
		int ���� = 10000;
		int õ�� = 1000;
		int ��� = 100;
		int �ʿ� = 10;
		
		System.out.println("����= " +money/����);
		money = money % ����;
		System.out.println("õ��= " +money/õ��);
		money = money % õ��;
		System.out.println("���=" +money/���);
		money = money % ���;
		System.out.println("�ʿ�="+ money/�ʿ�);

		
		//gunchimcompany
		int �⺻�� = 3500000;
		int �ð����� = 85000;
		double ���� = �⺻�� * 0.1 ;
		double �Ǽ��ɾ� = �⺻�� + �ð����� - ����;
		System.out.println(�Ǽ��ɾ�);
		
		//3��
		System.out.println("INPUTNAME:");
		System.out.println("KOR:");
		System.out.println("ENG:");
		System.out.println("MAT:");
		
		String �̸� =br.readLine() ;
		String str1 =br.readLine();
		String str2 =br.readLine();
		String str3 =br.readLine();
		
		int �������� = Integer.parseInt(str1);
		int �������� = Integer.parseInt(str2);
		int �������� = Integer.parseInt(str3);
		
		int �հ����� = �������� + �������� + �������� ;
		double ������� = (�������� + �������� + ��������) /3 ;
		System.out.println("�̸� : "+�̸�);
		System.out.println("�հ�����: "+ �հ�����);
		System.out.println("������� �� " + �������);
		
		
		
		//4��
		System.out.println("�غ�:");
		System.out.println("����:");
		
		String a =br.readLine() ;
		String b =br.readLine() ;

		int x = Integer.parseInt(a);
		int h = Integer.parseInt(b);
		
		
		int v = (x*h) /2 ;
		
		System.out.println("����:" + v);
		
			
	}
}

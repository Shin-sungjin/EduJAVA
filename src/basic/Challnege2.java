package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Challnege2 {
	public static void main(String[] args) throws IOException {  
		boolean answer = true;   //boolean�� �ʱ� �� ���� 
		System.out.println("���ڿ��� �Է�");  //����ڿ��� ���ڿ��� �Է¹���
		BufferedReader br  =
				new BufferedReader(new InputStreamReader(System.in));   //�Է��� �ޱ� ���� �޼ҵ� 
		String s = br.readLine();   //����ڿ��� ���ڿ��� �Է¹ް� String s �� ���� 
		
		int g_cnt=0;     // g or G ī��Ʈ �Լ�
		int c_cnt=0;	 // c or C ī��Ʈ �Լ� 
		for(int i=0; i<s.length(); i++) {      //�ݺ����� Ȱ����, ���ڿ��� ���̸�ŭ �ݺ�, �������� �����ڸ� ����Ͽ�, 1ȸ �ݺ� �� ���� i �� ���� 
			if(s.charAt(i)=='g' || s.charAt(i)=='G') {  //or �������� ||�� Ȱ���Ͽ� �ҹ���, �빮�� ������� ī����
				g_cnt++;    //�ش� ���ĺ��� �ִٸ� �������������ڸ� Ȱ���Ͽ� ī���� 
			}
			if(s.charAt(i)=='c' || s.charAt(i)=='C') {
				c_cnt++;	
			}
		}
		
		if(g_cnt==c_cnt) { //���� �����ϴٸ� true �� ��ȯ
			
			System.out.println("'g'�� ����"+ g_cnt+"��, 'c'�� ����"+ c_cnt +"���� �����Ƿ� true�� return �մϴ�.");
		}else {			// �ƴ϶�� false �� ���
			
			System.out.println("'g'�� ����"+ g_cnt+"��, 'c'�� ����"+ c_cnt +"���� �ٸ��Ƿ� flase�� return �մϴ�.");
		}

		
	}
}
	
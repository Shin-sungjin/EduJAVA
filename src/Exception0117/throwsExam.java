package Exception0117;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.nio.Buffer;

public class throwsExam {

	//�����Ͱ� ���� �� ���������� ����ó���� �ʿ�.
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// throws(������/ ���� ���ѱ��)
		// �޼��� ȣ�� �� ������ ���ܸ� ó���϶�� ���ѱ�� ���� 
		// ���� ���� : ȣ�� �� �������� �ݵ�� ���� ó�� �ڵ尡 �־�� �Ѵ�. 
		// throws�� ���� ���ܸ� ������ �߻� ���� ���� Ŀ������ ������.
		
		
		// Exception(���� �ֻ��� Ŭ����)  -> Throwable (Exception ���� ����)
									 // ��� ���ܿ� ������ ����
		//�Ϲ����� try~catch
		//throws ���� try~catch �� ���� �� ��������.
		try {
			Method1();
		} catch (Exception e) {
			System.out.println("0���� ������ �����");
		}
	
		//BufferedReader
		// ��ĳ�ʸ� ��ü�Ͽ� ����ϴ� Ŭ����. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
	
	}
	
	
	public static void Method1() throws Exception {
		Method2();
	}
	
	public static void Method2() throws Exception{
		System.out.println(100/0);
	}

	
	
}

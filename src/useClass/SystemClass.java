package useClass;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SystemClass {
	
	public static void main(String[] args) throws Exception {
		// �ý��� Ŭ���� 
		// getProperty()
		
		
		//�ü�� �̸�
//		System.out.println(System.getProperty("os.name"));
//		
//		System.out.println(System.getProperty("java.version"));
//		
//		//��� ���� ���� �� 
//		System.out.println(System.getProperty("file.separator"));
//		
//		//÷������ ����� ���� ��� �� 
//		
//		System.out.println(System.getProperty("user.home"));
//		
//		System.out.println(System.getProperty("user.dir"));
		//sysout�� Ȯ�� ���� ���� ��w�� �ؾ� �� 


		//��ü�κ��� Ŭ���� ���� ��� 
		
		
		//user.home�� ����
		// \\�� ����Ͽ� ���� ������ ���� => �㳪 C:����̺�� null�� ��ȯ
		String url = System.getProperty("\\user.home");
		if(url == (null)) { 
			url = "\\";    //  => null �� ��ȯ�� �ֻ��� ���丮�� ��Ī�ϴ�  \\�� ����Ͽ� ����
		}
		String rote = "test4\\���ÿ���.mp4";  // ���� ���� ���
//		File URl = new File();
		System.out.println(url+rote);   //���⼭ �����ع����� 
		//���� ��Ʈ���� �ѹ��� �ν��Ͻ��� �޾Ƶ� �Ǿ��� �� ���� 
		File file = new File(url+rote);
		FileInputStream fStream2 = new FileInputStream(url+rote);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);	
		
		System.out.println("����Ʈ ��� �б� ����");
		
		while(bStream.read() !=-1) {
		}
		
		System.out.println("���� �Ϸ�");
		
		fStream2.close();
		bStream.close();
		
	
	
		
	}

}

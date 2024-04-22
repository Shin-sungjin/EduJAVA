package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//����Ʈ ��� ��Ʈ�� - ���Ͽ��� Byte�� �а� ���� �� �� ���. 
		// InputStream - Byte��� �Է½�Ʈ���� �ֻ��� Ŭ����
		//		read : �Է½�Ʈ�����κ��� 1����Ʈ�� �а� ���� ����Ʈ�� ����
		//      read(byte[] b) : �Է½�Ʈ������ 
		//							
		// 	-FileInputStream
		// OutputStream
		//	-FileOutputStream
		
		
		// fileReader
		// fileWriter
		InputStream iStream =
				new FileInputStream("C:\\gunchim\\test.txt");
		
//		String filePath = "C:\\\\gunchim\\\\test.txt";
//		InputStream inStream = new FileInputStream(filePath);
		//FileInputStream(File file)  -> �־��� file ��ü�� ����Ű�� ������ ����Ʈ ��Ʈ������ 
		// �ϱ� ���� ��ü ����
		//fileInputString(String name) = > �־��� �̸��� ����Ű�� ������ ����Ʈ ��Ʈ������ �б�
		
		int readByte;	
		byte[] b = new byte[100];
		//���� �� �ִ� byte �ڵ带 ������ 
		
		
		//InputStream Ŭ���� read �޼���� 
		// ���̻� ���� �� ���� ����  -1 �� ����.
		while( (readByte = iStream.read(b)) != -1) {
			System.out.println("���� ����Ʈ �� : " + readByte);   //�ƽ�Ű�ڵ尪�� ���
			String s = new String(b, "UTF-8");
			//UTF-8 ���ڵ� 
		
			System.out.println("���� ���� : " + s); //����Ÿ��ĳ���� �� ���ڸ� ���			
		}
		
//		String data = "ABC�׽�Ʈ";
//		System.out.println(new String(data.getBytes("UTF-8"), "UTF-8"));
//		System.out.println(new String(data.getBytes(), "EUC-KR"));
	
		System.out.println(Charset.defaultCharset());
		
		iStream.read();
	
	
	
	
	}
}



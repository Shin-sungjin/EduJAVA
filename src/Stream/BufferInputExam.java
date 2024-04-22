package Stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputExam {
	// ���� ��� ���� ��Ʈ��
	// ��, ��� ���ɿ� ������ ��ġ�� ����� �ڵ�/
	
	//���۸� �̿��� �ذ�
	// ���̷�Ʈ ������ �ƴ� ���۸� ���� �۾� 
	
	// (����Ʈ �Է� ��Ʈ��)		(�����Է� ��Ʈ��)
	// BufferdInputStream,  BufferdReader
	// BufferOutputStream,  BufferWirter
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		String url = System.getProperty("user.home");
		System.out.println(url);
		File file = new File("C:\\test4\\���ÿ���.mp4");
		FileInputStream fStream1 = new FileInputStream(file);
//		System.out.println("file�� ũ�� : " + file.length());
//		System.out.println("����Ʈ ��� �б� ����");
//		start = System.currentTimeMillis();
//		while(fStream1.read() !=-1) {	
//		}
//		end = System.currentTimeMillis();
//		System.out.println("���� ���� �б� : "+ (end - start) + "ms");
//		fStream1.close();

		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);		
		
		System.out.println("����Ʈ ��� �б� ����");
		start = System.currentTimeMillis();
		while(bStream.read() !=-1) {
		}
		end = System.currentTimeMillis();
		System.out.println("���۷� �б� : "+ (end - start) + "ms");
		
		fStream2.close();
		fStream1.close();
		bStream.close();
	}
}

package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExam2 {
	public static void main(String[] args) throws IOException {
		// ���� ���� ���
		String origin =  "C:\\gunchim\\test111.xlsx";
		// ������ ���� ���(����)
		String target =  "C:\\gunchim2\\test123.xlsx";
		
		File file = new File(origin);
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(target);
		
		byte[] bar = new byte[100];
		int readByteCount ;
		int i = 0;
		while((readByteCount = fis.read(bar)) != -1) {
			// wirte : ��½�Ʈ���� 1byte ����
	         fos.write(bar, 0, readByteCount);
	         i++;
	      }
		
		System.out.println("���� �� : " + i);
		
		fis.close();
		fos.close();
		System.out.println("����Ϸ�");
		
		
	}
}

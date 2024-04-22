package Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExam {
	public static void main(String[] args) throws IOException {
		
		File filePath = new File("C:\\test3\\�غ� ����.txt");
		
		// �̵�� ���ϵ��� �ε� �Ұ�(�� ����)  ex)����, ��ȭ, ���� �� 2�� ����
		FileReader fiReader = new FileReader(filePath);
	
		char[] cArr = new char[100];
		int readCharNo;
		int i = 0;
		while((readCharNo = fiReader.read(cArr)) != -1) {
			
			String str = new String(cArr, 0, readCharNo);
			System.out.print(str);
			i++;
			
		}
		System.out.println(i);
		
	
		fiReader.close();
	
	}
}

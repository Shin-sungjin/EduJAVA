package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExam {
	public static void main(String[] args) throws IOException {
		// Reader : �����б⿡ Ưȭ�Ǿ��ִ� Ŭ����
		// ���� Ŭ���� FileReaderf�� ���� �� ����
		Reader reader = new FileReader("C:\\gunchim\\test3.txt");
		int readData;
		
		while((readData = reader.read()) != -1) {
			System.out.println("���� ���� : " + (char)readData);
			System.out.println("���� ���� : " + readData );
		}
		reader.close();
		
		//���� �ܾ� �˻� �ڵ� ����
		
		
	} 
	
}

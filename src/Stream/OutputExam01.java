package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputExam01 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = 
				new FileInputStream("C:\\gunchim\\test.txt");
		
		FileOutputStream fos = 
				new FileOutputStream("C:\\gunchim\\test2.txt");
		byte[] readByte = new byte[1000];
		int data = 0;
		
		while((data = fis.read(readByte)) != -1) {
			fos.write(readByte);
		}
		fos.flush();
		System.out.println("복사완료");
	}
}

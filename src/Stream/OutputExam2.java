package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExam2 {
	public static void main(String[] args) throws IOException {
		// 기존 파일 경로
		String origin =  "C:\\gunchim\\test111.xlsx";
		// 저장할 파일 경로(복사)
		String target =  "C:\\gunchim2\\test123.xlsx";
		
		File file = new File(origin);
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(target);
		
		byte[] bar = new byte[100];
		int readByteCount ;
		int i = 0;
		while((readByteCount = fis.read(bar)) != -1) {
			// wirte : 출력스트림에 1byte 전송
	         fos.write(bar, 0, readByteCount);
	         i++;
	      }
		
		System.out.println("루핑 수 : " + i);
		
		fis.close();
		fos.close();
		System.out.println("복사완료");
		
		
	}
}

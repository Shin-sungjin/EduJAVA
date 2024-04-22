package Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExam {
	public static void main(String[] args) throws IOException {
		
		File filePath = new File("C:\\test3\\극비 문서.txt");
		
		// 미디어 파일들은 로딩 불가(못 읽음)  ex)사진, 영화, 음악 등 2진 파일
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

package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExam {
	public static void main(String[] args) throws IOException {
		// Reader : 문자읽기에 특화되어있는 클래스
		// 하위 클래스 FileReaderf를 생성 후 대입
		Reader reader = new FileReader("C:\\gunchim\\test3.txt");
		int readData;
		
		while((readData = reader.read()) != -1) {
			System.out.println("읽은 문자 : " + (char)readData);
			System.out.println("읽은 문자 : " + readData );
		}
		reader.close();
		
		//과제 단어 검색 코드 구현
		
		
	} 
	
}

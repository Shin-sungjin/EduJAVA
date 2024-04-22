package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx02 {
	public static void main(String[] args) throws IOException {
		InputStream iStream =
				new FileInputStream("C:\\gunchim\\test.txt");
		int count;
		byte[] readBytes = new byte[10];
		
		// 시작 인덱스가 2고, 3개만 읽어서 저장하는 코드 
		// 2시작, 5끝, 이니까,3개만 읽어옴
		
		count = iStream.read(readBytes, 2, 5);
		
		System.out.println("읽은 바이트 수 " + count );
		
		for(byte b : readBytes) {
			System.out.println("읽은 바이트 : " + (char)b);
		}
		
		// Stream 사용후에는 반드시 종료할 것. 
		iStream.close();
	}
}

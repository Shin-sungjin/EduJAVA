package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//바이트 기반 스트림 - 파일에서 Byte를 읽고 쓰고 할 때 사용. 
		// InputStream - Byte기반 입력스트림의 최상위 클래스
		//		read : 입력스트림으로부터 1바이트를 읽고 읽은 바이트를 리턴
		//      read(byte[] b) : 입력스트림으로 
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
		//FileInputStream(File file)  -> 주어진 file 객체가 가리키는 파일을 바이트 스트림으로 
		// 일기 위한 객체 생성
		//fileInputString(String name) = > 주어진 이름이 가르키는 파일을 바이트 스트림으로 읽기
		
		int readByte;	
		byte[] b = new byte[100];
		//읽을 수 있는 byte 코드를 넓혀줌 
		
		
		//InputStream 클래스 read 메서드는 
		// 더이상 읽을 게 없는 경우는  -1 을 리턴.
		while( (readByte = iStream.read(b)) != -1) {
			System.out.println("읽은 바이트 수 : " + readByte);   //아스키코드값을 출력
			String s = new String(b, "UTF-8");
			//UTF-8 인코딩 
		
			System.out.println("읽은 문자 : " + s); //강제타입캐스팅 후 문자를 출력			
		}
		
//		String data = "ABC테스트";
//		System.out.println(new String(data.getBytes("UTF-8"), "UTF-8"));
//		System.out.println(new String(data.getBytes(), "EUC-KR"));
	
		System.out.println(Charset.defaultCharset());
		
		iStream.read();
	
	
	
	
	}
}



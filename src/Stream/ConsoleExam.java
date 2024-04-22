package Stream;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;

public class ConsoleExam {
	
	
	public static void main(String[] args) throws IOException {
		
		//콘솔 클래스
		// 시스템을 사용하기 위해 키보드로 입력을 받고 화면으로 
		// 출력하는 소프트웨어
		// -> cmd(명령 프롬프트) / 터미널(리눅스)
		
		Console console = System.console();
		
		// 시스템 입력 스트림
		InputStream is = System.in;  //Byte 기반 코드 
		//정형화 된 패턴이 존재 
		int what = is.read();
//		char chr = (char) is.read();
		System.out.println(what);
		// System.in
		// 시스템 출력 스트림
		
	}

}

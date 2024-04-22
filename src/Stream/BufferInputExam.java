package Stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputExam {
	// 선능 향상 보조 스트림
	// 입, 출력 성능에 영향을 미치는 입출력 코드/
	
	//버퍼를 이용한 해결
	// 다이렉트 연결이 아닌 버퍼를 통해 작업 
	
	// (바이트 입력 스트림)		(문자입력 스트릠)
	// BufferdInputStream,  BufferdReader
	// BufferOutputStream,  BufferWirter
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		String url = System.getProperty("user.home");
		System.out.println(url);
		File file = new File("C:\\test4\\샘플영상.mp4");
		FileInputStream fStream1 = new FileInputStream(file);
//		System.out.println("file의 크기 : " + file.length());
//		System.out.println("바이트 기반 읽기 시작");
//		start = System.currentTimeMillis();
//		while(fStream1.read() !=-1) {	
//		}
//		end = System.currentTimeMillis();
//		System.out.println("버퍼 없이 읽기 : "+ (end - start) + "ms");
//		fStream1.close();

		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);		
		
		System.out.println("바이트 기반 읽기 시작");
		start = System.currentTimeMillis();
		while(bStream.read() !=-1) {
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼로 읽기 : "+ (end - start) + "ms");
		
		fStream2.close();
		fStream1.close();
		bStream.close();
	}
}

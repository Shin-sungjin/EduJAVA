package Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class WriterExam {
	public static void main(String[] args) throws IOException{
		
		Writer wri = new FileWriter("C:\\gunchim\\tset4.txt");
		
		char[] str = "군침이".toCharArray();
//		System.out.println(Arrays.toString(str));
		
		for(int i = 0; i< str.length; i++) {
			wri.write(str[i]);
			System.out.println(i);
		}
		// 버퍼 : 데이터를 한곳에서 다른 곳으로 전송하는 동안
		//      그 데이터를 보관하는 영역

		// 버퍼링 : 버퍼를 채우는 동작 그 자체
		
		// 버퍼는 선입 선출 구조 (queue)
		
		// 버퍼를 강제로 비우는 작업   [write, OutputStream 사용시엔 flush 필수]
		wri.flush();
		System.out.println("파일 생성 완료");
		wri.close();
	
	
	
	
	
	}
}

package Stream;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class StreamExam2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 이ㅣㅂ력 스트림과 출력 스트림
		// 바이트 기반의 스트림
		// -모든 종류의 데이터를 주고 받을 수 있음
		//  (그림, 미디어, 문자 모두 가능)
		// - 
		// 문자 기반 스트림
		// - 문자만...
		// 인코딩과 디코딩
		// 인코딩 - > 기계가 알아듣기 편한 언어로 변환(바이트 코드)
		// 디코딩 - > 사람이 편한어넝로 변환
		
		String gunchim = "군침이 싹도노";
		String[] encodings = 
				new String[] {"x-windows-949",
							  "EUC-KR", "UTF-8",
							  "ISO8859-1"};
		String[] encoded = new String[4];
		String decoded =" ";
	
		for(int i =0; i<encodings.length; i++) {
			encoded[i] = URLEncoder.encode(gunchim, encodings[i]);
			System.out.println(encodings[i]+"을 인코딩 한 값" + encoded[i]);
		}
		for(int i =0; i<encodings.length; i++) {
			decoded = URLDecoder.decode(encoded[i], encodings[i]);
			System.out.println("\n"+encodings[i]+"을 디코딩한 값 " + decoded);		
			
		}
	}
	
}


package Stream;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileClassExam {
	public static void main(String[] args) throws URISyntaxException, IOException {
		// File
		// 입출력 스트림
		//  - 디렉터리 생성, 파일 제거등은 할 수 없었음
		File dir = new File("C:\\test2");
		
		File file1 = new File("C:\\test2\\test.txt");
		if(!file1.exists()) {
			dir.mkdirs();
		}
		
		file1.createNewFile();
		System.out.println("파일생성완료");
		
		
		
		//만약 폴더가 있다면 이 Method를 실행하는 것은 의미없음.
//		System.out.println(dir.exists());
//		if(!dir.exists()) {
			// exists : 폴더가 있는지 없는지 확인
			// 부모 디렉토리가 없으면 폴더를 만들고
			// 부모가 있면 그 안에 자신의 폴더를 만들음
			// 단 부모 폴더가 없는데 경로를 부모 폴더로 만ㄷㄹ었다면
			// 생성불가.
//			dir.mkdirs();
		
		//Fileclass Exam에 있는 이 코드 그대로 분석하기
		File tmp = new File("C:/test1");  	// "C:/test1" 의 String Path를 가진 인스턴스 생성 
		File[] contents = tmp.listFiles();  	// tmp 내의 파일 리스트들을 담는 File 배열 인스턴스 생성 
		// 시간표현은 기본적으로 ("yyyy - mm --dd a HH:mm:SS ") 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy - mm --dd a HH:mm:SS ");	 // pattern , Locale.getDefault(Locale.Category.FORMAT)
																					// SimpleDateFormat의 생성자 
																					// 주어진 String의 패턴대로 연도, 월, 일, 형식, 시간, 분, 초 를 불러옴
		System.out.println("날짜 \t 시간 \t\t\t 형태 \t 크기 \t 이름");
		System.out.println(sdf.format(new Date()));   // public static native long currentTimeMillis();  Data의 생성자에 사용되는 Method
													 // 시간을 sdf에 format 시킴
		System.out.println("---------------절취선------------------");
		
		for(File file : contents) {   //향상된 for문,, contents 의 배열을 File클래스의 file 인스턴스로 처음부터 끝까지 
		//Type 맞춰줘야 함
			
			System.out.print(sdf.format(new Date(file.lastModified())));
			// sdf를 재 포맷한다.  // 파일이 마지막으로 수정된 날짜 기준으로
			
			// file 인스턴스가 폴더인가 아닌가를 판단. 
			if(file.isDirectory()) { 
				//폴더라면, 		   형식을 지정       폴더 이름
				System.out.print("\t<DIR>\t\t"+file.getName());
			}
			else {
				//폴더가 아닐 때,            파일의 용량			파일이름 출력
				System.out.print("\t\t"+ file.length()+"\t"+file.getName());
			}
			//개행
			System.out.println();
		}

		// URI(통합 자원 식별자)(Uniform Resource Identifier)
		//  -리소스를 식별하는 통일된 방식
		//  -URI를 통해 식별 가능한 모든 종류의 자원
		//  -다른 항목과 구분하기 위한 필요한 정보
		//  => 인터넷 상 리소스를 식별하는 고유한 문자열 시퀀스.
		
		// URL(Uniform Resource Locator)
		//	-자원의 위치를 나타내는 규약 
		//  -웹 사이트 주소 뿐만이 아닌 컴퓨터 네트워크상 자원 표기법;
		
		// URI 객체 : 문자열 전송과 조작을 위한 프로토콜
		// URL 객체 : 네트워크 전송을 위한 프로토콜
		// protocal : 통신규약
		
		//URI 사용 예시 
//		String uriName = "http://www.google.co.kr/Temp/file3.txt";
//		URI uri = new URI(uriName);
//		System.out.println(uri);
	}
}


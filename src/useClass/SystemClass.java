package useClass;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SystemClass {
	
	public static void main(String[] args) throws Exception {
		// 시스템 클래스 
		// getProperty()
		
		
		//운영체제 이름
//		System.out.println(System.getProperty("os.name"));
//		
//		System.out.println(System.getProperty("java.version"));
//		
//		//경로 구분 기준 자 
//		System.out.println(System.getProperty("file.separator"));
//		
//		//첨부파일 저장시 많이 사용 됌 
//		
//		System.out.println(System.getProperty("user.home"));
//		
//		System.out.println(System.getProperty("user.dir"));
		//sysout은 확인 끝난 이후 삭w제 해야 함 


		//객체로부터 클래스 정보 얻기 
		
		
		//user.home에 접근
		// \\를 사용하여 상위 폴더에 접근 => 허나 C:드라이브라 null값 반환
		String url = System.getProperty("\\user.home");
		if(url == (null)) { 
			url = "\\";    //  => null 값 반환시 최상위 디렉토리를 지칭하는  \\만 사용하여 접근
		}
		String rote = "test4\\샘플영상.mp4";  // 이후 접근 경로
//		File URl = new File();
		System.out.println(url+rote);   //여기서 조합해버리기 
		//더한 스트링을 한번더 인스턴스로 받아도 되었을 것 같다 
		File file = new File(url+rote);
		FileInputStream fStream2 = new FileInputStream(url+rote);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);	
		
		System.out.println("바이트 기반 읽기 시작");
		
		while(bStream.read() !=-1) {
		}
		
		System.out.println("수행 완료");
		
		fStream2.close();
		bStream.close();
		
	
	
		
	}

}

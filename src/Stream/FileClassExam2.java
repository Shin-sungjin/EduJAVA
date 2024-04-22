package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.ReadableByteChannel;

import javax.imageio.stream.FileImageInputStream;

public class FileClassExam2 {
	public static void main(String[] args) throws Exception {
//		File file = new File("C:/test1/pororo.txt");
//	    System.out.println("파일의 경로 : " + file.getPath());  //파일의 경로를 얻기
//	    System.out.println("부모 디렉토리 : " + file.getParent());
//	    System.out.println("실행 가능한가 : " + file.canExecute());
//	    System.out.println("읽기 가능한가 : " + file.canRead());
//	    System.out.println("숨김 파일인가 : " + file.isHidden());
//	    System.out.println("쓰기나 수정이 가능한가 : " + file.canWrite());
//	    System.out.println("파일 이름 : " + file.getName());
//	    System.out.println("파일 크기 : " + file.length());
//	    System.out.println("URI출력 형태 : " + file.toURI());
	    
	    
//	    String firstName = " 디비에서 땡겨온 경로";
//	    String lastName = "디비에서 땡겨온 파일이름";
	    
	    
	    String oriFileName = "C:/test2/버그리포트 원본.pptx";
	    String tarFilename = "C:/test3/버그리퍼트 복사본.pptx";
	    
	    File file2 = new File(oriFileName);
	    //파일로부터 데이터를 복사
	    FileInputStream fis = new FileInputStream(file2);  
	    //복사할 파일 출력
	    FileOutputStream fos = new FileOutputStream(tarFilename);
	    
	    int readByteCount;
	    int i = 0;
	    byte[] bArr = new byte[100];
	    
	    long startTime = System.currentTimeMillis();
	    
	    while((readByteCount = fis.read(bArr)) != -1) {
	    	fos.write(bArr, 0 , readByteCount);
	    	i++;
	    }
	    fos.flush();
	    
	    
	    long endTime = System.currentTimeMillis();
	    System.out.println("총 루핑 수 :" + i);
	    System.out.println("복사 시간 : " +(endTime - startTime) + "ms");
	    System.out.println("복사한 파일 크기 : " + (file2.length()/1024));
	    // 용량 단위 	
	    // byte -> kb -> mb -> gb -> tb -> pb -> sb -> zb;
	    // 각 단위가 1024개 씩 모이면 다음단계로 승진;
	    
	    fos.close();
	    fis.close();
	    System.out.println(file2.getName() + " 파일복사 완료");
	
	}
}

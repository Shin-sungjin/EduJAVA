package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferdOutPut {
	public static void main(String[] args) throws Exception{
		
		File file = new File("C:\\test4\\샘플영상.mp4");
//		System.out.println("file의 크기 : "+ ((file.length()) /1024)/1024+"Mbyte");
		FileInputStream fiStream = null;
		FileOutputStream fostream = null;
		
		BufferedInputStream bInput = null;
		BufferedOutputStream bOutput = null;
		
		int dataCnt = 0;
		long start = 0;
		long end = 0;
		
		byte[] bArr = new byte[10000];
		
		//  메인 스트림에 보조 스트림을 연결하는 자악업  (입력)
		fiStream = new FileInputStream(file);
		bInput = new BufferedInputStream(fiStream);
		
		// 메인 스트림에 보조 스트림을 연결하는 작업(출력)
		fostream = new FileOutputStream(file);
		bOutput = new BufferedOutputStream(fostream);
		
		start = System.currentTimeMillis();
		
		while ( (dataCnt = bInput.read(bArr)) != -1) {
			fostream.write(bArr, 0, dataCnt);
		}
		
		fostream.flush();
		end = System.currentTimeMillis();
		
		
		System.out.println("노 버퍼 : " + (end -start) + "ms" );
		
		
		fostream.close();
		fiStream.close();
		bInput.close();
		bOutput.close();
		
	}
}

package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferdOutPut {
	public static void main(String[] args) throws Exception{
		
		File file = new File("C:\\test4\\���ÿ���.mp4");
//		System.out.println("file�� ũ�� : "+ ((file.length()) /1024)/1024+"Mbyte");
		FileInputStream fiStream = null;
		FileOutputStream fostream = null;
		
		BufferedInputStream bInput = null;
		BufferedOutputStream bOutput = null;
		
		int dataCnt = 0;
		long start = 0;
		long end = 0;
		
		byte[] bArr = new byte[10000];
		
		//  ���� ��Ʈ���� ���� ��Ʈ���� �����ϴ� �ھǾ�  (�Է�)
		fiStream = new FileInputStream(file);
		bInput = new BufferedInputStream(fiStream);
		
		// ���� ��Ʈ���� ���� ��Ʈ���� �����ϴ� �۾�(���)
		fostream = new FileOutputStream(file);
		bOutput = new BufferedOutputStream(fostream);
		
		start = System.currentTimeMillis();
		
		while ( (dataCnt = bInput.read(bArr)) != -1) {
			fostream.write(bArr, 0, dataCnt);
		}
		
		fostream.flush();
		end = System.currentTimeMillis();
		
		
		System.out.println("�� ���� : " + (end -start) + "ms" );
		
		
		fostream.close();
		fiStream.close();
		bInput.close();
		bOutput.close();
		
	}
}

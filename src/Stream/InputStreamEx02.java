package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx02 {
	public static void main(String[] args) throws IOException {
		InputStream iStream =
				new FileInputStream("C:\\gunchim\\test.txt");
		int count;
		byte[] readBytes = new byte[10];
		
		// ���� �ε����� 2��, 3���� �о �����ϴ� �ڵ� 
		// 2����, 5��, �̴ϱ�,3���� �о��
		
		count = iStream.read(readBytes, 2, 5);
		
		System.out.println("���� ����Ʈ �� " + count );
		
		for(byte b : readBytes) {
			System.out.println("���� ����Ʈ : " + (char)b);
		}
		
		// Stream ����Ŀ��� �ݵ�� ������ ��. 
		iStream.close();
	}
}

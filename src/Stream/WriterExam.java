package Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class WriterExam {
	public static void main(String[] args) throws IOException{
		
		Writer wri = new FileWriter("C:\\gunchim\\tset4.txt");
		
		char[] str = "��ħ��".toCharArray();
//		System.out.println(Arrays.toString(str));
		
		for(int i = 0; i< str.length; i++) {
			wri.write(str[i]);
			System.out.println(i);
		}
		// ���� : �����͸� �Ѱ����� �ٸ� ������ �����ϴ� ����
		//      �� �����͸� �����ϴ� ����

		// ���۸� : ���۸� ä��� ���� �� ��ü
		
		// ���۴� ���� ���� ���� (queue)
		
		// ���۸� ������ ���� �۾�   [write, OutputStream ���ÿ� flush �ʼ�]
		wri.flush();
		System.out.println("���� ���� �Ϸ�");
		wri.close();
	
	
	
	
	
	}
}

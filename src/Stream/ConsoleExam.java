package Stream;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;

public class ConsoleExam {
	
	
	public static void main(String[] args) throws IOException {
		
		//�ܼ� Ŭ����
		// �ý����� ����ϱ� ���� Ű����� �Է��� �ް� ȭ������ 
		// ����ϴ� ����Ʈ����
		// -> cmd(��� ������Ʈ) / �͹̳�(������)
		
		Console console = System.console();
		
		// �ý��� �Է� ��Ʈ��
		InputStream is = System.in;  //Byte ��� �ڵ� 
		//����ȭ �� ������ ���� 
		int what = is.read();
//		char chr = (char) is.read();
		System.out.println(what);
		// System.in
		// �ý��� ��� ��Ʈ��
		
	}

}

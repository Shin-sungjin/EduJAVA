package Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/test3/�غ� ����.txt");
		FileWriter fWriter = new FileWriter(file);
		
		
		fWriter.write("��ħ�� ����." + "\r\n");
	    fWriter.write("FileWriterŬ������ ���� �����Դϴ�." + "\r\n");
	    fWriter.write("FileWriter �ٽ� ���� �����Դϴ�." + "\r\n");      
	      
	    System.out.println(file.getName() + "�� �����Ǿ����ϴ�.");
	    fWriter.flush();
	    fWriter.close();
	}
}

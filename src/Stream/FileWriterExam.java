package Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/test3/극비 문서.txt");
		FileWriter fWriter = new FileWriter(file);
		
		
		fWriter.write("군침이 돈다." + "\r\n");
	    fWriter.write("FileWriter클래스로 보낸 내용입니다." + "\r\n");
	    fWriter.write("FileWriter 다시 보낸 내용입니다." + "\r\n");      
	      
	    System.out.println(file.getName() + "이 생성되었습니다.");
	    fWriter.flush();
	    fWriter.close();
	}
}

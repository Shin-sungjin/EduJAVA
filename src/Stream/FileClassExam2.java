package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.ReadableByteChannel;

import javax.imageio.stream.FileImageInputStream;

public class FileClassExam2 {
	public static void main(String[] args) throws Exception {
//		File file = new File("C:/test1/pororo.txt");
//	    System.out.println("������ ��� : " + file.getPath());  //������ ��θ� ���
//	    System.out.println("�θ� ���丮 : " + file.getParent());
//	    System.out.println("���� �����Ѱ� : " + file.canExecute());
//	    System.out.println("�б� �����Ѱ� : " + file.canRead());
//	    System.out.println("���� �����ΰ� : " + file.isHidden());
//	    System.out.println("���⳪ ������ �����Ѱ� : " + file.canWrite());
//	    System.out.println("���� �̸� : " + file.getName());
//	    System.out.println("���� ũ�� : " + file.length());
//	    System.out.println("URI��� ���� : " + file.toURI());
	    
	    
//	    String firstName = " ��񿡼� ���ܿ� ���";
//	    String lastName = "��񿡼� ���ܿ� �����̸�";
	    
	    
	    String oriFileName = "C:/test2/���׸���Ʈ ����.pptx";
	    String tarFilename = "C:/test3/���׸���Ʈ ���纻.pptx";
	    
	    File file2 = new File(oriFileName);
	    //���Ϸκ��� �����͸� ����
	    FileInputStream fis = new FileInputStream(file2);  
	    //������ ���� ���
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
	    System.out.println("�� ���� �� :" + i);
	    System.out.println("���� �ð� : " +(endTime - startTime) + "ms");
	    System.out.println("������ ���� ũ�� : " + (file2.length()/1024));
	    // �뷮 ���� 	
	    // byte -> kb -> mb -> gb -> tb -> pb -> sb -> zb;
	    // �� ������ 1024�� �� ���̸� �����ܰ�� ����;
	    
	    fos.close();
	    fis.close();
	    System.out.println(file2.getName() + " ���Ϻ��� �Ϸ�");
	
	}
}

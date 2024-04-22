package Stream;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileClassExam {
	public static void main(String[] args) throws URISyntaxException, IOException {
		// File
		// ����� ��Ʈ��
		//  - ���͸� ����, ���� ���ŵ��� �� �� ������
		File dir = new File("C:\\test2");
		
		File file1 = new File("C:\\test2\\test.txt");
		if(!file1.exists()) {
			dir.mkdirs();
		}
		
		file1.createNewFile();
		System.out.println("���ϻ����Ϸ�");
		
		
		
		//���� ������ �ִٸ� �� Method�� �����ϴ� ���� �ǹ̾���.
//		System.out.println(dir.exists());
//		if(!dir.exists()) {
			// exists : ������ �ִ��� ������ Ȯ��
			// �θ� ���丮�� ������ ������ �����
			// �θ� �ָ� �� �ȿ� �ڽ��� ������ ������
			// �� �θ� ������ ���µ� ��θ� �θ� ������ ���������ٸ�
			// �����Ұ�.
//			dir.mkdirs();
		
		//Fileclass Exam�� �ִ� �� �ڵ� �״�� �м��ϱ�
		File tmp = new File("C:/test1");  	// "C:/test1" �� String Path�� ���� �ν��Ͻ� ���� 
		File[] contents = tmp.listFiles();  	// tmp ���� ���� ����Ʈ���� ��� File �迭 �ν��Ͻ� ���� 
		// �ð�ǥ���� �⺻������ ("yyyy - mm --dd a HH:mm:SS ") 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy - mm --dd a HH:mm:SS ");	 // pattern , Locale.getDefault(Locale.Category.FORMAT)
																					// SimpleDateFormat�� ������ 
																					// �־��� String�� ���ϴ�� ����, ��, ��, ����, �ð�, ��, �� �� �ҷ���
		System.out.println("��¥ \t �ð� \t\t\t ���� \t ũ�� \t �̸�");
		System.out.println(sdf.format(new Date()));   // public static native long currentTimeMillis();  Data�� �����ڿ� ���Ǵ� Method
													 // �ð��� sdf�� format ��Ŵ
		System.out.println("---------------���뼱------------------");
		
		for(File file : contents) {   //���� for��,, contents �� �迭�� FileŬ������ file �ν��Ͻ��� ó������ ������ 
		//Type ������� ��
			
			System.out.print(sdf.format(new Date(file.lastModified())));
			// sdf�� �� �����Ѵ�.  // ������ ���������� ������ ��¥ ��������
			
			// file �ν��Ͻ��� �����ΰ� �ƴѰ��� �Ǵ�. 
			if(file.isDirectory()) { 
				//�������, 		   ������ ����       ���� �̸�
				System.out.print("\t<DIR>\t\t"+file.getName());
			}
			else {
				//������ �ƴ� ��,            ������ �뷮			�����̸� ���
				System.out.print("\t\t"+ file.length()+"\t"+file.getName());
			}
			//����
			System.out.println();
		}

		// URI(���� �ڿ� �ĺ���)(Uniform Resource Identifier)
		//  -���ҽ��� �ĺ��ϴ� ���ϵ� ���
		//  -URI�� ���� �ĺ� ������ ��� ������ �ڿ�
		//  -�ٸ� �׸�� �����ϱ� ���� �ʿ��� ����
		//  => ���ͳ� �� ���ҽ��� �ĺ��ϴ� ������ ���ڿ� ������.
		
		// URL(Uniform Resource Locator)
		//	-�ڿ��� ��ġ�� ��Ÿ���� �Ծ� 
		//  -�� ����Ʈ �ּ� �Ӹ��� �ƴ� ��ǻ�� ��Ʈ��ũ�� �ڿ� ǥ���;
		
		// URI ��ü : ���ڿ� ���۰� ������ ���� ��������
		// URL ��ü : ��Ʈ��ũ ������ ���� ��������
		// protocal : ��űԾ�
		
		//URI ��� ���� 
//		String uriName = "http://www.google.co.kr/Temp/file3.txt";
//		URI uri = new URI(uriName);
//		System.out.println(uri);
	}
}


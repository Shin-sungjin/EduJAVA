package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class WordSearch {
	public static void main(String[] args) throws IOException {
		// words.txt ���� �ε����� ����
		String path = "C:\\test3\\words.txt";
		
		File file = new File(path);
		
//		System.out.println("����ũ�� : " + file.length()/1024 + "kb");
		
		//.add �޼��带 ����� ��Ƶ� ������ �������, �ʿ��� �ν��Ͻ��� �������ּ���
		List<String> pocket = new ArrayList<String>();
		
		//���������� �����ϱ� ArrayList
		try {
			
			Scanner s = new Scanner(file);
			
			while(s.hasNext()) {
				
				pocket.add(s.next());	
				
			}
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		catch (Exception e) {
			
			// TODO: handle exception
		}
		
		
//		System.out.println(pocket.toString());
		
		
	
		
//		String target = "�츮";
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		
//		System.out.println("ã���� �ܾ �Է��ϼ���");
//		String target = br.readLine();
		
		
//		boolean check = pocket.contains(target); // ���ǿ� ��� �� ���� ����
//		int index = pocket.indexOf(target);  // ���� ������ �ҷ���, index ��ȯ
		
		
		outLoop:
		while(true) {
			boolean found = false;    //flag ���� 
			System.out.println("ã���� �ܾ �Է��ϼ���    (���� exit)");   // exit �� �Է��Ǹ� ����
			String target = br.readLine();   //����� �Է�
			
			//exit �Է½� ����
			if(target.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break outLoop;
				
			}
			
			// ����Ʈ �� target ���� ������ ���
			if(pocket.contains(target)) {
	
				System.out.printf("%s�� ������ %s��°�� �ֽ��ϴ�", target, pocket.indexOf(target)+1);
				System.out.println();
				found = true;   //�÷��� ���� ��ȯ
			
			}
			//���� �� ���� ��� �� �ݺ� 
			else if(!found) {
				System.out.printf("%s�� ������ �������� �ʴ� �ܾ��Դϴ�.", target);
				System.out.println();
				
			}
		}
	

	}
}

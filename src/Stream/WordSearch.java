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
		// words.txt 파일 로딩까지 진행
		String path = "C:\\test3\\words.txt";
		
		File file = new File(path);
		
//		System.out.println("파일크기 : " + file.length()/1024 + "kb");
		
		//.add 메서드를 사용해 담아둘 공간을 만들거임, 필요한 인스턴스를 선언해주세요
		List<String> pocket = new ArrayList<String>();
		
		//순차적으로 들어오니까 ArrayList
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
		
		
	
		
//		String target = "우리";
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		
//		System.out.println("찾으실 단어를 입력하세요");
//		String target = br.readLine();
		
		
//		boolean check = pocket.contains(target); // 조건에 사용 될 변수 선언
//		int index = pocket.indexOf(target);  // 조건 만족시 불러올, index 반환
		
		
		outLoop:
		while(true) {
			boolean found = false;    //flag 변수 
			System.out.println("찾으실 단어를 입력하세요    (종료 exit)");   // exit 가 입려되면 종료
			String target = br.readLine();   //사용자 입력
			
			//exit 입력시 종료
			if(target.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break outLoop;
				
			}
			
			// 리스트 내 target 값이 있으면 출력
			if(pocket.contains(target)) {
	
				System.out.printf("%s는 사전의 %s번째에 있습니다", target, pocket.indexOf(target)+1);
				System.out.println();
				found = true;   //플래그 변수 전환
			
			}
			//없을 시 문구 출력 후 반복 
			else if(!found) {
				System.out.printf("%s는 사전에 존재하지 않는 단어입니다.", target);
				System.out.println();
				
			}
		}
	

	}
}

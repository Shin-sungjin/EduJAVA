package SSJ_Quiz;

import java.util.ArrayList;
import java.util.List;

public class SSJ_Quiz7 {
	
	
	public static void main(String[] args) throws Exception {
		
		String[] strings = {"apple", "banana", "cheery"};
		String str = "banana";
		
		List<String> std = new ArrayList<String>();
		for(int i = 0; i<strings.length; i++){
			std.add(strings[i]);
		}
		try {
			if(std.contains(str)) {
				System.out.printf("문자열%s의 인덱스%d", str, std.indexOf(str));
			}
			else if(!std.contains(str)) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("문자열을 찾을 수 없습니다");
		}
		
		
	}
}

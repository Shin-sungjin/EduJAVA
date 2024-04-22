package SSJ_Quiz;

public class SSj_Quiz9 {

	public static void main(String[] args) {
		String[] strings = {"apple", "banana", "durian", "elderberry"};
		
		int len = strings.length;
		int strLen = 0;
		int idx = 0 ;
		for(int i = 0; i<len; i++) {
			if(strLen < strings[i].length()) {
				strLen = strings[i].length();
				idx = i;
			}
			else {
				continue;
			}
		}
		
		System.out.println(strings[idx]);
		
	}
}

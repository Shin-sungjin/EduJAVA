package SSJ_Quiz;

public class SSJ_Quiz2 {
	public static void main(String[] args) {
		String word = "Gunchim ssak";
		
		int len = word.length();
		int g = 0;
		int s = 0;
		for(int i = 0; i<len; i++) {
			char w = word.charAt(i);
			if(w==71 || w==103) {
				g++;
			}
			else if(w==83 || w==115) {
				s++;
			}
			else {
				continue;
			}
		}
		
		System.out.println("g : "+ g);
		System.out.println("s: "+ s);
		
	}
}

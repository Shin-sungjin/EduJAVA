package test0112;

public class java_quiz4_�ż��� {
	
	public static String gunchim(int g) {
		String answer= "";
		
		String str = "";
		String ans = "��ħ";
		for(int s = 1; s <=1000; s++) {
			str += (s%2 != 0 ) ? ans.charAt(0): ans.charAt(1) ; 
		}
		
		for(int i = 0; i< g; i++) {
			answer +=str.charAt(i);
		}
	
	
		
		return answer;
	}
	
	public static void main(String[] args) {

		System.out.println(gunchim(3));
	}
}

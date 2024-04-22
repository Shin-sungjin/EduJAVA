package test0112;

import java.util.Arrays;

public class java_quiz5_½Å¼ºÁø {

	
	public static String strange_word(String str) {
		String[] ans = str.split(" ");
		String answer = "";
		for(int i = 0; i < ans.length; i++) {
			for(int s = 0; s < ans[i].length(); s++) {
				if(s % 2 != 0 || s ==1) {
					char odd =  ans[i].charAt(s);
					answer +=  Character.toLowerCase(odd);
				}
				else {
					char even = ans[i].charAt(s);
					answer += Character.toUpperCase(even);
				}
			}
			answer += " ";
		}

			return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strange_word("try hello world"));
	}

	
	
	
	
}

package QuizAnswer;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int answer = 2;
        String str2 = "6CD";
        String str1 = "ab6CDE443fgh22iJKlmn1o";

        int endIndex = str2.length();   
        for(int i=0; i < str1.length(); i++){       
            String ans = "";    
            if(i + endIndex <= str1.length()) {
                 ans = str1.substring(i , (i + endIndex));
                 if(ans.equals(str2))
                   answer = 1;
                 } 
                 else{
                     continue ;
                 }
            }   
       
        System.out.println(answer);
	}
       
  }
 


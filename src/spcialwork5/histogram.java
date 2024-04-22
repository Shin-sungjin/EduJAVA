package spcialwork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class histogram{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		char[] alpha = new char[26];
		int[] cnt = new int[26];
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		String str = "";
		
		//문자열 입력 받기 
		onefor:
		while(true) {
			str += br.readLine();
			for(int i = 0; i<str.length(); i++) {
				if(str.charAt(i) == ';') {
					break onefor;
				}
			}
		}
		
		
		//str 전원 소문자로 변경 
		str = str.toUpperCase();
		
		//대문자 
		for(int a =0; a<alpha.length; a++) {
			alpha[a] = (char) (a + 65);
		}
		
		//왜 대입이 안되냐 
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (alpha[i] == str.charAt(j)) {
                	cnt[i]++;  //여기가 동작을 안하나
                }
            }
        }
        
        for(int count = 0; count < alpha.length; count++) {
        	System.out.print(alpha[count]);
        	int idx = cnt[count];
        	for(int f = 0; f <idx; f++) {
        		System.out.print("-");
        	}
        	System.out.println();
        }

		
		
		
	}
}
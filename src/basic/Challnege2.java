package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Challnege2 {
	public static void main(String[] args) throws IOException {  
		boolean answer = true;   //boolean의 초기 값 설정 
		System.out.println("문자열을 입력");  //사용자에게 문자열을 입력받음
		BufferedReader br  =
				new BufferedReader(new InputStreamReader(System.in));   //입력을 받기 위한 메소드 
		String s = br.readLine();   //사용자에게 문자열을 입력받고 String s 에 저장 
		
		int g_cnt=0;     // g or G 카운트 함수
		int c_cnt=0;	 // c or C 카운트 함수 
		for(int i=0; i<s.length(); i++) {      //반복문을 활용해, 문자열의 길이만큼 반복, 후위증가 연산자를 사용하여, 1회 반복 한 이후 i 값 증가 
			if(s.charAt(i)=='g' || s.charAt(i)=='G') {  //or 연산자인 ||을 활용하여 소문자, 대문자 상관없이 카운팅
				g_cnt++;    //해당 알파벳이 있다면 후위증가연산자를 활용하여 카운팅 
			}
			if(s.charAt(i)=='c' || s.charAt(i)=='C') {
				c_cnt++;	
			}
		}
		
		if(g_cnt==c_cnt) { //만약 동일하다면 true 값 반환
			
			System.out.println("'g'의 개수"+ g_cnt+"개, 'c'의 개수"+ c_cnt +"개로 같으므로 true를 return 합니다.");
		}else {			// 아니라면 false 값 출력
			
			System.out.println("'g'의 개수"+ g_cnt+"개, 'c'의 개수"+ c_cnt +"개로 다르므로 flase를 return 합니다.");
		}

		
	}
}
	
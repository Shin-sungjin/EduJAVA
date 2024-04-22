package useClass;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExam {  //클래스명은 자바 내장클래스를 겹치면 안됌 

	public static void main(String[] args) {
		// Split은 공백도 하나의 토큰(값)으로 인식한다. 
		// 
		
		
		String data = "dog baby cat a b c d e f g h";
		
		//공백을 한칸까지만 인식하지 못함, 공백이 두칸 이상이라면, 두 번쨰 공백은 배열에 저장됨.
		String[] result = data.split(" ");
		System.out.println(Arrays.toString(result));
		
		// 그냥 다 잘라버리는 구나 
		// 공백이 두 칸이상이면 공백을 값으로 인정 X
		// -> 공백이 몇칸이건 상관 없음 
		StringTokenizer sToken = new StringTokenizer(data, " ", false);  //ture 일시, 공백도 인식 but 개행하며 출력
		
		//이터레이터 구조임
		while(sToken.hasMoreTokens()){
			String str = sToken.nextToken();
			System.out.println(str);
		}
		
		
		
	}
}

package QuizAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Challange010301 {
	public static void main(String[] args) throws IOException
	{
		
	
		
	
		// TODO Auto-generated method stub
		
//		함수 egun_mosam은 정수 a와 자연수 b을 입력 받아, 
//		a부터 시작해 b씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
//		다음 제한 조건을 보고, 조건을 만족하는 함수, egun_mosam을 완성하세요
//
//		제한 조건
//		n은 1000 이하인 자연수입니다.
//		입출력 예
		//a부터 시작해 a의 배수를 n개의 리스트 반환
//		a	n	answer
//		2	5	[2,4,6,8,10]
//		4	3	[4,8,12]
//		-4	2	[-4, -8]
//			
		System.out.println("정수 a와 n를 입력해주세요");   //a부터 시작해 a의 배수를 n개의 리스트 반환
		
		BufferedReader br = //사용자로부터 입력 받기 위해 버퍼리더 선언
				new BufferedReader( new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());   //사용자로부터 a와 n의 값을 받음 
		int n = Integer.parseInt(br.readLine());
		
		int[] answer = new int[n];   //n 개의 배열 생성 
		
		for( int i = 0; i < n; i++) {   //for 반복문을 활용해서, 0번째 인덱스부터 a에 i를 곱한 값을 추가
			answer[i] = a * (i+1) ;		//0번째 인덱스에 0을 곱하지 않고 n까지 곱하기 위하여 +1
		}
		System.out.println(Arrays.toString(answer));
		

		
	}

}

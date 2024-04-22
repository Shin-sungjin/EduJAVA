
package Wokr0125;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoftEngineerSociety {
/*SoftEngineerSociety의 2xN명의 수강생들은 N명씩 두 팀으로 나눠 
숫자 게임을 하려고 합니다. 
두 개의 팀을 각각 A팀과 B팀이라고 하겠습니다. 숫자 게임의 
규칙은 다음과 같습니다.

먼저 모든 사원이 무작위로 자연수를 하나씩 부여받습니다.     /Random 함수 사용
각 사원은 딱 한 번씩 경기를 합니다.			//중복 검사
각 경기당 A팀에서 한 사원이, B팀에서 한 사원이 나와 서로의 수를 공개합니다.   //비교 연산자 사용 
그때 숫자가 큰 쪽이 승리하게 되고, 승리한 사원이 속한 팀은 승점을 1점 얻게 됩니다.  //Score +1;
만약 숫자가 같다면 누구도 승점을 얻지 않습니다.   //
전체 사원들은 우선 무작위로 자연수를 하나씩 부여받았습니다.   // 
그다음 A팀은 빠르게 출전순서를 정했고 자신들의 출전 순서를 B팀에게 공개해버렸습니다.    //출전순서   => 배열의 인덱스 
B팀은 그것을 보고 자신들의 최종 승점을 가장 높이는 방법으로 팀원들의 출전 순서를 정했습니다.   // 
이때의 B팀이 얻는 승점을 구해주세요.    // 최대 승점 구하기
A 팀원들이 부여받은 수가 출전 순서대로 나열되어있는 배열 A와 i번째 요소가 B팀의 i번 팀원이 
부여받은 수를 의미하는 배열 B가 주어질 때, B 팀원들이 얻을 수 있는 최대 승점을 return 하도록 
big_num_game 함수를 완성해주세요.


//조건문을 사용한 연산 필요
// 만약 A[[i] 수와 비교하여 정렬한다고 할 때 
// B[i]는 A[i]와 가장 근삿값인게 유리 



제한사항
A와 B의 길이는 같습니다.
A와 B의 길이는 1 이상 100,000 이하입니다.
A와 B의 각 원소는 1 이상 1,000,000,000 이하의 자연수입니다.
입출력 예
A		B			result
[6,6,6,6]		[1,1,1,1]	   	   	   0
[25,111,34,171,99]	[12,252,63,81,85]	   	   3
[5,1,3,7]		[2,2,6,8]	   	   	   3
입출력 예 설명
입출력 예 #1

A 팀은 숫자 5를 부여받은 팀원이 첫번째로 출전하고, 이어서 1,3,7을 부여받은 팀원들이 차례대로 출전합니다.
B 팀원들을 4번, 2번, 3번, 1번의 순서대로 출전시킬 경우 팀원들이 부여받은 숫자들은 차례대로 8,2,6,2가 됩니다. 그러면, 첫 번째, 두 번째, 세 번째 경기에서 승리하여 3점을 얻게 되고, 이때가 최대의 승점입니다.

입출력 예 #2
B 팀원들을 어떤 순서로 출전시켜도 B팀의 승점은 0점입니다.   */

	List<Integer> Ag = new ArrayList<Integer>();
	List<Integer> Bg = new ArrayList<Integer>();
	boolean[] ch= new boolean[Ag.size()];
	
	//정렬
	public int big_num_game(int[] A, int[] B) {
		//정렬
		//여기가 저기 print 까지 같다가 다시 돌아온다.



		for(int i = 0; i< A.length; i++) {
			Ag.add(A[i]);
			Bg.add(B[i]);
		}
		//왜 한번 더 돌지?
		// main에서 두번 호출 해서 그렇다. 
		// 근데 리스트 초기화 과정이 필요할 듯 
		
		
//		System.out.println("AG배열 생성"+Ag.toString());
//		System.out.println("BG배열 생성"+Bg.toString());
		
		
		Collections.sort(Ag); 
		Collections.sort(Bg);
		
//		System.out.println("정렬 이후"+Ag.toString());
//		System.out.println("B정렬이후"+Bg.toString());
	
		int score = 0;
		int index = A.length;
		int a= 1;
		for(int m = index-1; m>=0; m--) {
			
			for(int l = (index - a); l>=0; l--) {
				
					if(Bg.get(l) > Ag.get(m)) {   //Ag의 i값이, bg의 인덱스 값보다 클때
						score++;
						a++;
						break;
						}	
					
					else {
						
					continue;
					}
				}
		}	
		
		Ag.removeAll(Ag);
		Bg.removeAll(Bg);
		return score;
				
	}


		
		
		

	
	//게임
		//숫자비교
			//스코어부여
	public static void main(String[] args) {
		int[] A = {25,111,34,171,99};
		int[] B = {12,252,63,81,85};
		SoftEngineerSociety as = new SoftEngineerSociety();
		
		System.out.println(as.big_num_game(A, B));
	}

}

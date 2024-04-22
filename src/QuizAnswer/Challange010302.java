package QuizAnswer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Challange010302 {
	public static void main(String[] args) {
//		노는게 제일좋지만 혼자서 특히 잘 노는 군침이는 어느 날 방구석에 있는 숫자 카드 더미를 보더니 
//		혼자 할 수 있는 재미있는 게임을 생각해냈습니다.
//
//		숫자 카드 더미에는 카드가 총 100장 있으며, 각 카드에는 1부터 100까지 숫자가 하나씩 적혀있습니다. //최대 100
//		2 이상 100 이하의 자연수를 하나 정해 그 수보다 작거나 같은 숫자 카드들을 준비하고,    //숫자 범위 2~100이하 자연수, 정한 자연수 n,, n보다 작거나 같은수 a <= n ..랜덤?
//		준비한 카드의 수만큼 작은 상자를 준비하면 게임을 시작할 수 있으며 게임 방법은 다음과 같습니다.   //카드 수 = 배열
//
		//1은 불필요한가? => 필요 없음
		// 자연수를 하나 정함.
		// 정해진 수보다 작거나 같은 숫자 카드를 준비 
		// 카드의 수만큼 작은 상자를 준비 => 각각의 배열?
		
//		준비된 상자에 카드를 한 장씩 넣고, 상자를 무작위로 섞어 일렬로 나열합니다.    //배열에 카드 1장 삽입   -> 무작위로 섞임
//		상자가 일렬로 나열되면 상자가 나열된 순서에 따라 1번부터 순차적으로 증가하는 번호를 붙입니다.  //섞인게 끝나면 일렬로 나열, 순서에 따라 순차적으로 증가하는 번호? 1번, 2번?
//		준비된 상자-> 일렬로 나열 
//		나열된 순서에 따라 1번부터 순차적 증가
		
		
//		그 다음 임의의 상자를 하나 선택하여 선택한 상자 안의 숫자 카드를 확인합니다.  //임의의 상자? 암튼 , 선택해서 상자안의 카드 확인, => 배열 요소 확인?
		
//		다음으로 확인한 카드에 적힌 번호에 해당하는 상자를 열어 안에 담긴 카드에 적힌 숫자를 확인합니다. => 위 단계에서 
//		마찬가지로 숫자에 해당하는 번호를 가진 상자를 계속해서 열어가며, 열어야 하는 상자가 이미 열려있을 때까지 반복합니다.
//		적힌 번호가 인덱스인가?
//
//		이렇게 연 상자들은 1번 상자 그룹입니다. 이제 1번 상자 그룹을 다른 상자들과 섞이지 않도록 따로 둡니다. 
//		만약 1번 상자 그룹을 제외하고 남는 상자가 없으면 그대로 게임이 종료되며, 이때 획득하는 점수는 0점입니다.
//
		// 
		
		
//		그렇지 않다면 남은 상자 중 다시 임의의 상자 하나를 골라 같은 방식으로 이미 열려있는 상자를 만날 때까지 상자를 엽니다. 
//		이렇게 연 상자들은 2번 상자 그룹입니다.
//
//		1번 상자 그룹에 속한 상자의 수와 2번 상자 그룹에 속한 상자의 수를 곱한 값이 게임의 점수입니다.
//		
		
//		상자 안에 들어있는 카드 번호가 순서대로 담긴 배열 cards가 매개변수로 주어질 때, 
//		군침이가 이 게임에서 얻을 수 있는 최고 점수를 구해서 return 하도록 hon_ja_jalnom 함수를 완성해주세요.
//
//		제한사항
//		2 ≤ cards의 길이 ≤ 100
//		cards의 원소는 cards의 길이 이하인 임의의 자연수입니다.  //cards는 배열 
//		cards에는 중복되는 원소가 존재하지 않습니다.  원소 equal 요소 //
//		cards[i]는 i + 1번 상자에 담긴 카드에 적힌 숫자를 의미합니다.  //cards 0 번은 1번 이상의 상자에 담긴 카드에 적힌 숫자를 의미 
		// 그룹의 기준?
//		입출력 예
//		cards	result
//		[8,6,3,7,2,5,1,4]	12
		
		
//		인덱스 0번은 8
// 		인덱스( 사람기준) 8번으로 이동 [컴터 기준 7]
//		8번은 4 - >인덱스 4롤 이동
//		4번은 7 -> 인덱스 7ㄹ로 이동
//		1번은 8  -> 이미 열려있므로 끝.
//      이게 1번 상자 그룹
//		2번 상자그룹은 인덱스 2번이 열리지 않았을 때, 인덱스 2부터 시작.
		
//		입출력 예 설명
//		1, 4, 7, 8이 속하는 상자의 그룹과 2, 5, 6이 속하는 상자의 그룹과 3이 속하는 상자의 그룹이 존재합니다. 
//		따라서 3번 상자를 고르지 않았을 때, 두 번의 시행에서 3과 4를 기록하며 최고 점수 12를 얻을 수 있습니다.
//      최고 점수를 구해서 return
		
		
		
		// 선언부
		// 그룹 별로 선언해놔야하나?
		int[] cards = new int[98];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i+2;
			}  //2부터 시작하는 배열 작성
		double randomoValue = Math.random();

		
		// 구현부 
		
		// 자연수를 하나 정함.
		int num = (int)(randomoValue * 100) + 2;
		
		// 정해진 수보다 작거나 같은 숫자 배열을 준비
		int[] arr = new int[num];
		int len = arr.length;
		for (int i =0; i<len; i++ ) {
			arr[i] = i+2;
		}
		System.out.println(Arrays.toString(arr));
		
		// 배열을 랜덤으로 섞기
		
		int tmp = 0;
		for(int i=0; i < len; i++ ) {	
			int j = (int)(Math.random() * num);						
			tmp = arr[i];			
			arr[i] = arr[j];
			arr[j] =tmp;
			}
		System.out.println(Arrays.toString(arr));
		// 반복문 과 break 문 섞어야 할듯
		int[] score = new int[num];
		boolean[] chk = new boolean[num];
		int gruop1 = 0;
		for(int i = 0; i < len; i ++ ) {			
			if (chk[i] == true){ //만약 chk 값이 false면 계속 진행 
				return;
			}
			else if(chk[i]== false) {
				for(int j = 0; j<len;) {  //연산자 안쓴이유???
					
					
					int move = arr[j];			//arr[j]번의 값이 move에 삽입	
					
					if (chk[j] == true) { //똑같은 숫자가 한번 더 나오면 탈출

						return;  //한번 더 탈출 해야 할 것 같소 
					}				
					else if(chk[j] == false) {  //해당 인덱스 값이 true가 아닌 경우 계속해서 시작!
				
						chk[j] = true;		//한번 나온 값은 true로 변환;						
						j = move - 1;		//move -1로 인덱스값을 j로 지정						
						gruop1++;
				  }
				}
			
				 }
			System.out.println("*"+gruop1);
			}
			
		int gruop2 = 0;
		
		for(int i=0; i < len; i++) {
			if(chk[i] == false) {
				for(int j = 0; j<len;) {
					int move = arr[j];
					if (chk[j] == true) { //똑같은 숫자가 한번 더 나오면 탈출
						System.out.println(move);
						return; 
					}
					else if(chk[j] == false) {  //해당 인덱스 값이 true가 아닌 경우 계속해서 시작!
						System.out.println(move);
						chk[j] = true;		//한번 나온 값은 true로 변환;						
						j = move - 1;		//move -1로 인덱스값을 j로 지정						
						gruop2++;
					}
				}
			}else if(chk[i]==true) {
				return;
			}
			System.out.println("*"+gruop2+"*");
		}
			
		
				
				//move에 j arr[j]값을 넣고, 해당 값 scroe 배열에 삽입 
				//만약 chk 값이 false면 계속 진행  
				
				//countinue 함수도 필요할 것 같다. ex) 두 번쨰 상자가 열렸을 때 세 번째로 이동하도록 
}
			

			
		
	
	
	
	
	
	
	
	
	
	
	
	

	}



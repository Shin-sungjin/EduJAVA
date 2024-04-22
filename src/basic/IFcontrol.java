package basic;

public class IFcontrol {

	public static void main(String[] args) {
			// 조건문
			// 어떠한 조건으로 인해 프로그램이 실행하는 부분에서 분기가 일어나는 것
			// 조건문 : 조건식 + 블록라인(실행블록) { }
			// if(조건식) {
			//		조건식이 true 일 때 실행되는 코드들
			//   }
		
			// else if(조건식) + 블록라인{
			//  if는 만족하지 않으나 else if 의 조건식을 만족할 경우 실행되는 코드들(영역)
			// }
			// else {
			// if도 else if도 만족하지 못하면 실행되는 코드들
			// }
			
		
		
		
		
		//조건문의 예시 1
			// 만약 200억이 생긴다면 무엇을 할것인가?
			// -강사는 200억이 생기면 차를 바꾼다. 
			// 
		
			long money = 20000000000L ; 
			if(money >= 20000000000L) {
				System.out.println("차를 바꾼다.");
			}
		
		boolean lampWork = false ;
		boolean plug = false ;
		boolean bulbBruned = true ;
		
		if (!plug) {  //(plug == false);
			System.out.println("플러그를 꽃으쇼");
			plug = true ;
		}
		else if (bulbBruned == true) {
			System.out.println("전구 교체");
		}
		else if (bulbBruned == false) {
			System.out.println("램프 수리");
			
		}
		
			
		
		// 조건문 예시 2번
		// if / else if / else 라는 형식으로 구성 
		// 아래와 같은 규칙도 있음 
		// 1. if 단독으로 쓰는 것도 가능   => 꼭 if 밑에 else if/ else 가 꼭 올 필요는 없읍 
		// 2. else if / else 는 각자 따로 쓰는 것은 불가능 = > if문과 연계하여 사용해야함. 
		//   -else if/ else는 if 문을 만족하지 못했을 때 수행하는 문법이기 때문에 불가능.
		//		-> 용도가 있기에 용도에 맞춰서 사용 해야 함 
		// 3. if 문 내에 if 문을 중첩해서 넣는 것 또한 가능하다. 
		//  -조건을 조금 더 세부적으로 설계하고 싶을 때 사용하는 것. 
		
		// 복잡하 설계도를 보고 조건문 작성 
		
		
		
		
		
	}
}

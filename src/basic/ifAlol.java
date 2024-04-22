package basic;

public class ifAlol {
	public static void main(String[] args) {
		
		// 긴 코드를 작성할 때 +  조건과 반복을 활용할 때의 경우의 수(상황)
		// 1. 선언부와 구현부를 나눠 코드의 가독성을 높인다. (정리정돈 잘해)
		// 2. 조건문은 무조건 단수는 아니다. 
		//    => 조건문 내 조건문이 오는 것이 가능하다.
		// 3. 조건문이 많아지면 코드가 복잡해지는 것은 당연.
		//    => 그래서 들여쓰기와 주석을 활용해서 정리해두면 보기 편함 ㅋ
		
		
		//선언부 
		int neoGuri = 3;
		boolean pot = true;
		int soup = 1;
		int dasima = 0;
		boolean water = false ;
		boolean clean = false ;
		
		//구현부 ->구현부 내부에도 변수가 존재 할 수 있음 (지역, 전역 개념과 연계)
		// 너구라 있는가 없는가를 구분
		// 너구리는 2개 이상이 필요. (한번에 2개 먹음
		if(neoGuri<2) {
			System.out.println("안먹음 ㅅㄱ");
			System.out.println("나중에 리턴처리할거임 여기 실행되면");
		} // 너구리 개수 체크 조건문 종료 
		
		// 너구리 개수가 충분. 
		// 2개를 소모 
		neoGuri = neoGuri -2;
		if (pot == true) {
			water = true ;
			clean = true ;
			if(soup<1) {
				System.out.println("스프가 없눙");
			}// 스프가 없는 경우 조건 종료 
			else {//스프가 있는 경우 시작
				System.out.println("스프투하");
				if(dasima<1) {
					System.out.println("있는게 없네;");
				}//다시마 체크 조건 종료 
			}//스프가 있는 경우 조건 종료 
			
			
			
		}// 냄비 유무 조건문 종료 (냄비가 있는 경우)
		else if (pot == false){
			System.out.println("뽀글이");
		}// 냄비 유무 조건문 종료 (냄비가 없는 경우)
	} 
}

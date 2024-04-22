package basic;

public class ScopeExam {
	public static void main(String[] args) {
		
		// 스코프 -> 범위(고유영역)ㅔ
		// -> 접근의 유효범위 (변수에 접근하기 위한)
		// { } <-- 블록라인 또한 하나의 스코프로 가정, 
		// 스코프(밤위) 내에서는 스코프 외부에서 선언된 변수에 접근이 가능.
		// 다만 스코프 외부에서 스코프 내부 변수에 접근 불가;
		
//		int gunchim = 10;
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			System.out.println(gunchim);
//		}
//		System.out.println(gunchim);
//		System.out.println(i);
		//스코프의 예시 1 . 이해가 안되면 실행해 볼 것
		// 1. 변수 군침 박스가 어디까지 생존해있는가
		// 2. 변수 number의 생존 범위 
		// 3. 변수 box의 생존 범위 
		
//		int box =1 ;
//		if (true) {
//			int gunchimBox = 20;
//			if(true) {
//				int number = 0;
//				int result = box + number + gunchimBox;
//			}
//			number = 1;
//		}
//		gunchimBox = 10;
	
		for(int i= 0; i<10; i++) {
			int gunchim2 = 0;
			gunchim2 = gunchim2 + i;
			System.out.println(gunchim2);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

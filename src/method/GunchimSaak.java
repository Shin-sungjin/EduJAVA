package method;

public class GunchimSaak {
	
	public static int add(int a, int b) {
		return a+b ;
		//리턴이 필요한 이유 
		// Method가 종료된다고 프로그램이 종료되는 경우는 드물다. 
		// -> Method의 리턴값을 가공하여 프로그램 실행에 영향을 준다. 
		// -> 불필요한 코드를 작성할 이유가 없음. 
			
	}
	
	public static void add2(int a, int b) {
		System.out.println(add(10 , 20));
	}
	//리턴 타입이 void 인 경ㅇ우는 
	// 리턴 값이 없는 Method 라 부름
	// 리턴 타입 void는 불필요한가?/
	//  -> 반환 할 값이 없다면 리턴 타입을 void로 작성 
	
	public static void main(String[] args) {
		
//	      MethodExam me = new MethodExam();
//	      me.mul1to9();

		
		int[] test = {9, 7, 2, 4};
		System.out.println(Methodexam3.arrSum(test));
		
		
		
		//두수의 덧셈을 구하는 메서드 
		
		
		System.out.println(add(10 , 20));
		add2(20, 30);
	}
}

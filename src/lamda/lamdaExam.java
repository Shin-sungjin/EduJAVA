package lamda;

public class lamdaExam {
	public static void main(String[] args) {
		// 람다식
		// 1.8 버전부터 출시
		// 익명함수를 생성하는 식
		
		// 람다의 장점
		// 1. 간결한 코드 
		// 2. 컬렉션을 매핑해서 쉽게 사용
		
//		(Type param,  ...) ->

		//		{
//			람다 실행코드
//		}
		
		// 람다 사용 예시   
		// 람다식을 이용한 익명구현객체 생성과정 
		// 아래 블록 라인은 lamdaTest Method의 method()의 구현부
		lamdaTest lt =   ()    ->  {
			String str = "이것이 람다여";
			System.out.println(str);
		};
		
		lt.method();
		
		lamdaTest lt2 = new lamdaTest() {
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("아따 배고프다잉");
			}
		};
		lt2.method();
		
		lt = () -> System.out.println("람다여");
//		lt = () -> {System.out.println("람다여");};
		lt.method();
		
		// 함수 지향 프로그래밍; 
		// 함수 : y= f(x)
		// 데이터를 파라미터 값으로 전달하고 결과를 받는 코드들로 구성
		// 함수와 Method의 차이  => 클래스 내부에 있느냐 없느냐에 따라 구분
		
		// 함수지향 vs 객체지향
		// 함수지향 장젖ㅁ
		// 대용량 데이터 처리시에 유리
		//	-데이터를 즉각 처리하는 것이 가능
		// 이벤트 중심의 프로그래밍 
	}
}

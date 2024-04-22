package lamda;


//람다 인터페이스 선언
// 아래 어노테이션은 람다식을 쓸 때 권장사항이지 필수는 아님
// 하나의 추상메서드만 가지는가를 컴파일러에게 체크 시키는 것.
@FunctionalInterface
public interface lamdaTest  {
	void method();
	
}

//람다의 단점
// 람다인터페이스 내부에서 여러가지 Method 선언 시 원래 목적에 벗어난다 (간결성)
// 오히려 코드가 복잡하다

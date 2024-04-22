package CollectionAndGeneric;

import java.util.ArrayList;
import java.util.List;

public class WrapperExam {
	public static void main(String[] args) {
		
		// 기본 자료형을 싸악 감싸는 클래스(Wrapper class)
		// 기본 자료형도 목적에 따라서는 인스턴스화가 필요하다. 
		// 널값 처리 등 여러가지거 처리를 위해, Wrapper Class를 사용 
		
		
		
		List<Object> list = new ArrayList<>();
		
		Integer int1 = new Integer(10);
		
		list.add(10);
		list.add(int1);
		System.out.println(list.toString());
		// [10, 10]
		// 기본,  참조;
		
		//Byre
		Byte bt = new Byte((byte)1);

		// short
		Short sho = new Short((short)10);

		// int
		Integer integer = new Integer(10); 
				//참조타입 <========== 일반타입
				//참조타입은 타입 캐스팅이 편하다.

		// long
		Long lon = new Long(10L);

		// float
		Float flo = new Float(10.2F);

		// double
		Double dou = new Double(10.2);

		// boolean
		Boolean bool = new Boolean(true);

		// char
		Character character = new Character('A');		
		
		
		// 위와 같은 클래스들은 기본타입의 wrapper 클래스라 부름. 
		// new 키워드 다음이 블럭 처리 된 이유.
		// 자바에서 Auto Boxing, UnBoxing을 지원하기 때문, 
		
		
		// 참조타입의 유리한 점 
		// 
		
		// 이 코드는 인스턴스를 생서하지 않았는데 왜 호출이 가능한가?
		// static 키워드 때문에 인스턴스 생성 없이도 코드 실행 가능 
		System.out.println(add(10, 20));
		System.out.println(add(10, null));
	}   
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	//아래가 아닌 위 처럼 썻을 때의 이득;
	// 1. 예외처리 
	// 2. 
	// 참조타입인 경우, 이게 사실, 두개의 요소가 있는 것이 아님
	
	//Answer :  현업에서는 언제 어디서 null값이 넘어 올지 모른다. 
	// 하지만 int는 null을 인식하지 않지만, 
	// Integer은 null값 또한 참조타입을 변환한다. 
	// 그래서 그대로 연산이 진행되어, nullPointException이 연산과정에서 발생한다. 
	// 그리하여, int일 경우  null값이 들어오는 것을 방지할 수 있다. 
	
	public static int add(Integer a, Integer b) {
		return a+b;
	}
}

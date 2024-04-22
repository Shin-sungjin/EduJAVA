package CollectionAndGeneric;

public class GenericExam2 {
	public static void main(String[] args) {
		
		// 멀티타입 파라미터
		// 각 타입 파라미터는 콤마로 구분
		// 개발자 10명 중 9명이 봤을 때 의미파악이 쉬운 이름으로 두면 좋음
		
		// 제네릭 Method
		// 파라미터 타입과 리턴타입으로 타입 파라미터를 갖는 Method;
		// 이클립스는 인식을 못하고 있지만
		// 컴파일러는 파라미터 타입을 보고 참조타입이니 
		// integer로 인식하여 번역했다.
		Person<Integer> p1 = GenericExam2.<Integer> changing(new Integer(100));
		int val =p1.getT();
		Person<String> p2 =  GenericExam2.<String> changing(new String("gunchim"));
		String val2 = p2.getT();
		System.out.println(val + val2);
	}
	
	//Generic Method 예시 
	public static<T> Person<T> changing(T t){
	
		Person<T> person = new Person<T>();
		person.setT(t);
		return person;
		
	}
	
}

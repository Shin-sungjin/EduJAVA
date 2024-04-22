package CollectionAndGeneric;


// 제네릭을 사용하는 경우, 
// 내장 메소드는 제네릭을 바로 사용가능 

// T : Type;
// e : Element;
// => 코드의 가독성과 유지보수성을 높일 수 있음 


// 제네릭을 사용하는 방법 
public  class Kdigita3th<T> {
	
	
	// T는 타입이 정해지지 않은 상황;
	// 이 클래스를 사용할 때 정해짐.
	
	
	//타입이 정해지는 시기는 프로그램을 실행할 때
	// 제네릭을 정의할 때 사용할 수 없는 키워드는 무엇?
	// static 
	private T t; //제네릭 자체가 멤버 변수 

	public Kdigita3th() {
		
	}
	// 제네렉을 사용 할 시 반드시 getter/setter가 필요 

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

package OOP1010;

public class Animal {
	public void eat(){
		
	}
	
	public void sleep() {	
	}
}

class camel extends Animal{
	@Override
	public void eat(){
		System.out.println("풀 쩝쩝");
	}
}

class tiger extends Animal{
	@Override
	public void eat(){
		System.out.println("고기 쩝쩝");
	}
}

// 애니멀을 상속 받는 도그와 bird 클래스
class Dog extends Animal{
	@Override //기능이 있는 주석
	public void eat(){
		System.out.println("다 좋앙");
		
	}
	
	void howl() {
	  System.out.println("왈왈");
  }
}


class Bird extends Animal{
	void howl() {
		System.out.println("짹짹");
	}
}

//인터페이스 없이 다중 상속을 구현하는 방법
class DogBird extends Dog{
	// 클래스의 포함 
	Bird b = new Bird();	//(DogBird의 멤버변수) / 포함관계
	//위는 정확히 상속은 아니고, 포함 관계임 
}

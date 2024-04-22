package oop;

public class ComputerPactori {
	// 컴퓨터를 구성
	
	//컴퓨터 속성
	// 속성 -크기, 성능, 디자인   //속성은 가장 원초적인 단위 사용/ 디자인 - > 컬러
	String size = "ㅈㄴ큼";
	String performance = "ㅈㄴ빠름";
	String design = "화려";
	
	//행동 -데이터를 저장한다. 검색한다. 불러온다.
	
	void save() {
		System.out.println("데이터를 저장합니다.");
	}
	
	void search() {
		System.out.println("검색하기");
	}
	
	void load() {
		search();
		// 메서드 내부에서 다른 메서드를 호출 하는 것 또한 가능. 
		System.out.println("불러오기");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터 행동
		// 정의한 클래스를 사용하는 방법. 
		
		// 인스턴스를 변수로 볼 수 있다.
		// 인스턴스  = 참조 자료형 변수. (래퍼 클래스?)
		// 참조자료형의 예시. 
		ComputerPactori com1 = new ComputerPactori();   //com1이 인스턴스
		ComputerPactori com2 = new ComputerPactori();   // new 새로운 인스턴스를 만드는 키워드
		// 똑같은 클래스에서 만든 인스턴스라도, 인스턴스마다 다른 주소를 가짐, 영역 별로 따로 할당 됨.
		
		com1.design = "쌉좋음";
		com2.design = "개구림";
		
		System.out.println(com1.design );
		System.out.println(com2.design );
//		System.out.println(com1.design);
//		System.out.println(com1.performance);
//		System.out.println(com1.size);
		
		
		
//		com1.save();
//		com1.load();
//		com1.search();
		
		// 객체와 인스턴스의 차이
		// 자바에서 객체라 부를 수 있는 것들의 범위는?  => 프로그래밍 상 존재하는 거의 대부분의 것들	
		// 인스턴스는 클래스를 통해 만들어진 객체 자체만을 일컫는다. 
		
		
		// 인스턴스의 특징
		// 1. 인스턴스는 일명 참조값을 저장한다. (주소로 바라본다.)
		//    => 인스턴스별로 속성값이 다르게 설정할 수 있음. 
		// 2. 인스턴스는 생성시 마다 별도의 메모리 공간을 차지한다. 
		// 3. new 키워드를 / (class 를) 통해 생성된 객체를 인스턴스라 부른다. 
		//		-> 객체를 메모리에 적재했다. 
		
		
		//new / ㅊ마조 타입
		// 객체는 인스턴스를 포함한다. 
		// class(new 연산자)를 통해 만들어진 객체를 인스턴스 
		// -> new 연산자에 의해 메모리에 할당된 객체를 인스턴스.		
		// 클래스의 인스턴스화를 통해 생성된 객체를 인스턴스라 한다.
		//
		
		
		
		
		
	}

}

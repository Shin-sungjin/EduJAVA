package OOP0115;

public interface interFaceExam2 {
	// 인터페으스와 다형성
	// 인터페이스 타입의 참조 변수로 인터페이스를 구현한 클래스의 
	// 인스턴스를 참조가 가능 
	
	// 인터페이스를  파라미터 타입으로 설정하는것도 가능
	// 조건 : 파라미터로 올 수 있는 것은 인터페이스를 구현한 클래스만 가능. 
	
	// 인터페이스도 return 타입으로 올 수 있음.
	
	// default 메서드 (1.8부터 추가된 기능)
	// -인터페이스의 확장성을 위해 추가된 키워드 
	// -구현부 자체가 있는 기본 메서드를 쓸 수 있도록 
	//   default 메서드를 추가함.
	// -default 메서드도 오버라이딩은 당연히 가능;
	// -default는 기본적으로 public이여야 함. 
	
	
	
	public static void main(String[] args) {
		A gunchim = new A();
		b gunchim2 = new b();
		C gunchim3 = new C();
		
		//gunchim.gunchim(null);
		gunchim.gunchim(gunchim3);
		
//		gunchim2.gunchim() ;

	
	}
}

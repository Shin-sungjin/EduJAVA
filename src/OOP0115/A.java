package OOP0115;

public class A {
	
	
	public void gunchim ( b b) {
		b.gunchim();
	}
	
	// 인터페이스를 파라미터 타입으로 설정하는 예시
	public void gunchim(IN i) {
		i.gunchim();
	}
	
	//어디서 누가 만든 것 혹은 어떠한 내장 클래스도 상관없이 
	// 다형성을 이용해서 파라미터로 인스턴스를 받고싶으면
	// 어떤 클래스 (타입)으로 만들어야 할까?
	// 오브젝트 클래스( Object )
}

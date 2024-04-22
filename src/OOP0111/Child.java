package OOP0111;

public class Child extends Parents{
	int a = 9724;
	
	public Child() {
		super(97);
		System.out.println("생성자 호출!");
		
	}
	
	@Override
	public void gunchim() {

		System.out.println("1번" + a);
		System.out.println("2번" + this.a);
		System.out.println("3번" + super.a); // 부모클래스 인스턴스 변수로 접근
		super.gunchim(); // 부모 클래스의 Method를 자식클래스에서 호출
		
	}
	
}



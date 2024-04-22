package OOP0111;

public class Siba implements Dog{

	// 인터페이스의 생성자를 선언 및 정의하는 것을 불가능
	// 인터페이스를 구현하는 클래스에서 super Method 써도 
	// 큰 의미 X
//	public Siba(String color) {
//		super();
//	}
	
	// 아래 Method 들은 이미 인터페이스에서 선언되어 있는 Method
	// 하지만 해당 인터페이스를 구현할 경우 무조건 그 인터페이스에 있는 
	// Method들을 Overriding 해야 한다. ( abstract 키워드가 있는)
	
	
	@Override
	public void bite() {
		// TODO Auto-generated method stub
		System.out.println("세게 묾");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("와구와구");
	}

	@Override
	public void ppuzik() {
		// TODO Auto-generated method stub
		
	}
	
}

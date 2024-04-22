package op0108;



public class ConstExam {
	
	// 지구 속성
	boolean water;   //인스턴스 변수 || 멤버 변수
	boolean	life;
	int gravity;
	int humanity;
	String country;
	
	
	
	
	
	ConstExam(boolean water, boolean life, int gravity, int humanity, String country) {
		// this
		// 자기 자신을 가리키느 참조 변수;
		// 모든 인스턴스 Method에 지역변수로 숨겨진 채로 존재. 
		// 인스턴스 주소 자체를 저장하고 있음.
		
		// this는 인스턴스를 구분하기 위해 쓰는 키워드. 
		// this를 쓰지 않아도 사실 인스턴스 변수에 인스턴스 별로 
		// 값은 세팅 된다. 
		// but 지역변수와 인스턴스변수를 정확하게 구분하기 위해 this를 쓰는 것 뿐이다. 
		
		this.water = water;
		this.life = life;
		this.gravity = gravity;
		this.humanity = humanity;
		this.country = country;
//		this(); / this 메소드 
		// 같은 클래스 내에서 다른 생성자를 호출할 때 사용하는 메서드,
		
	}
	
	ConstExam( boolean life, int gravity, int humanity, String country) {
		// this
		// 자기 자신을 가리키느 참조 변수;
		// 모든 인스턴스 Method에 지역변수로 숨겨진 채로 존재. 
		// 인스턴스 주소 자체를 저장하고 있음.
		
		// this는 인스턴스를 구분하기 위해 쓰는 키워드. 
		// this를 쓰지 않아도 사실 인스턴스 변수에 인스턴스 별로 
		// 값은 세팅 된다. 
		// but 지역변수와 인스턴스변수를 정확하게 구분하기 위해 this를 쓰는 것 뿐이다. 		

		this.life = life;
		this.gravity = gravity;
		this.humanity = humanity;
		this.country = country;
//		this(); / this 메소드 
		// 같은 클래스 내에서 다른 생성자를 호출할 때 사용하는 메서드,
		
	}



	public static void main(String[] args) {
		// 생성자
		// 1. 특별한 Method
		//   - 인스턴스 초기화 Method
		// 2. 인스턴스 생성시 항상 필요한 Method
		
		// 생성자의 특징
		// 1. 클래스명과 항상 동일
		// 2. 인스턴스 생성 시 한번만 호출 됨 
	
		ConstExam  germany   = new ConstExam(true, true, 10, 8320 , "독일" );
		ConstExam  england   = new ConstExam(true, true, 10, 6500 , "잉글랜드" );
		System.out.print(germany.country);
		System.out.print("\t"+germany.water);
		System.out.print("\t"+germany.life);
		System.out.print("\t"+germany.gravity);
		System.out.println("\t"+germany.humanity);

		
		System.out.print(england.country);
		System.out.print("\t"+england.humanity);
		System.out.print("\t"+england.gravity);
		System.out.print("\t"+england.life);
		System.out.print("\t"+england.water);

	}
}
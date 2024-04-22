package op0108;	


//Object 클래스 = > 자바의 최상위 클래스, property
// => 자연스러운 기능; 내장메소드 

//하나의 인스턴스는 여러개의 참조변수를 가르키는 경우는 얼마든지 가능 
// 하지만 여러개의 인스턴스를 하나의 참조변수로 가리키는 것은 불가능하다. //하나의 인스턴스에 하나의 값만 들어감 

//정처기 실기위주 공부??
// 실기 위주 공부시 필기 문제 이해 
// 기출 문제 5년치 풀고 가기 (1주일 전에) 
// 문제 자체를 확실히 이해 하고 가기;
// 실기는 길게, 필기는 짧게 



// class
// object
// 내장 class
// 사용자 정의 class, 


//클래스와 클래스 변수는 메소드 영역임.  메소드 영역의 특징
//클래스 변수 = 인스턴스의 생성없이 어디서든 가져다 쓸 수 있는 클래스들;
//  => 메모리에 이미 할당이 되어 있기에 가능;
//  클래스는 인스턴스 생성 이전에 미리 준비 되어있음



public class JMClass {
	
	// 속성  [멤버 변수]
	//       => 클래스 내에 선언된 변수;
	int hp = 100;  // 인스턴스 변수
	int mp; //인스턴스 변수
	static int age = 20;  //정적 변수(클래스 변수) // static => 접근 제어자만 문제 없다면, 언제 어디서든 접근할 수 있는 변수 
	double height = 177.3;
	String gender = "남";
	String mbti = "INTJ";
	String bType = "B"; //bType == blood Type;
	boolean weapon = false ;
	boolean gunchim = false ;
	
	
	//인스턴스를 만들어 heap에 할당 
	
	
	
	// 행동
	public void swingBat() {
		System.out.println("빠따를 휘두르기?");
	}
	
	
	//쉬는시간
	public void rest() {
		this.mp++;
		smoke();
		sleep();
	}
	
	public void smoke() {
		System.out.println("뻐끔뻐끔");
	}
	
	public void sleep() {
		System.out.println("gg");
	}
	
	
	
	//점심시간
	public void eat() {
		this.hp++;
		System.out.println("nummy");
	}
	
	
	public static void main(String[] args) {
		JMClass jm = new JMClass ();
		JMClass jm2 = new JMClass ();
		//new 연산자로 JMClass의 jm 인스턴스를 만들어 heap에 할당
		
		
		
		
		jm.rest();
		
		System.out.println(jm.mp);
		System.out.println(jm2.mp);
	}
}

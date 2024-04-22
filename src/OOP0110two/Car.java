package OOP0110two;

public class Car {
	//quiz
	// 이 클래스에는 
	// speed 라는 속성과
	
	// 해당 속성을 세팅하는 생성자와 기본 생성자가 필요
	// 세개의 메서드 제작
	// 1.speedUp - speed 멤버 변수의 값을 10 증가
	// 2.speedDown - speed 멤버 변수의 값을 10 하락, 
	//				- 10 이하인 경우 0으로 초기화 
	// 3. stop - 속도를 0으로 초기화 
	
	// sports car 클래스는
	// 생성자를 정의하고, 
	// 다음의 조건 만족  (Car 클래스 상속 받을 것)
	// 1. speedUP - 속성값 20 증가
	// 2. stop - 재정의 하여 다음의 메세지 출력
	//   -스포츠카는 빨간 불에도 멈추지 않아 boy
	
	int speed;
	
	Car(){
		this.speed = 0;
	}
	Car(int speed){
		this.speed = speed;
	}
	
	public  void speedUp() {
		this.speed +=10;
	}
	
	public void speedDown() {
		this.speed = this.speed-10;
		if(this.speed < 0) {
			this.speed = 0;
			System.out.println("초기화");
		}
		
	}
	
	public void stop() {
		this.speed = 0;
	}
	
}

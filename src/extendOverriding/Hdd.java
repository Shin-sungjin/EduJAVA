package extendOverriding;

public class Hdd extends Object{
	
	 int size;
	 int rpm;
	
	 Hdd(){
		this.size = 0;  //this는 인스턴스 구분자
		this.rpm = 0;
	}
	 Hdd(int size, int rpm){
		this();
		this.size = size;
		this.rpm = rpm;
	}
	
	 void serchStat() {
		System.out.println(this.size);
		System.out.println(this.rpm);
	}
	
	public  void main(String[] args) {
		
		Hdd hd = new Hdd();			
		System.out.println("hd");
		hd.serchStat();
		
		Hdd hd2 = new Hdd(100, 5000000);	
		
		System.out.println("hd2");
		hd2.serchStat();
	
		}
	}
	
	
	//quiz
	// 생성자를 두개 생성 
	// 1. non
	// 2. 속성 모두 파라미터로 가지고 있는 생성장
	// 조건, 인스턴스 생성시, 속성값을 세팅할 수 있어야 함
	// 퀴즈 3.
	// 3. 해당 매서드 호출 시 용량과 속도를 알 수 있는 
	//     -serchSet() 매서드 구현 
	//		- 파라미터 와 리턴 은 필요하다고 판단되면 정의


	

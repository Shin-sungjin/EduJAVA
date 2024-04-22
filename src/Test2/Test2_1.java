package Test2;

import java.util.Scanner;

public class Test2_1 {
	
		static Scanner sc = new Scanner(System.in);   //스캐너 선언
		private double area;    //넓이 선언
		final double PI = 3.141592;    //파이 값 상수 선언

		public Test2_1() {
			this.area = 0;			//생성자 0.0 으로 초기화
		}

		public void circle() {
			int r;				//반지름 r

			System.out.println("\n**** 원의 넓이 ****");          //해당 도형이 선택 되면 도형 내에서 원의 넓이 설정
			System.out.print("반지름 : ");	r = sc.nextInt();		//r 값 을 스캐너로 불러옴

			area = r * r * PI;		// 원 넓이 공식
			output();
		}

		public void triangle() {    //삼각형
			int b, h;

			System.out.println("\n**** 삼각형의 넓이 ****");   //역시나 여기서 입력 받음
			System.out.print("밑  변 : ");	b = sc.nextInt();
			System.out.print("높  이 : ");	h = sc.nextInt();

			area = (double)b * h / 2;
			output();  //출력
		}

		public void trapezoid() {
			int a, b, h;
			//역시나 여기서 입력 받음
			System.out.println("\n**** 사다리꼴의 넓이 ****");
			System.out.print("아랫변 : ");	a = sc.nextInt();
			System.out.print("윗  변 : ");	b = sc.nextInt();
			System.out.print("높  이 : ");	h = sc.nextInt();

			area = (double)(a + b) * h / 2;
			output();
		}

		public void output() {
			System.out.printf("넓이 : %.2f\n\n", area);  //area 출력 하고, 개행 두번
		}

		public int menu() {
			int n;
			//시작 menu 코딩
			System.out.println("**** 도형선택 ****");
			System.out.println("1. 삼각형");
			System.out.println("2. 원");
			System.out.println("3. 사다리꼴");
			System.out.println("4. 종료");
			System.out.print("선택 : ");
			n = sc.nextInt();
			// 스위치 구문을 이용해서, 바로 받아옴
			switch (n) {
				case 1 :	triangle();		break;
				case 2 :	circle();		break;
				case 3 :	trapezoid();	break;
				case 4 :	System.out.println("\n감사합니다^.^");
			} // 케이스 별 정리 
			
			return n;  //n값 리턴
		}

		public static void main(String[] args) {
			Test2_1 ob = new Test2_1();
			
			while(true){
				if(ob.menu() == 4) break;;  // 4번으로 입력 바을 시 break;
			}
			sc.close();   //스캐너 닫기 
		}
	}



// 다시 돌아온 내 코드 리뷰 Time!
/*
 * package SSJ_Quiz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class figure {   
	private double area;		// 넓이 설정
	private final double PI= 3.131592;  // 상수 지정
 	
	public figure(){
		this.area =0.0;		// 0.0으로 초기화
	}
	
	
	//각 도형 메소드는 계산 결과만 반환 .
	public double circle(int r){
		this.area = r * r* PI;			
		return area;
	}
	
	public double trinagle(int h , int x) {
		this.area = (h*x) / 2 ;
		return area;
	}
	
	public double trape(int up, int down, int h) {
		this.area = (up+down) *h /2;
		return area;
	}
	
	
	//output 메소드를 활용했어야 하는데, 만들어두고 사용하지 않음
	 // 사실상 각 값의 return 값 자체가, 바로 메소드 호출에서 받아오는게 더 좋을 것이라고 생각했으나
	  * 강사님 코드와 비교했을 때, main 코드가 더 간결해보여, output 을 활용해도 괜찮았을 것 같다. 
	public void output() {
		System.out.println(this.area);
	}
	
	//메뉴 코딩
	public  void menu() throws IOException{  
		System.out.println("***도형선택***");
		* buffer가 더 익숙하여 bufferedReader 사용
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
				
		* 질문지 셋		
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
		System.out.println("선택 : ");
		
		int answer = Integer.parseInt(br.readLine());
		
		switch(answer){  /스위치 구문으로 각각 필요한 말들과 결과값 출력 결과 코딩
			case 1:  //삼각형
				System.out.println("**** 삼각형의 넓이 ****");
				System.out.print("밑변 :");
				int x =Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print("높이 :");
				int h =Integer.parseInt(br.readLine());
				System.out.println("넓이 : "+ trinagle(x,h));
				break;
				
			case 2: ; //원
				System.out.println("**** 원의 넓이 ****");
				System.out.println("반지름 :");
				int r =Integer.parseInt(br.readLine());
				System.out.println("넓이 : "+ circle(r));
				break;
			case 3:  //사다리꼴
				System.out.println("**** 사다리꼴의 넓이 ****");
				System.out.print( "아랫 변 : ");
				int u = Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print( "윗 변 :");
				int d = Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print( "높이 :");
				int th = Integer.parseInt(br.readLine());
				System.out.println("넓이 : "+ trape(u, d, th));
				break;
			case 4:
				System.out.println("종료합니다.");
				break;
			}
	}

		//Main
		public static void main(String[] args) throws IOException {
			figure fi = new figure();
			fi.menu();
				
		}


}

 */


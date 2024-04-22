package method;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import basic.inputSc;

public class MethodExam {

	
	public  int[] mul1to9() {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("1~20 사이의 수를 입력하면 1~9까지 곱한결과를 출력해드림");
		      int j = sc.nextInt();
		      
		      for(int i=1; i<=9; i++) {
		         System.out.println(j + " * "+i+ " = "+ j * i);
		      }
		      
		      
		      int[] gunchim = {10, 20, 30};
			   // 리턴 값 을 여러개 주는 방법이 있는가?
			   // return type으로 arr 가 올 수 있냐?
		      // 배열 이용하면 가능      
		      return gunchim;

		   }
	
	public static void sungjin(){
		//public 캡슐화의 핵심. 이거 활용 못하면, 자바 안배운거임 	
		System.out.println("굼침이 싹돌고~");
	}
	
	public static void main(String[] args) throws IOException{
		// 함수
		// 입력에 대한 작업의 결과를 출력해주는 기능(코드)의 모음
		// 특정한 용도의 코드를 한곳에 모아둔 것
		
		// 메서(소)드
		// 클래스 내부에 구현된 함수 
		
		//함수와 Method 의 차이점
		//클래스를 포함하느냐, 아니냐
		
		// 자바에서는 함수라는 용어는 거의 쓰지 않음. 
		// reason : 자바의 코드는 클래스 내부에서 실행되는 경우가 대부분; 
		// -> 그렇다면 우리가 지금까지 숨쉬듯 사용한 main도 메서드?
		// -> ㅇㅇ/ 그리고 자바는 코드가 싫행될 때, 제일 먼저 main method 실행. 
		
		
		// Java file 실행 process
		// 개발자(user)가 코드를 작성하고 저장하는 순간
		// ->자바 소스(코드)파일[.java file] -> 컴파일러에 의해서 
		// -> byte 코드로 구성된 byte 코드로 변환 됨(.class) =>bin 파일에 저장됌
		// 변환된 byte 코드 파일을 Class Loader를 통해 실행 엔진으로 넘겨 // jvm 중 Class Loader로 전달. / (jvm은 Class Loader / Execution 존재)// Class Loader = > Runtime Data area 까지 전달. 
		// byte 코드를 실행 가능하도록 해석  // 그 과정에서 => Execution 의 interpreter, compiler 로 번역/  (해당 구역에 Garbage Collector 가 존재)[메모리 관리]
		// -> 실행 엔진은 번역이 끝나면 런타임 데이터 영역으로 넘겨  // Runtime Data Area =>  본격적으로 데이터가 저장 된 공간
		/// 운영체제로 부터 메모리 영역을 할당 받고 프로그램을 실행 
						
		// JVM (자바 버츄얼 머신) 
		// 자바와 운영체제 사이에서 메모리 관리 및 자바 코드 실행 등을 처리해주는 
		// S/W
		// 가상 머신 자체가 원래 있는 기계, 서버 없이 가상으로 구현해버리는 것,. 
		// 가상화, 컨테이너 이런 개념들이 요즘 hot 해짐 
		// 운용 비용 대폭 절감 가능 
		
		
		//Method 예시 
		//Quiz 
		// 사용자로부터 1~20 사이의 숫자를 입력받아 
		// 입력 받은 숫자의 1~9 까지의 곱셉결과를 출력하는 
		// 코드를 작성 
		
		
//		System.out.println("1~20 사이 수를 입력하세요");
//		
//		BufferedReader br =
//				new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		
//		if(num>20){
//			System.err.println("20 까지만 입력하쇼");
//		}
//		else {
//			for(int i = 1; i <= 9;  i++ ) {
//				System.out.println(num+ " * " + i+ " = " +num * i);
//			}
//		}			
	
		// Method 와 관련된 용어
		// 1. 재사용성
		// 2. ** 인수(argument), 파라미터(매개변수) **
		// 3. return
		// 4. return type
		
		// Method 특징
		//  1. Method는 부를 때만 온다.
		//   - 호출되지 않는 한 절대 실행 안된다.
		//  2.리턴이라는 개념의 유무에 따라 결과 자체와 값 자체가 다를 수 있음.
		
		
		//접근 제어자			리턴타입 		파라미터는 여러개 올 수 있음 
		//public	 static  void 	methodName(파라미터 타입 파라미터 명){
		// method 구현부
		//} 
		
		
		// 인수, 파라미터(인자)
		// 인수(argument) : 메서드로 전달할 값을 적는 부분
		// 파라미터(인자/ 매개변수) : 매서드 호출 시 인수로부터 전달된 값을 받아오는 변수 
		
		
		// return(반환값)
		// return type 이 void인지 아닌지가 기준, 
		
		// 메서드 만들기가 어려운 분들을 위한 tip
		// 1. 우선 Method 선언 전 main 에서 
		//   Method로 묶어둘 코드들을 작성하고 test 한다. 
		// 2. 선언부(변수들) 중 유동적인 변수들은 인수로 
		//    결과를 확인하는 변수는 return value 로 작성되는 경우가 대부분이다. 
		// 3. Main 바깥에 Method 를 선언해 code를 붙여넣고
		//	  결과를 확인한 변수를 리턴값으로 둔다. 
		//	=> 인수로 준 변수의 타입과 파라미터 타입 또한 맞춰야 함. 	
		// 일단 void로 Method 만들고, 다 만든 후 void를 값에 따라 변형
		
		
		//quiz
		// 랜덤 구구단 게임 
		// 프로그램을 실행하면
		// 랜덤 구구단 게임 입니다. 
		// 3초이내에 답을 적어주세요 
		// 2단부터~9단 사이 출력
		// ex)  4 * 8의 =?
		//       6 * 4 = ?
		// 맞추면 정답입니다. 
		// 틀리면 오답입니다. 
		
		
		
		
//		BufferedReader br =
//				new BufferedReader(new InputStreamReader(System.in));
//		
//		int cnt = 0;
//		// 이 코드에서 0을 방지할 수 있는 방법이 있을까?
//		System.out.println("랜덤 구구단 게임입니다.");
//		System.out.println("3초 이내에 답을 적어주세요");
//		
//		
//		for(int i =0; i < 5; i++) {
//		
//			int num1 = (int)(Math.random() * 8) + 2;
//			int num2 = (int)(Math.random() * 8) + 2;
//			
//			//0 방지 코드?
//			if (num1 == 0 || num2 ==0) {
//				--i ;
//				continue;
//			}
//			
//			System.out.print(num1 + " * "+ num2 + " = ");
//			
//			int ans = Integer.parseInt(br.readLine());
//			
//			int result = num1 * num2 ;
//			
//			if (ans == result) {
//				System.out.println("정답입니다.");
//				cnt++;
//			}
//			else if(ans != result) {
//				System.out.println("오답입니다." );
//			}
//		}
//		
//		System.out.println("맞춘 개수는" + cnt + "개 입니다.");
		
//		guguGame();
//		MethodExam me = new MethodExam();
//		me.mul1to9();
//		int[] result = me.mul1to9(); //mul1to9는 리턴 결과로 정수가 넘어옴.
//		System.out.println(result);
		
		MethodExam2 me =new MethodExam2();
		// 전역 변수라고 해도 어느 클래스에 있는지는 알아야 함
		
		
		System.out.println(me.lupy);
		
		
		//가독성, 확장성, 유지보수성, 재사용성
		
		
		

	}
	
	public static void guguGame() throws IOException {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		// 이 코드에서 0을 방지할 수 있는 방법이 있을까?
		System.out.println("랜덤 구구단 게임입니다.");
		System.out.println("3초 이내에 답을 적어주세요");
		
		
		for(int i =0; i < 5; i++) {
		
			int num1 = (int)(Math.random() * 8) + 2;
			int num2 = (int)(Math.random() * 8) + 2;
			
//			0 , 1방지 코드?
			if (num1 < 2 || num2 < 2) {
				--i ;
				continue;
			}
//			 단점은 평소보다 반복을 많이 할 수 있음
			
//			if(num1 < 2) {
//				num1 = 2;
//			}
//			if (num2 < 2) {
//				num2 = 2;
//			}
//			
			System.out.print(num1 + " * "+ num2 + " = ");
			
			int ans = Integer.parseInt(br.readLine());
			
			int result = num1 * num2 ;
			
			if (ans == result) {
				System.out.println("정답입니다.");
				cnt++;
			}
			else if(ans != result) {
				System.out.println("오답입니다." );
			}
		}
		
		System.out.println("맞춘 개수는" + cnt + "개 입니다.");
	}
	
	// 리턴 타입 설명 
	// 리턴 타입 
	// void  - 즉 리턴 값 없는 메소드 
	// 리턴 타입에 올 수 있는 현태 
	// 일반 타입 전부 ( int, boolean, byte[첨부 파일 등], long 등) , 참조 타입도 가능 
	
	// 리턴타입의 의의 
	// 예를 들어 return type가 int 라면 = > return  값에 정수가 들어가야 한다. 
	//  ->  return (int)(Math.random() * 8) + 2; => 이렇게도 사용함 
	//   return type 과 값의 형이 다를 시 에러 
	
	







}



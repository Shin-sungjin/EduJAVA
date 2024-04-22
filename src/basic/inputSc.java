package basic;

import java.util.Scanner;

public class inputSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// user로 부터 값을 입력받기 
		// Scanner : 사용자(클라이언트)로부터 입력 받기 위한 클래스
		
		//아래 sc = 객체(인스턴스), "." => method 호출,  
		Scanner in = new Scanner(System.in);  //객체 지향 프로그램과 관련 있는 문법 구조 
		
		// Scanner를 통해 만들어진 무언가를 실행할 때는, 프로그램의 실행이 잠시 대기 된다. 
		// 사용자의 입력이 있을 때까지 대기한다. 
//		int num = sc.nextInt();
//		System.out.println("사용자가 입력한 숫자\t" +  num);
		
		// Scanner 사용시 주의사항 
		// 1.필요할때만 써야한다. (안쓰는 코드는 주석처리) /개발 단계에서 마지막에 input 값 함
		// 2. 문자열을 입력받을 때 주의해야한다. 
		//    - 저장할 변수의 타입 또한 잘 맞춰야함.
		// 3. Scanner는 사용 시 호출이 필요하다. (import 필요)
		// 4. 공백이나 개행을 기준으로 데이터 처리, 
		
		// Scanner Method 정리 
		// Scanner 객체명
		// 객체명.nextInt();
		// nextByte()
		// nextInt()
		// nextLong()
		// nextFloat()
		// nextDouble()
		//  -----------해당 타입을 입력 받을 때 사용.
		// next()    //문자열 타입을 입력 받음  (공백을 기준으로 단어를 읽음)
		// nextLine()  //문자열 타입을 입력 받음.  (개행을 기준으로 한 줄을 읽음)
		

//		byte a = in.nextByte();       // byte 형 입력 및 리턴
//		short b = in.nextShort();       // short 형 입력 및 리턴
//		int c = in.nextInt();          // int 형 입력 및 리턴
//		long d = in.nextLong();       // long 형 입력 및 리턴
//		
//		float e = in.nextFloat();       // float 형 입력 및 리턴
//		double f = in.nextDouble();    // double 형 입력 및 리턴
//		
//		boolean g = in.nextBoolean();    // boolean 형 입력 및 리턴		
		String h = in.next();          // String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
		String i = in.nextLine();       // String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
			  
		System.out.println(h);
		System.out.println(i);
		
		
	}

}

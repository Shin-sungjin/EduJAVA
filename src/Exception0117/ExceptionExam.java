package Exception0117;

import java.util.Iterator;

public class ExceptionExam {

	// 오류 
	// 에러, 예외 라는 표현 
	// 에러 : 의도치 않게 프로그램이 종료 되는 것 
	// 		흔히 하드웨어의 잘못된 동작으로 발생 
	//		프로그램이 비정상적으로 종료되며 장상 실행상태로 돌아가기가 매우 어려움
	// 		
	// 예외 : 사용자의 잘못된 조작이나 개발자의 잘못된 프로그래밍으로 
	//		인한 오류
	//		예외가 발생하면 프로그램이 종료됨
	//		예외처리를 통해 프로그램의 종료를 막을 수 있음. 
	
	// 예외의 종류 
	// 일반 얘외(컴파일 예외, checked exception)[Syntax Error라고 하기도 함]
	// 실행 예외 (런타임 예외, unchecked exception)
	 	
	// NullPoinerException
	// ArrayIndexoutofBoundException
	// NumberFormatException
	
	public static void main(String[] args) {
		// 산술 예외 
		
		//예외 처리 예시 

		//try~catch 구문
		
		
		try {
			int gunchim = 10/0;
			System.out.println(gunchim);
		} catch (Exception e) {
			// TODO: handle exception\
			//printStackTrace
			// 에러 로그를 확인 하는 Method;
			// 주의사항 : 쓰고 불필요 할 시 반드시 지울 것. * 해킹 위험이 있음
			e.printStackTrace();
			System.err.println("0으로 한번만 더 나누면 춘식이로 만들어버릴게 ");
		}
	
		//catch가 실행되면 프로그램은 어떻게 될까?
		System.out.println("되냐?");
		System.out.println("왜 되냐 이게");
		
		int[] arr = new int[5];
		
		try {
			for (int i = 0; i< 6; i++) {
				arr[i] = 10;
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println("배열의 한계치 넘음");
		}
		
		
		//데이터 전송 영역은 무조건 예외처리가 필수!!
		
	
	
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
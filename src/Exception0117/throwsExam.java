package Exception0117;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.nio.Buffer;

public class throwsExam {

	//데이터가 오갈 때 강제적으로 예외처리가 필요.
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// throws(던지기/ 예외 떠넘기기)
		// 메서드 호출 한 곳에서 예외를 처리하라고 떠넘기는 구조 
		// 주의 사항 : 호출 한 곳에서는 반드시 예외 처리 코드가 있어야 한다. 
		// throws를 통해 예외를 강제로 발생 시켜 예외 커스텀이 가능함.
		
		
		// Exception(예외 최상위 클래스)  -> Throwable (Exception 위에 있음)
									 // 모든 예외와 오류를 관장
		//일반적인 try~catch
		//throws 보다 try~catch 가 조금 더 안정적임.
		try {
			Method1();
		} catch (Exception e) {
			System.out.println("0으로 나누지 말라고");
		}
	
		//BufferedReader
		// 스캐너를 대체하여 사용하는 클래스. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
	
	}
	
	
	public static void Method1() throws Exception {
		Method2();
	}
	
	public static void Method2() throws Exception{
		System.out.println(100/0);
	}

	
	
}

package Exception0117;

class A{}
class B extends A{}
class C extends A{}

interface i{}

class D implements i{}
class E implements i{}


public class ExceptionExam2 {
	public static void main(String[] args) {

		//다중 예외 처리 (multi catch) 
		
		try {	

			A a = new B();
			B b = (B) a;
			//코숏 (B)는 A(고양이다)
			// 코숏은 B = 고양이다.?
			//classCastException
			A a1 = new B();
			C c = (C)a1; //B와 C는 전혀 관계없는 클래스이기에 캐스팅 불가. 
	
			String str = null;
			// nullPointException
			// 널값을 가공, 이용 하려 할 때 발생 
			// 
			System.out.println(str.toString());
			
		} 	
		catch (ClassCastException e) {
			System.out.println("클래스 오류 ");
			e.getMessage();
		}
		
		catch (NullPointerException e ) {
			// TODO: handle exception
			System.out.println("널 포인터");
			
		}
		// multicatch 구문
//		catch (NullPointerException \ NumberFormatException m) {
//			// TODO: handle exception
//			System.out.println("널 포인터");
//			
//		}
		catch (Exception e) {  //Exception은 항상 아래에 두어야 하며,  맨 윗쪽에 넣어둔다면, 어떤 예외인지 확인할 수 없음 
							   // 혹시 모를 상황에 대비하여, 맨 아래에 최상위 Exception을 두는 것
			
			System.out.println("에러 ");
				// TODO: handle exception
		}
	
		// finally
		// 예외 처리에서 반드시 실행되는 코드 
		// 예외 유무 상관없이 무조건 실행 
		finally {
			System.out.println("군침이 싹 도는 군 ");
		}
		
		
		System.out.println("배달의 민족 요기요");
		
		
	}
}

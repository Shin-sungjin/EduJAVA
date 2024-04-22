package OOP0115;

public class InnerClassExam {
	
	//중첩 클래스(인스턴스 멤버 클래스)
	class gunchim{
		//
		int test = 10;

		
		public void ssak() {
			System.out.println("군침도노");
		}

		
		gunchim() {
 
		}
	}
	//정적 멤버 클래스 
	static class gunchim2{
		//
		int test = 10;

		
		public void ssak() {
			System.out.println("군침도노");
		}

		
		gunchim2() {
 
		}
	}
	
	
	public void gohomehagosipuninseo() {
		//지역 클래스(local class)
		// Method 내부에 선언하여 잠깐만 사용 후 폐기하는 용도.
		
		class gunchimssak{
			
		}
		
		gunchimssak gsk = new gunchimssak();
		
	}
	
	public static void main(String[] args) {
		
		// 중첩 클래스 
		// 클래스 내 멤버 변수로 선언되어진 클래스 
		// 하나의 클래스가 다른 클래스의 멤버 변수로 선언된 경우 . 
		// 안드, SWING, FX(gui)에서 이벤트 처리 시 사용
	}
}

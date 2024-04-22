package Exception0117;


// 클래스 첫 글자가 대문자여야 하는 이유
// 1. 메서드와 구분을 쉽게 하기 위함 
public class ThrowsExam2 {

	
	public static void main(String[] args) {
		
		try {
			System.out.println("군침이 싹 안돌음 ㅡ.ㅡ  ");
			throw new Exception("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		} catch (Exception e) {
			System.out.println("이거실행되면 catch");
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
}

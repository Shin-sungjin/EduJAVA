package op0108;

public class StringObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String Object; 자바에서 특별한 개체 
		// String을 기본타입이자, 참조타입. 
		// 자바에서 특별하게 관리하는 참조타입일 뿐임 
		
		
		//문자열 생성시마다 방법읻 달라짐

		
		// 문자열 상수.
		String gunchim = "saak";   //스트링만 오로지 이러한 표현 가능
		
		// String Class 를 이용한 문자열 만들기 
		
		String str1 = new String("군침이 하나도 안돌음");
		//							생성자 - 인스턴시 생싱시 무조건 호출 
		
		//StringClass의 format Method 활용하기 
		// %s =  문자 format code
		// %d =  숫자
		// %f =  실수
		// \t   <<----- 이스케이프 코드 
		String str2 = String.format("%s도네", "군침이 싹");
		//%s 자리에 args 불러옴
	
		String str3 = String.join("%s%s", new String[] {"군","침"});
	
		
//		System.out.println(str2);
//		System.out.println(str3);
		
		
		//문자열에서 문자추출
		//chatAt();
		// 문자열에서 해당 인덱스에 있는 문자를 추출
		// 변수명(리터럴 문자열).charAt(인덱스 번호);
		String str4 = "tired";
		System.out.println(str4.charAt(0));
		System.out.println(str4.charAt(1));
	
		//문자열 비교 
		//equals  -> 주소가 저장하고 있는 문자열을 토큰화 하여 비교 
		//비교변수1.equals(비교변수2)  
		String gunchimking = "내가군침킹"; // 문자열 상수
		String gunchimKing2 = new String("내가군침킹");  //String 인스턴스임 
//		System.out.println(gunchimking == gunchimKing2);
		System.out.println(gunchimking.equals(gunchimKing2));  //안정적
		
		
		
		for(int i = 0; i<str4.length(); i++) {
			System.out.println(str4.charAt(i));
		}
	
	
	
	
	
	
	
	
	
	}

 }

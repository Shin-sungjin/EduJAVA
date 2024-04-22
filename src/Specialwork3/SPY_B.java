package Specialwork3;

public class SPY_B  implements Decryption{
	private String code;
	
	SPY_B(SPY_A spy1) throws Exception{ //구현부에서 즉시 코드를 삽입하는 경우
	
		this.code = decrypt(spy1.get_Code()); //디코딩이 왜 안되누,
	}


	//암호화이기 때문에, getter준비
	public String getCode() {
		return this.code;
	}
	
	//ㅊ음 복호화 알고리즘을 생성할 떄 
	//여러가지 에러가 많이 보였다.
	// 처음부터 빌더를 쓰지 않았고, 처음엔 replace를 사용하였지만 중복된 모든 알파벳이 변환을 여러번 거치는 경우가 있어 
	// 값의 변조가 일어나는 문제가 있었다. [제대로 복호화 되지 않음]
	// 그래서 replaceFirst 를 통해 복호화를 시도해보았지만
	// 어째선지 인덱스 0번의 문자열이 변환이 아닌 추가가 되는 형식이라, 인덱스 0번의 복호 값만 계속 추가 되었었다.
	// ex >[bb~
	//  =? hh[bb~
	// 이런식으로 전개가 되어서 builder를 사용해 setChar 메소드를 통해 특정인덱스 값만 변환하도록 하였다. 
	
	
	//암호화 구현에서는 쉽게 쉽게 작성했고 10분 정도 걸렸지만
	// 복호화 과정의 구현이 꽤나 어려웠다. 
	@Override
	public String decrypt(String message) {
		int len2 = message.length();
		for(int i = 0; i <len2 ; i++) {
			StringBuilder sb = new StringBuilder(message);
			char ch =message.charAt(i);
			char fix = (char) (ch +len2);	
			String chg1 =String.valueOf(ch);
			String fixed = String.valueOf(fix);
			
			//StringBulider로 바꾸고 난 이후 별 쓸모없는 내용일 듯 하다.
			if(chg1.contains("*") || chg1.contains("+")|| chg1.contains("-") || chg1.contains("?")) {
				chg1 =(String) "\\%s"+ chg1;
				sb.setCharAt(i, fix);
				message =sb.toString();
			}
			else{
				sb.setCharAt(i, fix); 
				message =sb.toString();
			}
		}
		return message;
	}
	

}

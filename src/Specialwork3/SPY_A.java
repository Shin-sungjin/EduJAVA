package Specialwork3;

import java.util.Random;

public class SPY_A implements Encryption{
	private String code;

	// 코드 삽입시 즉시 암호화
	SPY_A(String code){
		this.code = encrypt(code);
	}
	
	public String get_Code() {
		return this.code;
	}
	
	//여러가지 문자열로 test 중 len의 길이가 비정상적으로 길어지거나, 
	// 띄어쓰기가 들어오는 경우 복호화가 잘 되지 않았다. 
	
	//원래 코드 상 이부분은 replaceFirst를 사용하였지만
	// 여기도 Bulider를 통해 암호화 하기로 한다. 
	@Override
	public String encrypt(String message) {
		int len = message.length();
		
		for(int i = 0; i < len; i++) { 
			StringBuilder sb = new StringBuilder(message);
			char ch = message.charAt(i);
			char fix = (char) ((char)ch -len);
			String chg1 =String.valueOf(ch);
			String fixed = String.valueOf(fix);
			sb.setCharAt(i, fix);
			message =sb.toString();
		}
		return message;
	
	}
}

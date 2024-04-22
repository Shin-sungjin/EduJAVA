package Specialwork3;


// 암호는 APPLE
// ex) 암호화 = > Abc Prablem Painapple Learder Eduecation
// 그냥 암호화 알고리즘을, 해당 문자열의 길이만큼 
// 아스키 코드의 값을 -한 값으로 대치하였다.
// 띄어쓰기 기준으로 첫 대문자로 암호화
public interface Encryption {
		//암호화 인터페이스 
	
// 생각해보면 해당 문자열을 2진화로 변환
// => 1일 경우 모스부호, 0일 경우 공백 처리를 통해
// 암호화 해도 좋았을듯!
// 근데 탄로 날 가능성이 크다...
	
	
//예외 처리를 활용하여 
// 에러가 날 경우가 진짜 코드인 경우도 괜찮을 듯;
// 아니면 에러가 날 경우를 if 로 정의해두고 가짜 코드를 주는 방법도 괜찮을 듯
	
	

	String encrypt(String message);
}


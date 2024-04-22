package Specialwork3;

public class encryptionMain {
	/*문제:
		양방향 통신을 위한 인터페이스를 구현하여 송신과 수신을 처리하는 프로그램을 작성하시오.

		스토리:
		"스파이 A는 중요한 정보를 스파이 B에게 전달해야 합니다. 
		그러나 통신 경로에 적군 C가 있을 수 있으므로, 정보를 보낼 때는 암호화하여 보내야 합니다. 
		스파이 A와 스파이 B는 암호화 및 복호화를 위한 특수 장치를 갖추고 있습니다. 
		각각의 장치는 Encryption과 Decryption 인터페이스를 구현해야 합니다."

		인터페이스:
		interface Encryption {
		    String encrypt(String message);
		}

		interface Decryption {
		    String decrypt(String message);
		}
		요구사항:

		Encryption 인터페이스를 구현하여 encrypt 메서드를 작성하시오. 이 메서드는 문자열을 암호화한 후 암호화된 문자열을 반환해야 합니다.
		Decryption 인터페이스를 구현하여 decrypt 메서드를 작성하시오. 이 메서드는 암호화된 문자열을 복호화한 후 원래의 문자열 반환해야 합니다.
		암호화와 복호화에 사용되는 알리즘은 자유롭게 선택하십시오. (예: 시저호, XOR 암호 등)

		 if (Character.isLetter(c)) {
		                c =char) (((c - 'a' - 3 + 26) % 26) + 'a');  // 시저 암호 복호화 알고리즘 (알파벳 문자에만 적용)
		     }
	
	*/
	public static void main(String[] args) throws Exception {
		SPY_A spy1 = new SPY_A("gunchimSaaak");
		

		SPY_B spy3 = new SPY_B(spy1);
		
	
		
		
		System.out.println(spy1.get_Code());
//		System.out.println(spy2.getCode());
		System.out.println(spy3.getCode());
		
		
// 어디에 활용할 수 있을까?
// 사이트 비밀 번호 암호화 
//ex) 
		
//POST
// get_Code(password);;
//GET
// get_Code(spy1);
	}
}


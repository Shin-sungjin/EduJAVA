package Specialwork3;

import java.util.Random;

public class SPY_A implements Encryption{
	private String code;

	// �ڵ� ���Խ� ��� ��ȣȭ
	SPY_A(String code){
		this.code = encrypt(code);
	}
	
	public String get_Code() {
		return this.code;
	}
	
	//�������� ���ڿ��� test �� len�� ���̰� ������������ ������ų�, 
	// ���Ⱑ ������ ��� ��ȣȭ�� �� ���� �ʾҴ�. 
	
	//���� �ڵ� �� �̺κ��� replaceFirst�� ����Ͽ�����
	// ���⵵ Bulider�� ���� ��ȣȭ �ϱ�� �Ѵ�. 
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

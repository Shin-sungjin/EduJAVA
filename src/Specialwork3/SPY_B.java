package Specialwork3;

public class SPY_B  implements Decryption{
	private String code;
	
	SPY_B(SPY_A spy1) throws Exception{ //�����ο��� ��� �ڵ带 �����ϴ� ���
	
		this.code = decrypt(spy1.get_Code()); //���ڵ��� �� �ȵǴ�,
	}


	//��ȣȭ�̱� ������, getter�غ�
	public String getCode() {
		return this.code;
	}
	
	//���� ��ȣȭ �˰����� ������ �� 
	//�������� ������ ���� ������.
	// ó������ ������ ���� �ʾҰ�, ó���� replace�� ����Ͽ����� �ߺ��� ��� ���ĺ��� ��ȯ�� ������ ��ġ�� ��찡 �־� 
	// ���� ������ �Ͼ�� ������ �־���. [����� ��ȣȭ ���� ����]
	// �׷��� replaceFirst �� ���� ��ȣȭ�� �õ��غ�������
	// ��°���� �ε��� 0���� ���ڿ��� ��ȯ�� �ƴ� �߰��� �Ǵ� �����̶�, �ε��� 0���� ��ȣ ���� ��� �߰� �Ǿ�����.
	// ex >[bb~
	//  =? hh[bb~
	// �̷������� ������ �Ǿ builder�� ����� setChar �޼ҵ带 ���� Ư���ε��� ���� ��ȯ�ϵ��� �Ͽ���. 
	
	
	//��ȣȭ ���������� ���� ���� �ۼ��߰� 10�� ���� �ɷ�����
	// ��ȣȭ ������ ������ �ϳ� �������. 
	@Override
	public String decrypt(String message) {
		int len2 = message.length();
		for(int i = 0; i <len2 ; i++) {
			StringBuilder sb = new StringBuilder(message);
			char ch =message.charAt(i);
			char fix = (char) (ch +len2);	
			String chg1 =String.valueOf(ch);
			String fixed = String.valueOf(fix);
			
			//StringBulider�� �ٲٰ� �� ���� �� ������� ������ �� �ϴ�.
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

package Specialwork3;

public class encryptionMain {
	/*����:
		����� ����� ���� �������̽��� �����Ͽ� �۽Ű� ������ ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		���丮:
		"������ A�� �߿��� ������ ������ B���� �����ؾ� �մϴ�. 
		�׷��� ��� ��ο� ���� C�� ���� �� �����Ƿ�, ������ ���� ���� ��ȣȭ�Ͽ� ������ �մϴ�. 
		������ A�� ������ B�� ��ȣȭ �� ��ȣȭ�� ���� Ư�� ��ġ�� ���߰� �ֽ��ϴ�. 
		������ ��ġ�� Encryption�� Decryption �������̽��� �����ؾ� �մϴ�."

		�������̽�:
		interface Encryption {
		    String encrypt(String message);
		}

		interface Decryption {
		    String decrypt(String message);
		}
		�䱸����:

		Encryption �������̽��� �����Ͽ� encrypt �޼��带 �ۼ��Ͻÿ�. �� �޼���� ���ڿ��� ��ȣȭ�� �� ��ȣȭ�� ���ڿ��� ��ȯ�ؾ� �մϴ�.
		Decryption �������̽��� �����Ͽ� decrypt �޼��带 �ۼ��Ͻÿ�. �� �޼���� ��ȣȭ�� ���ڿ��� ��ȣȭ�� �� ������ ���ڿ� ��ȯ�ؾ� �մϴ�.
		��ȣȭ�� ��ȣȭ�� ���Ǵ� �˸����� �����Ӱ� �����Ͻʽÿ�. (��: ����ȣ, XOR ��ȣ ��)

		 if (Character.isLetter(c)) {
		                c =char) (((c - 'a' - 3 + 26) % 26) + 'a');  // ���� ��ȣ ��ȣȭ �˰��� (���ĺ� ���ڿ��� ����)
		     }
	
	*/
	public static void main(String[] args) throws Exception {
		SPY_A spy1 = new SPY_A("gunchimSaaak");
		

		SPY_B spy3 = new SPY_B(spy1);
		
	
		
		
		System.out.println(spy1.get_Code());
//		System.out.println(spy2.getCode());
		System.out.println(spy3.getCode());
		
		
// ��� Ȱ���� �� ������?
// ����Ʈ ��� ��ȣ ��ȣȭ 
//ex) 
		
//POST
// get_Code(password);;
//GET
// get_Code(spy1);
	}
}


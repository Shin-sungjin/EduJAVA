package op0108;

public class StringObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String Object; �ڹٿ��� Ư���� ��ü 
		// String�� �⺻Ÿ������, ����Ÿ��. 
		// �ڹٿ��� Ư���ϰ� �����ϴ� ����Ÿ���� ���� 
		
		
		//���ڿ� �����ø��� ����� �޶���

		
		// ���ڿ� ���.
		String gunchim = "saak";   //��Ʈ���� ������ �̷��� ǥ�� ����
		
		// String Class �� �̿��� ���ڿ� ����� 
		
		String str1 = new String("��ħ�� �ϳ��� �ȵ���");
		//							������ - �ν��Ͻ� ���̽� ������ ȣ�� 
		
		//StringClass�� format Method Ȱ���ϱ� 
		// %s =  ���� format code
		// %d =  ����
		// %f =  �Ǽ�
		// \t   <<----- �̽������� �ڵ� 
		String str2 = String.format("%s����", "��ħ�� ��");
		//%s �ڸ��� args �ҷ���
	
		String str3 = String.join("%s%s", new String[] {"��","ħ"});
	
		
//		System.out.println(str2);
//		System.out.println(str3);
		
		
		//���ڿ����� ��������
		//chatAt();
		// ���ڿ����� �ش� �ε����� �ִ� ���ڸ� ����
		// ������(���ͷ� ���ڿ�).charAt(�ε��� ��ȣ);
		String str4 = "tired";
		System.out.println(str4.charAt(0));
		System.out.println(str4.charAt(1));
	
		//���ڿ� �� 
		//equals  -> �ּҰ� �����ϰ� �ִ� ���ڿ��� ��ūȭ �Ͽ� �� 
		//�񱳺���1.equals(�񱳺���2)  
		String gunchimking = "������ħŷ"; // ���ڿ� ���
		String gunchimKing2 = new String("������ħŷ");  //String �ν��Ͻ��� 
//		System.out.println(gunchimking == gunchimKing2);
		System.out.println(gunchimking.equals(gunchimKing2));  //������
		
		
		
		for(int i = 0; i<str4.length(); i++) {
			System.out.println(str4.charAt(i));
		}
	
	
	
	
	
	
	
	
	
	}

 }

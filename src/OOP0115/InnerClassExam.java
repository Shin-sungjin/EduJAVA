package OOP0115;

public class InnerClassExam {
	
	//��ø Ŭ����(�ν��Ͻ� ��� Ŭ����)
	class gunchim{
		//
		int test = 10;

		
		public void ssak() {
			System.out.println("��ħ����");
		}

		
		gunchim() {
 
		}
	}
	//���� ��� Ŭ���� 
	static class gunchim2{
		//
		int test = 10;

		
		public void ssak() {
			System.out.println("��ħ����");
		}

		
		gunchim2() {
 
		}
	}
	
	
	public void gohomehagosipuninseo() {
		//���� Ŭ����(local class)
		// Method ���ο� �����Ͽ� ��� ��� �� ����ϴ� �뵵.
		
		class gunchimssak{
			
		}
		
		gunchimssak gsk = new gunchimssak();
		
	}
	
	public static void main(String[] args) {
		
		// ��ø Ŭ���� 
		// Ŭ���� �� ��� ������ ����Ǿ��� Ŭ���� 
		// �ϳ��� Ŭ������ �ٸ� Ŭ������ ��� ������ ����� ��� . 
		// �ȵ�, SWING, FX(gui)���� �̺�Ʈ ó�� �� ���
	}
}

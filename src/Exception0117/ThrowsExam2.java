package Exception0117;


// Ŭ���� ù ���ڰ� �빮�ڿ��� �ϴ� ����
// 1. �޼���� ������ ���� �ϱ� ���� 
public class ThrowsExam2 {

	
	public static void main(String[] args) {
		
		try {
			System.out.println("��ħ�� �� �ȵ��� ��.��  ");
			throw new Exception("������������������������");
		} catch (Exception e) {
			System.out.println("�̰Ž���Ǹ� catch");
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
}

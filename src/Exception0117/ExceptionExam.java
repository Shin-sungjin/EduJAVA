package Exception0117;

import java.util.Iterator;

public class ExceptionExam {

	// ���� 
	// ����, ���� ��� ǥ�� 
	// ���� : �ǵ�ġ �ʰ� ���α׷��� ���� �Ǵ� �� 
	// 		���� �ϵ������ �߸��� �������� �߻� 
	//		���α׷��� ������������ ����Ǹ� ��� ������·� ���ư��Ⱑ �ſ� �����
	// 		
	// ���� : ������� �߸��� �����̳� �������� �߸��� ���α׷������� 
	//		���� ����
	//		���ܰ� �߻��ϸ� ���α׷��� �����
	//		����ó���� ���� ���α׷��� ���Ḧ ���� �� ����. 
	
	// ������ ���� 
	// �Ϲ� ���(������ ����, checked exception)[Syntax Error��� �ϱ⵵ ��]
	// ���� ���� (��Ÿ�� ����, unchecked exception)
	 	
	// NullPoinerException
	// ArrayIndexoutofBoundException
	// NumberFormatException
	
	public static void main(String[] args) {
		// ��� ���� 
		
		//���� ó�� ���� 

		//try~catch ����
		
		
		try {
			int gunchim = 10/0;
			System.out.println(gunchim);
		} catch (Exception e) {
			// TODO: handle exception\
			//printStackTrace
			// ���� �α׸� Ȯ�� �ϴ� Method;
			// ���ǻ��� : ���� ���ʿ� �� �� �ݵ�� ���� ��. * ��ŷ ������ ����
			e.printStackTrace();
			System.err.println("0���� �ѹ��� �� ������ ����̷� ���������� ");
		}
	
		//catch�� ����Ǹ� ���α׷��� ��� �ɱ�?
		System.out.println("�ǳ�?");
		System.out.println("�� �ǳ� �̰�");
		
		int[] arr = new int[5];
		
		try {
			for (int i = 0; i< 6; i++) {
				arr[i] = 10;
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println("�迭�� �Ѱ�ġ ����");
		}
		
		
		//������ ���� ������ ������ ����ó���� �ʼ�!!
		
	
	
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
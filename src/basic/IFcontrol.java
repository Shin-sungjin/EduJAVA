package basic;

public class IFcontrol {

	public static void main(String[] args) {
			// ���ǹ�
			// ��� �������� ���� ���α׷��� �����ϴ� �κп��� �бⰡ �Ͼ�� ��
			// ���ǹ� : ���ǽ� + ��϶���(������) { }
			// if(���ǽ�) {
			//		���ǽ��� true �� �� ����Ǵ� �ڵ��
			//   }
		
			// else if(���ǽ�) + ��϶���{
			//  if�� �������� ������ else if �� ���ǽ��� ������ ��� ����Ǵ� �ڵ��(����)
			// }
			// else {
			// if�� else if�� �������� ���ϸ� ����Ǵ� �ڵ��
			// }
			
		
		
		
		
		//���ǹ��� ���� 1
			// ���� 200���� ����ٸ� ������ �Ұ��ΰ�?
			// -����� 200���� ����� ���� �ٲ۴�. 
			// 
		
			long money = 20000000000L ; 
			if(money >= 20000000000L) {
				System.out.println("���� �ٲ۴�.");
			}
		
		boolean lampWork = false ;
		boolean plug = false ;
		boolean bulbBruned = true ;
		
		if (!plug) {  //(plug == false);
			System.out.println("�÷��׸� ������");
			plug = true ;
		}
		else if (bulbBruned == true) {
			System.out.println("���� ��ü");
		}
		else if (bulbBruned == false) {
			System.out.println("���� ����");
			
		}
		
			
		
		// ���ǹ� ���� 2��
		// if / else if / else ��� �������� ���� 
		// �Ʒ��� ���� ��Ģ�� ���� 
		// 1. if �ܵ����� ���� �͵� ����   => �� if �ؿ� else if/ else �� �� �� �ʿ�� ���� 
		// 2. else if / else �� ���� ���� ���� ���� �Ұ��� = > if���� �����Ͽ� ����ؾ���. 
		//   -else if/ else�� if ���� �������� ������ �� �����ϴ� �����̱� ������ �Ұ���.
		//		-> �뵵�� �ֱ⿡ �뵵�� ���缭 ��� �ؾ� �� 
		// 3. if �� ���� if ���� ��ø�ؼ� �ִ� �� ���� �����ϴ�. 
		//  -������ ���� �� ���������� �����ϰ� ���� �� ����ϴ� ��. 
		
		// ������ ���赵�� ���� ���ǹ� �ۼ� 
		
		
		
		
		
	}
}

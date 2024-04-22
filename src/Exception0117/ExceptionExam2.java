package Exception0117;

class A{}
class B extends A{}
class C extends A{}

interface i{}

class D implements i{}
class E implements i{}


public class ExceptionExam2 {
	public static void main(String[] args) {

		//���� ���� ó�� (multi catch) 
		
		try {	

			A a = new B();
			B b = (B) a;
			//�ڼ� (B)�� A(����̴�)
			// �ڼ��� B = ����̴�.?
			//classCastException
			A a1 = new B();
			C c = (C)a1; //B�� C�� ���� ������� Ŭ�����̱⿡ ĳ���� �Ұ�. 
	
			String str = null;
			// nullPointException
			// �ΰ��� ����, �̿� �Ϸ� �� �� �߻� 
			// 
			System.out.println(str.toString());
			
		} 	
		catch (ClassCastException e) {
			System.out.println("Ŭ���� ���� ");
			e.getMessage();
		}
		
		catch (NullPointerException e ) {
			// TODO: handle exception
			System.out.println("�� ������");
			
		}
		// multicatch ����
//		catch (NullPointerException \ NumberFormatException m) {
//			// TODO: handle exception
//			System.out.println("�� ������");
//			
//		}
		catch (Exception e) {  //Exception�� �׻� �Ʒ��� �ξ�� �ϸ�,  �� ���ʿ� �־�дٸ�, � �������� Ȯ���� �� ���� 
							   // Ȥ�� �� ��Ȳ�� ����Ͽ�, �� �Ʒ��� �ֻ��� Exception�� �δ� ��
			
			System.out.println("���� ");
				// TODO: handle exception
		}
	
		// finally
		// ���� ó������ �ݵ�� ����Ǵ� �ڵ� 
		// ���� ���� ������� ������ ���� 
		finally {
			System.out.println("��ħ�� �� ���� �� ");
		}
		
		
		System.out.println("����� ���� ����");
		
		
	}
}

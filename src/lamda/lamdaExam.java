package lamda;

public class lamdaExam {
	public static void main(String[] args) {
		// ���ٽ�
		// 1.8 �������� ���
		// �͸��Լ��� �����ϴ� ��
		
		// ������ ����
		// 1. ������ �ڵ� 
		// 2. �÷����� �����ؼ� ���� ���
		
//		(Type param,  ...) ->

		//		{
//			���� �����ڵ�
//		}
		
		// ���� ��� ����   
		// ���ٽ��� �̿��� �͸�����ü �������� 
		// �Ʒ� ��� ������ lamdaTest Method�� method()�� ������
		lamdaTest lt =   ()    ->  {
			String str = "�̰��� ���ٿ�";
			System.out.println(str);
		};
		
		lt.method();
		
		lamdaTest lt2 = new lamdaTest() {
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("�Ƶ� ���������");
			}
		};
		lt2.method();
		
		lt = () -> System.out.println("���ٿ�");
//		lt = () -> {System.out.println("���ٿ�");};
		lt.method();
		
		// �Լ� ���� ���α׷���; 
		// �Լ� : y= f(x)
		// �����͸� �Ķ���� ������ �����ϰ� ����� �޴� �ڵ��� ����
		// �Լ��� Method�� ����  => Ŭ���� ���ο� �ִ��� �����Ŀ� ���� ����
		
		// �Լ����� vs ��ü����
		// �Լ����� ������
		// ��뷮 ������ ó���ÿ� ����
		//	-�����͸� �ﰢ ó���ϴ� ���� ����
		// �̺�Ʈ �߽��� ���α׷��� 
	}
}

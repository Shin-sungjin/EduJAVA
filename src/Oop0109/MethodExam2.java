package Oop0109;

public class MethodExam2 {
	// Method �� ���� ������ ����
	// ���� ������ �ִ� �ֵ��� ȣ���� ���� ����
	
	// Method�� ���� 
	// 1. return ���� �ְ� �Ķ���Ͱ� �ִ� Method
	
	// ����Ÿ�԰� ���ϰ��� ��ġ �ؾ��Ѵ�. 
	// ex) return type = String ,  return value = String;

	 static String test1(int a){ //�Ķ���� ��Ī ���� �� �뵵�� �°Բ� ����
		 return "��ħ�� �ϵ���";
	}
	
	// 2. return ���� ������ �Ķ���Ͱ� ���� Method
	 
	static String americano() {
		return "�Ƹ޸�ī�� �̴� ��";
	}
	 
	// 3. return ���� ������ �Ķ���Ͱ� �ִ� Method
	static void gugu(int dan) {
		for(int i=1; i<=9; i++) {
			int num =  dan * i;
			System.out.println(dan + " * "+ i + " = " + num);
		}
	}
	 
	 
	// 4. return ���� �Ķ���͵� ���� Method
	static void test4() {
		System.out.println("��ħ ���� �ȵ�.");
	}
	
	
	// �Ϲ� Method vs ���� Method;
	// �Ϲ� Method - �ش� Ŭ������ ������� �ν��Ͻ��� ���� �� ȣ��
	// ���� Method - Ŭ������.�޼����() ���� ȣ��
	
	//return ���� �ֳ� ������ ����
	// -> ���� ������ �����ϳ�, �Ұ����ϳ��� ���� 
	
	
	public static void main(String[] args) {
		
		System.out.println(MethodExam2.test1(10));
		MethodExam2.gugu(4);
		MethodExam2.americano();
//		System.out.println(MethodExam2.test4());
	}
}

package useClass;

public class ClassExam {
	public static void main(String[] args)  {
		Person2 person = new Person2();
		//getClass = Object�� ����
		// �ν��Ͻ� ���� ã��.
//		Class class1 = person.getClass();
//		
//		System.out.println(class1);
//		
//		System.out.println(class1.getName());
//		
//		System.out.println(class1.getSimpleName());
		
		Class class2;
		try {
			class2 = Class.forName("useClass.Person2");  //���ڿ��κ��� ��ü�� ������ ��� ���.
			
			System.out.println(class2);
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	
	}
}

package useClass;

public class ClassExam {
	public static void main(String[] args)  {
		Person2 person = new Person2();
		//getClass = Object에 있음
		// 인스턴스 족보 찾기.
//		Class class1 = person.getClass();
//		
//		System.out.println(class1);
//		
//		System.out.println(class1.getName());
//		
//		System.out.println(class1.getSimpleName());
		
		Class class2;
		try {
			class2 = Class.forName("useClass.Person2");  //문자열로부터 객체의 정보를 얻는 방법.
			
			System.out.println(class2);
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	
	}
}

package CollectionAndGeneric;

public class GenericExam2 {
	public static void main(String[] args) {
		
		// ��ƼŸ�� �Ķ����
		// �� Ÿ�� �Ķ���ʹ� �޸��� ����
		// ������ 10�� �� 9���� ���� �� �ǹ��ľ��� ���� �̸����� �θ� ����
		
		// ���׸� Method
		// �Ķ���� Ÿ�԰� ����Ÿ������ Ÿ�� �Ķ���͸� ���� Method;
		// ��Ŭ������ �ν��� ���ϰ� ������
		// �����Ϸ��� �Ķ���� Ÿ���� ���� ����Ÿ���̴� 
		// integer�� �ν��Ͽ� �����ߴ�.
		Person<Integer> p1 = GenericExam2.<Integer> changing(new Integer(100));
		int val =p1.getT();
		Person<String> p2 =  GenericExam2.<String> changing(new String("gunchim"));
		String val2 = p2.getT();
		System.out.println(val + val2);
	}
	
	//Generic Method ���� 
	public static<T> Person<T> changing(T t){
	
		Person<T> person = new Person<T>();
		person.setT(t);
		return person;
		
	}
	
}

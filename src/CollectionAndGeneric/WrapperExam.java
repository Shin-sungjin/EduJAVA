package CollectionAndGeneric;

import java.util.ArrayList;
import java.util.List;

public class WrapperExam {
	public static void main(String[] args) {
		
		// �⺻ �ڷ����� �ξ� ���δ� Ŭ����(Wrapper class)
		// �⺻ �ڷ����� ������ ���󼭴� �ν��Ͻ�ȭ�� �ʿ��ϴ�. 
		// �ΰ� ó�� �� ���������� ó���� ����, Wrapper Class�� ��� 
		
		
		
		List<Object> list = new ArrayList<>();
		
		Integer int1 = new Integer(10);
		
		list.add(10);
		list.add(int1);
		System.out.println(list.toString());
		// [10, 10]
		// �⺻,  ����;
		
		//Byre
		Byte bt = new Byte((byte)1);

		// short
		Short sho = new Short((short)10);

		// int
		Integer integer = new Integer(10); 
				//����Ÿ�� <========== �Ϲ�Ÿ��
				//����Ÿ���� Ÿ�� ĳ������ ���ϴ�.

		// long
		Long lon = new Long(10L);

		// float
		Float flo = new Float(10.2F);

		// double
		Double dou = new Double(10.2);

		// boolean
		Boolean bool = new Boolean(true);

		// char
		Character character = new Character('A');		
		
		
		// ���� ���� Ŭ�������� �⺻Ÿ���� wrapper Ŭ������ �θ�. 
		// new Ű���� ������ �� ó�� �� ����.
		// �ڹٿ��� Auto Boxing, UnBoxing�� �����ϱ� ����, 
		
		
		// ����Ÿ���� ������ �� 
		// 
		
		// �� �ڵ�� �ν��Ͻ��� �������� �ʾҴµ� �� ȣ���� �����Ѱ�?
		// static Ű���� ������ �ν��Ͻ� ���� ���̵� �ڵ� ���� ���� 
		System.out.println(add(10, 20));
		System.out.println(add(10, null));
	}   
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	//�Ʒ��� �ƴ� �� ó�� ���� ���� �̵�;
	// 1. ����ó�� 
	// 2. 
	// ����Ÿ���� ���, �̰� ���, �ΰ��� ��Ұ� �ִ� ���� �ƴ�
	
	//Answer :  ���������� ���� ��� null���� �Ѿ� ���� �𸥴�. 
	// ������ int�� null�� �ν����� ������, 
	// Integer�� null�� ���� ����Ÿ���� ��ȯ�Ѵ�. 
	// �׷��� �״�� ������ ����Ǿ�, nullPointException�� ����������� �߻��Ѵ�. 
	// �׸��Ͽ�, int�� ���  null���� ������ ���� ������ �� �ִ�. 
	
	public static int add(Integer a, Integer b) {
		return a+b;
	}
}

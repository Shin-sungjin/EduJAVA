package ListExam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExam2 {
	
	// Collection interFace
	// �÷��� �� �ֻ��� Ŭ����
	
	// �÷��� �����ӿ�ũ�� �迭�� �ٸ�
	// List�� ��ü�� ��, �迭�� ��ü ��ü�� ���� 
	// ����� ����� �Ѵٰ�, �������� ���� 
	
	// 3������ �̸� ���� 
	// 1.List   => �� ����
		// ArrayList
		//	-���۱��� 
	
	
		// LinkedList
		//  -ArrayList�� ���۱����� ����, 
		//  - But, �ڵ�����δ� ���� �Ȱ��� 
		// Ư����Ȳ�� ���� ������ ��Ȳ�� ���� 
	
		// Stack -> Vector
		// (Stack�� Vector�� ��ӹ���)
		
		// ��ü ��ü�� �����ϴ°� �ƴ� ����, �ּҰ� ����ȴ�.
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		// �÷����� ����Ʈ�� �ڵ����� �ε����� ����������,
		// ó������ 0�� �̻��� �����͸� �ش� ��ġ�� �ε����� �Ұ���
		// ������ �����ʹ� ���������� ����
		// Ư���ε����� Ư���� ������ �Ұ���
		// add�� �Ķ���Ͱ��� 2���� ��, ���ڴ� �ε�����,
//		list1.add(5, 5);
//		list1.add(4, 4);
//		list1.add(2, 2);
//		list1.add(0, 0);
//		list1.add(1, 1);
//		list1.add(3, 3);
		
		System.out.println(list1.toString());
		//add : ������ �߰� 
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		System.out.println(list1.toString());
		
		//����Ʈ�� ���� �̹� �������ִ� ���¶�� 
		// �Ʒ��� ���� Ư�� �ε����� Ư������ �����ϴ� ���� ����
		// ���� ������ 1�� �ε����� �ڷ� �и�
		// �ٵ� ��â���� ���� ������ ���ؼ� �߰��ϴ� ���� �Ұ���.
		list1.add(1, 9724);
		System.out.println(list1.toString());
		
		
		// subList(���� �ε���, �� �ε�����+1)
		// �ݺ� ���� �� Ư�� ���� ���� �� ����
		// ���ǽ��� �� �ȶ�������, 
		System.out.println(list1.subList(1, 3));
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		
		// ����
		// �������� ���� 
		Collections.sort(list1);
		System.out.println(list1.toString());
		
		// ���� ����
		Collections.reverse(list1);
		System.out.println(list1.toString());
		
		// 1. ���ظ�� �� ������ ���� �̰� ���� �ȵ�� �ϴ°�
		// toStirng�� ��� �����
		// 2. ������������ �����ϴ� �����?
		Collections.sort(list1, Collections.reverseOrder());
		print(list1, list2);
		
		
		System.out.println("��ġ : " + list1.indexOf(0));
	}
	
	public static void print(List list1, List list2) {
		System.out.println("ù ��° ����Ʈ�� ���� ���  : " + list1.toString());
		System.out.println("�� ��° ����Ʈ�� ���� ���  : " + list2.toString());
	}
	
	
	
	
	
	
	
	// 2.Set
		
	
	// 3.Map
		// hashMap
		// property
	
	//�÷��� ������ ��ũ�� ���� 
	// �ֻ��� �÷��� �������̽��� ���� 
	// �� ������ List, Set, Map�� ���� 
	
	// 
	
}

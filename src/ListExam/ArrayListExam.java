package ListExam;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam {
	public static void main(String[] args) {
		
		
		// ArrayList�� ���׸�Ÿ���̴�. 
		// �׷��Ƿ� �Ʒ��� �ڵ�� ��� ó��
		ArrayList list1 = new ArrayList();
		
		
		list1.add("123");
		list1.add("456");
		list1.add(9724);
		
		System.out.println(list1.size());
		System.out.println(list1.hashCode());
		System.out.println(list1.toString());

		int size = list1.size();
		
		
		
		
		// ���� 
		// �ݺ����� Ȱ���Ͽ� ����Ʈ���� �ִ� ��� ��Ҹ� ����
		
		//���� For�� ó�� ���������ڸ� ����ϸ� ���� 
		// �׷��� ���� ���� �����ڸ� �̿��Ͽ� �ذ�
		
		// �Ʒ��� �ڵ�� ���� 
		// ���� : �÷��� �����ӿ�ũ�� ����Ʈ�� ��ü�� �������Ǹ� ���鸸ŭ ���ܿ�
		// 		��, �ε��� 0�� ������ ��, 0 ��°�� idx�� ����������
		//		i ���� ���� �ϰ�, ���� �� �ٽ� ����Ʈ ���θ� ���� �ϱ� ����
		//		������ ���� for�����δ� ������ �Ұ�

		for (int i = 0; i<size; i++) {
			// �ش� �÷��� ����Ʈ�� ���� �������� Method;
			list1.remove(i);
		
		}
		
		
		// �ذ� ��� 1.
		// �� ���������� �����Ͽ� 0���� �� ���ʷ� ���� (���� �ݺ�)
		// �÷��� �����ӿ�ũ���� ���� for���� �Ⱦ��� ����
		// !.���� for���� �ʿ伺�� ����.��!
		for (int i = size-1; i>=0; i--) {
			// �ش� �÷��� ����Ʈ�� ���� �������� Method;
			list1.remove(i);
		
		}
		
		
		// �ذ� ��� 2.
		// ������ �迭�� ��� ������ �Ǵϱ�, 0���� ����� �°� 
		// ��� 0���� �����൵ ����
		// ���� �������� ���� ���
		
		for( int i = 0; i < size; i++) {
			list1.remove(0);
		}
		System.out.println(list1.toString());
		

		

		
	}
}

package useClass;

public class HashExam {
	
	
	public static void main(String[] args) {
		// �ؽ��ڵ� ���� ����
		// �ؽ��ڵ� : ��ü�� �ĺ��ϴ� �� �ٸ� ���� ��
		// �� Ȯ���� ����
		// - �ؽ� �ڵ�� ��ü�� �޸� �ּҸ� �̿��ؼ� �ؽ��ڵ� ��ü�� ����� ����
		//
		// �ؽ� �ڵ鸣 ���� ��ü�� ����� ��, 
		
		Person2 person1 = new Person2("���ڵ�", 30, new int[] {172, 170});
		Person2 person2 = new Person2("�ڱ���", 30, new int[] {172, 170});
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		System.out.println("------------���뼱-------------");
		
		int[] arr1 = new int[] {180,80};
		int[] arr2 = new int[] {180,80};		
	
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
	}

}

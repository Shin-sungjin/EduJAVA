package useClass;

import java.util.Objects;

public class DeepEqulasExam {
	public static void main(String[] args) {
		//deepEquals method
		// �Ϲ������δ� equlas �� ����
		// �ٸ� ���� ��ü�� �迭�� ���� �ٸ� 
		// ��ø�� �׸� ������ ��?
		
		Integer[] arr1 = new Integer[] {new Integer(10), new Integer(50)};
		Integer[] arr2 = new Integer[] {new Integer(10), new Integer(50)};
		
		System.out.println(Objects.equals(arr1, arr2));   //�ּҰ� �ٸ��� ������ false   => 
		System.out.println(Objects.deepEquals(arr1, arr2)); //�ּҸ� �����ϰ� ��Ҹ� �� [�� �� �� ���]
	
	
		
		
	}
}

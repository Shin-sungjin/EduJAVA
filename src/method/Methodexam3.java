package method;

public class Methodexam3 {

	public static int arrSum( int[] arr ) {  //return �� ������ ���� ��, ����ȉ�
		int sum = 0;  //���� ��
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];	
		}
		double avg = sum / arr.length ;
		return sum ;
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ����� ����, ����� ���ϴ� �ڵ� 
		//  ->Method�� ����Ѱ���.
		// ������ ��κ� �μ��� �δ� �ܿ��찡 ����. 
		// => �ڵ帶�� �������̶�� �μ��� �� Ȯ���� ����. 
		
		int[] arr1 =new int[] {10, 20, 30, 40};
		//�޼��带 ���鶧 retrun ���� ���� �� �� �򰥸���.��
		// sysout���� ����ϴ� �������� ���� ���� �� ���ɼ��� ����. 
	
	}	
}

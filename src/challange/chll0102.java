package challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//0113 ��������
//
//�������� ���ڰ� ���� ���ڿ� numbers�� �־����� ��, 
//���ڿ��� ����ִ� ���ڷ� ���� �� �ִ� �Ҽ��� �� ������ return �ϵ��� 
//find_prime �Լ��� �ϼ����ּ���.
//
//���ѻ���
//numbers�� ���� 1 �̻� 7 ������ ���ڿ��Դϴ�.
//numbers�� 0~9���� ���ڸ����� �̷���� �ֽ��ϴ�.
//"013"�� 0, 1, 3 ���ڰ� ���� ���� ������ ������ִٴ� �ǹ��Դϴ�.
//����� ��
//numbers	return
//"17"	3
//"011"	2
//����� �� ����
//���� #1
//[1, 7]���δ� �Ҽ� [7, 17, 71]�� ���� �� �ֽ��ϴ�.
//
//���� #2
//[0, 1, 1]���δ� �Ҽ� [11, 101]�� ���� �� �ֽ��ϴ�.
//
//11�� 011�� ���� ���ڷ� ����մϴ�.

public class chll0102 {
	
	public static int setNumbers(int[] arr){
		int len= arr.length;
		List<Integer> setNumber = new ArrayList();
		
		//while ���� �Ẽ��?
		for(int i = 0; i<len; i++ ) {
			for(int j = i+1 ; j<len; j++){
				String str = Integer.toString(arr[i]);
				str += Integer.toString(arr[j]).charAt(0);
				setNumber.add(Integer.parseInt(str));
				System.out.println(str);
				
			}
		}
		for(int i = arr.length-1; i>=0; i-- ) {
			setNumber.add(arr[i]);
			for(int j = i-1 ; j>=0; j--){
				String str = Integer.toString(arr[i]);
				str += Integer.toString(arr[j]).charAt(0);
				setNumber.add(Integer.parseInt(str));
				System.out.println(str);
			}
		}
//		101�� �ȸ���
		
		//������ �� ���� for��
	    for (int y = setNumber.size() - 1; y >= 0; y--) {
	    	int s = setNumber.get(y);
	    	int x = 0;
	    
	    	if(y != 0){
	    	    x = setNumber.get(y-1);
	    	}
	    	System.out.println(s+"_"+x);
	    	if(s == x || s == 1) {
	    		System.out.println("����"+s);
	    		setNumber.remove(Integer.valueOf(s));
			}
	    	
	    }
		
	    
//	    �Ҽ����� Ȯ���ϴ� FOR��
	    for (int y = setNumber.size() - 1; y >= 0; y--) {
	    	int i = setNumber.get(y);
			for(int j =2;  j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					System.out.println("�Ҽ��ƴ�"+ i);
					setNumber.remove(Integer.valueOf(i));
				}
			}
		}
		return setNumber.size();
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,1};
		System.out.println(setNumbers(arr));
		System.out.println();
		
	}
}


//�ش� ���� �������� ������ 101�� ������ �Ǿ� ���� �ʴ� ������ �߰�, �˰��� �����ΰ� ����. 
// ������ �ذ� å�� �������� �ʾ� �켱, ���ε� ��. ���� ���� ���� 
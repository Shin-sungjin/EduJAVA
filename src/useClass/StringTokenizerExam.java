package useClass;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExam {  //Ŭ�������� �ڹ� ����Ŭ������ ��ġ�� �ȉ� 

	public static void main(String[] args) {
		// Split�� ���鵵 �ϳ��� ��ū(��)���� �ν��Ѵ�. 
		// 
		
		
		String data = "dog baby cat a b c d e f g h";
		
		//������ ��ĭ������ �ν����� ����, ������ ��ĭ �̻��̶��, �� ���� ������ �迭�� �����.
		String[] result = data.split(" ");
		System.out.println(Arrays.toString(result));
		
		// �׳� �� �߶������ ���� 
		// ������ �� ĭ�̻��̸� ������ ������ ���� X
		// -> ������ ��ĭ�̰� ��� ���� 
		StringTokenizer sToken = new StringTokenizer(data, " ", false);  //ture �Ͻ�, ���鵵 �ν� but �����ϸ� ���
		
		//���ͷ����� ������
		while(sToken.hasMoreTokens()){
			String str = sToken.nextToken();
			System.out.println(str);
		}
		
		
		
	}
}

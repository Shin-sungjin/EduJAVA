package QuizAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Challange010301 {
	public static void main(String[] args) throws IOException
	{
		
	
		
	
		// TODO Auto-generated method stub
		
//		�Լ� egun_mosam�� ���� a�� �ڿ��� b�� �Է� �޾�, 
//		a���� ������ b�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
//		���� ���� ������ ����, ������ �����ϴ� �Լ�, egun_mosam�� �ϼ��ϼ���
//
//		���� ����
//		n�� 1000 ������ �ڿ����Դϴ�.
//		����� ��
		//a���� ������ a�� ����� n���� ����Ʈ ��ȯ
//		a	n	answer
//		2	5	[2,4,6,8,10]
//		4	3	[4,8,12]
//		-4	2	[-4, -8]
//			
		System.out.println("���� a�� n�� �Է����ּ���");   //a���� ������ a�� ����� n���� ����Ʈ ��ȯ
		
		BufferedReader br = //����ڷκ��� �Է� �ޱ� ���� ���۸��� ����
				new BufferedReader( new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());   //����ڷκ��� a�� n�� ���� ���� 
		int n = Integer.parseInt(br.readLine());
		
		int[] answer = new int[n];   //n ���� �迭 ���� 
		
		for( int i = 0; i < n; i++) {   //for �ݺ����� Ȱ���ؼ�, 0��° �ε������� a�� i�� ���� ���� �߰�
			answer[i] = a * (i+1) ;		//0��° �ε����� 0�� ������ �ʰ� n���� ���ϱ� ���Ͽ� +1
		}
		System.out.println(Arrays.toString(answer));
		

		
	}

}

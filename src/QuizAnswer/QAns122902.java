package QuizAnswer;

import java.util.Scanner;

public class QAns122902 {
	public static void main(String[] args) {
		
		//��2
		// �ΰ��� ���ڸ� �Է� �޾� �μ� �� ū ���� ����Ͻÿ�. 
//		Input a : 5
//		Input b :13
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("a�� b���� ũ�Ƿ� a�� ����մϴ�. a�� �� :" + a);
		}
		else if(a<b) {   //else if�� else���� Ȯ�强�� ���� *Ȯ�强: �ڵ尡 �������� ���� �߰� �� �� �־�� �Ѵ�. 
			System.out.println("b�� a���� ũ�Ƿ� b�� ����մϴ�. b�� �� :" + b);
		}
		
		String result = (a > b) ? "a�� b���� ũ�Ƿ� a�� ����մϴ�. a�� �� :" + a :"b�� a���� ũ�Ƿ� b�� ����մϴ�. b�� �� :" + b;
		System.out.println(result);
		// ��µǴ� ������ ���� , ������ ���� ���� �ؾ� ��
		
	}
}

package basic;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		
		// 2���� �迭 
		// �迭�� �������� 2���� ��
		// n���� �迭�� �����Ѵ�. //�������� �ַ� 2���� �迭, bigdata�� �������� 3���� �迭�� ���䵵 �����Ͽ�����, ������ �̸���.
		// �迭�� ��ҷ� �迭�� �����Ѵ�. 
		int[][] array = new int[][] { //�迭 ���� �ּ� 
			{10, 20, 30}, // 0��, 0��, 1��, 2��
			{40, 50, 60}, // 1��, 0��, 1��, 2��
			{70, 80, 90}, // 2��, 0��, 1��, 2�� 
		};
		System.out.println(array.length);
		
		
		System.out.println(Arrays.toString(array)); //2���� �迭 ���� ������ �迭�� �� �ּҸ� ����Ű�� ����;
		
		// 2���� �迭�� �����
		// 
		
		//10
		//20
		//30
		//:
		//90
		//���� ������ ������ 
		
		for( int i = 0; i < array.length; i++ ) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		
		// 2���� �迭������ 2���� �迭�� �ּ��̴�. 
		// ��ҷ� ������ 1���� �迭�� �ּҰ� �ȴ�. 
		
		//2���� �迭���� �迭�� = ����;
		
//	      int[][] score = new int[][] {
//	          {100,70,50},
//	          {70,50,30},
//	          {50,80,70},
//	          {55,85,77},
//	          {100,80,75},
//	       };
//	       
//	       System.out.println("��ȣ\t����\t����\t����\t����\t���");
//	       System.out.println("==========================");
	       
	       
		
		
		
		
		
	}
}

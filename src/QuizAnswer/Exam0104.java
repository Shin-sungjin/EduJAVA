package QuizAnswer;

import java.util.Arrays;

public class Exam0104 {
	public static void main(String[] args) {
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("==============================================");
		
		int[][] score = new int[][] {
			{100,70,50},
			{70,50,30},
			{50,80,70},
			{55,85,77},
			{100,80,75},
		};
		
		
		for(int i = 0; i<score.length; i++ ) {
			int sum = 0;
			double average = 0;
//			int[] temp = new int[score[i].length];    //�̰� �ʿ� ������ 
			
			
			System.out.print(i + "\t");
			for(int j = 0; j<score[i].length; j++) {
				sum += score[i][j];	 //������ �ܺο� �ִ� sum ������ ���� 
//				temp[j] =score[i][j];
//				System.out.print(i + "\t"+ score[i][j] +"\t"+sum + "\t" + average );   => ����
//				System.out.print(i + "\t"+ score[i][j] +"\t"+sum + "\t" + average );  => ����
				System.out.print(score[i][j]+"\t");
			}
			average += sum / score[i].length;
			System.out.println(+ sum +"\t"+ average);
			
			
			
			
		}
		int korTotal =0;  //���� ����
		int engTotal =0;  //���� ����
		int mathTotal =0; //���� ����
		int totalsum =0;  //��ü ����
		double totalavg =0; //��ü ���
		
		for(int i = 0; i < score.length; i++ ) {
			for(int j = 0; j<score[i].length; j++) {
				//switch ������ �ۼ��ص� �� �� ����. 
				switch (j) {
					case 0:
						korTotal += score[i][j];
						break;
					case 1:
						engTotal += score[i][j];
						break;
					case 2:
						mathTotal += score[i][j];
						break;
				}
//				if(j == 0) {
//					korTotal += score[i][j];
//				}
//				else if(j == 1) {
//					engTotal += score[i][j];
//				}
//				else if(j == 2) {
//					mathTotal += score[i][j];
//				}
				totalsum = 	korTotal + engTotal +mathTotal;
				totalavg = totalsum / 3 ;
			}
		}
		System.out.printf("����\t%d\t%d\t%d\t%d\t%.2f", korTotal, engTotal, mathTotal, totalsum, totalavg);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}

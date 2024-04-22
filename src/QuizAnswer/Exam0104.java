package QuizAnswer;

import java.util.Arrays;

public class Exam0104 {
	public static void main(String[] args) {
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
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
//			int[] temp = new int[score[i].length];    //이거 필요 없었음 
			
			
			System.out.print(i + "\t");
			for(int j = 0; j<score[i].length; j++) {
				sum += score[i][j];	 //총점을 외부에 있는 sum 값으로 받음 
//				temp[j] =score[i][j];
//				System.out.print(i + "\t"+ score[i][j] +"\t"+sum + "\t" + average );   => 실패
//				System.out.print(i + "\t"+ score[i][j] +"\t"+sum + "\t" + average );  => 실패
				System.out.print(score[i][j]+"\t");
			}
			average += sum / score[i].length;
			System.out.println(+ sum +"\t"+ average);
			
			
			
			
		}
		int korTotal =0;  //국어 총점
		int engTotal =0;  //영어 총점
		int mathTotal =0; //수학 총점
		int totalsum =0;  //전체 총점
		double totalavg =0; //전체 평균
		
		for(int i = 0; i < score.length; i++ ) {
			for(int j = 0; j<score[i].length; j++) {
				//switch 문으로 작성해도 될 것 같다. 
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
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%.2f", korTotal, engTotal, mathTotal, totalsum, totalavg);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}

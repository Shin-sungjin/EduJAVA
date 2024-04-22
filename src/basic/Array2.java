package basic;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		
		// 2차원 배열 
		// 배열의 차원수가 2개인 것
		// n차원 배열도 존재한다. //현업에선 주로 2차원 배열, bigdata의 등장으로 3차원 배열의 수요도 증가하였으나, 아직은 이르다.
		// 배열의 요소로 배열이 존재한다. 
		int[][] array = new int[][] { //배열 이퀄 주소 
			{10, 20, 30}, // 0행, 0열, 1열, 2열
			{40, 50, 60}, // 1행, 0열, 1열, 2열
			{70, 80, 90}, // 2행, 0열, 1열, 2열 
		};
		System.out.println(array.length);
		
		
		System.out.println(Arrays.toString(array)); //2차원 배열 내의 각각의 배열이 또 주소를 가르키고 있음;
		
		// 2차원 배열의 선언법
		// 
		
		//10
		//20
		//30
		//:
		//90
		//일케 나왔음 좋겠음 
		
		for( int i = 0; i < array.length; i++ ) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		
		// 2차원 배열에서는 2차원 배열명도 주소이다. 
		// 요소로 들어오는 1차원 배열도 주소가 된다. 
		
		//2차원 배열엣는 배열명 = 변수;
		
//	      int[][] score = new int[][] {
//	          {100,70,50},
//	          {70,50,30},
//	          {50,80,70},
//	          {55,85,77},
//	          {100,80,75},
//	       };
//	       
//	       System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
//	       System.out.println("==========================");
	       
	       
		
		
		
		
		
	}
}

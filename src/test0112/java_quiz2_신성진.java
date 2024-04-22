package test0112;

import java.util.Arrays;
import java.util.Random;

public class java_quiz2_½Å¼ºÁø {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr = new int[50];
		int cnt = 0;
		int sum = 0;
		for(int i =0; i<50; i++) {
			arr[i] = random.nextInt(100);	
			sum += arr[i];
		}
		
	
		for(int j = 0; j<arr.length; j++) {
			for(int s =0; s<6; s++) {
				System.out.print(arr[j] + "\t");
			}
		System.out.println();
		}
		
	
	System.out.println("ÃÑÇÕ : " + sum);
	}
}
	

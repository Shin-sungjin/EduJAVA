package SSJ_Quiz;

import java.util.ArrayList;
import java.util.List;

public class SSJ_Quiz8 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7,8, 9,10};
		int len = numbers.length;
		
		List<Integer> even  = new ArrayList<Integer>();
		List<Integer> odd  = new ArrayList<Integer>();
		for(int i = 0; i <len;  i++) {
			int test = numbers[i];
			if(test % 2 == 0) {
				even.add(test);
			}
			else {
				odd.add(test);
			}
		}
		
		System.out.println(even.toString());
		System.out.println(odd.toString());
	}
}

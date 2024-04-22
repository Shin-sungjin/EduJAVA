package SSJ_Quiz;

import java.util.ArrayList;
import java.util.List;

public class SSJ_Quiz1 {

	public static void main(String[] args) {
		int[]  numbers = {1, 2, 3,4,2,5,1,6};
		
		List<Integer> number = new ArrayList<Integer>();
		int len = numbers.length;
		for( int i = 0; i < len; i++) {
			if(!number.contains(numbers[i])) {
				number.add(numbers[i]);
			}
			else {
				continue;
			}
		}
		
		System.out.println(number.toString());
	}
}

package ListExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam3 {

	public static void main(String[] args) {
		
		
//		List<String> list1 = Arrays.asList("군침이" , "형진", "강훈");
//		List<String> list1 = new ArrayList<>();
//		list1.add("조준모");
//		                                    
//		System.out.println(list1.toString());
		
		List<Integer> list2 = new ArrayList<Integer>();
//		
//		list2.add(10);
//		list2.add(20);
//		list2.add(30);
//		
		
		
		Integer[] arr = (Integer[]) list2.toArray(new Integer[0]);
		
		int idx = arr.length;
		System.out.println(arr.toString());
		int[] arr1 = new int[idx];
		for(int i = 0; i < idx; i++) {
			arr1[i] = arr[i];
		}
		System.out.println(arr1.toString());
		
	}
}

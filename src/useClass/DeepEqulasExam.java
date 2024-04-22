package useClass;

import java.util.Objects;

public class DeepEqulasExam {
	public static void main(String[] args) {
		//deepEquals method
		// 일반적으로는 equlas 와 동일
		// 다만 비교할 객체가 배열일 경우는 다름 
		// 중첩된 항목 값까지 비교?
		
		Integer[] arr1 = new Integer[] {new Integer(10), new Integer(50)};
		Integer[] arr2 = new Integer[] {new Integer(10), new Integer(50)};
		
		System.out.println(Objects.equals(arr1, arr2));   //주소가 다르기 때문에 false   => 
		System.out.println(Objects.deepEquals(arr1, arr2)); //주소를 제외하고 요소만 비교 [값 비교 시 사용]
	
	
		
		
	}
}

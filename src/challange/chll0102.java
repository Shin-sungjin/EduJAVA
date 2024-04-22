package challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//0113 도전과제
//
//여러개의 숫자가 적힌 문자열 numbers가 주어졌을 때, 
//문자열에 들어있는 숫자로 만들 수 있는 소수가 몇 개인지 return 하도록 
//find_prime 함수를 완성해주세요.
//
//제한사항
//numbers는 길이 1 이상 7 이하인 문자열입니다.
//numbers는 0~9까지 숫자만으로 이루어져 있습니다.
//"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
//입출력 예
//numbers	return
//"17"	3
//"011"	2
//입출력 예 설명
//예제 #1
//[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
//
//예제 #2
//[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
//
//11과 011은 같은 숫자로 취급합니다.

public class chll0102 {
	
	public static int setNumbers(int[] arr){
		int len= arr.length;
		List<Integer> setNumber = new ArrayList();
		
		//while 문을 써볼까?
		for(int i = 0; i<len; i++ ) {
			for(int j = i+1 ; j<len; j++){
				String str = Integer.toString(arr[i]);
				str += Integer.toString(arr[j]).charAt(0);
				setNumber.add(Integer.parseInt(str));
				System.out.println(str);
				
			}
		}
		for(int i = arr.length-1; i>=0; i-- ) {
			setNumber.add(arr[i]);
			for(int j = i-1 ; j>=0; j--){
				String str = Integer.toString(arr[i]);
				str += Integer.toString(arr[j]).charAt(0);
				setNumber.add(Integer.parseInt(str));
				System.out.println(str);
			}
		}
//		101을 안만듬
		
		//동일한 값 삭제 for문
	    for (int y = setNumber.size() - 1; y >= 0; y--) {
	    	int s = setNumber.get(y);
	    	int x = 0;
	    
	    	if(y != 0){
	    	    x = setNumber.get(y-1);
	    	}
	    	System.out.println(s+"_"+x);
	    	if(s == x || s == 1) {
	    		System.out.println("삭제"+s);
	    		setNumber.remove(Integer.valueOf(s));
			}
	    	
	    }
		
	    
//	    소수인지 확인하는 FOR문
	    for (int y = setNumber.size() - 1; y >= 0; y--) {
	    	int i = setNumber.get(y);
			for(int j =2;  j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					System.out.println("소수아님"+ i);
					setNumber.remove(Integer.valueOf(i));
				}
			}
		}
		return setNumber.size();
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,1};
		System.out.println(setNumbers(arr));
		System.out.println();
		
	}
}


//해당 값은 나오지만 여전히 101은 삽입이 되어 있지 않는 문제점 발견, 알고리즘 문제인것 같다. 
// 마땅한 해결 책이 생각나지 않아 우선, 업로드 함. 추후 수정 예정 
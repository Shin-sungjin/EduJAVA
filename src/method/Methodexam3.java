package method;

public class Methodexam3 {

	public static int arrSum( int[] arr ) {  //return 값 없으면 오류 남, 실행안됌
		int sum = 0;  //리턴 값
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];	
		}
		double avg = sum / arr.length ;
		return sum ;
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 요소의 총합, 평균을 구하는 코드 
		//  ->Method로 묶어둘거임.
		// 선언값은 대부분 인수로 두는 겨에우가 많다. 
		// => 코드마다 유동적이라면 인수로 올 확률이 높다. 
		
		int[] arr1 =new int[] {10, 20, 30, 40};
		//메서드를 만들때 retrun 값이 누가 될 지 헷갈린다.면
		// sysout으로 출력하는 변수값이 리턴 값이 될 가능성이 높다. 
	
	}	
}

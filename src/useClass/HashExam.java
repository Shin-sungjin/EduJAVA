package useClass;

public class HashExam {
	
	
	public static void main(String[] args) {
		// 해쉬코드 생성 예시
		// 해쉬코드 : 객체를 식별하는 또 다른 정수 값
		// 더 확실한 구분
		// - 해쉬 코든는 객체의 메모리 주소를 이용해서 해시코드 자체를 만들어 리턴
		//
		// 해시 코들르 통해 객체의 동등성을 비교, 
		
		Person2 person1 = new Person2("김코딩", 30, new int[] {172, 170});
		Person2 person2 = new Person2("박콬딩", 30, new int[] {172, 170});
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		System.out.println("------------절취선-------------");
		
		int[] arr1 = new int[] {180,80};
		int[] arr2 = new int[] {180,80};		
	
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
	}

}

package lamda;

public class LamdaExam2 {
	public static void main(String[] args) {
		
		LamdaTest2 la1 = null;

		la1 = (a, b) -> {
			int result = a+b;
			return result;
		};
		
		System.out.println(la1.method(100, 200));
		
	}
}

package SSJ_Quiz;

public class SSj_Quiz3 {

	
	public static void main(String[] args) {
		String test1 = "level";
		String test2 = "gunchim";
		
		StringBuffer testOne = new StringBuffer(test1);
		StringBuffer testTwo = new StringBuffer(test2);
		
		testOne.reverse();
		testTwo.reverse();
		
		if(test1.contains(testOne)) {
			System.out.println("회문입니다.");
		}
		else if(!test1.contains(testOne)) {
			System.out.println("회문이 아닙니다.");
		}
		if(test2.contains(testTwo)) {
			System.out.println(test2);
			System.out.println(test2);
			System.out.println("회문입니다.");
		}
		else if(!test2.contains(testTwo)) {
		
			System.out.println("회문이 아닙니다.");
		}
	}
}

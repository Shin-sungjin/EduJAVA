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
			System.out.println("ȸ���Դϴ�.");
		}
		else if(!test1.contains(testOne)) {
			System.out.println("ȸ���� �ƴմϴ�.");
		}
		if(test2.contains(testTwo)) {
			System.out.println(test2);
			System.out.println(test2);
			System.out.println("ȸ���Դϴ�.");
		}
		else if(!test2.contains(testTwo)) {
		
			System.out.println("ȸ���� �ƴմϴ�.");
		}
	}
}

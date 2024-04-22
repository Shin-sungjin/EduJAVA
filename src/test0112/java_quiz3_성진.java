package test0112;

public class java_quiz3_¼ºÁø {

	public static int return_add(int a, int b) {
		int answer = 0;
		if(b < a) {
			int tep = b;
			int tem = a;
			a= tep;
			b = tem;
		}
		
		if(a == b) {
			answer = a;
		}
		else {
			int sum =0;
			for(int i = a; i <=b; i++) {
				sum += i;
				
			}
			answer = sum;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		System.out.println(return_add(2,5));
		
	}
}

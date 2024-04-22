package OOP1010;
//퀴즈1.

//정수 a과 b가 매개변수로 주어질 때, 
//a을 b로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하는함수 
//quiz1 메서드를 만들어주세요.
//
//퀴즈2
//
//문자열 str1과 정수 n이 매개변수로 주어질 때, 
//str1에 들어있는 각 문자를 n만큼 반복한 문자열을 
//return 하는 n_time 메서드를 만들어보세요.
//
//제한사항
//2 ≤ my_string 길이 ≤ 5
//2 ≤ n ≤ 10
//대소문자는 신경 x
//
//입출력 예
//my_string		n	result
//"hello"		3	"hhheeellllllooo"

public class ExamBasic0110 {
	static int quiz1(int num1, int num2) {
		double ans =(double)num1/(double)num2 ;
		double ans2 = ans*1000;
		int num = (int) Math.floor(ans2); 
	
		return num;
	}
	
	static int quiz1(double num1, double num2) {
		double ans =(int)num1/ (int)num2 ;
		double ans2 = ans*1000;
		return (int)ans2;
	}


	static String n_time(String str1, int n) {
		String str = "";
		for(int i =0; i< str1.length(); i++) {
			for(int j = 0; j<n; j++) {
				str += str1.charAt(i);
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		int a = quiz1(3,2);
		String b = n_time("hello", 3);
		System.out.println("quiz1 메소드를 실행합니다." + a);
		System.out.println("n_time 메소드를 실행합니다"+b);
	
	}

}

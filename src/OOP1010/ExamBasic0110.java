package OOP1010;
//����1.

//���� a�� b�� �Ű������� �־��� ��, 
//a�� b�� ���� ���� 1,000�� ���� �� ���� �κ��� return �ϴ��Լ� 
//quiz1 �޼��带 ������ּ���.
//
//����2
//
//���ڿ� str1�� ���� n�� �Ű������� �־��� ��, 
//str1�� ����ִ� �� ���ڸ� n��ŭ �ݺ��� ���ڿ��� 
//return �ϴ� n_time �޼��带 ��������.
//
//���ѻ���
//2 �� my_string ���� �� 5
//2 �� n �� 10
//��ҹ��ڴ� �Ű� x
//
//����� ��
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
		System.out.println("quiz1 �޼ҵ带 �����մϴ�." + a);
		System.out.println("n_time �޼ҵ带 �����մϴ�"+b);
	
	}

}

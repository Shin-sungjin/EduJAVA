package Weekend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class waring extends Exception{
	waring(){
		
	}
}
class Operation {
//	����: ��Ģ������ �����ϴ� ���� ���α׷��� �ۼ��ؾ� �մϴ�. 
//	����ڷκ��� �� ���� ���ڿ� �����ڸ� �Է¹޾� ��� ����� ����ؾ� �մϴ�. 
//	���� ó���� ���� 0���� ������ ��츦 ó���ؾ� �մϴ�.
//
//	�䱸����:
//	����ڷκ��� ù ��° ����, ������, �� ��° ���ڸ� �Է¹޾� ��� ����� ����ϴ� ���� ���α׷��� �ۼ��ؾ� �մϴ�.
//	�Է��� �����ڿ� ���� ����, ����, ����, ������ ������ �����ؾ� �մϴ�.
//	������ ������ ������ ��, �� ��° ���ڰ� 0�� ��� ArithmeticException�� �߻����Ѿ� �մϴ�. 
//	�� ��� "0���� ���� �� �����ϴ�!"��� �޽����� ����Ͽ� ���ܸ� ó���ؾ� ��
	

	
	public  static double operation(int a, String b, int c) {
		
		double res = 0 ;
			//���� ����� �̻��ϴ�
			switch(b){
				case("+"):
					res = a + c;
					break;
				case("-"):
					res = a - c;
					break;
				case("*"):
					res = a * c;
					break;
			
				case("/"):
					try {
						res = a / c;
						break;
					} catch (Exception e) {
						System.out.println("0���� ���� �� �����ϴ�!");
					}
			}
			
		return res;
			
	}
		
}
public class foreWeekend{
	

	public static void main(String[] args) throws IOException, waring {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �Է� =");
		int a = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� =");
		String cn = br.readLine();
		System.out.print("���� �Է� =");
		int b = Integer.parseInt(br.readLine());
		
		Operation fix = new Operation();
		
		System.out.print(fix.operation(a, cn, b));
	}


}

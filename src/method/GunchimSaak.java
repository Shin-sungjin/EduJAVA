package method;

public class GunchimSaak {
	
	public static int add(int a, int b) {
		return a+b ;
		//������ �ʿ��� ���� 
		// Method�� ����ȴٰ� ���α׷��� ����Ǵ� ���� �幰��. 
		// -> Method�� ���ϰ��� �����Ͽ� ���α׷� ���࿡ ������ �ش�. 
		// -> ���ʿ��� �ڵ带 �ۼ��� ������ ����. 
			
	}
	
	public static void add2(int a, int b) {
		System.out.println(add(10 , 20));
	}
	//���� Ÿ���� void �� �椷��� 
	// ���� ���� ���� Method �� �θ�
	// ���� Ÿ�� void�� ���ʿ��Ѱ�?/
	//  -> ��ȯ �� ���� ���ٸ� ���� Ÿ���� void�� �ۼ� 
	
	public static void main(String[] args) {
		
//	      MethodExam me = new MethodExam();
//	      me.mul1to9();

		
		int[] test = {9, 7, 2, 4};
		System.out.println(Methodexam3.arrSum(test));
		
		
		
		//�μ��� ������ ���ϴ� �޼��� 
		
		
		System.out.println(add(10 , 20));
		add2(20, 30);
	}
}

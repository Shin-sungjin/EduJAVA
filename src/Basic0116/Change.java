package Basic0116;

import java.util.Scanner;

abstract class Change {
	abstract protected double changeMethod(double src);
	abstract protected String getSrc(); 
	abstract protected String getDest(); 
	protected double rat; // ����
	
	public void run() {
		Scanner scanner=new Scanner(System.in);
		System.out.println(getSrc()+"�� "+getDest()+" �� ��ȯ");
		System.out.print(getSrc()+"�� �Է��ϼ���>> ");
		double val=scanner.nextDouble();
		double res= changeMethod(val);
		System.out.println("��ȯ ���: "+res+getDest()+"�Դϴ�");
		scanner.close();
	}
	protected String getSrc(String ge) {
		// TODO Auto-generated method stub
		return null;
	}

}
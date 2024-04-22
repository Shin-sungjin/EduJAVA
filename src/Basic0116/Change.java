package Basic0116;

import java.util.Scanner;

abstract class Change {
	abstract protected double changeMethod(double src);
	abstract protected String getSrc(); 
	abstract protected String getDest(); 
	protected double rat; // 비율
	
	public void run() {
		Scanner scanner=new Scanner(System.in);
		System.out.println(getSrc()+"을 "+getDest()+" 로 변환");
		System.out.print(getSrc()+"을 입력하세요>> ");
		double val=scanner.nextDouble();
		double res= changeMethod(val);
		System.out.println("변환 결과: "+res+getDest()+"입니다");
		scanner.close();
	}
	protected String getSrc(String ge) {
		// TODO Auto-generated method stub
		return null;
	}

}
package Basic0119;

public class colorTv extends TV {

	private int color;	
	colorTv(int a, int b){
		super(a);
		this.color = b;
	}
	//����� �̿��Ͽ�, int a �Ķ��� 
	// super Ű���带 ���� , size�� �Ҵ� 
	

	public void printProperty() {
		String result = String.format("%d��ġ", super.getSize()); //getSize�� �̿��� size�� ��������
		result += String.format("   %d�÷�", this.color);
		System.out.println(result);
	}
	
}

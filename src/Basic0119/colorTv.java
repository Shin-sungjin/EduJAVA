package Basic0119;

public class colorTv extends TV {

	private int color;	
	colorTv(int a, int b){
		super(a);
		this.color = b;
	}
	//상속을 이용하여, int a 파람을 
	// super 키워드를 통해 , size에 할당 
	

	public void printProperty() {
		String result = String.format("%d인치", super.getSize()); //getSize를 이용해 size값 가져오기
		result += String.format("   %d컬러", this.color);
		System.out.println(result);
	}
	
}

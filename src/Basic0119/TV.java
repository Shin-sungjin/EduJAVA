package Basic0119;

public class TV {
//	아래의 메인 메서드와 실행결과를 확인하여 
//	TV라는 클래스를 상속받는 colorTV 클래스 작성.
//	colorTV 클래스는 TV클래스와 차별점은 두되 상속의 특성을 살리는 형태로 작성해볼것.
//	(정답은 없음 자유롭게 생각해볼것,)

		private int size;
		public TV(int size) { 
			this.size=size; 
		}
		protected int getSize() { 
			return size; 
		}
	

	public static void main(String[] args) {
		colorTv myTV=new colorTv(32, 1024);
		myTV.printProperty();
		boolean a= true;

	}

}

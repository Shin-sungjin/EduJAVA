package Basic0119;

public class TV {
//	�Ʒ��� ���� �޼���� �������� Ȯ���Ͽ� 
//	TV��� Ŭ������ ��ӹ޴� colorTV Ŭ���� �ۼ�.
//	colorTV Ŭ������ TVŬ������ �������� �ε� ����� Ư���� �츮�� ���·� �ۼ��غ���.
//	(������ ���� �����Ӱ� �����غ���,)

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

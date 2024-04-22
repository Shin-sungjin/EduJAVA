package SSJ_Quiz5;

public class Student implements Member{
	private String uId;
	
	
	Student(String id){
		this.uId = id;
	}
	@Override
	public String getMemberId() {
		
		 return uId;
	}

	@Override
	public boolean borrowBook(Book book) {
		boolean ck = book.available;
			if(ck) {
				System.out.println("������ ���� �߽��ϴ�.");
				book.available = false;
			}
			else if(!ck) {
				System.out.println("������ �Ұ����մϴ�.");
			}
		
		return ck;
		
	}

	@Override
	public boolean returnBook(Book book) {
		book.available = true;
		System.out.println("�ݳ��� �Ϸ� �Ǿ����ϴ�.");
		return true;
	}

}


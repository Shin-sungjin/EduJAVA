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
				System.out.println("도서를 대출 했습니다.");
				book.available = false;
			}
			else if(!ck) {
				System.out.println("대출이 불가능합니다.");
			}
		
		return ck;
		
	}

	@Override
	public boolean returnBook(Book book) {
		book.available = true;
		System.out.println("반납이 완료 되었습니다.");
		return true;
	}

}


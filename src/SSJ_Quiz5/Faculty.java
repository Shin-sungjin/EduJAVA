package SSJ_Quiz5;

public class Faculty implements Member{
	private String uId;

	Faculty(String id){
		this.uId = id;
	}
	@Override
	public String getMemberId() {
		// TODO Auto-generated method stub
		return this.uId;
	}

	@Override
	public boolean borrowBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean returnBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}
}

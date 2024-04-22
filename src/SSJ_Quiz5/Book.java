package SSJ_Quiz5;

public class Book {
	protected String title;
	protected String author;
	 boolean available = true;
	
	Book(){
		
	}
	
	public String getBookName() {
		return this.title;
	}
	public void getBookInfo() {
		System.out.println("책 제목 : "+ this.title + "\n 도서의 저자 :"+this.author );
		
	}
}

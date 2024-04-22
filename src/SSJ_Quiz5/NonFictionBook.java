package SSJ_Quiz5;

public class NonFictionBook extends Book{
	private String title;
	private String author;
	private boolean available;
	private String type;
	
	
	NonFictionBook(String t, String a, String ty){
		this.title = t;
		this.author = a;
		this.type =ty;
	}
	
	public String getBookName() {
		return this.title;
	}

}

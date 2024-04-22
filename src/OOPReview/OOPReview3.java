package OOPReview;

public class OOPReview3 {

	 String bname;
	 String author;
	 int price ;
	
	public void setBook( String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;	
		viewBook();
	}
	
	public void viewBook() {
		System.out.println("책이름 :" + this.bname);
		System.out.println("작가 :" + this.author);
		System.out.println("가격 :" + this.price);
	}

	public String getBname() {
		return bname;
		
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		OOPReview3 ob = new OOPReview3();
		ob.setBook("자바완성", "김코딩", 250000);
		
		OOPReview3 ob1 = new OOPReview3();
		ob1.setBname("JSP 잡기");
		ob1.setAuthor("송JP");
		ob1.setPrice(3500);
		
		
		System.out.println("책이름 :" +ob1.getBname());
		System.out.println("작가 :"+ob1.getAuthor());
		System.out.println("가격 :" +ob1.getPrice());		
	}
	
	
}

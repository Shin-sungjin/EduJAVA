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
		System.out.println("å�̸� :" + this.bname);
		System.out.println("�۰� :" + this.author);
		System.out.println("���� :" + this.price);
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
		ob.setBook("�ڹٿϼ�", "���ڵ�", 250000);
		
		OOPReview3 ob1 = new OOPReview3();
		ob1.setBname("JSP ���");
		ob1.setAuthor("��JP");
		ob1.setPrice(3500);
		
		
		System.out.println("å�̸� :" +ob1.getBname());
		System.out.println("�۰� :"+ob1.getAuthor());
		System.out.println("���� :" +ob1.getPrice());		
	}
	
	
}

package Test2;

import java.util.List;
import java.util.Map;


import java.util.ArrayList;
import java.util.HashMap;

interface Member {  //Member �������̽� ����
    String getMemberId();
    void borrowBook(Book book); //���� �޼ҵ�
    void returnBook(Book book); // �ݳ��޼ҵ�
}

class Book {			
    private String title;  
    private String author;
    private boolean available;  //���� ���� ���� 

    public Book(String title, String author) {  //������ 
        this.title = title;
        
        this.author = author;
        this.available = true;
    }
    

    public String getTitle() {  //���� �������� Method
        return title;
    }

    public String getAuthor() {//�۰� �������� Method
        return author;
    }

    public boolean isAvailable() {//���� ���� ����  �������� Method
        return available;
    }

    public void setAvailable(boolean available) { //���� ���� ���ο� ���� ��ȯ Method
        this.available = available; //�� �ν��Ͻ��� ���� ���� ���� �� ��ȯ
    }

    public String getBookInfo() {  //å ����
        return "Title: " + title + ", Author: " + author + ", Available: " + available;
    }
}

class FictionBook extends Book {  //�Ҽ�
    private String genre;   

    //������, 
    
    public FictionBook(String title, String author, String genre) {
        super(title, author); //��,,, �̰� �̷��� �� ���� �ֳ�,,, ��,,,,, �Ӹ��� ���ϴ�.
        //Book �ν��Ͻ� ���� 
        this.genre = genre;
    }

    public String getGenre() {
        return genre; //�Ҽ� ����? ��ȯ
    }
}

class NonFictionBook extends Book {  //���ȼ� ������ ���� Ŭ���� 
    private String subject;

    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}

class Student implements Member {   //Member�� ��� �޴� Ŭ����
    private String memberId;  //memberId�� ���� 

    public Student(String memberId) {  //����
        this.memberId = memberId;
    }

    public String getMemberId() {  //Id ��ȯ
        return memberId;
    }

    public void borrowBook(Book book) {   //���� �޼ҵ� 
        if (book.isAvailable()) {  //book�� ���°� true �Ͻ� 
            book.setAvailable(false);  //false�� ��ȯ
            System.out.println("���� ���� �Ϸ�: " + book.getTitle());  //���� ������ å �̸� 
        } else {
            System.out.println("�ش� ������ �̹� ���� ���Դϴ�."); //false�� �� 
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {  //�ݳ� �޼ҵ�, false �Ͻ� �ݳ� ����
            book.setAvailable(true);  //true �� ���� 
            System.out.println("���� �ݳ� �Ϸ�: " + book.getTitle());
        } else {
            System.out.println("�ش� ������ ���� ���� �ƴմϴ�.");
        }
    }
}


//Student�� ������ �˰��� 
class Faculty implements Member { 
    private String memberId;

    public Faculty(String memberId) {  
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {  
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("���� ���� �Ϸ�: " + book.getTitle());
        } else {
            System.out.println("�ش� ������ �̹� ���� ���Դϴ�.");
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("���� �ݳ� �Ϸ�: " + book.getTitle());
        } else {
            System.out.println("�ش� ������ ���� ���� �ƴմϴ�.");
        }
    }
}



class Library {
    private List<Book> bookList;  //å�� ������ ����Ʈ ����
    private List<Member> memberList;  //����� ������ ����Ʈ ����

    public Library() {  //�����ڿ� �Բ� ����Ʈ ����
    	bookList = new ArrayList<>();
    	memberList = new ArrayList<>();
    }

    public void addBook(Book book) {  //å �߰� 
        bookList.add(book);
    }

    public void addMember(Member member) {  //��� ���
        memberList.add(member);
    }

    public void borrowBook(Member member, Book book) { //����
        member.borrowBook(book);  //member�� borrowbook �޼ҵ� ���� �Ͽ�  Book�� �Ķ���ͷ� ���� 
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);//member�� returnBook �޼ҵ� ���� �Ͽ�  Book�� �Ķ���ͷ� ���� 
    }
}

public class Main5 {
	public static void main(String[] args) {
		// ������ �ý��� ���� ����
		Library library = new Library();

		// ���� �߰�
		Book book1 = new FictionBook("��ħ�� �ξ� ���� �ڹ�", "G.C.King", "Fantasy");
		Book book2 = new NonFictionBook("�ι��ٽ� ���� ����", "������", "Software Development");
		library.addBook(book1);
		library.addBook(book2);

		// ȸ�� �߰�
		Member student = new Student("S001");
		Member faculty = new Faculty("F001");
		library.addMember(student);
		library.addMember(faculty);

		// ���� ���� �� �ݳ�
		library.borrowBook(student, book1); // ���� ���� �Ϸ�: ��ħ�� �ξ� ���� �ڹ�
		library.borrowBook(faculty, book2); // ���� ���� �Ϸ�: �ι��ٽ� ���� ����
		library.borrowBook(student, book1); // �ش� ������ �̹� ���� ���Դϴ�.
		library.returnBook(student, book1); // ���� �ݳ� �Ϸ�: ��ħ�� �ξ� ���� �ڹ�
		library.returnBook(faculty, book2); // ���� �ݳ� �Ϸ�: �ι��ٽ� ���� ����
		library.returnBook(student, book1); // �ش� ������ ���� ���� �ƴմϴ�
	}
}


/* MyCode Review!
 * public interface Member {  member �ν��Ͻ� ���� 
	public String getMemberId();
	public boolean borrowBook(Book book);
	public boolean returnBook(Book book);
	
	}
	
	public class Book {   //book Ŭ���� 
		protected String title;
		protected String author;
		 boolean available = true;
		
		Book(){  //������
			
		}
		
		public String getBookName() {  //å �̸� �ҷ����� 
			return this.title;
		}
		public void getBookInfo() {   //å �̸� ��ȯ 
			System.out.println("å ���� : "+ this.title + "\n ������ ���� :"+this.author );
			
		}
	}
	
	public class FictionBook extends Book {  //book�� ��� ���� 
		private String title;  
		private String author;
		private boolean available;
		private String type;
	
		FictionBook(String t, String a, String ty){  //å ���� ��� method
			this.title = t;
			this.author = a;
			this.type =ty;
		}
	
		public String getBookName() {  // å �̸� ��ȯ
			return this.title;
		}
	}	
	
	public class Student implements Member{
		private String uId;  //������� id 
		
		
		Student(String id){  //id ����
			this.uId = id;
		}
		@Override
		public String getMemberId() { //id ��ȯ
			
			 return uId;
		}
	
		@Override
		public boolean borrowBook(Book book) {  //����
			boolean ck = book.available;  //���� �Ϸ��� å�� boolean �� Ȯ��
				if(ck) {  //true�Ͻ�
					System.out.println("������ ���� �߽��ϴ�.");
					book.available = false;  //���� �Ϸ� �ϰ�, ����
				}
				else if(!ck) {  //�ƴ� �� ���� �Ұ� 
					System.out.println("������ �Ұ����մϴ�.");
				}
			
			return ck;
			
		}
	
		@Override   //�ݳ� �޼ҵ� 
		public boolean returnBook(Book book) {
			book.available = true;   //���⸦ �� �� ���� �߾�� �ߵ�. 
			System.out.println("�ݳ��� �Ϸ� �Ǿ����ϴ�.");
			return true;
		}

	}

	public class Faculty implements Member{
		private String uId;
	
		Faculty(String id){
			this.uId = id;
		}
		
		Student�� ���� �� �˰��� 
		@Override
		public String getMemberId() {
			// TODO Auto-generated method stub
			return this.uId;
		}
	
		//������ �ð��� ������.
		@Override
		public boolean borrowBook(Book book) {
			// TODO Auto-generated method stub
			return false;
		}
	
		//������ �ð��� ������. 
		@Override
		public boolean returnBook(Book book) {
			// TODO Auto-generated method stub
			return false;
		}
	}
	
	public class Library {
		//Map��, List ����
		Map<String, String> bookList = new HashMap<String, String>();
		ArrayList memberList = new ArrayList();
		
		Library(){
			
		}
		
		public void addBook(Book book){  //å ���� �߰�, bookList�� ����� �۰� �Է�
			bookList.put(book.title, book.author);
			System.out.println("���� ����� �Ϸ� �Ǿ����ϴ�.");
			}
			
		public void addMember(Member member) {  Member ����Ʈ�� ȸ�� ���� �߰� 
			memberList.add(member.getMemberId());
			System.out.println("ȸ�� ��� �Ϸ�");
		}
		
		public void borrowBook(Member member, Book book ) {  //ȸ�����̵� Ȯ�� ��, ���� ����
			boolean ck  =  book.available;  // ������� å ������ ���� Ȯ��
			
			if(memberList.contains(member.getMemberId())) {
				// ȸ������ ����� �Ǿ� �ְ�
				if(book.available) { // ���°� true �Ͻ� , ���� ���� ���� 
					System.out.printf("���� ���� �Ϸ� : %s", book.getBookName());
					System.out.println();
					book.available = false; // ���� ���� false�� ����
				}
				else { å�� ���°� false�Ͻ� ���� �� ���
					System.out.println("�������Դϴ�.");
				}
			}
			else {  //memberList�� ȸ�� Id ���� x �� 
				System.out.println("�������� �ʴ� ȸ���Դϴ�.");
			}
		}
		
		//����� ������ �˰��� 
		public void returnBook(Member member, Book book ) {
			if(memberList.contains(member.getMemberId())) {
				if(book.available) {
					System.out.println("�������� �ƴմϴ�.");
				}
				else {
					System.out.printf("���� ���� �Ϸ� : %s" , book.getBookName());
					System.out.println();
					book.available = true;
				}
			}
			else {
				System.out.println("ȸ���� �ƴմϴ�.");
			}
		
	}


*/


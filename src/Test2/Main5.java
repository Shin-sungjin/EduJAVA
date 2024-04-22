package Test2;

import java.util.List;
import java.util.Map;


import java.util.ArrayList;
import java.util.HashMap;

interface Member {  //Member 인터페이스 생성
    String getMemberId();
    void borrowBook(Book book); //대출 메소드
    void returnBook(Book book); // 반납메소드
}

class Book {			
    private String title;  
    private String author;
    private boolean available;  //대출 가능 여부 

    public Book(String title, String author) {  //생성자 
        this.title = title;
        
        this.author = author;
        this.available = true;
    }
    

    public String getTitle() {  //제목 가져오는 Method
        return title;
    }

    public String getAuthor() {//작가 가져오는 Method
        return author;
    }

    public boolean isAvailable() {//대출 가능 여부  가져오는 Method
        return available;
    }

    public void setAvailable(boolean available) { //대출 가능 여부에 대한 반환 Method
        this.available = available; //그 인스턴스의 대출 가능 여부 값 반환
    }

    public String getBookInfo() {  //책 정보
        return "Title: " + title + ", Author: " + author + ", Available: " + available;
    }
}

class FictionBook extends Book {  //소설
    private String genre;   

    //생성자, 
    
    public FictionBook(String title, String author, String genre) {
        super(title, author); //와,,, 이걸 이렇게 할 수도 있네,,, 와,,,,, 머리가 띵하다.
        //Book 인스턴스 생성 
        this.genre = genre;
    }

    public String getGenre() {
        return genre; //소설 여부? 반환
    }
}

class NonFictionBook extends Book {  //논픽션 도서에 대한 클래스 
    private String subject;

    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}

class Student implements Member {   //Member을 상속 받는 클래스
    private String memberId;  //memberId를 가짐 

    public Student(String memberId) {  //생성
        this.memberId = memberId;
    }

    public String getMemberId() {  //Id 반환
        return memberId;
    }

    public void borrowBook(Book book) {   //대출 메소드 
        if (book.isAvailable()) {  //book의 상태가 true 일시 
            book.setAvailable(false);  //false로 전환
            System.out.println("도서 대출 완료: " + book.getTitle());  //대출 성공과 책 이름 
        } else {
            System.out.println("해당 도서는 이미 대출 중입니다."); //false일 때 
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {  //반납 메소드, false 일시 반납 가능
            book.setAvailable(true);  //true 갑 대입 
            System.out.println("도서 반납 완료: " + book.getTitle());
        } else {
            System.out.println("해당 도서는 대출 중이 아닙니다.");
        }
    }
}


//Student와 동일한 알고리즘 
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
            System.out.println("도서 대출 완료: " + book.getTitle());
        } else {
            System.out.println("해당 도서는 이미 대출 중입니다.");
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("도서 반납 완료: " + book.getTitle());
        } else {
            System.out.println("해당 도서는 대출 중이 아닙니다.");
        }
    }
}



class Library {
    private List<Book> bookList;  //책을 저장할 리스트 선언
    private List<Member> memberList;  //멤버를 저장할 리스트 선언

    public Library() {  //생성자와 함꼐 리스트 생성
    	bookList = new ArrayList<>();
    	memberList = new ArrayList<>();
    }

    public void addBook(Book book) {  //책 추가 
        bookList.add(book);
    }

    public void addMember(Member member) {  //멤버 등록
        memberList.add(member);
    }

    public void borrowBook(Member member, Book book) { //대출
        member.borrowBook(book);  //member의 borrowbook 메소드 실행 하여  Book을 파라미터로 받음 
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);//member의 returnBook 메소드 실행 하여  Book을 파라미터로 받음 
    }
}

public class Main5 {
	public static void main(String[] args) {
		// 도서관 시스템 동작 예시
		Library library = new Library();

		// 도서 추가
		Book book1 = new FictionBook("군침이 싸악 도는 자바", "G.C.King", "Fantasy");
		Book book2 = new NonFictionBook("두번다시 개발 안해", "백지영", "Software Development");
		library.addBook(book1);
		library.addBook(book2);

		// 회원 추가
		Member student = new Student("S001");
		Member faculty = new Faculty("F001");
		library.addMember(student);
		library.addMember(faculty);

		// 도서 대출 및 반납
		library.borrowBook(student, book1); // 도서 대출 완료: 군침이 싸악 도는 자바
		library.borrowBook(faculty, book2); // 도서 대출 완료: 두번다시 개발 안해
		library.borrowBook(student, book1); // 해당 도서는 이미 대출 중입니다.
		library.returnBook(student, book1); // 도서 반납 완료: 군침이 싸악 도는 자바
		library.returnBook(faculty, book2); // 도서 반납 완료: 두번다시 개발 안해
		library.returnBook(student, book1); // 해당 도서는 대출 중이 아닙니다
	}
}


/* MyCode Review!
 * public interface Member {  member 인스턴스 생성 
	public String getMemberId();
	public boolean borrowBook(Book book);
	public boolean returnBook(Book book);
	
	}
	
	public class Book {   //book 클래스 
		protected String title;
		protected String author;
		 boolean available = true;
		
		Book(){  //생성자
			
		}
		
		public String getBookName() {  //책 이름 불러오기 
			return this.title;
		}
		public void getBookInfo() {   //책 이름 반환 
			System.out.println("책 제목 : "+ this.title + "\n 도서의 저자 :"+this.author );
			
		}
	}
	
	public class FictionBook extends Book {  //book을 상속 받음 
		private String title;  
		private String author;
		private boolean available;
		private String type;
	
		FictionBook(String t, String a, String ty){  //책 정보 등록 method
			this.title = t;
			this.author = a;
			this.type =ty;
		}
	
		public String getBookName() {  // 책 이름 반환
			return this.title;
		}
	}	
	
	public class Student implements Member{
		private String uId;  //멤버변수 id 
		
		
		Student(String id){  //id 생성
			this.uId = id;
		}
		@Override
		public String getMemberId() { //id 반환
			
			 return uId;
		}
	
		@Override
		public boolean borrowBook(Book book) {  //대출
			boolean ck = book.available;  //대출 하려는 책의 boolean 값 확인
				if(ck) {  //true일시
					System.out.println("도서를 대출 했습니다.");
					book.available = false;  //대출 완료 하고, 변경
				}
				else if(!ck) {  //아닐 시 대출 불가 
					System.out.println("대출이 불가능합니다.");
				}
			
			return ck;
			
		}
	
		@Override   //반납 메소드 
		public boolean returnBook(Book book) {
			book.available = true;   //여기를 좀 더 구현 했어야 했따. 
			System.out.println("반납이 완료 되었습니다.");
			return true;
		}

	}

	public class Faculty implements Member{
		private String uId;
	
		Faculty(String id){
			this.uId = id;
		}
		
		Student와 유사 한 알고리즘 
		@Override
		public String getMemberId() {
			// TODO Auto-generated method stub
			return this.uId;
		}
	
		//구현할 시간이 없엇따.
		@Override
		public boolean borrowBook(Book book) {
			// TODO Auto-generated method stub
			return false;
		}
	
		//구현할 시간이 없엇따. 
		@Override
		public boolean returnBook(Book book) {
			// TODO Auto-generated method stub
			return false;
		}
	}
	
	public class Library {
		//Map과, List 선언
		Map<String, String> bookList = new HashMap<String, String>();
		ArrayList memberList = new ArrayList();
		
		Library(){
			
		}
		
		public void addBook(Book book){  //책 정보 추가, bookList에 제목과 작가 입력
			bookList.put(book.title, book.author);
			System.out.println("도서 등록이 완료 되었습니다.");
			}
			
		public void addMember(Member member) {  Member 리스트에 회원 정보 추가 
			memberList.add(member.getMemberId());
			System.out.println("회원 등록 완료");
		}
		
		public void borrowBook(Member member, Book book ) {  //회원아이디 확인 후, 대출 가능
			boolean ck  =  book.available;  // 빌려라는 책 정보의 상태 확인
			
			if(memberList.contains(member.getMemberId())) {
				// 회원으로 등록이 되어 있고
				if(book.available) { // 상태가 true 일시 , 도서 대출 가능 
					System.out.printf("도서 대출 완료 : %s", book.getBookName());
					System.out.println();
					book.available = false; // 대출 이후 false로 수정
				}
				else { 책의 상태가 false일시 대출 중 출력
					System.out.println("대출중입니다.");
				}
			}
			else {  //memberList에 회원 Id 존재 x 시 
				System.out.println("존재하지 않는 회원입니다.");
			}
		}
		
		//대출과 유사한 알고리즘 
		public void returnBook(Member member, Book book ) {
			if(memberList.contains(member.getMemberId())) {
				if(book.available) {
					System.out.println("대출중이 아닙니다.");
				}
				else {
					System.out.printf("도서 대출 완료 : %s" , book.getBookName());
					System.out.println();
					book.available = true;
				}
			}
			else {
				System.out.println("회원이 아닙니다.");
			}
		
	}


*/


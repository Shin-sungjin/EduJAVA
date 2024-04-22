package SSJ_Quiz5;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
	
	Map<String, String> bookList = new HashMap<String, String>();
	ArrayList memberList = new ArrayList();
	Library(){
		
	}
	
	public void addBook(Book book){
		bookList.put(book.title, book.author);
		System.out.println("도서 등록이 완료 되었습니다.");
		}
	public void addMember(Member member) {
		memberList.add(member.getMemberId());
		System.out.println("회원 등록 완료");
	}
	
	public void borrowBook(Member member, Book book ) {
		boolean ck  =  book.available;
		
		if(memberList.contains(member.getMemberId())) {
			
			if(book.available) {
				System.out.printf("도서 대출 완료 : %s", book.getBookName());
				System.out.println();
				book.available = false;
			}
			else {
				System.out.println("대출중입니다.");
			}
		}
		else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}
	
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
	
	public static void main(String[] args) {
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

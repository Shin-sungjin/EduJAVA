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
		System.out.println("���� ����� �Ϸ� �Ǿ����ϴ�.");
		}
	public void addMember(Member member) {
		memberList.add(member.getMemberId());
		System.out.println("ȸ�� ��� �Ϸ�");
	}
	
	public void borrowBook(Member member, Book book ) {
		boolean ck  =  book.available;
		
		if(memberList.contains(member.getMemberId())) {
			
			if(book.available) {
				System.out.printf("���� ���� �Ϸ� : %s", book.getBookName());
				System.out.println();
				book.available = false;
			}
			else {
				System.out.println("�������Դϴ�.");
			}
		}
		else {
			System.out.println("�������� �ʴ� ȸ���Դϴ�.");
		}
	}
	
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
	
	public static void main(String[] args) {
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

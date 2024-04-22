package ListExam;

import java.util.Iterator;
import java.util.Vector;

import OOP0115.b;

public class VectorExam {
	public static void main(String[] args) {
		
	
	// Vector
	// 기본적으로 멀티스레드를 허용하기 때문에
	// 여러개의 스레드가 Vector에 접근해서
	// 객체를 추가하거나 삭제할 때 사용. 
	
	//크기가 5인 Vector
	//크기 설정 X시 기본적으로 10의 크기를 가져감
	Vector<Board> vector = new Vector<>(5);
	
	//익명 인스턴스 추가
	
	vector.add(new Board("1", "2", "3"));
	vector.add(new Board("4", "5", "6"));
	vector.add(new Board("7", "8", "9"));
	
//	for (int i =0; i<vector.size(); i++) {
//		System.out.println(vector.get(i).);
//		}
	
	
	// 향상된 for 문
	// 객체의 순환시 사용하면 좋음
	// Board 클래스를 통해 만들어진 임시 인스턴트 B
	// vector 인스턴스를 순환 
	
	//객체 반복시 좋음, 굳이 증감연산자 안씀
//	for(Board B : vector) {
//		System.out.println(B.subject);
//		System.out.println(B.content);
//		System.out.println(B.writer);
//	}
	
	//객체의 반복자 = Iterator 
	Iterator<Board> iterrator = vector.iterator();
	while(iterrator.hasNext()){  //가져올 데이터가 있으면 가져와라. 
		Board board = iterrator.next();
		System.out.println(board.subject + board.content + board.writer);
	}
	}
}

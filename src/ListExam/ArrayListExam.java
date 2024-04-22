package ListExam;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam {
	public static void main(String[] args) {
		
		
		// ArrayList는 제네릭타입이다. 
		// 그러므로 아래의 코드는 경고 처리
		ArrayList list1 = new ArrayList();
		
		
		list1.add("123");
		list1.add("456");
		list1.add(9724);
		
		System.out.println(list1.size());
		System.out.println(list1.hashCode());
		System.out.println(list1.toString());

		int size = list1.size();
		
		
		
		
		// 퀴즈 
		// 반복문을 활용하여 리스트안의 있는 모든 요소를 삭제
		
		//기존 For문 처럼 증가연산자를 사용하면 오류 
		// 그래서 후위 감소 연산자를 이용하여 해결
		
		// 아래의 코드는 에러 
		// 이유 : 컬렉션 프레임워크의 리스트는 객체가 삭제ㅐ되면 공백만큼 땡겨옴
		// 		즉, 인덱스 0을 삭제할 때, 0 번째의 idx는 삭제되지만
		//		i 값은 증가 하고, 삭제 후 다시 리스트 내부를 정렬 하기 때문
		//		기존의 증가 for문으로는 삭제는 불가

		for (int i = 0; i<size; i++) {
			// 해당 컬렉션 리스트의 값을 가져오는 Method;
			list1.remove(i);
		
		}
		
		
		// 해결 방안 1.
		// 맨 마지막부터 삭제하여 0까지 쭉 차례로 삭제 (역순 반복)
		// 컬렉션 프레임워크에서 구형 for문을 안쓰는 이유
		// !.향상된 for문의 필요성의 등장.ㄴ!
		for (int i = size-1; i>=0; i--) {
			// 해당 컬렉션 리스트의 값을 가져오는 Method;
			list1.remove(i);
		
		}
		
		
		// 해결 방안 2.
		// 어차피 배열이 계속 정리가 되니까, 0값만 사이즈에 맞게 
		// 계속 0값만 지워줘도 가능
		// 내가 생각하지 못한 방법
		
		for( int i = 0; i < size; i++) {
			list1.remove(0);
		}
		System.out.println(list1.toString());
		

		

		
	}
}

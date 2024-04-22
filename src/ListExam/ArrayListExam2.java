package ListExam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExam2 {
	
	// Collection interFace
	// 컬렉션 중 최상위 클래스
	
	// 컬렉션 프레임워크와 배열을 다름
	// List는 객체로 봄, 배열을 객체 자체를 저장 
	// 비슷한 기능을 한다고, 동일하지 않음 
	
	// 3대장이 이를 구현 
	// 1.List   => 힙 영역
		// ArrayList
		//	-동작구조 
	
	
		// LinkedList
		//  -ArrayList와 동작구조는 차이, 
		//  - But, 코드상으로는 거의 똑같음 
		// 특정상황에 각자 유리한 상황이 있음 
	
		// Stack -> Vector
		// (Stack은 Vector를 상속받음)
		
		// 객체 자체를 저장하는게 아닌 참조, 주소가 저장된다.
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		// 컬렉션의 리스트는 자동으로 인덱싱은 가능하지만,
		// 처음부터 0번 이상의 데이터를 해당 위치로 인덱싱은 불가능
		// 들어오는 데이터는 순차적으로 쌓임
		// 특정인덱스에 특정값 삽입이 불가능
		// add의 파라미터값이 2개일 때, 전자는 인덱스값,
//		list1.add(5, 5);
//		list1.add(4, 4);
//		list1.add(2, 2);
//		list1.add(0, 0);
//		list1.add(1, 1);
//		list1.add(3, 3);
		
		System.out.println(list1.toString());
		//add : 데이터 추가 
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		System.out.println(list1.toString());
		
		//리스트의 값이 이미 정해져있는 상태라면 
		// 아래와 같이 특정 인덱스에 특정값을 저장하는 것이 가능
		// 저장 이전에 1번 인덱스는 뒤로 밀림
		// 근데 팽창되지 않은 범위에 대해서 추가하는 것은 불가능.
		list1.add(1, 9724);
		System.out.println(list1.toString());
		
		
		// subList(시작 인덱스, 끝 인덱스값+1)
		// 반복 돌릴 때 특정 값만 돌릴 수 있음
		// 조건식이 잘 안떠오르네, 
		System.out.println(list1.subList(1, 3));
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		
		// 정렬
		// 오름차순 정렬 
		Collections.sort(list1);
		System.out.println(list1.toString());
		
		// 역순 정렬
		Collections.reverse(list1);
		System.out.println(list1.toString());
		
		// 1. 조준모는 뭔 지랄이 나서 이게 맘에 안든다 하는가
		// toStirng을 계속 써버림
		// 2. 내림차순으로 정렬하는 방법은?
		Collections.sort(list1, Collections.reverseOrder());
		print(list1, list2);
		
		
		System.out.println("위치 : " + list1.indexOf(0));
	}
	
	public static void print(List list1, List list2) {
		System.out.println("첫 번째 리스트의 현재 요소  : " + list1.toString());
		System.out.println("두 번째 리스트의 현재 요소  : " + list2.toString());
	}
	
	
	
	
	
	
	
	// 2.Set
		
	
	// 3.Map
		// hashMap
		// property
	
	//컬렉션 프레임 워크의 구조 
	// 최상위 컬렉션 인테페이스가 존재 
	// 그 밑으로 List, Set, Map이 존재 
	
	// 
	
}

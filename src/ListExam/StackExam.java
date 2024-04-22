package ListExam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExam {
	
	// Stack : 쌓인다. 
	// stack은 기본적으로 후입 선출의 구조 
	// Last in First Out (LIFO)
	
	// Stack의 활용 예시
	// 1.웹 브라우저의 방문기록 (뒤로가기)
	// ex) 네이버 홈 -> 해외 축고 - > 최신뉴스 - >김민재 기사 
	//		김민재 기사를 누르고 뒤로가기를 누르면 네이버 메인이 아닌 최신 뉴스로 감
	// 2.역순 문자열
	// 3.실행취소(undo)
	// 4.수식 괄호 검사식
	
	
	// Queue : 줄 서서 기다리기 
	// 큐는 기본적으로 선입 선출
	// First In First Out (FiFO)
	
	// 1. 우선순위가 같은 작업의 예약(프린터 인쇄 대기열)
	// 2. 검색기록
	// 3. 은행 업무 
	// 4. 콜센터 대기 
	// 5. BFS(너비 우선 탐색)
	// 6. Cache
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
				
		//stack push(넣을게), pop(뺄게)
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		//queue offer(넣을게), 
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
	
		System.out.println("스택구조");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("큐 구조");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
			
		}
	
	}
	
}

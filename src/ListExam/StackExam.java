package ListExam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExam {
	
	// Stack : ���δ�. 
	// stack�� �⺻������ ���� ������ ���� 
	// Last in First Out (LIFO)
	
	// Stack�� Ȱ�� ����
	// 1.�� �������� �湮��� (�ڷΰ���)
	// ex) ���̹� Ȩ -> �ؿ� ��� - > �ֽŴ��� - >����� ��� 
	//		����� ��縦 ������ �ڷΰ��⸦ ������ ���̹� ������ �ƴ� �ֽ� ������ ��
	// 2.���� ���ڿ�
	// 3.�������(undo)
	// 4.���� ��ȣ �˻��
	
	
	// Queue : �� ���� ��ٸ��� 
	// ť�� �⺻������ ���� ����
	// First In First Out (FiFO)
	
	// 1. �켱������ ���� �۾��� ����(������ �μ� ��⿭)
	// 2. �˻����
	// 3. ���� ���� 
	// 4. �ݼ��� ��� 
	// 5. BFS(�ʺ� �켱 Ž��)
	// 6. Cache
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
				
		//stack push(������), pop(����)
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		//queue offer(������), 
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
	
		System.out.println("���ñ���");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("ť ����");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
			
		}
	
	}
	
}

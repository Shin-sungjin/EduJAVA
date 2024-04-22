package ListExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class QueueHomework {
// ���⼭�� ���� �⺻���� ���Լ����� �����غ����� �Ѵ�. 
// ���ۿ� �ռ� ��밡���� ��� ���� 
// offer (����) , poll(����)  peek(���� ù��° ��� ��ȯ)
// ���� ��ǥ������ ���Լ����� �Ͼ�� Frank Buger�� �ֹ� ������ ǥ���غ���
	
// ���� ���� �� ��� ������� �������� ���Դϴ�. 
	public static void main(String[] args) {
		FIFO fi = new FIFO();
		fi.setInventory("Large Meet1");
		fi.setInventory("Large Meet2");
		fi.setInventory("Fork");
		fi.getInventory();
		fi.firstInventory();
		fi.useElement();
	}
}

class FIFO{
	 private Queue<String> queue = new LinkedList<String>();
	
	
	 FIFO(){
		 this.queue =queue;
	 }
	 
	 public void setInventory(String Element) {
		 this.queue.offer(Element);
	 }
	 public void getInventory() {
		 System.out.println(this.queue);
	 }
	 
	 public void firstInventory() {
		 System.out.println(this.queue.peek());
	 }
	 
	 public void useElement() {
		 System.out.println(this.queue.poll()+ "�� �Ҹ��߽��ϴ�.");;
		 
	 }
}
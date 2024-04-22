package ListExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class QueueHomework {
// 여기서는 가장 기본적인 선입선출을 구현해보고자 한다. 
// 시작에 앞서 사용가능한 요소 정리 
// offer (삽입) , poll(삭제)  peek(가장 첫번째 요소 반환)
// 가장 대표적으로 선입선출이 일어나는 Frank Buger의 주방 구조를 표현해보자
	
// 가장 먼저 온 재료 순서대로 차곡차곡 쌓입니다. 
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
		 System.out.println(this.queue.poll()+ "을 소모했습니다.");;
		 
	 }
}
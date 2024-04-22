package ListExam;

import java.util.Iterator;
import java.util.Vector;

import OOP0115.b;

public class VectorExam {
	public static void main(String[] args) {
		
	
	// Vector
	// �⺻������ ��Ƽ�����带 ����ϱ� ������
	// �������� �����尡 Vector�� �����ؼ�
	// ��ü�� �߰��ϰų� ������ �� ���. 
	
	//ũ�Ⱑ 5�� Vector
	//ũ�� ���� X�� �⺻������ 10�� ũ�⸦ ������
	Vector<Board> vector = new Vector<>(5);
	
	//�͸� �ν��Ͻ� �߰�
	
	vector.add(new Board("1", "2", "3"));
	vector.add(new Board("4", "5", "6"));
	vector.add(new Board("7", "8", "9"));
	
//	for (int i =0; i<vector.size(); i++) {
//		System.out.println(vector.get(i).);
//		}
	
	
	// ���� for ��
	// ��ü�� ��ȯ�� ����ϸ� ����
	// Board Ŭ������ ���� ������� �ӽ� �ν���Ʈ B
	// vector �ν��Ͻ��� ��ȯ 
	
	//��ü �ݺ��� ����, ���� ���������� �Ⱦ�
//	for(Board B : vector) {
//		System.out.println(B.subject);
//		System.out.println(B.content);
//		System.out.println(B.writer);
//	}
	
	//��ü�� �ݺ��� = Iterator 
	Iterator<Board> iterrator = vector.iterator();
	while(iterrator.hasNext()){  //������ �����Ͱ� ������ �����Ͷ�. 
		Board board = iterrator.next();
		System.out.println(board.subject + board.content + board.writer);
	}
	}
}

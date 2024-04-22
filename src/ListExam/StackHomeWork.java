package ListExam;

import java.util.Stack;
//���ۿ� �ռ� ���ͳ� �ڵ带 ã�ƺ��� �ʾҰ�, 
// ������ ��ü���� review�� �������� �����ϰ� 
// ȥ�ڼ� ������Ʈ �ּ� �̵�, ���� �� �����غý��ϴ�.
// Ȥ�� Ȯ���ϽŴٸ� �ǵ�� ��Ź�帮�ڽ��ϴ�!


//���� ��ü ���� �ڵ� ������ !!

//�켱 ���� ���� ���� �����غ��ô�. 

//���� ���� ���뿡�� ����� Stack�� Ư¡���� ���Ǹ� �غ���
// Stack�� ���� ������ ������. 

// ���� ������ ���ø� ���ǿ��� ������ ���� �̿ܿ��� ���� �������� �ʴ´�. 
// ��� ����ؾ����� �� �𸣰ڴ�. 

// ���ǿ��� ���� ó������ ����� ���ͳ� �ּ�, �ǵ��ư��⸦ �����غ���, 
// ���ǻ�, ���ͳ� �ּҴ� String���� �޴´�. 
// ��ư Ŭ���� ���ǻ� �����ϵ��� �Ѵ�. 
public class StackHomeWork {
	
	//ã�ƺôµ� 
	// heep ������ ��� ������ �����ϴ� �����̰�
	// stack ������ �޼ҵ带 �����ϴ� �����̶�� ���� �ִ�. 
	// ������ ���� ������ Stack Ű���带 �̿��Ͽ�, �������� �ڵ带 ����� ����������,
	// ��� ���� �����ʹ� ������ ���δ�. 
	
	// ������, ���� ���� ����, ��, Method�� ���� ���� ���ʷ� �Է¹ް�,
	// ��Ҹ� ȣ���ϴ� Method�� �������� ���� ��ȯ�ϴ� ������ ���ϴ� �� ����. 
	
	// ���� Stack ���÷� ��� ���캻 ���, Stack �ڵ������� ���� ������ �������� ������� ��ȯ�ϴ� �� ����.

	public static void main(String[] args) {
		URL ul = new URL("naver");
		System.out.println(ul.getUrl());
		ul.setURL("sports");
		System.out.println(ul.getUrl());
		ul.returnURL();
//		System.out.println(ul.getUrl());
		
	}
}

class URL{
	private String url;    //url�� ���� String���� �޴´�. 
	private Stack<String> stack = new Stack<String>(); // Stack �÷��� �����ӿ�ũ�� �����Ѵ�. 
	//�迭�� Stack�� ����ٸ�, ũ�Ⱑ �����Ǿ� �־�, ������ ���� ���� �� ����, list�� �����Ѵ�. 
	
	URL(String url){   //������    ex) naver.com �� naver ���� ���� �� �ְڴ�. 
		this.url = url;  //url �� �ʱ�ȭ 
		this.stack.push(url); //�ʱ�ȭ
	}
	// ex) �����ڿ� naver�� ���´ٸ� 
	// ù ������ naver �� �Ǵ� ���̴�. 
	
	public String getUrl() {
		 return this.url;
		 //url�� ������ ���� Method
	}
	
	public void setURL(String u) {
		this.stack.push("/"+u);  // "/"�� �Բ� �̵��ϰ��� �ϴ� Url�� stack�� push
		int num = stack.indexOf(u);		//�ش� ��ġ ���� ����
		for(int i = 0 ; i<stack.peek().length(); i++) { //���� �������� ���� URL�� ȣ��ȴ�.
			//���� �������� �ִ� ����� ���� ���� ��ŭ �ݺ�
			char ch = stack.peek().charAt(i);
			this.url += ch;
			//url ���� 
		}
	
		
	}
	
	public void returnURL() {
		String rep = this.stack.peek();  //������ ������ �� ȣ��
		int idx = url.indexOf(rep);		//�ش� ���ڿ��� ������� ȣ��
		this.stack.pop();  //������ �� ���� // peek�� �ҷ��Դ� ��
		this.url =this.url.substring(0, idx);  //�� ���߸��� 
		//	substring�� ���ڿ� ��ü�� ���� ��ȯ�� ��ġ�� �ʰ�, ��Ʈ�� Ŭ������ ���ο� �ν��Ͻ��� �����ϴ� ���̹Ƿ�
		// �� ���� ���� ������ �ʿ�� �ϴ�. 
		System.out.println(this.url);
		
		
		
	}
}

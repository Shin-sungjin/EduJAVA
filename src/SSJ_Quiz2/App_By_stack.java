package SSJ_Quiz2;

import java.util.Stack;

public class App_By_stack implements Stack_by_interface{
	private String arr[];
	private int top;
	
	public App_By_stack(int num) {
		arr = new String[num];
		top = 0;
	}

	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		
		return  arr.length;
	}

	@Override
	public String pop() {
		if(top==0)
			return "비어있음";
		else {
			String str = arr[top-1];
			top--;
			return str;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public boolean push(String str) {
		if(top == arr.length)
			return false;
		else {
			arr[top] = str;
			top++;
			return true;
		}
	
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		App_By_stack abs = new App_By_stack(5);
		System.out.println(abs.pop());
		System.out.println(abs.length());
		System.out.println(abs.push("zz"));
		
	}

}

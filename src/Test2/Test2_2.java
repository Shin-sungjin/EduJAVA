package Test2;

interface Stack_by_interface {
    int length();
    int capacity();
    void pop(double value);
    double push();
}

class Test2_21 implements Stack_by_interface{
	   private double[] arr;   
	    private int top;

	    public Test2_21(int capacity) {   //������
	        arr = new double[capacity];		//�迭 ���� ����
	        top = 0;	//top�� 0���� �ʱ�ȭ��
	    }

	    @Override
	    public int length() {	
	        return top;				//top ����
	        //�Ʒ� �޼ҵ���� Ȱ���ϸ� top ���� ������ ��ȭ
	    }

	    @Override
	    public int capacity() { //�ִ� ���� ��ȯ
	        return arr.length;
	    }

	    @Override
	    public void pop(double value) {  //top  => �ε��� ��ȣ
	        if (top < arr.length) { //top�� ��ü ���� �������� �۴ٸ�
	            arr[top] = value;   //value�� ž�� �����ϰ�,
	            top++; //���� ������ ���ؼ� top �� ����
	        }
	    }//top�� �ִ� ������ �����ϴٸ� �ϰ͵� ���� X

	    @Override
	    public double push() {   //���� �� ����
	        if (top > 0) {			//top�� 0���� Ŭ ��
	            top--;			//���� --�ϰ� ��
	            return arr[top];   //�迭�� top �ε����� �� ��ȯ
	        }
	        return 0.0;			//���ٸ� 0.0 retrun;
	    }
}

public class Test2_2 {
    public static void main(String[] args) {
    	Test2_21 stack = new Test2_21(5);   //�迭 ���� 5 ����
        System.out.println("Stack capacity: " + stack.capacity());
        // �ִ� ���� ���� Ȯ��

        stack.pop(1.5);
        stack.pop(2.8);
        stack.pop(3.7);
        //����
        
        System.out.println("���� ����" + stack.length());
        // � ����Ǿ� �ִ°�

        double value = stack.push();
        System.out.println("�� ���� " + value);
        // push�� �޾ƿ� value ��

        stack.pop(4.2);
        stack.pop(5.9);//������� �� �� ���� 
        
        stack.pop(6.4); // This push will not be executed as the stack is full

        System.out.println("���� ���� " + stack.length());
    }
}

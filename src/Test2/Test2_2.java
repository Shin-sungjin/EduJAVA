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

	    public Test2_21(int capacity) {   //생성자
	        arr = new double[capacity];		//배열 길이 설정
	        top = 0;	//top는 0으로 초기화ㅏ
	    }

	    @Override
	    public int length() {	
	        return top;				//top 리턴
	        //아래 메소드들을 활용하며 top 값이 유동적 변화
	    }

	    @Override
	    public int capacity() { //최대 갯수 반환
	        return arr.length;
	    }

	    @Override
	    public void pop(double value) {  //top  => 인덱스 번호
	        if (top < arr.length) { //top이 전체 저장 공간보다 작다면
	            arr[top] = value;   //value를 탑에 저장하고,
	            top++; //후위 연산자 통해서 top 값 증가
	        }
	    }//top이 최대 갯수와 동일하다면 암것도 실행 X

	    @Override
	    public double push() {   //스택 값 리턴
	        if (top > 0) {			//top이 0보다 클 때
	            top--;			//먼저 --하고 들어감
	            return arr[top];   //배열의 top 인덱스의 값 반환
	        }
	        return 0.0;			//없다면 0.0 retrun;
	    }
}

public class Test2_2 {
    public static void main(String[] args) {
    	Test2_21 stack = new Test2_21(5);   //배열 길이 5 선언
        System.out.println("Stack capacity: " + stack.capacity());
        // 최대 저장 갯수 확인

        stack.pop(1.5);
        stack.pop(2.8);
        stack.pop(3.7);
        //삽입
        
        System.out.println("스택 길이" + stack.length());
        // 몇개 저장되어 있는가

        double value = stack.push();
        System.out.println("팝 영역 " + value);
        // push로 받아오 value 값

        stack.pop(4.2);
        stack.pop(5.9);//여기까진 들어갈 수 있음 
        
        stack.pop(6.4); // This push will not be executed as the stack is full

        System.out.println("스택 길이 " + stack.length());
    }
}

package op0108;

public class OOPBasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체와 배열. 
		// 배열 분수에 저장 되는 값 - 인스턴스에 접근할 수 있는 참조값.
		// String 타입의 배열 선언 가능? => 웅 가능!
		
		int[] gunchim = new int[3];
		
		JMClass[] jm = new JMClass[3];
		// JMClass 참조 자료형 배열을 생성 [참조 타입 생성]
		// JMClass의 인스턴스만 배열에 저장이 가능하다.
		jm[0] = new JMClass() ;
		
		System.out.println(gunchim);
		
		
		
	}

}

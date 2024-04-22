package basic;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		//배열, 제어문, 연산자
		
		//배열
		// 똑같은 데이터 타입의 여러 변수를 하나로 묶어 처리하는 자료구조 
		// 특정한 데이터를 하나의 변수로 표현하는 것. 
		
		//10, 20, 30, 40 이라는 값을 저장하고 
		// 이들의 합계 
//		
//	int a= 10;
//	int b= 20;
//	int c= 30;
//	int d =40;
//	System.out.println(a+ b+c+d);
//	//위의 코드는 변수당 1개의 정수값을 저장하고 있는 상황 
	// 하지만 연산을 위해 저 값들을 하나의 변수에 통합하여 저장하는 것도 가능.
	// 위의 코드를 통합하여 저장(배열의 선언)
//	
	int[] gunchim = {10, 20, 30, 40};
	System.out.println(gunchim); //자바에서 배열 변수를 다이렉트로 출력시에는 주소값을 출력한다. 
	
	//배열 번호 : 인덱스
	System.out.println(gunchim[0]+gunchim[1]+gunchim[2]+gunchim[3]);
	System.out.println(gunchim[0]);
	System.out.println(gunchim[1]);
	System.out.println(gunchim[2]);
	System.out.println(gunchim[3]);
	// 배열안에 있는 값들 : 요소 (element)
		
	
	//배열을 선언(만드는)방법
	// 1. 공간과 값을 할당하는 법.
	//	int[] a = {10, 20, 30, 40};
	// 2. 공간과 값을 할당하는 다른 표기방법
//	int [] b = new int[] {10, 20, 30, 40};
	
	// 3. 공간만 할당하고 그 이후 값을 넣는 것.
	int [] gunchimArray = new int[4];
	
	
	int a = 10;
	gunchimArray[0] = 15;
	gunchimArray[1] = 30;
	gunchimArray[2] = 45;
	gunchimArray[3] = 60;
	System.out.println(gunchimArray[0]);
	System.out.println(gunchimArray[1]);
	System.out.println(gunchimArray[2]);
	System.out.println(gunchimArray[3]);
	
	
	//배열의 요소 한꺼번에 보는 방법
	// Arrays.toString(배열 변수명)
	System.out.println(Arrays.toString(gunchimArray));
	
	
	// 문자열 배열 생성하기 
	String[] txtArray = new String[4];
	//txtArray 0번 인덱스에 gohome이라는 문자를 담고싶음
	txtArray[0] = "wannagohome";
	txtArray[1] = "gun";
	txtArray[2] = "chim";
	txtArray[3] = "ssak";
	System.out.println(Arrays.toString(txtArray));
	
	//빈 데이터
	// 사람입장 - '텅텅', 0, 공백, => but 스페이스바도 아스키 코드 
	// 컴터 입장 - null 
	//    0  = 소진 되었다. 다썼다. 
	//    null = 애초에 없어요. 아 있었는데? 아뇨 없어요   => object type으로 존재 
	//    undefined =  타입도 없어, 그냥 없어, null 상위 표현 
	
	// 배열의 크기(길이) 찾는 법. 
	// length 
	// 배열명.length   => 배열 크기 나옴
	//  ->베열 요소의 개수 
	
	System.out.println(gunchimArray.length);
	System.out.println(txtArray.length);
	
	// 배열과 메모리 
	// 메모리는 주소를 가지고, 주소별로  변수 나 다른 여러가지 요소를 할당
	// 메서드, 클래스, Stack, heap = >
	// 메모리 영역은 총 세 가지 영역을 가짐, 클랙스 영역, Stack 영역, heap 영역
	// 선언

	// 배열을 생성하고 모든 요소들을 0으로 초기화
	// 20바이트의 공간을 할당한 배열 gunchim2를 선언하고
	// 모든 요소들을 0으로 초기화 
	int[] gunchim2 = new int[5];  //4byte 요소 5개 할당 
	
	// 12byte의 배열 gunchim3를 생성한 후,
	// 10, 20, 30 이라는 요소를 각각 할당하여 초기화;
	int[] gunchim3 = new int[]{10, 20, 30} ;
	
	//
	int[] guchim4 = {20, 30, 40};
	
	
	
	
	}
}

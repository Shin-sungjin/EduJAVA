package basic;

public class variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		// 변수, 상수, 리터럴
//		// 변수 : 변하는 수 
//		// 상수 - 변하지 않는 수. (딱 1번만 값을 저장할 수 있는 변수) constant
//		
//		//상수는 현업에서 사용 빈도 높음
//		final int bakkas = 1000000000; // <----심볼릭 상수, 상징적인 값
//		// 상수는 한번 선언하면 값이 변하지 않는다. 
//		// 아래와 같이 변화를 주려 하면 에러가 발생한다. (즉, 불변한다)		
//		//bakkas = bakkas - 100000000;
//		// 프로그래밍에서 불변의 기준이란, 프로그램이 실행되는 동안, 바뀌지 않는 것 
//		
//		
//		// 리터럴 - 존재 자체가 값인 것. 
//		// 리터럴이라 부를 수 있는 값 = 할당이 불가능한 값
//		String name = "루피";
//		name = "군침이";
//		// "루피" = "군침이";
//		
//		// 주황색 글자 = 키워드 = 예약어 = 이미 기능(의미)를 가지고 있는 것
//		
//		// ** 타입 변환 (Casting) **
//		// - 기존 자료형에서 다른 자료형으로 변환하는 것 
//		// - 묵시적(암시적) 형변환 :
//		//     ->직접 형변환 문법을 사용하지 않아도 자동으로 타입을 변환하는 것 => JAVA에서는 생각보다 잘 안나옴, 근데 JS는 잘 나옴 근데, 타입 개판 
//		// - 명시적 형변환
//		//     -타입변환을 강제로 지시하는 것 (데이터의 손실 및 변질 발생 가능) [RapperClass -> integer를 받아서 처리 -> 데이터 손실을 막기 위함]
		
		//묵시적 형변환 예시 1
		float instrument = 9.72f;
		
		double d = instrument ;
		
		
		System.out.println(instrument);
		System.out.println(d);
	
		//묵시적 형변환 예시 2
		byte gunchim = 32 ;
		short gunchim2 = gunchim;
		int gunchim3 = gunchim2;
		long gunchim4 = gunchim3;
		
		
		System.out.println(gunchim);
		System.out.println(gunchim2);
		System.out.println(gunchim3);
		System.out.println(gunchim4);
		
		
		//실수는 기본적으로 정수보다 더 큰 범위의 표현이 가능
		// String은 기본적으로 4byte의 공간을 가진다. 
		
		
		//명시적 형변환 
		int a= 1000;
		long b = (long) a;
		
		//명시적 형변환에서 데이터가 변질 되는 경우 
		// 실수와 정수의 최대 표현범위가 다르기 때문에
		// 데이터가 변질될 가능성이 충분히 발생할 수 있음.
		float fl =10000000.0F ;
		int in = (int) fl;
		System.out.println(in);
		
		//연산시 형변환 
		// 정수와 실수를 계산할 경우는 실수로 결과를 뽑아낸다. 
		double d1= 9.724;
		int in1 =972 ;
		System.out.println(d1+in1);
		
		//자바의 경우는 정수끼리 나눌때에는 대부분 소숫점은 버린 결과를 출력 
		// 다만 다른 언어에서는 강제로 형 변환이 발생할 수 있음 
		int in2 =17;
		int in3 =2;
		System.out.println((double) in2/in3);
		}  

}

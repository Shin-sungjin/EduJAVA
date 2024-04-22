package QuizAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Student0108 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			Student0108 gun = new Student0108();
		}
	
	String name = "gunchim";
	int sID;   //Student ID   =>> 현업에서는 맨 앞글자 두문자, 뒤에 ID 이렇게 쓰는 경우 많음 
	String 학과;
	int year;

	
	//아래의 메서드를 생성자라 하는데 
	// 이 메서드는 기입하지 않아도 컴파일러가 알아서 기입

	
	
	// 공부
	public  void Study() throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("공부를 하고 있소");
		System.out.println(" 무슨일 이시오?");
		String a = br.readLine();
		System.out.println("그렇구만,, 공무좀 하겠소");
	}
	
	// 놀기
	public  void Play() {
		System.out.println("공부는 개나 줘버리고 놀고 있소");
		System.out.println("저리가시오 흥이 깨지오");
	}
	
	// 먹기
	public void Eat() {
		System.out.println("공부 해야 해도 밥은 먹고 해야 하지 않겠소");
	}
	
	
	//자기 
	public void sleep () {
		System.out.println("잠은 자야 하지 않겠소");
	}

}

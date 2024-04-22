package basic0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Health {
//	   필드명 : char gender(성별)
//       double tall (신장)
//       double weight(체중)
//생성자 : Health() - 초기화
//메서드 : input() - 성별, 신장, 체중입력받기
//       output1() - 출력
	
	//getter / setter 를 요구하지 않았으므로, private 사용 x, producted나 defalut 상숑
	protected char gender ;
	protected double tall;
	protected double weight;

	protected Health() {
		gender = '\0'; //캐릭터 값 초기화 방식
		tall =0.0;
		weight = 0.0;
	}
	
	public void input(char gender, double tall, double weight) {
		this.gender = gender;
		this.tall =tall;
		this.weight =weight;
	}
	
	public void output1() {
		System.out.println("성별 - "+this.gender);
		System.out.println("신장 -"+this.tall + "Cm");
		System.out.println("체중 - "+this.weight + "Kg");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		//정보 입력 하쇼
		System.out.print("성별 (m/f)");
		char gender =  br.readLine().charAt(0);
		System.out.print("신장(Cm)");
		double tall = Double.parseDouble(br.readLine()); 
		System.out.print("체중(Kg)");
		double weight = Double.parseDouble(br.readLine()); 
		
		//Info 클래스 인스턴스 생성
		Info he = new Info();
		
		//가보자고~~
		he.input(gender, tall, weight);
		he.output1();
		he.calculate();
		System.out.println(he.output2());
	}

}

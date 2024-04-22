package basic0118;

import java.util.Scanner;

public class basic01182 {
	private int r;
	private double size;
	private final double PI = 3.141592;
	
	// Method 사용시의 선입견
	// Method 내부에서 인스턴스를 사용하지 않으려고함. 
	public basic01182() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		r = sc.nextInt();
		process();
		sc.close(); // 인스턴스 종료 
		
	}
	
	//원의 넓이 계산
	public double process() {
		size = r * r * PI;
		return size;
	}
	
	//출력
	public void output() {
		
		System.out.printf("원의 넓이 : %.2f" ,size);
	}
	
	//메인
	public static void main(String[] args) {	
		basic01182 sar = new basic01182();
		sar.process();
		sar.output();
	}
}

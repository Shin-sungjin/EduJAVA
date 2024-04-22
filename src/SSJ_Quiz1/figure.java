package SSJ_Quiz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class figure {
	private double area;
	private final double PI= 3.131592;
	
	public figure(){
		this.area =0.0;
	}
	
	public double circle(int r){
		this.area = r * r* PI;
		return area;
	}
	
	public double trinagle(int h , int x) {
		this.area = (h*x) / 2 ;
		return area;
	}
	
	public double trape(int up, int down, int h) {
		this.area = (up+down) *h /2;
		return area;
	}
	
	public void output() {
		System.out.println(this.area);
	}
	
	public  void menu() throws IOException{
		System.out.println("***도형선택***");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
		System.out.println("선택 : ");
		int answer = Integer.parseInt(br.readLine());
		switch(answer){
			case 1:  //삼각형
				System.out.println("**** 삼각형의 넓이 ****");
				System.out.print("밑변 :");
				int x =Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print("높이 :");
				int h =Integer.parseInt(br.readLine());
				System.out.println("넓이 : "+ trinagle(x,h));
				break;
				
			case 2: ; //원
				System.out.println("**** 원의 넓이 ****");
				System.out.println("반지름 :");
				int r =Integer.parseInt(br.readLine());
				System.out.println("넓이 : "+ circle(r));
				break;
			case 3:  //사다리꼴
				System.out.println("**** 사다리꼴의 넓이 ****");
				System.out.print( "아랫 변 : ");
				int u = Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print( "윗 변 :");
				int d = Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print( "높이 :");
				int th = Integer.parseInt(br.readLine());
				System.out.println("넓이 : "+ trape(u, d, th));
				break;
			case 4:
				System.out.println("종료합니다.");
				break;
			}
	}

		public static void main(String[] args) throws IOException {
			figure fi = new figure();
			fi.menu();
				
		}


}

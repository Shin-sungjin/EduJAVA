package Basic0116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

class Schedule  {
	
	private String work; // 하루의 할 일을 나타내는 문자열
	
	public Schedule(String work) {
		this.work = work;
	}
	
	public void set(String work) { 
		this.work=work; 
	}
	
	
	public String get() { 
		return work; 
		}
	
	public void show() {
		if (work==null) {
			System.out.println("없습니다.");
		}
		else { 
			System.out.println(work+"입니다.");
		}
	}
}




public class MonthSchedule {

	Schedule[] sc = new Schedule[30];
	int day;
	String work;

	public void start() throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("===========이번달의 스케쥴 관리 프로그램================");
		boolean Ok = false;
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(num) {
			case 1:
				getwork();
				break;
			
			case 2:
				show();
				break;
			}	
		}
	}
	
	public void getwork() throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("날짜를 입력(1~30)");
		day = Integer.parseInt(br.readLine());
		System.out.println("할일(빈칸없이입력)");
		this.work = br.readLine();
		sc[day] = new Schedule(work);
	}
	
	
	public void show() throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("날짜(1~30)?");
		day = Integer.parseInt(br.readLine());
		if(sc[day]!= null) {
		System.out.println(day + "의 할일은 "+ sc[day].get() + "입니다.");
		}
		else {
			System.out.println("등록된 일정이 없습니다.");
		}
	}
	

	
	public static void main(String[] args) throws IOException {
		MonthSchedule cs = new MonthSchedule();
		cs.start();
	}
}

package Basic0116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

class Schedule  {
	
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	
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
			System.out.println("�����ϴ�.");
		}
		else { 
			System.out.println(work+"�Դϴ�.");
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
		System.out.println("===========�̹����� ������ ���� ���α׷�================");
		boolean Ok = false;
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 3) {
				System.out.println("���α׷��� �����մϴ�.");
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
		System.out.println("��¥�� �Է�(1~30)");
		day = Integer.parseInt(br.readLine());
		System.out.println("����(��ĭ�����Է�)");
		this.work = br.readLine();
		sc[day] = new Schedule(work);
	}
	
	
	public void show() throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��¥(1~30)?");
		day = Integer.parseInt(br.readLine());
		if(sc[day]!= null) {
		System.out.println(day + "�� ������ "+ sc[day].get() + "�Դϴ�.");
		}
		else {
			System.out.println("��ϵ� ������ �����ϴ�.");
		}
	}
	

	
	public static void main(String[] args) throws IOException {
		MonthSchedule cs = new MonthSchedule();
		cs.start();
	}
}

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
		System.out.println("***��������***");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. �ﰢ��");
		System.out.println("2. ��");
		System.out.println("3. ��ٸ���");
		System.out.println("4. ����");
		System.out.println("���� : ");
		int answer = Integer.parseInt(br.readLine());
		switch(answer){
			case 1:  //�ﰢ��
				System.out.println("**** �ﰢ���� ���� ****");
				System.out.print("�غ� :");
				int x =Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print("���� :");
				int h =Integer.parseInt(br.readLine());
				System.out.println("���� : "+ trinagle(x,h));
				break;
				
			case 2: ; //��
				System.out.println("**** ���� ���� ****");
				System.out.println("������ :");
				int r =Integer.parseInt(br.readLine());
				System.out.println("���� : "+ circle(r));
				break;
			case 3:  //��ٸ���
				System.out.println("**** ��ٸ����� ���� ****");
				System.out.print( "�Ʒ� �� : ");
				int u = Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print( "�� �� :");
				int d = Integer.parseInt(br.readLine());
				System.out.println();
				System.out.print( "���� :");
				int th = Integer.parseInt(br.readLine());
				System.out.println("���� : "+ trape(u, d, th));
				break;
			case 4:
				System.out.println("�����մϴ�.");
				break;
			}
	}

		public static void main(String[] args) throws IOException {
			figure fi = new figure();
			fi.menu();
				
		}


}

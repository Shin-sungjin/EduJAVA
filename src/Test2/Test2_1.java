package Test2;

import java.util.Scanner;

public class Test2_1 {
	
		static Scanner sc = new Scanner(System.in);   //��ĳ�� ����
		private double area;    //���� ����
		final double PI = 3.141592;    //���� �� ��� ����

		public Test2_1() {
			this.area = 0;			//������ 0.0 ���� �ʱ�ȭ
		}

		public void circle() {
			int r;				//������ r

			System.out.println("\n**** ���� ���� ****");          //�ش� ������ ���� �Ǹ� ���� ������ ���� ���� ����
			System.out.print("������ : ");	r = sc.nextInt();		//r �� �� ��ĳ�ʷ� �ҷ���

			area = r * r * PI;		// �� ���� ����
			output();
		}

		public void triangle() {    //�ﰢ��
			int b, h;

			System.out.println("\n**** �ﰢ���� ���� ****");   //���ó� ���⼭ �Է� ����
			System.out.print("��  �� : ");	b = sc.nextInt();
			System.out.print("��  �� : ");	h = sc.nextInt();

			area = (double)b * h / 2;
			output();  //���
		}

		public void trapezoid() {
			int a, b, h;
			//���ó� ���⼭ �Է� ����
			System.out.println("\n**** ��ٸ����� ���� ****");
			System.out.print("�Ʒ��� : ");	a = sc.nextInt();
			System.out.print("��  �� : ");	b = sc.nextInt();
			System.out.print("��  �� : ");	h = sc.nextInt();

			area = (double)(a + b) * h / 2;
			output();
		}

		public void output() {
			System.out.printf("���� : %.2f\n\n", area);  //area ��� �ϰ�, ���� �ι�
		}

		public int menu() {
			int n;
			//���� menu �ڵ�
			System.out.println("**** �������� ****");
			System.out.println("1. �ﰢ��");
			System.out.println("2. ��");
			System.out.println("3. ��ٸ���");
			System.out.println("4. ����");
			System.out.print("���� : ");
			n = sc.nextInt();
			// ����ġ ������ �̿��ؼ�, �ٷ� �޾ƿ�
			switch (n) {
				case 1 :	triangle();		break;
				case 2 :	circle();		break;
				case 3 :	trapezoid();	break;
				case 4 :	System.out.println("\n�����մϴ�^.^");
			} // ���̽� �� ���� 
			
			return n;  //n�� ����
		}

		public static void main(String[] args) {
			Test2_1 ob = new Test2_1();
			
			while(true){
				if(ob.menu() == 4) break;;  // 4������ �Է� ���� �� break;
			}
			sc.close();   //��ĳ�� �ݱ� 
		}
	}



// �ٽ� ���ƿ� �� �ڵ� ���� Time!
/*
 * package SSJ_Quiz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class figure {   
	private double area;		// ���� ����
	private final double PI= 3.131592;  // ��� ����
 	
	public figure(){
		this.area =0.0;		// 0.0���� �ʱ�ȭ
	}
	
	
	//�� ���� �޼ҵ�� ��� ����� ��ȯ .
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
	
	
	//output �޼ҵ带 Ȱ���߾�� �ϴµ�, �����ΰ� ������� ����
	 // ��ǻ� �� ���� return �� ��ü��, �ٷ� �޼ҵ� ȣ�⿡�� �޾ƿ��°� �� ���� ���̶�� ����������
	  * ����� �ڵ�� ������ ��, main �ڵ尡 �� �����غ���, output �� Ȱ���ص� �������� �� ����. 
	public void output() {
		System.out.println(this.area);
	}
	
	//�޴� �ڵ�
	public  void menu() throws IOException{  
		System.out.println("***��������***");
		* buffer�� �� �ͼ��Ͽ� bufferedReader ���
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
				
		* ������ ��		
		System.out.println("1. �ﰢ��");
		System.out.println("2. ��");
		System.out.println("3. ��ٸ���");
		System.out.println("4. ����");
		System.out.println("���� : ");
		
		int answer = Integer.parseInt(br.readLine());
		
		switch(answer){  /����ġ �������� ���� �ʿ��� ����� ����� ��� ��� �ڵ�
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

		//Main
		public static void main(String[] args) throws IOException {
			figure fi = new figure();
			fi.menu();
				
		}


}

 */


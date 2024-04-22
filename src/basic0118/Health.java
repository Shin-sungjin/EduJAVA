package basic0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Health {
//	   �ʵ�� : char gender(����)
//       double tall (����)
//       double weight(ü��)
//������ : Health() - �ʱ�ȭ
//�޼��� : input() - ����, ����, ü���Է¹ޱ�
//       output1() - ���
	
	//getter / setter �� �䱸���� �ʾ����Ƿ�, private ��� x, producted�� defalut ���
	protected char gender ;
	protected double tall;
	protected double weight;

	protected Health() {
		gender = '\0'; //ĳ���� �� �ʱ�ȭ ���
		tall =0.0;
		weight = 0.0;
	}
	
	public void input(char gender, double tall, double weight) {
		this.gender = gender;
		this.tall =tall;
		this.weight =weight;
	}
	
	public void output1() {
		System.out.println("���� - "+this.gender);
		System.out.println("���� -"+this.tall + "Cm");
		System.out.println("ü�� - "+this.weight + "Kg");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		//���� �Է� �ϼ�
		System.out.print("���� (m/f)");
		char gender =  br.readLine().charAt(0);
		System.out.print("����(Cm)");
		double tall = Double.parseDouble(br.readLine()); 
		System.out.print("ü��(Kg)");
		double weight = Double.parseDouble(br.readLine()); 
		
		//Info Ŭ���� �ν��Ͻ� ����
		Info he = new Info();
		
		//�����ڰ�~~
		he.input(gender, tall, weight);
		he.output1();
		he.calculate();
		System.out.println(he.output2());
	}

}

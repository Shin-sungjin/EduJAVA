package basic0118;

public class Child {

	protected String name;
	protected int age;
	protected double tall;
	
	Child(String n, int a, double t){
		this.name = n;
		this.age =a;
		this.tall = t;
		System.out.printf("�̸� : %s  \n ���� : %d \n ���� : %f", this.name, this.age, this.tall );
	}
	
//	public void run() {
//		System.out.println("�̸� : " + this.name);
//		System.out.println("���� : " + this.age);
//		System.out.println("���� : " + this.tall);
//	}
//	
	public static void main(String[] args) {
		 new Child("��ħ��", 24, 972.4);
	}

}

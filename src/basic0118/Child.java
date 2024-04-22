package basic0118;

public class Child {

	protected String name;
	protected int age;
	protected double tall;
	
	Child(String n, int a, double t){
		this.name = n;
		this.age =a;
		this.tall = t;
		System.out.printf("이름 : %s  \n 나이 : %d \n 신장 : %f", this.name, this.age, this.tall );
	}
	
//	public void run() {
//		System.out.println("이름 : " + this.name);
//		System.out.println("나이 : " + this.age);
//		System.out.println("신장 : " + this.tall);
//	}
//	
	public static void main(String[] args) {
		 new Child("군침이", 24, 972.4);
	}

}

package OOPReview;

public class OOPQuiz1 {
	public static void main(String[] args) {
		Test34 ob = new Test34("��ħ����", 85000000, "��ĺ�");
		ob.getInfomation1();
		ob.getInfomation2();
	}
}

class Salary{
	String name;
	int salary;
	
	Salary(String n, int s){
		this.name = n;
		this.salary = s;
	}
	
	public void getInfomation1() {
		System.out.println("�̸� :"+this.name);
		System.out.println("���� : "+this.salary);
	}
}

class Test34 extends Salary{

	String department;
	
	private Test34(String n , int s){
		super(n, s);
	}
	
	Test34(String n, int s, String d){
		super(n,s);
		this.name = n;
		this.salary = s;
		this.department =d;
	}
	
	public void getInfomation2() {
		System.out.println("�μ� : "+this.department);
	}
	
}

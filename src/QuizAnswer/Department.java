package QuizAnswer;

public class Department {
	static String dName;
    static String dHead;
	
    public static void main(String[] args) {
		Department d1 = new Department();
		d1.setDepartment();
		System.out.println(d1.dName +"\n"+d1.dHead);
		
	}
	public  static void setDepartment(){
		dName = "�ڹ�";
		dHead = "���ظ�";	
	}
	
	public void meet(char a) {
		System.out.println("�а���԰� ����� �Ͻðڽ��ϱ�?");
		if( a == 1 || a == 2) {
			System.out.println("�а���԰� ��� ������ �����մϴ�.");
		}
		else {
			System.out.println("��������� ����մϴ�. ");
		}
	}
	
	public void gradeSearch(int a) {
		System.out.println("�й��� �Է����ּ���");
		System.out.println("���� ��ȸ�� �Ͻðڽ��ϴ�?");
	}
	
	public   void goHOme(){
		System.out.println("���� Ȥ�� ������ �Ͻðڽ��ϱ�?");
		System.out.println("�ȵ˴ϴ�. ���ư�����");
		
	}
	
}

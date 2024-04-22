package Specialwork3;

import java.util.ArrayList;
import java.util.List;


interface GradePolicy{
	List<List<String>> gradeCal(List<List<String>> myGrade, Major major , List<Subject> myscore);
}
interface SABCDEF extends GradePolicy{
	List<List<String>> gradeCal (List<List<String>> myGrade, Major major , List<Subject> myscore);
}

class Major {   //�̸� �� �ֿ����
	private String name;
	private String RequiredSubject;
	
	Major(String name, String major){
		this.name = name;
		this.RequiredSubject = major;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRequiredSubject() {
		return this.RequiredSubject;
	}
}
	
class Subject {  // �̸� �� ����
	private String name;
	private int score;
	
	Subject(String name, int s){
		this.name = name;
		this.score = s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
}
		

class Student extends GoodSchool implements SABCDEF{
	private String name;
	private int SID;
	private Major major;  //Major Ŭ������ major
	private List<Subject> myscore ;
	private List<List<String>> myGrade;   //���⿡ ������� ���� �ұ�??
	// ����,,,?? 	�ʱ�ȭ,,,?? �ٵ�, 
	// 1. ����Ʈ [[    �ֿ� ����       ] [     �Ϲ� ����      ]] ???
	  
	
	Student(String n, int SId, Major major, List<Subject> ms){
		this.name = n;
		this.SID = SId;
		this.major = major;
		this.myscore = ms;
		this.myGrade = new ArrayList<>();
	}
	
	
	public List<List<String>> getMyGrade() {
		return this.myGrade;
	}
	
	
							//�̰� �޾ƾ� �ϳ�?? �׷� �Ʒ�ó�� ���� �����س��� �ϴ°žƳ�?
	public void setMyGrade(List<List<String>> myGrade) { // �̰�  SetMGrade�� �Ǿ�� �ϴ°� �ƴѰ���
							// �� ���⼭�� � ���� �޾ƾ� ����,, 
							// setMyGrade ��, ��ä�� ����� �����ϴ� �޼ҵ��� �ٵ� , �װ� ���� , List<List<String> Ÿ���� �ʿ䰡 �ֳ�?
							// String���� ���� �ص� ������ ������ �ƴѰ�??
							// �׷� �迭 �ΰ��� ���ο��� ��������� �ڳ� 
		List<String> majorSubject = new ArrayList<String>();
		List<String> subSubject = new ArrayList<String>();
		String[] MS = {"S", "A", "B", "C", "D", "F"};
		String[] SS = {"A", "B", "C", "D", "F"};
		
		for(int i = 0; i < MS.length; i++) {
			majorSubject.add(MS[i]);
		}
		
		for(int j = 0; j < SS.length; j++) {
			subSubject.add(SS[j]);
		}
		this.myGrade.add(majorSubject);
		this.myGrade.add(subSubject);
		//this.myGrade = �ֿ伺��, ���� ��� �迭;
		
		
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {   //major => String���� ���� �� Ȯ�� �ʿ�
		return major.getRequiredSubject();
	}
	
	public List<Subject> getMyScore(){
		return this.myscore;
	}
	@Override		
	public List<List<String>> gradeCal(List<List<String>> myGrade, Major major, List<Subject> myscore) {
		//�ʼ�
		// ����� �׳� ��º��ΰ�?
		
		// �� ��ü�� �迭�� �Ǿ�� �ϴ°� ������, 
		int ck = myscore.indexOf(this.name);
		int a = myscore.get(ck).getScore();
		if(major.getRequiredSubject().equals("����")) {
			
			
			// �ƴϸ� myGrade�� ��� ���� 
			// [[�̸�, �й�, ��������, ����, ���], [�̸�, �й�, ��������, ����, ���], [�̸�, �й�, ��������, ����, ���]] 
			// �̷������� �Ǵ� ������ �� ���ڴ�. 
			// �׷� myGrade�� ���� �迭�� ����, 
			// �ٵ� ��ºζ�� ���� �ٸ� �� ������, ��,,, 
			// ���ʿ� myGrade��� List�� �� ó�� ��������, ���� �Ķ���͸� ���� �޾ƿ��� �ʾƵ� �� �� ������ 
			
			//printf("�̸�\t|  �й�  |��������|����")
			//printf("\s\t|  \d  |"+this.major"+|myscroe.ofer(?)")
			
			//95~100��, 90~94��, 80~89��, 70~79, 60~69��, 60�� �̸�
			if  ( a >=95 && a<= 100) {
//				return this.myGrade.get(0).get(0);
			}
			
			else if( a<95 && a>= 90) {
				this.myGrade.get(ck).add("A");
			}
			
			else if( a<90 && a>= 80) {
				this.myGrade.get(ck).add("B");
			}
			else if( a<80 && a>= 70) {
				this.myGrade.get(ck).add("C");
			}
			else if( a<70 && a>= 60) {
				this.myGrade.get(ck).add("D");
			}
			else if( a<60) {
				this.myGrade.get(ck).add("F");
			}
		}
			//90~100��, 80~89��, 70~79��, 55~69��, 55�� �̸�
		else if(!major.getRequiredSubject().equals(major)) {
			if  ( a >=90 && a<= 100) {
				this.myGrade.get(ck).add("A");
			}
			
			else if( a<90 && a>= 80) {
				this.myGrade.get(ck).add("B");
			}
			
			else if( a<80 && a>= 70) {
				this.myGrade.get(ck).add("C");
			}
			else if( a<70 && a>= 55) {
				this.myGrade.get(ck).add("D");
			}
			else if( a<55) {
				this.myGrade.get(ck).add("F");
			}
		}
		return myGrade;
	}
}

class GoodSchool {
	List<Student> studentList ;
	
	 GoodSchool() {
	}
	 
	 public List<Student> getStudentList(){
		 return this.studentList;
	 }
	 
	 
	 public void setStudentList(List<Student> stu) {
		 studentList.addAll(stu);
	 }
	 
	 public void resultPrint(String s) {
		 System.out.println("??");
	 }
}

	


public class Special4 {

	public static void main(String[] args) {
		List<List<String>> grade = new ArrayList<>();

		Major korean = new Major("������", "����");
		List<Subject> sub = new ArrayList<>();
		sub.add(new Subject("������", 95));
		
		Student st1 = new Student("������", 100, korean, sub);
		System.out.println(st1.getMajor());	
		st1.setMyGrade(grade);
		System.out.println(st1.getMyGrade());
		
	}
}

package Specialwork3;

import java.util.ArrayList;
import java.util.List;


interface GradePolicy{
	List<List<String>> gradeCal(List<List<String>> myGrade, Major major , List<Subject> myscore);
}
interface SABCDEF extends GradePolicy{
	List<List<String>> gradeCal (List<List<String>> myGrade, Major major , List<Subject> myscore);
}

class Major {   //이름 및 주요과목
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
	
class Subject {  // 이름 및 성적
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
	private Major major;  //Major 클래스의 major
	private List<Subject> myscore ;
	private List<List<String>> myGrade;   //여기에 어느값이 들어가야 할까??
	// 성적,,,?? 	초기화,,,?? 근데, 
	// 1. 리스트 [[    주요 과목       ] [     일반 과목      ]] ???
	  
	
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
	
	
							//이걸 받아야 하나?? 그럼 아래처럼 저걸 정의해놔야 하는거아냐?
	public void setMyGrade(List<List<String>> myGrade) { // 이게  SetMGrade가 되어야 하는거 아닌강ㄷ
							// 흠 여기서는 어떤 값을 받아야 하지,, 
							// setMyGrade 면, 객채의 등급을 저장하는 메소드일 텐데 , 그게 굳이 , List<List<String> 타입일 필요가 있난?
							// String으로 설정 해도 괜찮지 않은거 아닌가??
							// 그럼 배열 두개를 메인에서 선정해줘야 겠네 
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
		//this.myGrade = 주요성적, 서브 등급 배열;
		
		
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {   //major => String으로 수정 함 확인 필요
		return major.getRequiredSubject();
	}
	
	public List<Subject> getMyScore(){
		return this.myscore;
	}
	@Override		
	public List<List<String>> gradeCal(List<List<String>> myGrade, Major major, List<Subject> myscore) {
		//필수
		// 여기는 그냥 출력부인가?
		
		// 갑 자체가 배열이 되어야 하는것 같은데, 
		int ck = myscore.indexOf(this.name);
		int a = myscore.get(ck).getScore();
		if(major.getRequiredSubject().equals("국어")) {
			
			
			// 아니면 myGrade의 요소 값이 
			// [[이름, 학번, 중점과목, 점수, 등급], [이름, 학번, 중점과목, 점수, 등급], [이름, 학번, 중점과목, 점수, 등급]] 
			// 이런식으로 되는 구조가 더 낫겠다. 
			// 그럼 myGrade는 성적 배열이 맞음, 
			// 근데 출력부라면 말이 다를 것 같은데, 흠,,, 
			// 애초에 myGrade라는 List가 위 처럼 생겼으면, 굳이 파라미터를 많이 받아오지 않아도 될 것 같은데 
			
			//printf("이름\t|  학번  |중점과목|점수")
			//printf("\s\t|  \d  |"+this.major"+|myscroe.ofer(?)")
			
			//95~100점, 90~94점, 80~89점, 70~79, 60~69점, 60점 미만
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
			//90~100점, 80~89점, 70~79점, 55~69점, 55점 미만
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

		Major korean = new Major("강감찬", "국어");
		List<Subject> sub = new ArrayList<>();
		sub.add(new Subject("강감찬", 95));
		
		Student st1 = new Student("강감찬", 100, korean, sub);
		System.out.println(st1.getMajor());	
		st1.setMyGrade(grade);
		System.out.println(st1.getMyGrade());
		
	}
}

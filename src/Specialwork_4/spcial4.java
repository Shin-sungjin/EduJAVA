package Specialwork_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

interface GoodSchool {  //인터페이스 선언 
	public void viewStudentInFo(String subject);
}

class StudenInfoList implements GoodSchool{  //최종적으로 출력하는 class
	
	
	private Map<String, List> SDT;  //활용 방안을 고안해봅시다. //학생 정보를 보관하기 위한 Map
//	private ArrayList<Object> sdtinfo = new ArrayList<Object>();
	//개개인의 학생들의 정보를 보관하는 List, 근데 
	// 여기서 리스트를 선언해버리면, 여기에 학생들의 정보가 쭉 추가되버리는 상황 발생해서 폐지 함
	// 그래서 Student 클래스에서 List 값으로 전달하도록 함.
	
	// 굳이 필요 없을 듯 //필요하다
	
	StudenInfoList(String name, Student std){
		SDT = new HashMap<String, List>();
//		this.sdtinfo.add(std.getName());
//		this.sdtinfo.add(std.getSID());
//		this.sdtinfo.add(std.getmainSubject()); 
//		this.sdtinfo.add(std.getMainScore());
//		this.sdtinfo.add(std.getSubScore());
		pushinfo(std);
	
	}
	
	public void pushinfo(Student std){ 
		SDT.put((String) std.getStdInfo().get(0), std.getStdInfo());
		//Student 클래스의 list를 불러오고, 해당 값들을 여기에 대입, 
		//getStdInfo 객체의 정보를 저장 하고 있는 리스트 
		//get(0) = 이름, 
		
		//아오 이따구로 받으니까, 그냥 키1번 리스트에 다 추가해블지;;그렇다면 리스트를 여기서 선언하면 안될 듯   
//		this.sdtinfo.add(std.getName());
//		this.sdtinfo.add(std.getSID());
//		this.sdtinfo.add(std.getmainSubject()); 
//		this.sdtinfo.add(std.getMainScore());
//		this.sdtinfo.add(std.getSubScore());
//		this.sdtinfo.add(std.getMyGrade());  //여기 값이 애매하다 
//		this.sdtinfo.add(std.getSubGrade());
	}
	
	//폐지 
//	public void setStdList() {
//		SDT.put((String) this.sdtinfo.get(0), this.sdtinfo);
//	}
//	
	
	//Test용 Map 리턴 
	public Map getMap() {
		return SDT;
	}
	
	//출력 구현 부 
	@Override
	public void viewStudentInFo(String subject) {
		System.out.println("------------------------");	
		System.out.printf("\t %s 수강생 학점\t", subject);  System.out.println();
		System.out.println("이름 | 학번  |  중점과목  | 점수 ");
		//정해진 양식에 맞춰 사용
			
		
		//여기 반복자에서 계속 index error 발생 
		Iterator<String> keys = SDT.keySet().iterator();
		while( keys.hasNext() ){
				String key = keys.next();
				//얻고자 하는 정보가 중점 과목 일 때 
				if(this.SDT.get(key).get(2).equals(subject)) {
					//위 주석의 index error 발생 원인
					// 이부분 this.SDT가 sdtinfo로 되어있었음,  코드를 보면 해당 리스트는 활용하지 않아, null 값이었기에 실행이 안되었던 것 
					System.out.println(String.format(" %s | %s | %s | %s : %s", 
								key, SDT.get(key).get(1), SDT.get(key).get(2), SDT.get(key).get(3), SDT.get(key).get(5)));
					}
				//얻고자 하는 정보가 일반 과목 일 때 
				else if(!this.SDT.get(key).get(2).equals(subject)) {
					System.out.println(String.format(" %s | %s | %s | %s : %s", 
								key, SDT.get(key).get(1), SDT.get(key).get(2), SDT.get(key).get(4), SDT.get(key).get(6)));
					}
			
		}
		
		//뭐가 문제지 
		//아래의 구조를 위의 출력 구현부와 같이 변경 함. 
//		if(sdtinfo.get(2).equals(subject)) {
//			   for( String key : SDT.keySet() ){
//				String key = keys.next();
//				System.out.println(String.format(" %s | %s | %s | %s : %s", 
//						key, SDT.get(key).get(1), SDT.get(key).get(2), SDT.get(key).get(3), SDT.get(key).get(5)));
//			}
//		}
//		else if(!this.sdtinfo.get(2).equals(subject)) {
//			
//			for( String key : SDT.keySet() ){
////				String key = keys.next();
//				System.out.println(String.format(" %s | %s | %s | %s : %s", 
//						key, SDT.get(key).get(1), SDT.get(key).get(2), SDT.get(key).get(4), SDT.get(key).get(6)));
//			}
//		}
	}//viewStudentInFo finish
}



 class Student{
	 //멤버 변수를 너무 과하게 쓴 감이 없지 않다. 
	private ArrayList<Object> stdinfo;
	private String name ;
	private int SID;
	private String major;
	private String mainSubject;
	private int mainScore;
	private int subScore;
	private String myGrade;	
	private String mySubGrade;
	// 이렇게 해버리면 단일 객체마다 코드가 너무 길어지는 단점이 있어버림
	// 그리고 반복 돌리기가 힘들며, 하나의 객체만을 담을 수 있음, 
	// 근데 하나의 객체만을 담기 위한게 클래스 아닌가??
	
	//출력 구현부의 Map에 조금 더 쉽게 삽입하기 위함 
	public void makeStdInfoList() {
		stdinfo =new ArrayList<Object>();
		stdinfo.add(this.name);  		//idx0
		stdinfo.add(this.SID);			//idx1
		stdinfo.add(this.mainSubject); 	//idx2
		stdinfo.add(this.mainScore);	//idx3
		stdinfo.add(this.subScore);		//idx4
		stdinfo.add(this.myGrade);		//idx5
		stdinfo.add(this.mySubGrade);	//idx6
	}
	
	//getter /setter
	public List getStdInfo() {
		return this.stdinfo;
	}
	
	public String getmainSubject() {
		return this.mainSubject;
	}
	public String getName() {
		return this.name;
	}
	
	public int getSID() {
		return this.SID;
	}

	public String getMajor() {
		return this.major;
	}

	public int getMainScore() {
		return this.mainScore;
	}

	public int getSubScore() {
		return this.subScore;
	}

	public String getMyGrade() {
		return this.myGrade;
	}

	public String getSubGrade()
	{
		return this.mySubGrade;
	}
	
	Student(){
		
	}
	
	//여기서 바로바로 List에 값을 추가 해도 되었을 것 같다
	Student(SDTO sd) {
		this.mainSubject = sd.getMajor().getmainSubject();
		this.name = sd.getName();
		this.SID = sd.getSID();
		this.mainScore = sd.getScore();
		this.subScore = sd.getsubScore();
		this.major = sd.getMajor().getMainMajor();
	
	}
	
	
	public void setMyGrade(String subject) {
		// 필수 과목
		// 추후 성적 산출 방식이 새롭게 생성 되었을 때를 고려하지 못한 코드인 것 같다. 
		// 하지만 이부분을 swith 구문을 이용해, n번째의 계산 방식 => 으로 여러가지 알고리즘을 구현해놔도 괜찮지 않을까 생각한다. 
		
		//중점 과목 등급 산출식
		if(this.mainSubject.equals(subject)) {
			//95~100점 S, 90~94점 A, 80~89점 B,70~79점 C, 60~69점 D, 60점 미만 F
			if(95<=this.mainScore && this.mainScore<=100) {
				this.myGrade = "S";
			}
			else if(90<=this.mainScore && this.mainScore<95) {
				this.myGrade = "A";
			}
			else if(80<=this.mainScore && this.mainScore<90) {
				this.myGrade = "B";
				
			}
			else if(70<=this.mainScore && this.mainScore<80) {
				this.myGrade = "C";
			}
			else if(60<=this.mainScore && this.mainScore<70) {
				this.myGrade = "D";
			}
			else if(this.mainScore<60) {
				this.myGrade = "F";
			}
		}
		
		//중점 과목이 아닌 과목의 등급 산출 방식
		else if(!mainSubject.equals(subject)) {
			// 90~100점 "A, 80~89점 B 70~79점 C 55~69점 D 55점 미만 F
			if(95 <=this.subScore && this.subScore < 100) {
				this.mySubGrade = "S";
			}
			else if(90<=this.subScore && this.subScore<95) {
				this.mySubGrade = "A";
			}
			else if(80<=this.subScore && this.subScore<90) {
				this.mySubGrade = "B";
			}
			else if(70<=this.subScore && this.subScore<80) {
				this.mySubGrade = "C";
			}
			else if(60<=this.subScore && this.subScore<70) {
				this.mySubGrade = "D";
			}
			else if(this.subScore<60) {
				this.mySubGrade = "F";
			}
		}
	}	//setMyGrade finish
}
	
//이름 성함
//간단하게 이름하고, 학번을 받는 클래스
class StudentInfO {
	private String name;
	private int SID;
	
	//생성자를 통해서 바로 정보를 받기에 getter만 준비
	StudentInfO(String n, int s){
		this.name = n;
		this.SID = s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSID() {
		return this.SID;
	}
}

// 과목 세팅 클래스 ,, 상속 받은 김에 바로super 키워드로 상위 접근도 가능하긴 하지만 DTO를 이용해보기로 함. 
// DTo를 이용하기에 굳이 상속이 필요하지 않을 것 같아, Student 상속 제거함
class Major  {   
	
	private List<String> subject; //어떤 과목이 있는지 
	private String Mainmajor; //전공
	private String mainSubject;  //중점 과목
	private String subSubject;	//일반 과목
	
	Major(String[] subject) throws IOException{
		this.subject = new ArrayList<String>();
		//배열의 값을 subject 리스트에 삽입
		addSubject(subject);
		//전공 정하기
		this.Mainmajor = setMainSubject();	
		//일반과목 설정
		this.subSubject = setSubSubject();
		}
	
	//과목 셋팅
	public void addSubject(String[] subject) {  
		for(String str : subject) {
			this.subject.add(str);
		}
	}
	
	//전공 정하기 
	public String setMainSubject() throws IOException {
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("해당 학생의 주요 과목을 선택하세요"); //여기서 주요과목이 아닌 전공을 선택하면 자동적으로 중점과목이 설정되도록 하는게 더 좋아보인다. 
		//이게 test 과정에서 상당히 번거롭긴하다. UX 측면에서 약점 요소 
		int i =0;
		
		//subject를 전공 배열로 설정해도 무관할 듯 
		for(String str : this.subject) {
			System.out.println((i+1)+"번" + this.subject.get(i));
			i++;
		}
		String str = br.readLine();
		//사용자 입력에 따라 전공, 중점 과목 설정 
		if(this.subject.contains(str)) {
			//subject 배열에 str이 있을 때 설정 가능
			this.mainSubject = str;
				// 중점과목에 따른 전공 설정
				if(str.equals("국어")) {
					this.Mainmajor = "국어국문학과";
				}
				else if(str.equals("수학")) {
					this.Mainmajor = "컴퓨터공학과";
			}
		}
		return this.Mainmajor;
	}	//setSubject finish
	
	
	//일반 과목 설정 
	public String setSubSubject(){
		//중점 과목의 인덱스 값
		int ck =subject.indexOf(mainSubject);
		if(ck == 0) {
			//현재는 두가지 과목밖에 없어서 편하게 설정하였지만,
			// 과목이 추가 될 경우에는 다른 알고리즘이 필요할 것으로 보임.
			// 간단하게 true, false로만 구분이 가능할 것 같다
			return subject.get(ck+1);
		}
		
		else if(ck == 1) {
			return  subject.get(ck-1);
		}
		
		return null;
	}
	
	//getter
	public String getMainMajor() {
		return this.Mainmajor;
	}
	
	public String getmainSubject() {
		return this.mainSubject;
	}
	
	public String getSubMajor() {
		return this.subSubject;
	}
}  //과목 클래스 끝

//학생의 점수를 나타내는 클래스
class Score {
	private int mainscore;  //중점 과목
	private int subscore;	//일반 과목
	
	Score(){
		this.mainscore = 0;
		this.subscore = 0;
	}
	//단순 입력 받는 클래스여도 괜찮을 것 같다.
	
	Score(int sc, int sub){
		this.mainscore = sc;
		this.subscore = sub;
	}

	//getter
	public int getScore() {
		return this.mainscore;
		
	}
	public int getsubScore() {
		return this.subscore;
	}
}


//* 폐지, Student 클래스에서 설정
//class MyGrade { // 근데 이건 StudentInfo에서 해도 될 것 같은데 
//	//어떤 과목의 등급을 구할지 물어보고, 
//	// 해당 과목을 super.Mainmajor와 동일하면 중점 과목 알고리즘
//	// 아닐시 일반 과목 알고리즘을 적용하면 될 것 같은데, 
//	swith 
//	case:(과목 1)
//	// 주요과목
//	//S, A B, C, D, E, f
//	//일반 과목
//	// A, B, c, d, f,
// 	case2 (+ , -) 
//	case3( P , np)
//	
//  위와 같이 다양한 계산방식을 설정해둘 수 있음 case n (int)로 해당 계산방식을 숫자로 간편히 계산 가능 bur, 출력부를 구현하기 빡셀듯 
//}

//Student DTO
class SDTO {
	
	//멤버변수
	private String name ;
	private int SID;
	private Major major;
	private int mainScore;
	private int subScore;
	
	//생성자
	SDTO(){
	}
	
	SDTO(StudentInfO si, Major major, Score sc ){
		this.name = si.getName();
		this.SID = si.getSID();
		this.major = major;
		this.mainScore = sc.getScore();
		this.subScore =sc.getsubScore();
	}
	
	//이하 getter/setter
	
	public int getsubScore() {
		return this.subScore;
	}
	
	//이름 getter/setter
	public String getName() {
		return this.name;
	}
	public void setName(StudentInfO si) {
		this.name = si.getName();
	}
	
	//학번 getter/setter;
	public int getSID() {
		return this.SID;
	}
	public void setSID(StudentInfO si) {
		this.SID = si.getSID();
	}
	
	
	//과목 getter/seterr
	public Major getMajor()  {
		return this.major;
	}

	
	//이건 그 뭐시냐 , major에 들어가 있어야지 왜 여기 있누;;  //변경 필요 //변경 완료 
	//major에서 구현한 부분을 해당 setter에서 한번 더 구현하고 있던 문제 발생
	public void setMajor(Major mg) throws IOException {
		this.major = mg;
	}
	
	
	//점수 getter/setter
	public int getScore() {
		return mainScore;
	}
	public void setScore(int score) {
		this.subScore = score;
	}
	
	
	//등급 getter/setter
	
}

public class spcial4{
	
	public static void main(String[] args) throws IOException {
		String[] subject = new String[] {"국어", "수학"};
		//1번 학생 세팅
		StudentInfO st1_Info = new StudentInfO("강감찬", 211213);
		Major st1_Major = new Major(subject);		//국어
		Score st1_Score = new Score(95, 56);
		SDTO st1INfo = new SDTO(st1_Info,st1_Major,st1_Score );
		Student st1 = new Student(st1INfo);
		st1.setMyGrade("국어"); st1.setMyGrade("수학");
		st1.makeStdInfoList();
		System.out.println();
		
		//2번 학생 세팅
		StudentInfO st2_Info = new StudentInfO("김유신", 212330);
		Major st2_Major = new Major(subject);  //수학
		Score st2_Score = new Score(95, 98);
		SDTO st2info = new SDTO(st2_Info,st2_Major,st2_Score );
		Student st2 = new Student(st2info);
		st2.setMyGrade("국어"); st2.setMyGrade("수학");
		st2.makeStdInfoList();
		System.out.println();
	
		//3번 학생 세팅 
		StudentInfO st3_Info = new StudentInfO("신사임당", 201518);
		Major st3_Major = new Major(subject);  //국어
		Score st3_Score = new Score(100, 88);
		SDTO st3info = new SDTO(st3_Info,st3_Major,st3_Score );
		Student st3 = new Student(st3info);
		st3.setMyGrade("국어"); st3.setMyGrade("수학");
		st3.makeStdInfoList();
		System.out.println();
		
		//3번 학생 세팅 
		StudentInfO st4_Info = new StudentInfO("이순신", 202360);
		Major st4_Major = new Major(subject);  //국어
		Score st4_Score = new Score(89, 95);
		SDTO st4info = new SDTO(st4_Info,st4_Major,st4_Score );
		Student st4 = new Student(st4info);
		st4.setMyGrade("국어"); st4.setMyGrade("수학");
		st4.makeStdInfoList();
		System.out.println();
		
		//5번 학생 세팅 
		StudentInfO st5_Info = new StudentInfO("홍길동", 201290	);
		Major st5_Major = new Major(subject);  //수학
		Score st5_Score = new Score(83, 56);
		SDTO st5info = new SDTO(st5_Info,st5_Major,st5_Score);
		Student st5 = new Student(st5info);
		st5.setMyGrade("국어"); st5.setMyGrade("수학");
		st5.makeStdInfoList();
		System.out.println();
		
		StudenInfoList stdlist = new StudenInfoList("강감찬", st1);
		//학생 정보 리스트에 추가 
		stdlist.pushinfo(st2);
		stdlist.pushinfo(st3);
		stdlist.pushinfo(st4);
		stdlist.pushinfo(st5);
		System.out.println(stdlist.getMap());
		stdlist.viewStudentInFo("국어");
		stdlist.viewStudentInFo("수학");
		
		
		//ArrayList index error로 인한 testcode
//		Map<String, List> TEST = new HashMap<String, List>();
//		ArrayList<Object> test = new ArrayList<Object>();
//		ArrayList<Object> test2 = new ArrayList<Object>();
//		test.add(1);
//		test.add("이순신");
//		test.add(98);
//		test.add("Lovejm");
//		
//		test2.add(15);
//		test2.add("강감찬");
//		test2.add(232);
//		test2.add("Cutejm");
//		
//		TEST.put("1", test);
//		TEST.put("2", test2);
//		Iterator<String> keys = TEST.keySet().iterator();
//		while( keys.hasNext() ){
//				String key = keys.next();
//				 System.out.println(String.format(" %s | %s | %s | %s : %s", 
//								key, TEST.get(key).get(0), TEST.get(key).get(1), TEST.get(key).get(2), TEST.get(key).get(3)));
//					}

	}
}
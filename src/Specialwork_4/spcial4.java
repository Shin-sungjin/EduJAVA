package Specialwork_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

interface GoodSchool {  //�������̽� ���� 
	public void viewStudentInFo(String subject);
}

class StudenInfoList implements GoodSchool{  //���������� ����ϴ� class
	
	
	private Map<String, List> SDT;  //Ȱ�� ����� ����غ��ô�. //�л� ������ �����ϱ� ���� Map
//	private ArrayList<Object> sdtinfo = new ArrayList<Object>();
	//�������� �л����� ������ �����ϴ� List, �ٵ� 
	// ���⼭ ����Ʈ�� �����ع�����, ���⿡ �л����� ������ �� �߰��ǹ����� ��Ȳ �߻��ؼ� ���� ��
	// �׷��� Student Ŭ�������� List ������ �����ϵ��� ��.
	
	// ���� �ʿ� ���� �� //�ʿ��ϴ�
	
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
		//Student Ŭ������ list�� �ҷ�����, �ش� ������ ���⿡ ����, 
		//getStdInfo ��ü�� ������ ���� �ϰ� �ִ� ����Ʈ 
		//get(0) = �̸�, 
		
		//�ƿ� �̵����� �����ϱ�, �׳� Ű1�� ����Ʈ�� �� �߰��غ���;;�׷��ٸ� ����Ʈ�� ���⼭ �����ϸ� �ȵ� ��   
//		this.sdtinfo.add(std.getName());
//		this.sdtinfo.add(std.getSID());
//		this.sdtinfo.add(std.getmainSubject()); 
//		this.sdtinfo.add(std.getMainScore());
//		this.sdtinfo.add(std.getSubScore());
//		this.sdtinfo.add(std.getMyGrade());  //���� ���� �ָ��ϴ� 
//		this.sdtinfo.add(std.getSubGrade());
	}
	
	//���� 
//	public void setStdList() {
//		SDT.put((String) this.sdtinfo.get(0), this.sdtinfo);
//	}
//	
	
	//Test�� Map ���� 
	public Map getMap() {
		return SDT;
	}
	
	//��� ���� �� 
	@Override
	public void viewStudentInFo(String subject) {
		System.out.println("------------------------");	
		System.out.printf("\t %s ������ ����\t", subject);  System.out.println();
		System.out.println("�̸� | �й�  |  ��������  | ���� ");
		//������ ��Ŀ� ���� ���
			
		
		//���� �ݺ��ڿ��� ��� index error �߻� 
		Iterator<String> keys = SDT.keySet().iterator();
		while( keys.hasNext() ){
				String key = keys.next();
				//����� �ϴ� ������ ���� ���� �� �� 
				if(this.SDT.get(key).get(2).equals(subject)) {
					//�� �ּ��� index error �߻� ����
					// �̺κ� this.SDT�� sdtinfo�� �Ǿ��־���,  �ڵ带 ���� �ش� ����Ʈ�� Ȱ������ �ʾ�, null ���̾��⿡ ������ �ȵǾ��� �� 
					System.out.println(String.format(" %s | %s | %s | %s : %s", 
								key, SDT.get(key).get(1), SDT.get(key).get(2), SDT.get(key).get(3), SDT.get(key).get(5)));
					}
				//����� �ϴ� ������ �Ϲ� ���� �� �� 
				else if(!this.SDT.get(key).get(2).equals(subject)) {
					System.out.println(String.format(" %s | %s | %s | %s : %s", 
								key, SDT.get(key).get(1), SDT.get(key).get(2), SDT.get(key).get(4), SDT.get(key).get(6)));
					}
			
		}
		
		//���� ������ 
		//�Ʒ��� ������ ���� ��� �����ο� ���� ���� ��. 
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
	 //��� ������ �ʹ� ���ϰ� �� ���� ���� �ʴ�. 
	private ArrayList<Object> stdinfo;
	private String name ;
	private int SID;
	private String major;
	private String mainSubject;
	private int mainScore;
	private int subScore;
	private String myGrade;	
	private String mySubGrade;
	// �̷��� �ع����� ���� ��ü���� �ڵ尡 �ʹ� ������� ������ �־����
	// �׸��� �ݺ� �����Ⱑ �����, �ϳ��� ��ü���� ���� �� ����, 
	// �ٵ� �ϳ��� ��ü���� ��� ���Ѱ� Ŭ���� �ƴѰ�??
	
	//��� �������� Map�� ���� �� ���� �����ϱ� ���� 
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
	
	//���⼭ �ٷιٷ� List�� ���� �߰� �ص� �Ǿ��� �� ����
	Student(SDTO sd) {
		this.mainSubject = sd.getMajor().getmainSubject();
		this.name = sd.getName();
		this.SID = sd.getSID();
		this.mainScore = sd.getScore();
		this.subScore = sd.getsubScore();
		this.major = sd.getMajor().getMainMajor();
	
	}
	
	
	public void setMyGrade(String subject) {
		// �ʼ� ����
		// ���� ���� ���� ����� ���Ӱ� ���� �Ǿ��� ���� ������� ���� �ڵ��� �� ����. 
		// ������ �̺κ��� swith ������ �̿���, n��°�� ��� ��� => ���� �������� �˰����� �����س��� ������ ������ �����Ѵ�. 
		
		//���� ���� ��� �����
		if(this.mainSubject.equals(subject)) {
			//95~100�� S, 90~94�� A, 80~89�� B,70~79�� C, 60~69�� D, 60�� �̸� F
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
		
		//���� ������ �ƴ� ������ ��� ���� ���
		else if(!mainSubject.equals(subject)) {
			// 90~100�� "A, 80~89�� B 70~79�� C 55~69�� D 55�� �̸� F
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
	
//�̸� ����
//�����ϰ� �̸��ϰ�, �й��� �޴� Ŭ����
class StudentInfO {
	private String name;
	private int SID;
	
	//�����ڸ� ���ؼ� �ٷ� ������ �ޱ⿡ getter�� �غ�
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

// ���� ���� Ŭ���� ,, ��� ���� �迡 �ٷ�super Ű����� ���� ���ٵ� �����ϱ� ������ DTO�� �̿��غ���� ��. 
// DTo�� �̿��ϱ⿡ ���� ����� �ʿ����� ���� �� ����, Student ��� ������
class Major  {   
	
	private List<String> subject; //� ������ �ִ��� 
	private String Mainmajor; //����
	private String mainSubject;  //���� ����
	private String subSubject;	//�Ϲ� ����
	
	Major(String[] subject) throws IOException{
		this.subject = new ArrayList<String>();
		//�迭�� ���� subject ����Ʈ�� ����
		addSubject(subject);
		//���� ���ϱ�
		this.Mainmajor = setMainSubject();	
		//�Ϲݰ��� ����
		this.subSubject = setSubSubject();
		}
	
	//���� ����
	public void addSubject(String[] subject) {  
		for(String str : subject) {
			this.subject.add(str);
		}
	}
	
	//���� ���ϱ� 
	public String setMainSubject() throws IOException {
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�ش� �л��� �ֿ� ������ �����ϼ���"); //���⼭ �ֿ������ �ƴ� ������ �����ϸ� �ڵ������� ���������� �����ǵ��� �ϴ°� �� ���ƺ��δ�. 
		//�̰� test �������� ����� ���ŷӱ��ϴ�. UX ���鿡�� ���� ��� 
		int i =0;
		
		//subject�� ���� �迭�� �����ص� ������ �� 
		for(String str : this.subject) {
			System.out.println((i+1)+"��" + this.subject.get(i));
			i++;
		}
		String str = br.readLine();
		//����� �Է¿� ���� ����, ���� ���� ���� 
		if(this.subject.contains(str)) {
			//subject �迭�� str�� ���� �� ���� ����
			this.mainSubject = str;
				// �������� ���� ���� ����
				if(str.equals("����")) {
					this.Mainmajor = "������а�";
				}
				else if(str.equals("����")) {
					this.Mainmajor = "��ǻ�Ͱ��а�";
			}
		}
		return this.Mainmajor;
	}	//setSubject finish
	
	
	//�Ϲ� ���� ���� 
	public String setSubSubject(){
		//���� ������ �ε��� ��
		int ck =subject.indexOf(mainSubject);
		if(ck == 0) {
			//����� �ΰ��� ����ۿ� ��� ���ϰ� �����Ͽ�����,
			// ������ �߰� �� ��쿡�� �ٸ� �˰����� �ʿ��� ������ ����.
			// �����ϰ� true, false�θ� ������ ������ �� ����
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
}  //���� Ŭ���� ��

//�л��� ������ ��Ÿ���� Ŭ����
class Score {
	private int mainscore;  //���� ����
	private int subscore;	//�Ϲ� ����
	
	Score(){
		this.mainscore = 0;
		this.subscore = 0;
	}
	//�ܼ� �Է� �޴� Ŭ�������� ������ �� ����.
	
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


//* ����, Student Ŭ�������� ����
//class MyGrade { // �ٵ� �̰� StudentInfo���� �ص� �� �� ������ 
//	//� ������ ����� ������ �����, 
//	// �ش� ������ super.Mainmajor�� �����ϸ� ���� ���� �˰���
//	// �ƴҽ� �Ϲ� ���� �˰����� �����ϸ� �� �� ������, 
//	swith 
//	case:(���� 1)
//	// �ֿ����
//	//S, A B, C, D, E, f
//	//�Ϲ� ����
//	// A, B, c, d, f,
// 	case2 (+ , -) 
//	case3( P , np)
//	
//  ���� ���� �پ��� ������� �����ص� �� ���� case n (int)�� �ش� ������� ���ڷ� ������ ��� ���� bur, ��ºθ� �����ϱ� ������ 
//}

//Student DTO
class SDTO {
	
	//�������
	private String name ;
	private int SID;
	private Major major;
	private int mainScore;
	private int subScore;
	
	//������
	SDTO(){
	}
	
	SDTO(StudentInfO si, Major major, Score sc ){
		this.name = si.getName();
		this.SID = si.getSID();
		this.major = major;
		this.mainScore = sc.getScore();
		this.subScore =sc.getsubScore();
	}
	
	//���� getter/setter
	
	public int getsubScore() {
		return this.subScore;
	}
	
	//�̸� getter/setter
	public String getName() {
		return this.name;
	}
	public void setName(StudentInfO si) {
		this.name = si.getName();
	}
	
	//�й� getter/setter;
	public int getSID() {
		return this.SID;
	}
	public void setSID(StudentInfO si) {
		this.SID = si.getSID();
	}
	
	
	//���� getter/seterr
	public Major getMajor()  {
		return this.major;
	}

	
	//�̰� �� ���ó� , major�� �� �־���� �� ���� �ִ�;;  //���� �ʿ� //���� �Ϸ� 
	//major���� ������ �κ��� �ش� setter���� �ѹ� �� �����ϰ� �ִ� ���� �߻�
	public void setMajor(Major mg) throws IOException {
		this.major = mg;
	}
	
	
	//���� getter/setter
	public int getScore() {
		return mainScore;
	}
	public void setScore(int score) {
		this.subScore = score;
	}
	
	
	//��� getter/setter
	
}

public class spcial4{
	
	public static void main(String[] args) throws IOException {
		String[] subject = new String[] {"����", "����"};
		//1�� �л� ����
		StudentInfO st1_Info = new StudentInfO("������", 211213);
		Major st1_Major = new Major(subject);		//����
		Score st1_Score = new Score(95, 56);
		SDTO st1INfo = new SDTO(st1_Info,st1_Major,st1_Score );
		Student st1 = new Student(st1INfo);
		st1.setMyGrade("����"); st1.setMyGrade("����");
		st1.makeStdInfoList();
		System.out.println();
		
		//2�� �л� ����
		StudentInfO st2_Info = new StudentInfO("������", 212330);
		Major st2_Major = new Major(subject);  //����
		Score st2_Score = new Score(95, 98);
		SDTO st2info = new SDTO(st2_Info,st2_Major,st2_Score );
		Student st2 = new Student(st2info);
		st2.setMyGrade("����"); st2.setMyGrade("����");
		st2.makeStdInfoList();
		System.out.println();
	
		//3�� �л� ���� 
		StudentInfO st3_Info = new StudentInfO("�Ż��Ӵ�", 201518);
		Major st3_Major = new Major(subject);  //����
		Score st3_Score = new Score(100, 88);
		SDTO st3info = new SDTO(st3_Info,st3_Major,st3_Score );
		Student st3 = new Student(st3info);
		st3.setMyGrade("����"); st3.setMyGrade("����");
		st3.makeStdInfoList();
		System.out.println();
		
		//3�� �л� ���� 
		StudentInfO st4_Info = new StudentInfO("�̼���", 202360);
		Major st4_Major = new Major(subject);  //����
		Score st4_Score = new Score(89, 95);
		SDTO st4info = new SDTO(st4_Info,st4_Major,st4_Score );
		Student st4 = new Student(st4info);
		st4.setMyGrade("����"); st4.setMyGrade("����");
		st4.makeStdInfoList();
		System.out.println();
		
		//5�� �л� ���� 
		StudentInfO st5_Info = new StudentInfO("ȫ�浿", 201290	);
		Major st5_Major = new Major(subject);  //����
		Score st5_Score = new Score(83, 56);
		SDTO st5info = new SDTO(st5_Info,st5_Major,st5_Score);
		Student st5 = new Student(st5info);
		st5.setMyGrade("����"); st5.setMyGrade("����");
		st5.makeStdInfoList();
		System.out.println();
		
		StudenInfoList stdlist = new StudenInfoList("������", st1);
		//�л� ���� ����Ʈ�� �߰� 
		stdlist.pushinfo(st2);
		stdlist.pushinfo(st3);
		stdlist.pushinfo(st4);
		stdlist.pushinfo(st5);
		System.out.println(stdlist.getMap());
		stdlist.viewStudentInFo("����");
		stdlist.viewStudentInFo("����");
		
		
		//ArrayList index error�� ���� testcode
//		Map<String, List> TEST = new HashMap<String, List>();
//		ArrayList<Object> test = new ArrayList<Object>();
//		ArrayList<Object> test2 = new ArrayList<Object>();
//		test.add(1);
//		test.add("�̼���");
//		test.add(98);
//		test.add("Lovejm");
//		
//		test2.add(15);
//		test2.add("������");
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
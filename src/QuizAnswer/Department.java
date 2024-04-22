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
		dName = "자바";
		dHead = "조준모";	
	}
	
	public void meet(char a) {
		System.out.println("학과장님과 면담을 하시겠습니까?");
		if( a == 1 || a == 2) {
			System.out.println("학과장님과 면담 일정을 조율합니다.");
		}
		else {
			System.out.println("면담일정을 폐기합니다. ");
		}
	}
	
	public void gradeSearch(int a) {
		System.out.println("학번을 입력해주세요");
		System.out.println("성적 조회를 하시겠습니다?");
	}
	
	public   void goHOme(){
		System.out.println("자퇴 혹은 휴학을 하시겠습니까?");
		System.out.println("안됩니다. 돌아가세요");
		
	}
	
}

package MapExam;

public class StudentVo {

	//E_CS_00000001
	//C_LN_00000001
	//위 두개는 업무 코드 
	
	private int sid;
	private String name;
	
	StudentVo(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}

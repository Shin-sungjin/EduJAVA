package MapExam;

public class StudentVo {

	//E_CS_00000001
	//C_LN_00000001
	//�� �ΰ��� ���� �ڵ� 
	
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

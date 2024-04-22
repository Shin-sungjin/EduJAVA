package MapExam;

import java.util.Objects;

public class StudentDTO {
	//E_CS_00000001
	//C_LN_00000001
	//�� �ΰ��� ���� �ڵ� 
	
	private String sid;
	private String name;
	
	StudentDTO(String sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	
	
	public String getSid() {
		return sid;
	}
	
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	   @Override
	   public int hashCode() {
	      return Objects.hash(this.sid, this.name);
	   }
	   
	   
	//   ���� ȣȯ���� ���ַ� �Ѵٸ� �� ����� ��������.
	//   public int hashCode() {
	//   return this.sno + this.name.hashCode();
	//   }
	   
	   
	   //�ش� ��ü�� �´��� �ƴ����� �ɷ��״� �͵� 
	   @Override
	   public boolean equals(Object obj) {
	      if(obj instanceof StudentDTO) {
	    	  StudentDTO student = (StudentDTO)obj;
	         return this.sid == student.sid && this.name.equals(student.name);
	      }
	      return false;
	   }   
}

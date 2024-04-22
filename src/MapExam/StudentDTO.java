package MapExam;

import java.util.Objects;

public class StudentDTO {
	//E_CS_00000001
	//C_LN_00000001
	//위 두개는 업무 코드 
	
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
	   
	   
	//   하위 호환성을 위주로 한다면 이 방법을 선택하자.
	//   public int hashCode() {
	//   return this.sno + this.name.hashCode();
	//   }
	   
	   
	   //해당 객체가 맞는지 아닌지만 걸러네는 것들 
	   @Override
	   public boolean equals(Object obj) {
	      if(obj instanceof StudentDTO) {
	    	  StudentDTO student = (StudentDTO)obj;
	         return this.sid == student.sid && this.name.equals(student.name);
	      }
	      return false;
	   }   
}

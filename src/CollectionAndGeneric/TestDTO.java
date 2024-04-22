package CollectionAndGeneric;

public class TestDTO {
	
	private String test1;
	private Integer test2;;
	private Double test3;
	private String test4;
	
	//현업 스프링 워크에서 데이터를 담당하는 클래스 
	// Vo ,DTO로 사용
	// Vo =값만 받는 value object
	
	// Dto =캛슐화를 구현하기 위한 현업의 퍼포먼스 
	// Data to object
	
	// 100점 맘에 드는 사람, = > 유경, 성진 ㅎㅎ,,,
	// 가독성, 유지보수 다 던지고 요구사항을 가장 철저히 지킴 
	// "요구 사항" 이게 핵심 
	
	
	
	public String getTest1() {
		return test1;
	}
	public void setTest1(String test1) {
		this.test1 = test1;
	}
	public Integer getTest2() {
		return test2;
	}
	public void setTest2(Integer test2) {
		this.test2 = test2;
	}
	public Double getTest3() {
		return test3;
	}
	public void setTest3(Double test3) {
		this.test3 = test3;
	}
	public String getTest4() {
		return test4;
	}
	public void setTest4(String test4) {
		this.test4 = test4;
	}
}

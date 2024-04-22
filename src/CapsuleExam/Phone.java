package CapsuleExam;

public class Phone {
	// 속성: 디자인, 색상, 브랜드, 크기, 카메라 개수, 
	// 행동:
	
	private String design;
	private String color;
	private String brand;
	private double size;
	private int cameraCnt;
	
	
	
	protected Phone(String design, String color, String brand, double size, int cameraCnt) {
		this.design = design;
		this.color = color;
		this.brand = brand;
		this.size = size;
		this.cameraCnt = cameraCnt;
	}

	//getter/setter
	//변수를 통해서 데이터를 통제하는 수단(게터와 세터)
	// 필요성
	// -자바는 변수의 타입, 접근제어자가 존재하는 이유가 따로 있다. 
	// -개발자 등 해당 S/W(Service)에 대해 아는 사람만
	//  데이터를 세팅하고, 가져오는 것을 허용하기 위해서. 
	
	
	public String getDesign() {
		return design;
	}
	
	public void setDesign(String design) {
		this.design = design;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public int getCameraCnt() {
		return cameraCnt;
	}
	
	public void setCameraCnt(int cameraCnt) {
		this.cameraCnt = cameraCnt;
	}
	 
	@Override//메소드의 재정의  //어노테이션 
	public String toString() {
		String str = this.getBrand() +"\t"+
					 this.getCameraCnt()+ "\t"+
					 this.getColor()+ "\t"+
					 this.getDesign()+ "\t" +
					 this.getSize();
		return str;
	}
	
	public void call() {
		System.out.println("뚜르르르 여보쇼 거기 짱깨집이요?");
	}
	
	//하남동 662번지
}

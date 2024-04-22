package CapsuleExam;

public class Phone {
	// �Ӽ�: ������, ����, �귣��, ũ��, ī�޶� ����, 
	// �ൿ:
	
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
	//������ ���ؼ� �����͸� �����ϴ� ����(���Ϳ� ����)
	// �ʿ伺
	// -�ڹٴ� ������ Ÿ��, ���������ڰ� �����ϴ� ������ ���� �ִ�. 
	// -������ �� �ش� S/W(Service)�� ���� �ƴ� �����
	//  �����͸� �����ϰ�, �������� ���� ����ϱ� ���ؼ�. 
	
	
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
	 
	@Override//�޼ҵ��� ������  //������̼� 
	public String toString() {
		String str = this.getBrand() +"\t"+
					 this.getCameraCnt()+ "\t"+
					 this.getColor()+ "\t"+
					 this.getDesign()+ "\t" +
					 this.getSize();
		return str;
	}
	
	public void call() {
		System.out.println("�Ѹ����� ������ �ű� ¯�����̿�?");
	}
	
	//�ϳ��� 662����
}

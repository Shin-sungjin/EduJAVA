package OOP0111;

public interface Dog {
	public static final String color = "����";
	
	
	public abstract void bite();
	
	public abstract void eat();
	
	public abstract void ppuzik();
	
	public default void walk() {
		System.out.println("��å ����");
	}
	
	public static String getColor() {
		return color;
	}
}
//�޼ҵ� ���輭?


package OOP0111;

public interface Dog {
	public static final String color = "빨강";
	
	
	public abstract void bite();
	
	public abstract void eat();
	
	public abstract void ppuzik();
	
	public default void walk() {
		System.out.println("산책 좋개");
	}
	
	public static String getColor() {
		return color;
	}
}
//메소드 설계서?


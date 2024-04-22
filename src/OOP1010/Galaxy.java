package OOP1010;

public class Galaxy extends SmartPhone{

	Galaxy(String design, String color, String brand, double size, int cameraCnt) {
		super(design, color, brand, size, cameraCnt);	
	}

	
	public static void main(String[] args) {
		Galaxy zfold6 = new Galaxy("°¶", "Æú", "µå", 0, 0);
		zfold6.call();
		
	}
}

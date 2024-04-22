package SSJ_Quiz;

public class SSJ_Quiz5 {
	
	public static void main(String[] args) {
		Rectangle square = new Rectangle(15, 4);
		
		Square sqe = new Square(1, 1);
		square.calculateArea();
		sqe.calculateArea();
		System.out.println("¸éÀû : " + sqe.calculateArea());
	}
}


class Rectangle{
	private double width;
	private double heigth;
	
	Rectangle(double width, double heigth){
		this.width = width;
		this.heigth = heigth;
	}
	
	public double calculateArea() {
		double result = width * heigth;
		return result;
	}
	
}

class Square extends Rectangle{
	private double width;
	private double heigth;
	
	Square(double width, double heigth) {
		super(width, heigth);
	}
	

}
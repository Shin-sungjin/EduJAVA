package OOP0110two;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car();
		sportsCar sCar1 = new sportsCar();
		
		
		car1.speedUp();
		System.out.println(car1.speed);
		car1.speedDown();
		System.out.println(car1.speed);
		car1.speedDown();
		
		sCar1.speedUp();
		System.out.println(sCar1.speed);
		sCar1.stop();
	}
}

package OOP0110two;

public class sportsCar extends Car {
	int speed;
	
	sportsCar(){
		speed = 0;
	}
	sportsCar(int speed){
		this.speed = speed;
	}
	
	@Override
	public void speedUp() {
		this.speed +=20;
	}
	
	@Override
	public void stop() {
		System.out.println("스포츠카는 빨간 불에도 멈추지 않아 boy");

	}
	
	

	
	
	}



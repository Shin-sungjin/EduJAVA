package Specialwork_1;

public interface Bird extends Animal {
	//fly()
	
	default void fly() {
		
	}
	
	@Override
	default void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default int getEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}

}

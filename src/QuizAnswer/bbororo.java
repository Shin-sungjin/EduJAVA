package QuizAnswer;

public class bbororo {
	private int money= 10000;
	
	public int useSubway(String color) {
		if( money >= 1200) {
			money -= 1200;
		}
		return money;
	}
	
	public int useBus(int num) {
		if (money >=1000)
		money -= 1000;
		return money;
	}
}

package QuizAnswer;

public class lupy {
	private int money = 5000;
	
	public int useBus(int num) {
		if (money >=1000)
		money -= 1000;
		return money;
	}
	
	public int useSubway(String color) {
		if( money >= 1200) {
			money -= 1200;
		}
		return money;
	}
}

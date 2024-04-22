package SSJ_Quiz3;

public class Robot {
	private String name;
	private String function;
	
	Robot(String n, String f){
		this.name = n;
		this.function = f;
	}
	
	public String getName() {
		return this.name;
	}
	public String getFunction() {
		return this.function;
	}
	
	public void performFunction(Robot robot) {
		System.out.println("나의 이름은"+ robot.getName() + "이고 나의 기능은"+ robot.getFunction()+"이야" );
		System.out.println("나의 이름은"+ this.name+ "이고 나의 기능은"+ this.function+ "이야");

	}

	public static void main(String[] args) {
		Robot robot1 =new Robot("로봇 1", "화재 진압");
		Robot robot2 =new Robot("로봇 2", "물자 운반");
		Robot robot3 =new Robot("로봇 3", "우주 정비");
		System.out.println(robot1.getFunction());
		System.out.println(robot2.getFunction());;
		robot3.performFunction(robot2);
	}
	
}

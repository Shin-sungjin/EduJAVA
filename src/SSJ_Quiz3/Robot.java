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
		System.out.println("���� �̸���"+ robot.getName() + "�̰� ���� �����"+ robot.getFunction()+"�̾�" );
		System.out.println("���� �̸���"+ this.name+ "�̰� ���� �����"+ this.function+ "�̾�");

	}

	public static void main(String[] args) {
		Robot robot1 =new Robot("�κ� 1", "ȭ�� ����");
		Robot robot2 =new Robot("�κ� 2", "���� ���");
		Robot robot3 =new Robot("�κ� 3", "���� ����");
		System.out.println(robot1.getFunction());
		System.out.println(robot2.getFunction());;
		robot3.performFunction(robot2);
	}
	
}

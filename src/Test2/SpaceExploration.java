package Test2;

class Robot {
    private String name; 
    private String function;
    //��� ���� ����
    
    //������, 
    public Robot(String name, String function) {
        this.name = name;
        this.function = function;
    }

    //��� �ҷ�����
    public String getFunction() {
        return function;
    }
    
    
    //�ٸ� robot �ν��Ͻ��� ����, this�� �ش� �ν��Ͻ� ���� �ҷ���, 
    // �Ǿ��� ���� ���� ���� �� ���⼭ robot.name���� �� �ҷ��Ա⿡, getName�� ������ ����������, �� �̰� �Ǵ��� �ñ��ϴ�. 
    // �ϴ� robot �ν��Ͻ��� �ش� Ŭ�������� �Ļ��Ǿ��� ������ ���� �� �� ������, 
    // ���� ���뿡 ���߾� ���ڸ�, ���� ������ ��ü�� ������ �����Ѵٴµ�, �̰� �̷��� ������ �������� �����ϴ�. 
    public String performFunction(Robot robot) {
        return this.name + "��(��) " + robot.name + "��(��) �����Ͽ� " + robot.function + "��(��) �����մϴ�.";
    }
}
public class SpaceExploration { 
	public static void main(String[] args) {
    Robot robot1 = new Robot("�κ�1", "ȭ�� ����");
    Robot robot2 = new Robot("�κ�2", "���� ���");
    Robot robot3 = new Robot("�κ�3", "���� ����");

    System.out.println(robot1.performFunction(robot2));
    System.out.println(robot2.performFunction(robot3));
    System.out.println(robot3.performFunction(robot1));
}

}

/*
 * public class Robot {
	private String name;
	private String function;
	* ��� ����
	* 
	* ������
	Robot(String n, String f){
		this.name = n;
		this.function = f;
	}
	
	* �̸��� ����� �޾ƿ��� ���� getter
	public String getName() {
		return this.name;
	}
	public String getFunction() {
		return this.function;
	}
	
	
	*���� ���� ���躼 ��� �ٸ� robot�ν��Ͻ��� name���� �ٷ� �������� ���Ͽ� getName() �޼ҵ���� ����
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

 */

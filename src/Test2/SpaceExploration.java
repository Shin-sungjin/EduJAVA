package Test2;

class Robot {
    private String name; 
    private String function;
    //멤버 변수 선언
    
    //생성자, 
    public Robot(String name, String function) {
        this.name = name;
        this.function = function;
    }

    //기능 불러오기
    public String getFunction() {
        return function;
    }
    
    
    //다른 robot 인스턴스와 협업, this로 해당 인스턴스 값을 불러옴, 
    // 의아한 점은 내가 했을 때 여기서 robot.name으로 못 불러왔기에, getName을 별도로 선언했지만, 왜 이게 되는지 궁금하다. 
    // 일단 robot 인스턴스도 해당 클래스에서 파생되었기 때문에 생성 된 것 같으나, 
    // 강의 내용에 비추어 보자면, 각각 별도로 객체의 정보를 저장한다는데, 이게 이렇게 병합이 가능한지 의이하다. 
    public String performFunction(Robot robot) {
        return this.name + "이(가) " + robot.name + "과(와) 협력하여 " + robot.function + "을(를) 수행합니다.";
    }
}
public class SpaceExploration { 
	public static void main(String[] args) {
    Robot robot1 = new Robot("로봇1", "화재 진압");
    Robot robot2 = new Robot("로봇2", "물자 운반");
    Robot robot3 = new Robot("로봇3", "우주 정비");

    System.out.println(robot1.performFunction(robot2));
    System.out.println(robot2.performFunction(robot3));
    System.out.println(robot3.performFunction(robot1));
}

}

/*
 * public class Robot {
	private String name;
	private String function;
	* 멤버 변수
	* 
	* 생성자
	Robot(String n, String f){
		this.name = n;
		this.function = f;
	}
	
	* 이름과 기능을 받아오기 위한 getter
	public String getName() {
		return this.name;
	}
	public String getFunction() {
		return this.function;
	}
	
	
	*나는 내가 시험볼 당시 다른 robot인스턴스의 name값에 바로 접근하지 못하여 getName() 메소드까지 설정
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

 */

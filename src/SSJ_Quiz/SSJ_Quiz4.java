package SSJ_Quiz;

public class SSJ_Quiz4 {
	public static void main(String[] args) {
		Student std = new Student("½Å¼ºÁø", 100);
		std.displayScore();
		System.out.println(std.displayScore());
	}
	
	
}


class Student{
	private String name;
	private int	score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public int displayScore() {
		return this.score;
	};
}
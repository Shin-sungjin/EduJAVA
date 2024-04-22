package SSJ_Quiz;


interface ScoreCalculator{
	int calculateScore(int[] scores);
}

class AverageScoreCalculator implements ScoreCalculator{
	
	
	
	
	@Override
	public int calculateScore(int[] scores) {
		int len = scores.length;
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}
		
		int avg = sum / len;
		
		
		return avg;
	}
	
	
}


public class SSJ_Quiz10 {
	public static void main(String[] args) {
		int[] scores = {80, 90, 45, 95, 85};
		
		ScoreCalculator calculator = new AverageScoreCalculator();
		int averageScore =calculator.calculateScore(scores);
		System.out.println("모든 학생의 평균 점수 : "+  averageScore );
	}
	
	
}

package Basic0123;
/*문제: 마법사가 되기 위해 여러 시험을 통과해야 합니다. 
각 시험은 다양한 난이도와 요구 사항을 가지고 있으며, 
마법사는 시험에 맞는 마법을 사용하여 통과해야 합니다. 
마법사의 능력을 활용하여 시험을 통과할 수 있는지 확인하는 프로그램을 작성해야 합니다.

요구사항:
Wizard 클래스를 작성해야 합니다. Wizard 클래스는 마법사의 이름(name)과 능력(ability)을 가지고 있어야 합니다.
Wizard 클래스에는 getAbility() 메서드가 있어야 합니다. 이 메서드는 마법사의 능력을 반환해야 합니다.
Wizard 클래스에는 passExam(int difficulty) 메서드가 있어야 합니다. 
이 메서드는 시험의 난이도(difficulty)를 입력받아 해당 시험을 통과할 수 있는지 여부를 반환해야 합니다. 
시험을 통과하려면 마법사의 능력이 시험의 난이도보다 크거나 같아야 합니다.
마법사는 여러 시험을 연속으로 통과해야 합니다. 
따라서 passExam() 메서드를 여러 번 호출하여 시험을 연속으로 통과하는 기능을 구현해야 합니다.
Wizard 클래스에는 생성자를 작성해야 합니다. 생성자는 이름과 능력을 입력받아 초기화해야 합니다.

아래의 코드는 메인에서 사용하는 마법사 객체의 난이도 통과 여부 테스트 코드 입니다.

        Wizard wizard = new Wizard("마법사", 15);

        int[] examDifficulties = {10, 20, 30, 25, 15};
        */
public class Wizard {
	private String name;
	private int ablity;
	
	
	Wizard(String name, int ablity) {
		super();
		this.name = name;
		this.ablity = ablity;
	}

	public int getAblity() {
		return ablity;
	}

	public void passExam(int[] difficulty) {
	    int cnt= 0;
		boolean pass =true;
		int len = difficulty.length;
		while(pass) {
		
			if( difficulty[cnt] <= ablity ) {
				cnt++;
				System.out.println(cnt+"단계를 통과했습니다." );
				if(len == cnt) {
					System.out.println("모든 단계를 통과했습니다.");
					break;
				}
			}
			else if(difficulty[cnt] > ablity) {
				System.out.println(cnt+1 + "단계를 통과하지 못했습니다.");
				break;
			}
		}
	}

	public static void main(String[] args) {
	       Wizard wizard = new Wizard("마법사", 80);

	       int[] examDifficulties = {10, 20, 30, 25, 15};
	       
	       wizard.passExam(examDifficulties);
	}
}

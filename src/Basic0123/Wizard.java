package Basic0123;
/*����: �����簡 �Ǳ� ���� ���� ������ ����ؾ� �մϴ�. 
�� ������ �پ��� ���̵��� �䱸 ������ ������ ������, 
������� ���迡 �´� ������ ����Ͽ� ����ؾ� �մϴ�. 
�������� �ɷ��� Ȱ���Ͽ� ������ ����� �� �ִ��� Ȯ���ϴ� ���α׷��� �ۼ��ؾ� �մϴ�.

�䱸����:
Wizard Ŭ������ �ۼ��ؾ� �մϴ�. Wizard Ŭ������ �������� �̸�(name)�� �ɷ�(ability)�� ������ �־�� �մϴ�.
Wizard Ŭ�������� getAbility() �޼��尡 �־�� �մϴ�. �� �޼���� �������� �ɷ��� ��ȯ�ؾ� �մϴ�.
Wizard Ŭ�������� passExam(int difficulty) �޼��尡 �־�� �մϴ�. 
�� �޼���� ������ ���̵�(difficulty)�� �Է¹޾� �ش� ������ ����� �� �ִ��� ���θ� ��ȯ�ؾ� �մϴ�. 
������ ����Ϸ��� �������� �ɷ��� ������ ���̵����� ũ�ų� ���ƾ� �մϴ�.
������� ���� ������ �������� ����ؾ� �մϴ�. 
���� passExam() �޼��带 ���� �� ȣ���Ͽ� ������ �������� ����ϴ� ����� �����ؾ� �մϴ�.
Wizard Ŭ�������� �����ڸ� �ۼ��ؾ� �մϴ�. �����ڴ� �̸��� �ɷ��� �Է¹޾� �ʱ�ȭ�ؾ� �մϴ�.

�Ʒ��� �ڵ�� ���ο��� ����ϴ� ������ ��ü�� ���̵� ��� ���� �׽�Ʈ �ڵ� �Դϴ�.

        Wizard wizard = new Wizard("������", 15);

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
				System.out.println(cnt+"�ܰ踦 ����߽��ϴ�." );
				if(len == cnt) {
					System.out.println("��� �ܰ踦 ����߽��ϴ�.");
					break;
				}
			}
			else if(difficulty[cnt] > ablity) {
				System.out.println(cnt+1 + "�ܰ踦 ������� ���߽��ϴ�.");
				break;
			}
		}
	}

	public static void main(String[] args) {
	       Wizard wizard = new Wizard("������", 80);

	       int[] examDifficulties = {10, 20, 30, 25, 15};
	       
	       wizard.passExam(examDifficulties);
	}
}

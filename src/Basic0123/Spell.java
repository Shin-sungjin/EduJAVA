package Basic0123;

/*������ �б��� �л����� �پ��� ������ ���� �ֽ��ϴ�. �̵��� ��ü���� ���α׷����� ������ Ȱ���Ͽ� �����غ����� �մϴ�.


Spell(����) Ŭ������ �ۼ��ϼ���. �� Ŭ������ ������ �Ӽ��� �޼��带 ������ �մϴ�:
�Ӽ�:
name (������ �̸��� ��Ÿ���� ���ڿ�)
level (������ ������ ��Ÿ���� ����)

�޼���:
castSpell(): ������ �����ϴ� �޼���. �� �޼���� ������ �̸��� ������ ����մϴ�.
Spell Ŭ������ �����ε��Ͽ� ������ �����ڵ��� �ۼ��ϼ���:
Spell(String name): �̸����� �Է¹޾� ������ ������ 1�� �����ϴ� ������
Spell(String name, int level): �̸��� ������ �Է¹޾� ������ �ʱ�ȭ�ϴ� ������
������ �ڵ带 �����Ͽ� �������� �����ϼ���:
java
public class WizardSchool {
    public static void main(String[] args) {
        Spell spell1 = new Spell("���̾");
        Spell spell2 = new Spell("����Ʈ��", 2);
        Spell spell3 = new Spell("���̽����̵�", 3);

        spell1.castSpell();
        spell2.castSpell();
        spell3.castSpell();
    }
}
����Ǵ� ��� ���:

���̾ ������ �����մϴ�. (����: 1)
����Ʈ�� ������ �����մϴ�. (����: 2)
���̽����̵� ������ �����մϴ�. (����: 3)
*/
public class Spell {
	private String name;
	private int level;
	
	Spell(String name) {
		
		this.name = name;
		this.level = 1;
	}

	
	
	Spell(String name, int level) {
			this.name = name;
			this.level = level;
		}




//	castSpell(): ������ �����ϴ� �޼���. �� �޼���� ������ �̸��� ������ ����մϴ�.
	public void castSpell() {
		System.out.println( this.name + " ������ �����մϴ�." + "(����:"+this.level+")" );
	}



	public static void main(String[] args) {
        Spell spell1 = new Spell("���̾");
        Spell spell2 = new Spell("����Ʈ��", 2);
        Spell spell3 = new Spell("���̽����̵�", 3);

        spell1.castSpell();
        spell2.castSpell();
        spell3.castSpell();
	}
}

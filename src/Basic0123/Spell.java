package Basic0123;

/*마법사 학교의 학생들은 다양한 마법을 배우고 있습니다. 이들을 객체지향 프로그래밍의 개념을 활용하여 구현해보려고 합니다.


Spell(마법) 클래스를 작성하세요. 이 클래스는 다음의 속성과 메서드를 가져야 합니다:
속성:
name (마법의 이름을 나타내는 문자열)
level (마법의 레벨을 나타내는 정수)

메서드:
castSpell(): 마법을 시전하는 메서드. 이 메서드는 마법의 이름과 레벨을 출력합니다.
Spell 클래스를 오버로딩하여 다음의 생성자들을 작성하세요:
Spell(String name): 이름만을 입력받아 마법의 레벨을 1로 설정하는 생성자
Spell(String name, int level): 이름과 레벨을 입력받아 마법을 초기화하는 생성자
다음의 코드를 실행하여 마법들을 시전하세요:
java
public class WizardSchool {
    public static void main(String[] args) {
        Spell spell1 = new Spell("파이어볼");
        Spell spell2 = new Spell("라이트닝", 2);
        Spell spell3 = new Spell("아이스블레이드", 3);

        spell1.castSpell();
        spell2.castSpell();
        spell3.castSpell();
    }
}
예상되는 출력 결과:

파이어볼 마법을 시전합니다. (레벨: 1)
라이트닝 마법을 시전합니다. (레벨: 2)
아이스블레이드 마법을 시전합니다. (레벨: 3)
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




//	castSpell(): 마법을 시전하는 메서드. 이 메서드는 마법의 이름과 레벨을 출력합니다.
	public void castSpell() {
		System.out.println( this.name + " 마법을 시전합니다." + "(레벨:"+this.level+")" );
	}



	public static void main(String[] args) {
        Spell spell1 = new Spell("파이어볼");
        Spell spell2 = new Spell("라이트닝", 2);
        Spell spell3 = new Spell("아이스블레이드", 3);

        spell1.castSpell();
        spell2.castSpell();
        spell3.castSpell();
	}
}

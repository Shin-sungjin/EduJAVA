package Specialwork;

import java.util.ArrayList;
import java.util.List;

public class Sorcerer extends Hero{
//	������� ������ ����Ͽ� ������ �Һ��� �� �ֽ��ϴ�. ������ ����ϸ� ������ �����ϰ�, "������ ����߽��ϴ�!"��� �޽����� ��µ˴ϴ�.
//	������� ������ ����� �� �ִµ�, Ư���� ������ ���� �߰��� Ư���� ���� ����� ����� �� �ֽ��ϴ�. 
//	������� "���̾"�� "����"�̶�� �� ���� ������ ��� �� �ֽ��ϴ�. 
//	"���̾"�� ����ϸ� ���� �����Ͽ� ������� ������, "����"�� ����ϸ� �ڽ��� ü���� ȸ���� �� �ֽ��ϴ�.
// 	���� ���� ȸ���� ü���� �ʿ�
//	������� ������ ����� �� ������, �ֹ��� ���� ��Ÿ���� ����(mana)�� ������ �ֽ��ϴ�.
	private int health;
	private int mana;
	List<String> list = new ArrayList();
	
	Sorcerer(int a){
		this.mana = a;
		this.health =a;
	}
	
	
	//������ �н��Ѵ�. 
	public void learnSpell(String a) {
		list.add(a);
		System.out.printf("%s�� �н��մϴ�." , a);
		System.out.println();
		
	}
	
	//���� casting
	public void castSpell(String m) {
		boolean spell =  list.contains(m);
		if(spell) {
			if(this.mana>10) {
				System.out.printf("%s�� ����մϴ�!", m);
				System.out.println();
				this.mana -= 10;
				if(m.equals("����")) {
					this.health += 10;
				}
				else if(m.equals("���̾")) {
					deal(20);
				}
			}
			else {
				System.out.println("������ ����� ������ �����մϴ�.");
			}
			
		}
		else {
			System.out.println("�׷� ������ ����� �ʾҾ��");
		}
	}
	
	public int getMana() {
		return this.mana;
	}
	
	
	
	
	//Main Sorcerer 
//    Sorcerer sorcerer = new Sorcerer(50);
//    sorcerer.learnSpell("���̾");
//    sorcerer.castSpell("���̾");
//    System.out.println("�������� ����: " + sorcerer.getMana());
}

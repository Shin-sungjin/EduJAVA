package Specialwork;

import java.util.ArrayList;
import java.util.List;

public class Rogue extends Hero {
//	������ �����Ͽ� ���� �� �ֽ��ϴ�. ������ �ϸ� ��ø���� �����ϰ�, "�����մϴ�..."��� �޽����� ��µ˴ϴ�.
//	������ ���� �ɷ� �ܿ��� "�賶 ����"�̶�� Ư���� ����� ���� �ֽ��ϴ�. 
//	�賶 ������ ������ ��ģ �����̳� �������� �����ϴ� �뵵�� ���˴ϴ�. 
//	������ �賶�� �������� �߰��ϰų� ������ �� �ֽ��ϴ�.
	
// (�賶�� �迭�� ǥ���ϴ� ���� ���غ��δ�. 
// �迭�� ��� �߰��ϴ� ���� �����ϱ� ���ؼ� �迭 �ִ��� 5������ �ְ�, 
// �ε����� �÷��� cnt ���� ������ �ʿ��غ��δ� 
// �߰��� ����. ++��,  => �̰��, �ִ��� �Ѿ��� ��� �迭�� �߰����� ���� ��Ȳ�� �߻� �� �� �ִµ�, 
// ���� �߰�/ ���� ��, ��� °�� �����ϰ�, �������� ������ �� ����ڰ� �����ϵ��� �ϴ� �͵� ����� �� �ְڴ�. )
	
//	������ ������ ����� �� ������, ������ ���õ��� ��Ÿ���� ��ø��(agility)�� ������ �ֽ��ϴ�.
	private int agility;
	private int health;
	//�賶 ���� ����
	List<String> list = new ArrayList();
	
	//������ ����
	Rogue(int a){
		this.agility =a;
		this.health = a;
	}
	
	public void hide() {
		this.agility -=5;
		System.out.println("�����մϴ�.....");
	}
	
	public void outOfHide() {
		this.agility += 5;
		System.out.println("������ �����մϴ�. ");
	}
	
	public void addItemToBackpack(String s) {
		list.add(s);
		System.out.printf("%s�� �賶�� �����մϴ�", s);
		System.out.println();
	}
	
	public void removeItemFromBackpack(String s) {
		boolean tre = list.contains(s);
		if(tre) {
			list.remove(s);
			System.out.printf("%s�� �賶�� �����մϴ�", s);
			System.out.println();
		}
		else {
			System.out.println("�׷� �������� �����ϴ�.");
		}
	}
	
	
    // ���� ��ü ����
//    Rogue rogue = new Rogue(20);
//    rogue.hide();
//    rogue.addItemToBackpack("��ȭ");
//    rogue.removeItemFromBackpack("����");
}


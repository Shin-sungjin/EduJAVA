package OOP1010;

import CapsuleExam.Phone;

public class SmartPhone extends Phone{
	SmartPhone(String design, String color, String brand, double size, int cameraCnt){
		super(brand, brand, brand, size, cameraCnt);
	}
	
	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone("��", "ħ", "��", 0, 0);
		// �θ� Ŭ������ ���� ���� ���� �޼��� 
		// �޼��带 ���� ����Ʈ�� Ŭ������ �� �ʿ� ������ 
		sm.call();
	}
	
	
}

package CapsuleExam;

import Oop0109.capsuleExam;

public class CapsuleExam3 {
	public static void main(String[] args) {
		
		
		capsuleExam ce = new capsuleExam("test");
		ce.test2();
	
		// phone Ŭ������ �̿��Ͽ� �ν��Ͻ��� �����
		// �ش� �ν��Ͻ��� �Ӽ����� �ҷ����ÿ�
		
		
		Phone iPhone11ProMax = new Phone("����", "�̵峪�� �׸�", "����", 34.2, 3);
		System.out.println(iPhone11ProMax.getBrand());
		System.out.println(iPhone11ProMax.getColor());
		System.out.println(iPhone11ProMax.getDesign());
		System.out.println(iPhone11ProMax.getSize());
		System.out.println(iPhone11ProMax.getCameraCnt());
		
		iPhone11ProMax.setDesign("����");
		iPhone11ProMax.setColor("����ũ");
		iPhone11ProMax.setBrand("��ħ");
		iPhone11ProMax.setSize(97.24);
		iPhone11ProMax.setCameraCnt(9);
		
		System.out.println("iPone11ProMax�� �ٲ�����ϴ�.");
//		System.out.println(iPhone11ProMax.getBrand());
//		System.out.println(iPhone11ProMax.getColor());
//		System.out.println(iPhone11ProMax.getDesign());
//		System.out.println(iPhone11ProMax.getSize());
//		System.out.println(iPhone11ProMax.getCameraCnt());
		
		System.out.println(iPhone11ProMax.toString());
		
	}
}

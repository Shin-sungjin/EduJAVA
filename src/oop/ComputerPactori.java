package oop;

public class ComputerPactori {
	// ��ǻ�͸� ����
	
	//��ǻ�� �Ӽ�
	// �Ӽ� -ũ��, ����, ������   //�Ӽ��� ���� �������� ���� ���/ ������ - > �÷�
	String size = "����ŭ";
	String performance = "��������";
	String design = "ȭ��";
	
	//�ൿ -�����͸� �����Ѵ�. �˻��Ѵ�. �ҷ��´�.
	
	void save() {
		System.out.println("�����͸� �����մϴ�.");
	}
	
	void search() {
		System.out.println("�˻��ϱ�");
	}
	
	void load() {
		search();
		// �޼��� ���ο��� �ٸ� �޼��带 ȣ�� �ϴ� �� ���� ����. 
		System.out.println("�ҷ�����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ǻ�� �ൿ
		// ������ Ŭ������ ����ϴ� ���. 
		
		// �ν��Ͻ��� ������ �� �� �ִ�.
		// �ν��Ͻ�  = ���� �ڷ��� ����. (���� Ŭ����?)
		// �����ڷ����� ����. 
		ComputerPactori com1 = new ComputerPactori();   //com1�� �ν��Ͻ�
		ComputerPactori com2 = new ComputerPactori();   // new ���ο� �ν��Ͻ��� ����� Ű����
		// �Ȱ��� Ŭ�������� ���� �ν��Ͻ���, �ν��Ͻ����� �ٸ� �ּҸ� ����, ���� ���� ���� �Ҵ� ��.
		
		com1.design = "������";
		com2.design = "������";
		
		System.out.println(com1.design );
		System.out.println(com2.design );
//		System.out.println(com1.design);
//		System.out.println(com1.performance);
//		System.out.println(com1.size);
		
		
		
//		com1.save();
//		com1.load();
//		com1.search();
		
		// ��ü�� �ν��Ͻ��� ����
		// �ڹٿ��� ��ü�� �θ� �� �ִ� �͵��� ������?  => ���α׷��� �� �����ϴ� ���� ��κ��� �͵�	
		// �ν��Ͻ��� Ŭ������ ���� ������� ��ü ��ü���� ���´´�. 
		
		
		// �ν��Ͻ��� Ư¡
		// 1. �ν��Ͻ��� �ϸ� �������� �����Ѵ�. (�ּҷ� �ٶ󺻴�.)
		//    => �ν��Ͻ����� �Ӽ����� �ٸ��� ������ �� ����. 
		// 2. �ν��Ͻ��� ������ ���� ������ �޸� ������ �����Ѵ�. 
		// 3. new Ű���带 / (class ��) ���� ������ ��ü�� �ν��Ͻ��� �θ���. 
		//		-> ��ü�� �޸𸮿� �����ߴ�. 
		
		
		//new / ������ Ÿ��
		// ��ü�� �ν��Ͻ��� �����Ѵ�. 
		// class(new ������)�� ���� ������� ��ü�� �ν��Ͻ� 
		// -> new �����ڿ� ���� �޸𸮿� �Ҵ�� ��ü�� �ν��Ͻ�.		
		// Ŭ������ �ν��Ͻ�ȭ�� ���� ������ ��ü�� �ν��Ͻ��� �Ѵ�.
		//
		
		
		
		
		
	}

}

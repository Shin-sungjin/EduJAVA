package op0108;



public class ConstExam {
	
	// ���� �Ӽ�
	boolean water;   //�ν��Ͻ� ���� || ��� ����
	boolean	life;
	int gravity;
	int humanity;
	String country;
	
	
	
	
	
	ConstExam(boolean water, boolean life, int gravity, int humanity, String country) {
		// this
		// �ڱ� �ڽ��� ����Ű�� ���� ����;
		// ��� �ν��Ͻ� Method�� ���������� ������ ä�� ����. 
		// �ν��Ͻ� �ּ� ��ü�� �����ϰ� ����.
		
		// this�� �ν��Ͻ��� �����ϱ� ���� ���� Ű����. 
		// this�� ���� �ʾƵ� ��� �ν��Ͻ� ������ �ν��Ͻ� ���� 
		// ���� ���� �ȴ�. 
		// but ���������� �ν��Ͻ������� ��Ȯ�ϰ� �����ϱ� ���� this�� ���� �� ���̴�. 
		
		this.water = water;
		this.life = life;
		this.gravity = gravity;
		this.humanity = humanity;
		this.country = country;
//		this(); / this �޼ҵ� 
		// ���� Ŭ���� ������ �ٸ� �����ڸ� ȣ���� �� ����ϴ� �޼���,
		
	}
	
	ConstExam( boolean life, int gravity, int humanity, String country) {
		// this
		// �ڱ� �ڽ��� ����Ű�� ���� ����;
		// ��� �ν��Ͻ� Method�� ���������� ������ ä�� ����. 
		// �ν��Ͻ� �ּ� ��ü�� �����ϰ� ����.
		
		// this�� �ν��Ͻ��� �����ϱ� ���� ���� Ű����. 
		// this�� ���� �ʾƵ� ��� �ν��Ͻ� ������ �ν��Ͻ� ���� 
		// ���� ���� �ȴ�. 
		// but ���������� �ν��Ͻ������� ��Ȯ�ϰ� �����ϱ� ���� this�� ���� �� ���̴�. 		

		this.life = life;
		this.gravity = gravity;
		this.humanity = humanity;
		this.country = country;
//		this(); / this �޼ҵ� 
		// ���� Ŭ���� ������ �ٸ� �����ڸ� ȣ���� �� ����ϴ� �޼���,
		
	}



	public static void main(String[] args) {
		// ������
		// 1. Ư���� Method
		//   - �ν��Ͻ� �ʱ�ȭ Method
		// 2. �ν��Ͻ� ������ �׻� �ʿ��� Method
		
		// �������� Ư¡
		// 1. Ŭ������� �׻� ����
		// 2. �ν��Ͻ� ���� �� �ѹ��� ȣ�� �� 
	
		ConstExam  germany   = new ConstExam(true, true, 10, 8320 , "����" );
		ConstExam  england   = new ConstExam(true, true, 10, 6500 , "�ױ۷���" );
		System.out.print(germany.country);
		System.out.print("\t"+germany.water);
		System.out.print("\t"+germany.life);
		System.out.print("\t"+germany.gravity);
		System.out.println("\t"+germany.humanity);

		
		System.out.print(england.country);
		System.out.print("\t"+england.humanity);
		System.out.print("\t"+england.gravity);
		System.out.print("\t"+england.life);
		System.out.print("\t"+england.water);

	}
}
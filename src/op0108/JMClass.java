package op0108;	


//Object Ŭ���� = > �ڹ��� �ֻ��� Ŭ����, property
// => �ڿ������� ���; ����޼ҵ� 

//�ϳ��� �ν��Ͻ��� �������� ���������� ����Ű�� ���� �󸶵��� ���� 
// ������ �������� �ν��Ͻ��� �ϳ��� ���������� ����Ű�� ���� �Ұ����ϴ�. //�ϳ��� �ν��Ͻ��� �ϳ��� ���� �� 

//��ó�� �Ǳ����� ����??
// �Ǳ� ���� ���ν� �ʱ� ���� ���� 
// ���� ���� 5��ġ Ǯ�� ���� (1���� ����) 
// ���� ��ü�� Ȯ���� ���� �ϰ� ����;
// �Ǳ�� ���, �ʱ�� ª�� 



// class
// object
// ���� class
// ����� ���� class, 


//Ŭ������ Ŭ���� ������ �޼ҵ� ������.  �޼ҵ� ������ Ư¡
//Ŭ���� ���� = �ν��Ͻ��� �������� ��𼭵� ������ �� �� �ִ� Ŭ������;
//  => �޸𸮿� �̹� �Ҵ��� �Ǿ� �ֱ⿡ ����;
//  Ŭ������ �ν��Ͻ� ���� ������ �̸� �غ� �Ǿ�����



public class JMClass {
	
	// �Ӽ�  [��� ����]
	//       => Ŭ���� ���� ����� ����;
	int hp = 100;  // �ν��Ͻ� ����
	int mp; //�ν��Ͻ� ����
	static int age = 20;  //���� ����(Ŭ���� ����) // static => ���� �����ڸ� ���� ���ٸ�, ���� ��𼭵� ������ �� �ִ� ���� 
	double height = 177.3;
	String gender = "��";
	String mbti = "INTJ";
	String bType = "B"; //bType == blood Type;
	boolean weapon = false ;
	boolean gunchim = false ;
	
	
	//�ν��Ͻ��� ����� heap�� �Ҵ� 
	
	
	
	// �ൿ
	public void swingBat() {
		System.out.println("������ �ֵθ���?");
	}
	
	
	//���½ð�
	public void rest() {
		this.mp++;
		smoke();
		sleep();
	}
	
	public void smoke() {
		System.out.println("��������");
	}
	
	public void sleep() {
		System.out.println("gg");
	}
	
	
	
	//���ɽð�
	public void eat() {
		this.hp++;
		System.out.println("nummy");
	}
	
	
	public static void main(String[] args) {
		JMClass jm = new JMClass ();
		JMClass jm2 = new JMClass ();
		//new �����ڷ� JMClass�� jm �ν��Ͻ��� ����� heap�� �Ҵ�
		
		
		
		
		jm.rest();
		
		System.out.println(jm.mp);
		System.out.println(jm2.mp);
	}
}

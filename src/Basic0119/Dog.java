package Basic0119;

//�ָ� ���� 

public class Dog implements Animal {

	private String name;
	private int availableTime;
	 
	Dog(String name, int availableTime) {
		this.name = name;
		this.availableTime = availableTime;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void reserveAppointment(int appointmentTime) {
		// TODO Auto-generated method stub
		//1~24; //�Ҹ��� �迭�� �̿��ص� �� �� ������, ture �� ��  ���༺��, false�� �� ���� ������ ���, 
		// �̷��� �Ǹ� �ߺ� �� ���� ���̽��� �����ϱ� �ʹ� ���� �� ������ 
		// �迭 �ð��� �ε��� ��ȣ�� �����Ѵٰ� ġ��, �ش� �ð��� �ش� �ϴ� �ε��� ���� +1  ��Ű��
		// 1 �̻��� �� �ߺ����� �����ϸ�� ��. 
		
		// ������ �Ұ����� ���̽��� ����, (���� X)
		//������ ���� ��, ������ �Ұ����� ���̽� ( boolean �迭 �̿�)�� �ƴ϶��
		//�Ҹ����� ���� �����ص� �� �� ex) ���ɽð�, ����ð� 
		
		
		
		// �̹� ����� ������� 
		// ���� �迭 [24h] �迭, [0, 0, 0 ... 0] ������ �Ϸ� �ƴٸ��, +1;
		// ���� ����ڰ� �̹� ���� �� �ð��� ���� �Ϸ� �Ѵٸ�, �ش� �ε����� 1�̻��� ��, ������ �߻��ϸ� �� �� ����. 
		// if�������� �� Ȯ���غ��� �� ��
	
		
		
		
		// ���� �� ���̽��� �ɸ��� ������, ����ó�� �Ϸ� �� ��.
		// ���⼭ �ش� �ε��� ++;
		
		
		//�ٵ� �̰� ��� �ٸ� Ŭ������ ���� �ؾ� �ϴ� ��Ұ� �ƴѰ�?
		// �׷��� �ٸ� �����鵵 ������ ���� ��, ���� ���� ���� �� ���ݾ�,
		// �� Ȥ�� hostpital Ŭ�������� �� ���� ������ �ð����� �����صΰ�, 
		// sub���� super�� �����ؼ� Ȯ���ϴ� ����� ���� ������? 
		
	}

	
	
}

package extendOverriding;

public class SSD extends Hdd {
	
	//�θ� Ŭ���� HDD�� ��� ������ �̸��� ������
	// �� ��� ������ ���� �ٸ� �����̴�. (���� �ּҰ� �ٸ��� ����)
	int size;
	int rpm;
	
	SSD(){
		
	}
	
	SSD(int size, int rpm){
		this.size = size;
		this.rpm = rpm;
	}
	
//	@Override  /
//	public void Gunchim() {
//		
//	}
//	�� �޼ҵ�� HDDŬ�������� �������� ����
	
	@Override
	public void serchStat() {
		//�� Ŭ������ HDD���� ����������
		//SSD Ŭ�������� �� ������ ���� ����
		System.out.println(this.size);
		System.out.println(this.rpm);
	}

	
	
}

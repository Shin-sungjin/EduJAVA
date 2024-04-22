package Weekend;

public class Dog implements Animal{
	
	//ȥ�� ���������� �ۼ��غ� �ڵ� 
	
	private String name;
	private boolean[] availableTime = new boolean[24]; //9�ú��� 22�ñ���
	private int[] host_num =new int[24];
	private int host_use;  //�����ð�,
	
	Dog(String name, int host_use) {
		this.name = name;
		this.host_use = host_use;
		
		for(int i = 0 ; i < availableTime.length; i++){
			if(i >= 9 && i <=host_use) {   
				availableTime[i] = true;   //������ ������ �ð�
			}
		}	
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void reserveAppointment(int appointmentTime) throws AppointmentException {
		try {
			if( availableTime[appointmentTime] != true) {
				throw new AppointmentException("������ �Ұ����� �ð��Դϴ�.");
			}
			
			else if( host_num[appointmentTime] != 0) {
				throw new AppointmentException("�̹� ����� �ð��Դϴ�. ");
			}
		
			else {
				host_num[appointmentTime] += 1;
				System.out.println(appointmentTime +"�ÿ� ���� �Ǿ����ϴ�.");
			}
			
		} catch (AppointmentException e) {
				System.out.println(e.getMessage());
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
				System.out.println();
		}
		
	
		
		
		// TODO Auto-generated method stub
		// 1~24; //�Ҹ��� �迭�� �̿��ص� �� �� ������, ture �� ��  ���༺��, false�� �� ���� ������ ���, 
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

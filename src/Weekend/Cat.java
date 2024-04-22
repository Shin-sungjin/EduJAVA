package Weekend;

import java.util.List;
//�� �ù�, �����غ��ϱ�, Map ����ؼ�, �ش� �ð��� �������� �����ϸ� �ƾ��� python ���� �翬�ߴµ�;;
public class Cat implements Animal {
	private String name;
	private List<Integer> availableTime;
	private boolean Ok =false;
	
	
	public Cat(String name, List<Integer> catAvailableTime){
		this.name = name;
		this.availableTime = catAvailableTime;
	}
	
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void reserveAppointment(int appointmentTime) throws AppointmentException  {
		// TODO Auto-generated method s		
		try {
			boolean cheak = false;
			for(int i =0; i < availableTime.size(); i++) {
				if(availableTime.contains(appointmentTime) ) { //������ �������� üũ 
					cheak = true;
				}		
			}
			if(cheak != true) {		//���� ������ �Ұ����� �� ���� �߻� 
				throw new AppointmentException("������ �Ұ����� �ð��Դϴ�.");
			}	//1ȸ�� �ص� �ǳ�??
			
			if(Ok == false) {
				Ok = true;
				System.out.println(appointmentTime +"�ÿ� ������ �Ϸ� �Ǿ����ϴ�.");
				
			}
			else if (Ok != false) {
				throw new AppointmentException("�̹� ����� �ð��Դϴ�. ");
			}
			

			
		
	} catch (AppointmentException e) {
			System.out.println(e.getMessage());
			
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
			System.out.println();
	}
		
	}

}

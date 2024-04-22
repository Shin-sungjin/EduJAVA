package Weekend;

import java.util.List;

public class Bird implements Animal{
	
	private String name;
	private List<Integer> availableTime;
	private boolean Ok =false;
	
	public Bird(String name, List<Integer> birdAvailableTime){
		this.name = name;
		this.availableTime = birdAvailableTime;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void reserveAppointment(int appointmentTime) throws AppointmentException {
		// TODO Auto-generated method stub
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

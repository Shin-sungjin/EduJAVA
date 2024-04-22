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
				if(availableTime.contains(appointmentTime) ) { //예약이 가능한지 체크 
					cheak = true;
				}		
			}
			if(cheak != true) {		//만약 예약이 불가능할 시 예외 발생 
				throw new AppointmentException("예약이 불가능한 시간입니다.");
			}	//1회만 해도 되나??
			
			if(Ok == false) {
				Ok = true;
				System.out.println(appointmentTime +"시에 예약이 완료 되었습니다.");
				
			}
			else if (Ok != false) {
				throw new AppointmentException("이미 예약된 시간입니다. ");
			}
			

			
		
	} catch (AppointmentException e) {
			System.out.println(e.getMessage());
			
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
			System.out.println();
	}
		
	}

}

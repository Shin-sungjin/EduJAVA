package Weekend;

import java.util.List;
//아 시발, 생각해보니까, Map 사용해서, 해당 시간에 벨류값을 조정하면 됐었네 python 때는 당연했는데;;
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

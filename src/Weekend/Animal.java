package Weekend;

public interface Animal {
	//주말과제
	//예외 만들어짐, 메인 찍어짐; 
		String getName();
		void reserveAppointment(int appointmentTime) throws AppointmentException; //예약하려는 시간을 입력 받는 메서드
					//만약 시간이 제대로 입력되지 않을 경우도 고려해주세요 -> int x => Integer로 
		
		
		
	//스토리: 동물 병원 예약 시스템
	//	
	//문제: 동물 병원 예약 시스템을 구현해야 합니다. 
	//다양한 종류의 동물들이 예약 가능한 시간과 예약된 시간을 관리합니다. 
	//동물은 Animal 인터페이스를 구현하여 다양한 종류의 동물 클래스를 만들어야 합니다. 
	//예약 시간이 중복되거나, 예약 가능한 시간이 아닌 경우 예외를 발생시켜야 합니다.
	//
	//요구사항:
	//Animal 인터페이스는 getName() 메서드와 reserveAppointment() 메서드를 가져야 합니다.
	//Animal 인터페이스를 구현하는 Dog, Cat, Bird 클래스를 작성해야 합니다.
	//Dog, Cat, Bird 클래스는 각각 예약 가능한 시간(availableTime)을 가지고 있어야 합니다.
	//reserveAppointment() 메서드는 예약하려는 시간(appointmentTime)을 입력받아 
	//해당 동물이 예약 가능한 시간인지 확인하고, 가능한 경우 예약을 수행합니다.
	//예약 가능한 시간이 아닌 경우 AppointmentException을 발생시켜야 합니다. 
	//이 경우 "해당 시간은 예약이 불가능합니다!"라는 메시지를 포함하여 예외를 처리해야 합니다.
	//예약 시간이 중복되는 경우 AppointmentException을 발생시켜야 합니다. 
	//이 경우 "이미 예약된 시간입니다!"라는 메시지를 포함하여 예외를 처리해야 합니다.
}

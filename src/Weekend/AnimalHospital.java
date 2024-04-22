package Weekend;

import java.util.List;

public class AnimalHospital {
 public static void main(String[] args){
	 List<Integer> catAvailableTime = List.of(10, 11, 12);
	 Animal dog = new Dog("멍멍이", 1);
	 Animal cat = new Cat("야옹이", catAvailableTime);

      List<Integer> birdAvailableTime = List.of(13, 14, 15);
      Animal bird = new Bird("짹짹이", birdAvailableTime);
	 try {
		 dog.reserveAppointment(10);
         cat.reserveAppointment(11);
         bird.reserveAppointment(13);
         bird.reserveAppointment(14);  	//이미 예약된 시간
         dog.reserveAppointment(12); 	//예약 불가능한 시간

		 //결과값 자체는 잘 나왔지만, 13시 예약한 결과, 멤버 변수의 불리안 값이 true로 바뀌어서 이미 예약되었다고 나온 것 같다. 
         //아마 15를 넣어도 예약이 되어있다고 나온다. 
         //dog는 멤버 변수에서 boolean을 이용해 일괄 영업 시간을 지정했다. 
         //영업 시간은 9시부터, 호스트가 지정한 시간까지이다. 
         
	 }
	 catch (AppointmentException e) {
		}
	 catch (Exception e) {
		// TODO: handle exception
	}


 }
}

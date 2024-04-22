package Weekend;

import java.util.List;

public class AnimalHospital {
 public static void main(String[] args){
	 List<Integer> catAvailableTime = List.of(10, 11, 12);
	 Animal dog = new Dog("�۸���", 1);
	 Animal cat = new Cat("�߿���", catAvailableTime);

      List<Integer> birdAvailableTime = List.of(13, 14, 15);
      Animal bird = new Bird("±±��", birdAvailableTime);
	 try {
		 dog.reserveAppointment(10);
         cat.reserveAppointment(11);
         bird.reserveAppointment(13);
         bird.reserveAppointment(14);  	//�̹� ����� �ð�
         dog.reserveAppointment(12); 	//���� �Ұ����� �ð�

		 //����� ��ü�� �� ��������, 13�� ������ ���, ��� ������ �Ҹ��� ���� true�� �ٲ� �̹� ����Ǿ��ٰ� ���� �� ����. 
         //�Ƹ� 15�� �־ ������ �Ǿ��ִٰ� ���´�. 
         //dog�� ��� �������� boolean�� �̿��� �ϰ� ���� �ð��� �����ߴ�. 
         //���� �ð��� 9�ú���, ȣ��Ʈ�� ������ �ð������̴�. 
         
	 }
	 catch (AppointmentException e) {
		}
	 catch (Exception e) {
		// TODO: handle exception
	}


 }
}

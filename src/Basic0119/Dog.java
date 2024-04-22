package Basic0119;

//주말 과제 

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
		//1~24; //불리안 배열을 이용해도 될 것 같은데, ture 일 시  예약성공, false일 시 예약 실패인 경우, 
		// 이렇게 되면 중복 된 예약 케이스를 구현하기 너무 힘들 것 같은데 
		// 배열 시간은 인덱스 번호로 통제한다고 치고, 해당 시간에 해당 하는 인덱스 값을 +1  시키고
		// 1 이상일 땐 중복으로 구현하면될 것. 
		
		// 예약이 불가능한 케이스를 구현, (사유 X)
		//순서로 봤을 때, 예약이 불가능한 케이스 ( boolean 배열 이용)가 아니라면
		//불리안은 직접 설정해도 될 듯 ex) 점심시간, 저녁시간 
		
		
		
		// 이미 예약된 경우인지 
		// 다음 배열 [24h] 배열, [0, 0, 0 ... 0] 예약이 완료 됐다며면, +1;
		// 다음 사용자가 이미 예약 된 시간에 예약 하려 한다면, 해당 인덱스가 1이상일 때, 오류가 발생하면 될 것 같다. 
		// if구문으로 뜯어서 확인해보면 될 것
	
		
		
		
		// 위의 두 케이스에 걸리지 않으면, 예약처리 완료 할 것.
		// 여기서 해당 인덱스 ++;
		
		
		//근데 이건 모든 다른 클래스와 공유 해야 하는 요소가 아닌가?
		// 그래야 다른 동물들도 예약을 했을 때, 같이 공유 받을 수 있잖아,
		// 아 혹시 hostpital 클래스에서 이 예약 가능한 시간들을 구현해두고, 
		// sub에서 super로 접근해서 확인하는 방법도 있지 않을까? 
		
	}

	
	
}

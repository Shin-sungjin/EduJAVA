package basic0118;

public class Info extends Health {
//	  필드명 : double s_weight (표준체중)
//      double fat      (비만도)
//      String result   (결과값)
//생성자 : s_weight = 0.0; (초기화작업)
//      fat = 0.0;
//      result = null;
//메소드 : calculate() - 비만도 계산
//      output2()  - 출력

	double s_weight ;
	double fat;
	String result;

	Info(){
		s_weight = 0.0;
		fat = 0.0;
		result = null;
	}
	//Health 쿨래스의 멤버들 불러옴
//	Info(char c , double d, double w){
//		super();
//	}
	//위 코드는 굳이 안적어도 되는 것 같다. 
	//super method에 대해  조금 더 이해가 필요할 것 같다. 
	
	
	//Info 클래스의 변수값 설정하는 Part
	public void  calculate() {
		//성별에 따라 표준 체중 변화
		if( this.gender == 'm') {
			this.s_weight = (this.tall - 100) * 0.9;
			
		}
		else if(this.gender == 'f') {
			this.s_weight =(this.tall-100) * 0.85;
		}
		
		//비만도 조사
		fat = (this.weight /this.s_weight) * 100;
		
		//비만도에 따라 result값 변환
		//여기를 조금 더 짧게 할 수 있을려나?
		if(fat<=90) {
			result =String.format("당신은 비만도 %.2f이고, 저체중입니다.", fat);
		}
		else if(fat<=110 && fat>90) {
			result =String.format("당신은 비만도 %.2f이고, 정상(표준체중)입니다.", fat);
		}
		else if(fat>110&&fat<=120) {
			result =String.format("당신은 비만도 %.2f이고, 과체중 입니다.", fat);
		}
		else if(fat<=130 && fat>120) {
			result =String.format("당신은 비만도 %.2f이고, 경도비만 입니다.", fat);
		}
		else if(fat<=150&& fat>130) {
			result =String.format("당신은 비만도 %.2f이고, 중도비만 입니다.", fat);
		}
		else  {
			result =String.format("당신은 비만도 %.2f이고, 고도비만 입니다.", fat);
		}

	}
	
	public String output2() {
		
		return result;
	}

}
//당신은 비만도 140.84이고,  중도비만 입니다.
//남성 : 표준체중 = (신장-100)*0.9
//여성 : 표준체중 = (신장-100)*0.85
//
//비만도 = 현재체중(Kg)/표준체중(Kg)*100
//--------------------------------------------------
//90%이하  : 저체중               121-130% : 경도비만
//91 -110% : 정상(표준체중)       131-150% : 중도비만
//111-120% : 과체중               150%     : 고도비만


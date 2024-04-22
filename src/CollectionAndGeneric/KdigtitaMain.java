package CollectionAndGeneric;

import java.util.ArrayList;
import java.util.List;

public class KdigtitaMain {

		public static void main(String[] args) {
			Kdigita3th<String> yuKyung = new Kdigita3th<>(); 
			yuKyung.setT("신유경");
			String name = yuKyung.getT();
			System.out.println(name);
		
			// 데이터의 통일화, 타입 변환제거 및 컴파일 시 예외 발생을 컨트롤 하기 위해 
			// Wrapper 클래스를 활용.
//			Kdigita3th<Integer> gunchim2 = new Kdigita3th<>();
//			gunchim2.setT(972);
//			int val = gunchim2.getT();
//			System.out.println(val);
			
			// 결론적으로 인스터스별로 타입을 구분함. 
			// 컬렉션 프레임 워크시 제네릭이 들어가 있어야 하고, 
			// 유동적인 변화 가능 
			// 인스턴스 별로 가르고, 타입을 그때 그때  변환
			// 조건문을 통해 타입을 따로 설정
			// 조건을 통해, 숫자를 입력해야 할지, 문자를 입력해야 할지 분기점이 생겼을 떄 
			// 유용 
			
			
			Kdigita3th<NamWook> namwook = new Kdigita3th<NamWook>();
			namwook.setT(new NamWook());  //자동박싱
			System.out.println(namwook.getT());
			
			List<TestDTO> list1 = new ArrayList<TestDTO>();
			//DTO 데이터의 통로가 되는 클래스 
			// 제네릭에서는 WrapperClss 가 들어가고, 사용자가 정의한 클래스도 들어갈 수 있어
			
			String test1 = "zzz";
			
		}
		
		
}

package Basic0116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//해당 문제를 코드를 구현하는 것이 어려워서 인터넷을 참고 하여 작성하였습니다. 
// 전체적인 코드 흐름을 명품 자바 해설을 보았고, 
// 중간중간 막히는 부분을 참고하면서 작성하였습니다. 
// 막힌 부분은, getNUm, getInfo, Search 등 구현부 였습니다. 
// 클래스 배열을 생성하는것이 좀 생소하였습니다. 

class SmartPhone{
	private String name;
	private String tel;
	
	public SmartPhone(String name , String tel) {
		this.name =name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}


	public String getTel() {
		return tel;
	}
}

public class PhoneNumList {
	int num;
	String name;
	String tel;
	static SmartPhone[] smart;
	
	
	
	public void getNum() throws IOException {
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		//저장할 사람 수 입력
		System.out.print("인원수 입력>>>");
		num = Integer.parseInt(br.readLine()); //아래 수정 전, for 문이 끊기는 이유는 수정 전 num 이 int num으로 적혀 있어 해당 Method 내에서만 반복 하고 있었습니다.
		//Smart phone 객체 배열 생성
		smart = new SmartPhone[num];  //SmartPhone 배열을 생성한다. 
	}
	
	public void getInfo() throws IOException{
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호를 입력 (빈칸없이 이름과 번호 입력)");
			name = br.readLine();
			tel = br.readLine();
			smart[i] = new SmartPhone(name, tel);	 //여전히 이 부분이 잘 이해가 가지 않습니다. 
													// 아마도, smart[i] 인덱스에 각각 name 인스턴스, tel 인스턴스를 저장하는것 같은데
													//이는 2차원 배열인걸까요,,?
													
		}
		System.out.println("저장 되었습니다.");
	}
	//수정 전. for 반복문이 돌지 않고 바로 저장되어 버리는 문제 발생, 
	//원인은 에상해보건데 num 값이 제대로 전달 되지 않는 것으로 보임
	public void Search() throws IOException {
		
		boolean Ok = false;
		
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("검색할 이름 >>");
			name = br.readLine();
			
			if(name.equals("exit")) {
				break;
			}
			
			for(int i = 0; i < num; i++) {
				if(name.equals(smart[i].getName())) {  //배열에서 getName값을 리턴 받습니다.
					System.out.println(name + "의 전화번호는 " + smart[i].getTel() + "입니다.");//이 구문을 보면 2차원 배열인 것 같다. smart[i] 중의 getTel메소드를 이용하여 tel값 리턴
					Ok = true;
				}

				
			}
			if(Ok == false) {
				System.out.println(name + " 이 존재하지 않습니다. ");
			}
			
			
			
		}
		
	
	
	
	}

	public static void main(String[] args) throws IOException {
		
		PhoneNumList phonelist = new PhoneNumList();
		phonelist.getNum();
		phonelist.getInfo();
		phonelist.Search();
		
	}



}

package ListExam;

import java.util.Stack;
//시작에 앞서 인터넷 코드를 찾아보진 않았고, 
// 기존의 객체지향 review의 형식으로 간단하게 
// 혼자서 웹사이트 주소 이동, 리턴 을 구현해봤습니다.
// 혹시 확인하신다면 피드백 부탁드리겠습니다!


//스택 객체 지향 코드 만들어보기 !!

//우선 개념 정리 부터 시작해봅시다. 

//오늘 강의 내용에서 언급한 Stack에 특징부터 정의를 해보자
// Stack은 후입 선출을 가진다. 

// 후입 선출의 예시를 강의에서 제공한 예시 이외에는 쉽게 떠오르지 않는다. 
// 어떻게 사용해야할지 잘 모르겠다. 

// 강의에서 가장 처음으로 언급한 인터넷 주소, 되돌아가기를 구현해보자, 
// 편의상, 인터넷 주소는 String으로 받는다. 
// 버튼 클릭도 편의상 생략하도록 한다. 
public class StackHomeWork {
	
	//찾아봤는데 
	// heep 영역은 멤버 변수를 선언하는 공간이고
	// stack 영역은 메소드를 선언하는 공간이라는 말이 있다. 
	// 하지만 오늘 과제는 Stack 키워드를 이용하여, 객제지향 코드를 만들어 보라했으니,
	// 적어도 오늘 과제와는 무관해 보인다. 
	
	// 하지만, 위와 같은 구조, 즉, Method를 통해 갑을 차례로 입력받고,
	// 요소를 호출하는 Method는 역순으로 값을 반환하는 형식을 원하는 것 같다. 
	
	// 오늘 Stack 예시로 잠시 살펴본 결과, Stack 자동적으로 대입 순서의 역순으로 결과값을 반환하는 것 같다.

	public static void main(String[] args) {
		URL ul = new URL("naver");
		System.out.println(ul.getUrl());
		ul.setURL("sports");
		System.out.println(ul.getUrl());
		ul.returnURL();
//		System.out.println(ul.getUrl());
		
	}
}

class URL{
	private String url;    //url의 값을 String으로 받는다. 
	private Stack<String> stack = new Stack<String>(); // Stack 컬렉션 프레임워크를 생성한다. 
	//배열로 Stack을 만든다면, 크기가 고정되어 있어, 불편한 점이 있을 것 같아, list로 생성한다. 
	
	URL(String url){   //생성자    ex) naver.com 의 naver 등이 들어올 수 있겠다. 
		this.url = url;  //url 값 초기화 
		this.stack.push(url); //초기화
	}
	// ex) 생성자에 naver가 들어온다면 
	// 첫 스택은 naver 가 되는 것이다. 
	
	public String getUrl() {
		 return this.url;
		 //url을 가지고 오는 Method
	}
	
	public void setURL(String u) {
		this.stack.push("/"+u);  // "/"와 함께 이동하고자 하는 Url을 stack에 push
		int num = stack.indexOf(u);		//해당 위치 값을 지정
		for(int i = 0 ; i<stack.peek().length(); i++) { //가장 마지막에 넣은 URL이 호출된다.
			//가장 마지막에 있는 요소의 값의 길이 만큼 반복
			char ch = stack.peek().charAt(i);
			this.url += ch;
			//url 수정 
		}
	
		
	}
	
	public void returnURL() {
		String rep = this.stack.peek();  //스택의 마지막 값 호출
		int idx = url.indexOf(rep);		//해당 문자열이 어딨는지 호출
		this.stack.pop();  //마지막 값 삭제 // peek로 불러왔던 값
		this.url =this.url.substring(0, idx);  //왜 안잘리지 
		//	substring은 문자열 자체에 대하 변환을 거치지 않고, 스트링 클래스의 새로운 인스턴스를 생성하는 것이므로
		// 꼭 기존 값에 대입이 필요로 하다. 
		System.out.println(this.url);
		
		
		
	}
}

package Basic0119;

abstract class PairMap {

    String keyArray []; //key 들을 저장하는 배열
	String valueArray []; //value 들을 저장하는 배열
	abstract String get(String key); //key 값을 가진 value를 리턴, 없으면 null 리턴
	abstract void put(String key, String value); //key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
	abstract String delete(String key); //key 값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴
	abstract int length(); //현재 저장된 아이템 개수 리턴
}
//위와같은 추상클래스가 있다고 가정했을때 
//위의 추상클래스를 인터페이스로 변경하여 구현하는 Dic 클래스를 작성하고.
//아래의 main 메소드를 활용할수 있는 클래스 DicMain을 작성하세요
// -> 주의사항 : 코드 주석 필수
//public static void main(String[] args) {
//	Dic dic=new Dic(10);
//	dic.put("김코딩", "자바스크립트");
//	dic.put("박코딩", "GoLang");
//	dic.put("조코팅", "python"); 
//	dic.put("김코딩", "JAVA"); //김코딩의 값을 JAVA로 수정
//	System.out.println("김코딩의 값은 "+dic.get("김코딩"));
//	System.out.println("박코딩의 값은 "+dic.get("박코딩"));
//	System.out.println("조코팅의 값은 "+dic.get("조코팅"));
//	dic.delete("박코딩"); //박코딩 아이템 삭제
//	System.out.println("박코딩의 값은 "+dic.get("박코딩")); //삭제된 아이템 접근
//}
//--출력---
//김코딩의 값은 JAVA
//박코딩의 값은 GoLang
//조코팅의 값은 python
//박코딩의 값은 null


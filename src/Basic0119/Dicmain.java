package Basic0119;

public class Dicmain {
	public static void main(String[] args) {
		Dic dic=new Dic();
		dic.put("김코딩", "자바스크립트");
		dic.put("박코딩", "GoLang");
		dic.put("조코팅", "python"); 
		dic.put("김코딩", "JAVA"); //김코딩의 값을 JAVA로 수정
		System.out.println("김코딩의 값은 "+dic.get("김코딩"));
		System.out.println("박코딩의 값은 "+dic.get("박코딩"));
		System.out.println("조코팅의 값은 "+dic.get("조코팅"));
		dic.delete("박코딩"); //박코딩 아이템 삭제
		System.out.println("박`코딩의 값은 "+dic.get("박코딩")); //삭제된 아이템 접근
		
		System.out.println("");
		Dic2 dic2=new Dic2(10);
		dic2.put("김코딩", "자바스크립트");
		dic2.put("박코딩", "GoLang");
		dic2.put("조코팅", "python"); 
		dic2.put("김코딩", "JAVA"); //김코딩의 값을 JAVA로 수정
		System.out.println("김코딩의 값은 "+dic2.get("김코딩"));
		System.out.println("박코딩의 값은 "+dic2.get("박코딩"));
		System.out.println("조코팅의 값은 "+dic2.get("조코팅"));
		dic2.delete("박코딩"); //박코딩 아이템 삭제
		System.out.println("박코딩의 값은 "+dic2.get("박코딩")); //삭제된 아이템 접근
	}
}

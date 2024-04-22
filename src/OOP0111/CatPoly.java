package OOP0111;

import java.awt.List;
import java.util.ArrayList;

public class CatPoly {
	
	protected String color;
	
	public void scertch() {
		System.out.println("할퀴기 공격 긁긁");
	}
	
	public void bite() {
		System.out.println("앙");
	}
	
	public static void main(String[] args) {
		//렉돌은 고양이다.
		CatPoly c1 = new Regdol();
		c1.bite();
		
		// 다형성을 활용하여 인스턴스를 생성 후 
		// 메서드를 호출할 때
		// 오버라이딩 된 메소드는 정상적으로 자식 Method 호출
		// 하지만 자식 메서드를 다이렉트로 호출하는 것은 불가능하다. 
		// c1.eat();
		//((Regdol) c1).eat();
		 
		// 만약 오버라이딩 되지 않은 자식 메서드를 호출할려면
		// 타입 변환(캐스팅)을 통해 맞춘 후 호출 해야 함.
		Regdol letdol =(Regdol) c1;
		
		letdol.eat();
		
		
		
		//코숏은 고양이다. 
		CatPoly c2  = new KoreanShort();
		
		
		 
	}
}

class Regdol extends CatPoly{
	
	@Override
	public void bite() {
		System.out.println("으르릉");
	}
	
	public void eat() {
		System.out.println("난 오늘 부터 고양이가 아니라 돼지여");
	}
}

class KoreanShort extends CatPoly{	
	public void eat() {
		System.out.println(" 못 봤는디....");
	}
	
}
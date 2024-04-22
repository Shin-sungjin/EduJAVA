package basic;

import java.util.Scanner;

public class jaPanGi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 목록(음료수 종류) 확인
		final String[] berverName = {"코카콜라제로", "사이다", "파워에이드", "쿠우"}; 
		// 목록의 금액 (상수 = final) 
		final int[] beverCost = {800, 1500, 2000, 1500};
		// 재고 개수
		int[] beverStock = {5, 2, 0, 3} ;
		// 금액 저장 
		int money = 0 ;
		// 항목 선택 변수 
		int choice = -1;
		
		Scanner sc = new Scanner(System.in);
		
		//금액투입
		money = 4000;
		// 음료 선택
		System.out.println("음료를 선택해주십쇼");
		System.out.println("1.코카제로 2.사이다 3.파워에이드 4.쿠우");
		choice = sc.nextInt();
		System.out.println(berverName[choice - 1]);
		//재고가 있는 경우
		if(beverStock[choice-1] > 0) {
			System.out.println("재고있음");
			if (money >= beverCost[choice -1]) {
				money = money - beverCost[choice - 1];
			    beverStock[choice-1] = beverStock[choice-1] -1;
			}
			else if(money < beverCost[choice -1]) {
				System.out.println("금액이 부족합니다.");
			}
		}
		// -> 돈이 부족한 경우
		// -> 돈이 있는 경우 
		// 		금액 차감 
		// 		재고 차감
		// 		음료 구매 안내 
		//		남은 금액 
		//  	거스름돈 받는 경우 
		//		거르슮돈ㅇ을 반환하지 않는 경우 
		
		//재고가 없는 경우 -> 음료가 없는 경우 프린트 
			else if (beverStock[choice - 1] <= 0) {
				System.out.println("재고 없음");
			}
		
		
	}

}


//1월 부터 12월 중 하나 입력
// 윤달 고려 X



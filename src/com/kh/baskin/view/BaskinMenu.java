package com.kh.baskin.view;

import java.util.Scanner;

import com.kh.baskin.controller.BaskinController;
import com.kh.baskin.model.vo.*;

public class BaskinMenu {
	
	// 필드부
	private BaskinController bc = new BaskinController();
	private Scanner sc = new Scanner(System.in);
	private Baskin b;
	private int[] selectFlavor = new int[6];
	private String[] mySelectFlavor = new String[6];
	
	
	public void mainMenu() {
			
		// 손님 돈 입력 받기
		System.out.println("가진 돈을 입력해주세요.");
		bc.setGuestMoney(sc.nextInt());
		
		// 돈에 따른 주문 메뉴 보여주기
		if(bc.showMenu() == 1) {
			return;
		}
		
		// 아이스크림 정하기
		while(true) {
			System.out.println("1. 파인트");
			System.out.println("2. 쿼터");
			System.out.println("3. 패밀리");
			System.out.println("4. 하프갤론");
			System.out.println("사이즈를 번호로 입력해주세요. >");
			int inputNum = sc.nextInt();
			
			if(inputNum < 1 || inputNum > 4) {
				System.out.println("다시 선택해주세요.");
			} else {
				b = bc.selectIcecream(inputNum);
				break;
	    	}
		}
		
		// 숟가락 개수 정하기
		System.out.println("숟가락 몇 개 필요하세요?");
		bc.setGuestNum(sc.nextInt());
		
		// 맛 정하기
		while(true) {
			
			// 메뉴 선택하기
			for(int i = 0; i < b.getIcecreamNum(); i++) {
				for(int j = 0; j < b.getFlavor().length; j++) {
					// 메뉴 표시
					System.out.println((j + 1) + ". " + b.getFlavor()[j]);
				}
				
				System.out.println("맛을 골라주세요.");
				
				int inputNum = sc.nextInt();
				
				if(inputNum < 1 || inputNum > 10) {
					System.out.println("다시 입력해주세요.");
					continue;
				} else {
					selectFlavor[i] = inputNum - 1;
				}
			}
			
			mySelectFlavor = bc.setFlavor(selectFlavor, b);	
			break;
		}
		
		// 주문 메뉴 확인
		System.out.println("주문하신 " + b.getName() + " 나왔습니다.");
		
		for(int i = 0; i < mySelectFlavor.length; i++) {
			System.out.print(mySelectFlavor[i] + " ");
		}
		
		System.out.println("맞으시죠?");
		System.out.println("숟가락은 " + bc.getGuestNum() + "개 넣어드렸습니다.");
		System.out.println("맛있게 드세요.");
	}
	
}

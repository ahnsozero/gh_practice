package com.kh.baskin.controller;

import com.kh.baskin.model.vo.*;

public class BaskinController {
	
	// 손님 객체 생성
	Guest g = new Guest();
	
    // 손님 돈 입력
    public void setGuestMoney(int money) {
    	g.setMoney(money);
    }   
    
    // 소유한 돈에 맞는 아이스크림 메뉴 출력
    public int showMenu() {
    	// 돈 모자라면 쫓아내기
    	int getOut = 0;
    	
        if(g.getMoney() >= 26500)  {
            System.out.println("하프갤런, 패밀리, 쿼터, 파인트 주문가능합니다!");
        }else if (g.getMoney() >= 22000) {
            System.out.println("패밀리, 쿼터, 파인트 주문가능합니다!");
        }else if (g.getMoney() >= 15500) {
            System.out.println("쿼터, 파인트 주문가능합니다!");
        }else if (g.getMoney() >= 8200) {
            System.out.println("파인트 주문가능합니다!");
        }else {
            System.out.println("돈도 없으면서 무슨... 가서 메로나나 사드시길");
            getOut = 1;
        }
        
        return getOut;
    }
    
    // 아이스크림 메뉴 정하기
    public Baskin selectIcecream(int menuNum) {
    	
    	// 메뉴 번호에 따른 아이스크림 객체 생성
    	if(menuNum == 1) {
    		Baskin p = new Pint();
    		return p;
    	} else if(menuNum == 2) {
    		Baskin q = new Quarter();
    		return q;
    	} else if(menuNum == 3) {
    		Baskin f = new Family();
    		return f;
    	} else if(menuNum == 4) {
    		Baskin h = new HalfGallon();
    		return h;
    	}
    	
    	return null;
    }
    
    // 숟가락 개수 설정하기
    public void setGuestNum(int guestNum) {      
        g.setGuestNum(guestNum);
    }
    
    // 숟가락 개수 가져오기
    public int getGuestNum() {      
        return g.getGuestNum();
    }
    
    // mySelectFlavor 배열에 맛이름 넣기
    public String[] setFlavor(int[] selectFlavor, Baskin b) {
    	String[] mySelectFlavor = new String[b.getIcecreamNum()];
    	
    	for(int i = 0; i < mySelectFlavor.length; i++) {
    		mySelectFlavor[i] = b.getFlavor()[selectFlavor[i]];
    	}
    	
        return mySelectFlavor;
    }
    
}

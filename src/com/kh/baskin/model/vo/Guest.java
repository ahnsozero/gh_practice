package com.kh.baskin.model.vo;

public class Guest {
    
	// 필드부
    private int guestNum;
    private int money;
       
    
    // 생성자부
    public Guest() {
    	
    }
    
    
    // 메소드부
    public int getGuestNum() {
        return guestNum;
    }
    
    public void setGuestNum(int guestNum) {
        this.guestNum = guestNum;
    }
    
    public int getMoney() {
        return money;
    }
    
    public void setMoney(int money) {
        this.money = money;
    }
    
}

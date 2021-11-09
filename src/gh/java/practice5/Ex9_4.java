package gh.java.practice5;

import java.util.Objects;

class Card {
	//필드부
	String kind;
	int number;
	
	//기본 생성자
	Card() {
		this("SPADE", 1);
	}
	// 매개변수를 갖고 있는 생성자
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	// equals()를 오버라이딩하면 haseCode()도 오버라이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind, number); //int hash(가변인자; 매개변수의 개수가 정해져있지 않다.)
	}
		
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj; // 부모타입 오브젝트로 들어온 obj를 자식타입인 (Card)로 강제 형변환 하여 밑에 값 비교
		return this.kind.equals(c.kind) && this.number == c.number;
		
	}
	
	// Object클래스의 toString()을 오버라이딩
	@Override
	public String toString() {
		return "kind:" + kind + ", number:" + number;
	}

}


class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));	
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

	}

}

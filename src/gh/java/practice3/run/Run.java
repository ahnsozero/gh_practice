package gh.java.practice3.run;

import gh.java.practice3.Person;
import gh.java.practice3.Product;

public class Run {
	
	public static void main(String[] args) {
		// Person 이라는 클래스를 통해 객체 생성
		// == 내가 만든 나만의 자료형(1.참조자료형, 2.주소값을 저장, 3.여러개의 자료형의 여러개의 값을 보관 + 기능)
		// == 사용자정의자료형
		
		// 인스턴스화
		Person lee = new Person();// 인스턴스화
		System.out.println(lee.information());
		// 기본값이 들어있음 => 기본형은 0, 0.0, 공백 / 참조형은 null
		
		// 값 대입 => setter
		lee.setID("990928-2222222");
		lee.setName("이선민");
		lee.setGender('F');
		System.out.println(lee.information());
		
		lee.setAge(23);
		lee.setPhone("010-1234-5678");
		lee.setEmail("clear94kr@hanmail.net");
		System.out.println(lee.information());
		
		Product pd = new Product();
		
		pd.setName("아이폰13");
		pd.setPrice(1380000);
		
		System.out.println(pd.information());
		
		pd.setbrand("삼성");
		System.out.println(pd.information());
	}


}

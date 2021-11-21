package sec01.exam01;

public class BoxingUnBoxing {

	public static void main(String[] args) {

		Integer obj1 = new Integer(100); // int 100을 박싱
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");	
		Integer obj4 = Integer.parseInt("300");
		
		
		int value1 = obj1.intValue(); // obj1객체 안에 있는 값을 인트형으로 다시 언박싱
		int value2 = obj2.intValue();
		short value3 = (short)obj3.intValue();
		
		System.out.println(value3);
		
		System.out.println(obj3 == obj4); // 두객체의 주소값을 비교
		System.out.println(obj3.equals(obj4)); // Integer클래스에 객체주소가 아닌, iv 값을 비교하게끔 오버라딩 되어 있어서 true반환
		
		
	}

}

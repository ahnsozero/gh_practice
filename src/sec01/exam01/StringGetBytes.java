package sec01.exam01;

public class StringGetBytes {

	public static void main(String[] args) {

		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes(); // 인코딩 : 문자열을 바이트배열로 변환하겠다.
		
		System.out.println(bytes1);
		System.out.println(bytes1.length);
		
		String str1 = new String(bytes1); // 디코딩 : 바이트배열을 다시 문자열로 변환하겠다.
		
		System.out.println(str1); //디코딩
		System.out.println(str1.length());

	}

}

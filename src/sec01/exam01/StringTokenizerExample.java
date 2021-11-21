package sec01.exam01;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str= "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(str, "/");
		int countTokens = st.countTokens();
		System.out.println(countTokens);
		
		/*
		for(int i = 0; i < countTokens; i++) {
			//String token = st.nextToken();
			System.out.println(st.nextToken());
		}*/
		
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

	}

}

package gh.java.practice_211107;

import java.util.Scanner;

public class Ex7_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찍고싶은 별 갯수를 입력하시오 >> ");
		int starNo = sc.nextInt();
				
//		for(int i = 0; i < starNo; i++) {
//			for(int j = 0; i+1 > j; j++) {
//				System.out.print("*");
//			}System.out.println();
//					
//		}
		
		for(int i=2; i<=9 ; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+ "*" + j +"=" + (i*j));
			}System.out.println();
		}
		
		
		
		
		for(int i = 0; i < starNo; i++) {
			for (int j = starNo; j > i; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}



package gh.java.practice6;
import java.util.Scanner;

public class Upper{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어를 입력하시오(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		for(String s : arr) {
			System.out.print(s.toUpperCase().charAt(0) + s.substring(1) + " ");
		}
							
	}

}

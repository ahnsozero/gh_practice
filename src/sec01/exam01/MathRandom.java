package sec01.exam01;

public class MathRandom {

	public static void main(String[] args) {

		int num = (int)(Math.random()*10) + 1;
		System.out.println(num); // 1 ~ 10까지의 난수		
		
		
		int num2 = (int)(Math.random()*6) + 1;
		System.out.println(num2); // 1 ~ 6까지의 난수

	}

}

package sec01.exam01;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(4,2);
		System.out.println(sb);

	}

}

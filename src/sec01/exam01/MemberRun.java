package sec01.exam01;

public class MemberRun {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");		
		Member obj2 = new Member("blue");
		
		if(obj1.equals(obj2)){
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

	}

}

package gh.java.practice3;

public class Person {
	
	// 사람의 인적정보
	// 주민번호, 이름, 나이, 성별, 휴대폰번호, 이메일주소
	
	// [필드부]
	
	private String id; 
	private String name; 
	private int age;
	private char gender; 
	private String phone;
	private String email;
	
	
	// setter 메소드
	public void setID(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	// getter 메소드
	public String getId() {		
		return this.id;
	}
	
	public String getName() {		 
		return this.name;
	}
	
	public int getAge() {		
		return this.age;
	}
	
	public char getGender() {		
		return this.gender;
	}
	
	public String getPhone() {		 
		return this.phone;
	}
	
	public String getEmail() {		
		return this.email;
	}
	
	
	public String information() {		
		return id + name + "님의 나이는 " + age + "이고" + "성별은" + gender + "입니다. 그리고 폰번호는 " + phone + "이며 이메일은 " + email + "입니다.";
	}

	
	
	
}

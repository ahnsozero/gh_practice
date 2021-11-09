package gh.java.practice_211107;

class Time {
	//필드부
	private int hour;
	private int minute;
	private int second;
	
	//생성자부
	public Time() {}
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;	
	}
	
	
	//메소드부
	// getter, setter
	public int getHour() {
		return hour;		
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;		
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}	
	
}



public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(23);
		System.out.println(t.getHour());
		t.setHour(25);
		System.out.println(t.getHour());
	}

}

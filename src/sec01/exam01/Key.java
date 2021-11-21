package sec01.exam01;

public class Key {
	public int number;
	
	public Key(){}
	public Key(int number){
		this.number = number;
	}
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			return true;
		}
		return false;
	}
	
	
	

}

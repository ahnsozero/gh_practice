package sec05.exam08_objectInputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:\\안소영\\Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("홍길동"));		
		
		
		oos.flush(); oos.close(); fos.close();
		
		
		FileInputStream fis = new FileInputStream("D:\\안소영\\Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj = (Integer)ois.readObject(); // readObject()가 Object타입으로 반환되어 나오기때문에 (Integer)로 형변환해줘야한다.
		Double obj2 = (Double)ois.readObject();
		int[] obj3 = (int [])ois.readObject();
		String obj4 = (String)ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3[0] +","+ obj3[1] +","+ obj3[2] );
		System.out.println(obj4);
		

	}

}

package sec02.exam03__reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("test.txt");
		int readCharNo;
		
		char[] cArr = new char[2]; 
		String data = "";
		while((readCharNo = reader.read(cArr)) != -1) {
			System.out.println(readCharNo);
			data += new String(cArr, 0, readCharNo);
			
			System.out.println(data);
		}
		
		System.out.println(data);
		reader.close();

	}

}

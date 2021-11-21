package sec02.exam03_reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("D:\\안소영\\test.txt");
		
		int readData;
		while((readData = reader.read()) != -1) {
			System.out.print((char)readData);
		}
		reader.close();
		Integer i = Integer.valueOf("100");
		int num = i.intValue();
		System.out.println(num);
		
	}

}

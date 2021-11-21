package sec02.exam03__reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		Reader reader = null;
		
			reader = new FileReader("test.txt");
			/*
			int readData;			
			while((readData = reader.read()) != -1) {
				System.out.print((char)readData);			
			}		*/
		
		
			
		
		int readData1;
		while(true) {
			readData1 =  reader.read();
			if(readData1 == -1) break;
			System.out.print(readData1);
		}
		
		reader.close();
	
	}
}	

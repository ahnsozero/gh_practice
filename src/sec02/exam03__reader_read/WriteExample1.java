package sec02.exam03__reader_read;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("test.txt");
		char[] data = "안소영".toCharArray();
		for(int i = 0; i < data.length ; i++) {
			writer.write(data[i]);
		}
		writer.flush();		
		writer.close();
		
		
		/*char[] data1 = "이준호".toCharArray();
		writer.write(data1);*/
		
		} 
		
	}



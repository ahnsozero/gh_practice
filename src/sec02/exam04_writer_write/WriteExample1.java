package sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("D:\\안소영\\test.txt");
		
		char[] data = "홍길동".toCharArray();
		for(int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();

	}

}

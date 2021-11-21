package sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("D:\\안소영\\test.txt");
		
		char[] data = "홍길동".toCharArray();
		
		writer.write(data);
		
		writer.flush();
		writer.close();

	}

}

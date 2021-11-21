package sec02.exam03__reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("test.txt");
		int readCharNo;
		char[] cArr = new char[4];
		readCharNo = reader.read(cArr, 1, 2);
		for(int i = 0; i < cArr.length ; i++) {
			System.out.println(cArr[i]);
		}
		reader.close();
	}

}

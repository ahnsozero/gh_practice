package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("D:\\aaa\\test.txt");//abcde, 1바이트의 문자 5개가 저장되어있다.
		int readByteNo;
		byte[] readBytes = new byte[3];	// 3칸짜리 바이트배열 선언	
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();

	}

}

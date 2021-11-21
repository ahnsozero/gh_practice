package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("D:\\aaa\\test.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break; // 더이상 읽을 데이터가 없다면 -1을 반환하기 때문에 -1이 되면 와일문은 멈춘다.
			System.out.println((char)readByte);
		}
		is.close();
	} 

}

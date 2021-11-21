package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("D:\\aaa\\test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8]; //byte[] 8칸짜리 선언
		readByteNo = is.read(readBytes, 2, 3);// 인덱스 2부터 3개까지 읽어와서 읽어 온 수반환
		for(int i = 0; i < readBytes.length; i++) {
			System.out.println(readBytes[i]); // 각 byte[]에 저장된 인덱스 출력
		}
		is.close();

	}

}

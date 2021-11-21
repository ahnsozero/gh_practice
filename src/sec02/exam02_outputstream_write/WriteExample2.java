package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("D:\\안소영\\test.txt");
		
		byte[] data = "ABC".getBytes(); // 문자열 "ABC"를 byte[]배열에 저장
		os.write(data); // D:\\안소영\\test.txt 에 ABC 1byte씩 출력됨
		os.flush(); // 버퍼가 풀로 차있지 않으면 출력되지 않기때문에
					// 강제적으로 잔류 버퍼를 출력해서 버퍼를 완전히 비워주는 메소드
		os.close();
	}

}

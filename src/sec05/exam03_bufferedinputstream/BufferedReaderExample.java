package sec05.exam03_bufferedinputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is); //보조장치
		BufferedReader br = new BufferedReader(reader); // 보조장치
		
		System.out.print("입력 : ");
		String lineString = br.readLine();// 한줄 전체를 읽으려고 많이들 사용
		System.out.println("출력 : " + lineString);

		br.close();
		reader.close();
		is.close();
	}
	

}

package sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws IOException {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("D:\\안소영\\유미.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}		
		end = System.currentTimeMillis();
		
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();
		
		
		
		
		FileInputStream fis2 = new FileInputStream("D:\\안소영\\유미.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}		
		end = System.currentTimeMillis();
		
		System.out.println("사용했을 때: " + (end-start) + "ms");
		bis.close();
		fis2.close(); // 버퍼를 사용했을 때 데이터를 훨씬 더 빨리 읽는다.

	}

}

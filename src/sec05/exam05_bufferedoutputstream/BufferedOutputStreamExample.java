package sec05.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("D:\\안소영\\유미.jpg");
		bis = new BufferedInputStream(fis); // 위의 FileInputStream을 보조 버퍼스트림 오픈
		fos = new FileOutputStream("D:\\안소영\\유미.jpg"); //요건 출력하는 스트림
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("사용했을 때 : " + (end-start) + "ms");
	}

}

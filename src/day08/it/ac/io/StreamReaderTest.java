package day08.it.ac.io;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StreamReaderTest {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			
			in = new FileInputStream("sample.txt");
			// 설정 encoding 은 파일의 encoding 과 동일한 것을 사용해야한다.
			is = new InputStreamReader(in, "UTF-8");
			
			int read = 0;
			
			// do-while 대신 while( (read = is.read()) != -1 ){} 도 사용가능.
			do {
				read = is.read();
				System.out.print((char)read);
			} while( read != -1);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				
				if(is != null) {
					is.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

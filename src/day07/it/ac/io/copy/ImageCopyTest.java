package day07.it.ac.io.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopyTest {

	public static void main(String[] args) {

		FileInputStream in = null;
		FileOutputStream out = null;
		
		byte[] buffer = new byte[1024];
		
		try {
			
			in = new FileInputStream("test2.jpg");
			out = new FileOutputStream("test2_copy.jpg", false); // 새로 쓰기	
			int read = 0;
			
			while( (read = in.read(buffer) ) != -1) {
				// 읽은 것을 다시 쓴다
				out.write(buffer, 0, read);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(in != null) {
					in.close();
				}
				
				if(out != null) {
					out.close();
				}
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

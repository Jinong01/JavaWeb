package day07.it.ac.io;

import java.io.File;
import java.io.FileInputStream;

public class ImageInputTest02 {
	
	public static void main(String[] args) {
		
		// 파일을 읽어서 출력해보자
		File f = new File("test2.jpg");
		FileInputStream in = null;
		int read = 0;
		try {
			in = new FileInputStream(f);
			int size = 1024 < in.available() ? in.available() : 1024;
			byte[] buffer = new byte[100];
			long start = System.currentTimeMillis();
			
			// 파일을 읽어봅시다, - while
			while((read = in.read(buffer)) != -1); {
				
				read = in.read(buffer);
					
			} 
			
			long term = System.currentTimeMillis() - start;
			double time = term ;
			System.out.println("걸린 시간 : " + time + " m/s");
			
		} catch (Exception e) {
			e.printStackTrace(); // 모든 예외 발생을 쫓아서 출력
		} finally {
			try {
				// 예외 발생 유무와 상관없이 실행됨
				if(in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace(); // 모든 예외 발생을 쫓아서 출력
			}
		}
	}
}

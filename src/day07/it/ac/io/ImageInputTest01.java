package day07.it.ac.io;

import java.io.File;
import java.io.FileInputStream;

public class ImageInputTest01 {
	
	public static void main(String[] args) {
		
		// 파일을 읽어서 출력해보자
		File f = new File("test2.jpg");
		FileInputStream in = null;
		int read = 0;
		try {
			in = new FileInputStream(f);
			
			long start = System.currentTimeMillis();
			
			// 파일을 읽어봅시다, - while
			do {
				
				read = in.read();
					
			} while(read != -1);
			
			long term = System.currentTimeMillis() - start;
			double time = term / 1000;
			System.out.println("걸린 시간 : " + time + " 초");
			
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

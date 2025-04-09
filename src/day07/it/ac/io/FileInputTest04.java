package day07.it.ac.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileInputTest04 {
	
	public static void main(String[] args) {
		
		// 파일을 읽어서 출력해보자
		File f = new File("example.txt");
		FileInputStream in = null;
		BufferedInputStream bf = null;
		int read = 0;
		try {
			in = new FileInputStream(f);
			bf = new BufferedInputStream(in);
			
			// 파일을 읽어봅시다, - while
			do {
				
				read = bf.read();
				System.out.print((char)read);
					
			} while(read != -1);
			
		} catch (Exception e) {
			e.printStackTrace(); // 모든 예외 발생을 쫓아서 출력
		} finally {
			try {
				// 예외 발생 유무와 상관없이 실행됨
				if(bf != null) {
					bf.close();
				}
				
				if(in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace(); // 모든 예외 발생을 쫓아서 출력
			}
		}
	}
}

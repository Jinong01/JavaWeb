package day07.it.ac.reader;

import java.io.FileReader;

public class FileReaderTest01 {
	public static void main(String[] args) {
	
		FileReader reader = null;
		
		int read = 0;
		
		try {
			
			reader = new FileReader("example.txt");
			
			while( (read = reader.read()) != -1) {
				// reader 는 char 기준, stream 은 byte
				System.out.print((char)read);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

package day08.it.ac.io;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class StreamWriterTest {

	public static void main(String[] args) {

		FileOutputStream out = null;
		OutputStreamWriter ow = null;
		
		String[] strArr = {"안녕안녕", "hihi"};
		
		try {
			
			out = new FileOutputStream("sampleWriter.txt");
			ow = new OutputStreamWriter(out, "UTF-8");
					
			System.out.println("====== 파일 쓰기 시작 ======");
			for(String str : strArr) {
				ow.write(str + "\n");
			}
			
			System.out.println("====== 파일 쓰기 종료 ======");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(ow != null) {
					ow.close();
				}
				if(out != null) {
					out.close();
				}
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

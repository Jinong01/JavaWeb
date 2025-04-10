package day08.it.ac.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class WiterFileTest {

	public static void main(String[] args) {
		
		InputStreamReader is= null;
		BufferedReader br = null;
		FileWriter fw = null;
		
		try {
			
			is = new InputStreamReader(System.in);
			br = new BufferedReader(is);
			fw = new FileWriter("output.txt");
			// FileWriter 는 OutputStream 과 같지만 Output 은 바이트 단위로 받고 FileWriter 는 문자,문자열 단위로 받는다
			
			String input = "";
			
			while(true) {
				System.out.println("입력 : ");
				input = br.readLine();
				if(input.equals("!")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				fw.write(input + "\n");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(fw != null) {
					fw.close();
				}
				if(br != null) {
					br.close();
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

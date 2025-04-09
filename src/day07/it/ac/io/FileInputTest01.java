package day07.it.ac.io;

import java.io.File;

public class FileInputTest01 {
	public static void main(String[] args) {
		
		File f = new File("example.txt");
		
		System.out.println(f.exists()); // 존재여부
		System.out.println(f.getName()); // 파일이름
		System.out.println(f.getAbsolutePath()); // 절대경로
		System.out.println(f.getPath()); // 상대경로
		System.out.println(f.isFile()); // 너 파일이니?
		System.out.println(f.isDirectory()); // 너 폴더니?
		System.out.println(f.length() + " byte"); // 크기
	}
}

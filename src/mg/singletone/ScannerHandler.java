package it.mg.singletone;

import java.util.Scanner;

public class ScannerHandler {
	
	private static Scanner scan;
	
	// 생성자로 객체를 만들지 못하도록 private 선언
	private ScannerHandler() {}
	
	// 스캐너 객체 얻어오기
	public static Scanner getInstance() {
		// 객체가 존재하지 않을떄만 새로 만들고 있으면 그대로 리턴
		if(scan == null) {
			getScanner();
		}
		
		return scan;
	}
	
	private static void getScanner() {
		scan = new Scanner(System.in);
	}
	
	public static void close() {
		if(scan != null) {
			scan = null;
		}
	}
}

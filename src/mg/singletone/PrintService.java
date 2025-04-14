package it.mg.singletone;

import java.util.Scanner;

public class PrintService {

	private Scanner scan;
	
	public void print() {
		scan = ScannerHandler.getInstance();
		System.out.println("값을 입력 : ");
		String str = scan.next();
		System.out.println(str);
		ScannerHandler.close();

	}
}

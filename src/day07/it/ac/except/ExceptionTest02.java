package day07.it.ac.except;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			
			try {
				System.out.println((i+1) + "번째 수 : ");
				list.add(scan.nextInt());
			} catch(Exception e) {
				i--;
				
				// 문자열 입력 대기 메서드
				// 메모리에 내용이 있으면 해당 내용을 사용하고 메모리를 지운다.
				scan.nextLine();
				System.out.println("오류!");
			}
		}
				
		scan.close();
		System.out.println("입력 값 : " + list);
	}
}
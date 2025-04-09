package day07.it.ac.except;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest03 {
	
	public static int insertData(Scanner scan) throws InputMismatchException{
		System.out.println("값을 입력하세요 : ");
		int num = scan.nextInt();
		return num;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			
			try {
				
				// 예외 던지기가 설정된 메서드를 호출 할 때는
				// 호출하는 쪽에서 try-catch 로 감싸거나 동일하게 던지기를 설정해줘야한다.
				// 던지기가 된 메서드의 예외를 처리해줄 곳이 필요
				int num = insertData(scan);
				list.add(num);
				
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

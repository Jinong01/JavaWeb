package day07.it.ac.except;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		int num = 10;
		int result = 0;
		try {
			result = num / 0;
			System.out.println(" 10 / 0 = " + result);
			
		} catch(ArithmeticException e) {
			System.out.println("정수는 0으로 나눌 수 없습니다.");
		}
		
		System.out.println("====== 종료 ======");
	}
}

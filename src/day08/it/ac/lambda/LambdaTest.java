package day08.it.ac.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		
		char[] arr = {'I','L','O','V','E','Y','O','U'};

		// {} 안에 return 한 줄만 존재하면 {}와 return 생략 가능
		MakeFunc mf = chArr -> String.valueOf(chArr);
		
		System.out.println(mf.getString(arr));
		
		
	}
	
}

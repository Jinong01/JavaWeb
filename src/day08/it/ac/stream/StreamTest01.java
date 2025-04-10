package day08.it.ac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamTest01 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			list.add(rand.nextInt(50) + 1);
		}
		
		System.out.println(list);
		
		// 짝수 모읍집
		List<Integer> even = list.stream().filter( (obj) -> obj%2 == 0 ).toList();
				
		System.out.println(even);
		
		// 전체 합 > reduce(초기값, -> )
		int sum = list.stream().reduce(0, (a,b) -> a+b );
		
		System.out.println(sum);
		
		// 숫자 합 2
		int result = list.stream().mapToInt( obj -> obj.intValue() ).sum();
		// int result = list.stream().mapToInt( Integer :: intValue() ).sum(); > obj 자기자신을 .intValue 할때는 이렇게 사용가능
		System.out.println(result);
		
		// 짝수 합
		int sum1 = list.stream()
				.filter((obj) -> obj % 2 == 0)
				.reduce(0, (a,b) -> a+b);
		
		System.out.println(sum1);
	}

}

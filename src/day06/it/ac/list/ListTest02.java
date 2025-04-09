package day06.it.ac.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest02 {
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			int val = rand.nextInt(50) + 1; // 0 <= x < 값
			list.add(val);
		}
		
		System.out.println("정렬 전 : " + list);
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println("오름 정렬 후 : " + list);
		
		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("내림 정렬 후 : " + list);
		
		
		
	}
}


// 인터페이스 > 다중 상속
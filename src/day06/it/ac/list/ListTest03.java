package day06.it.ac.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListTest03 {

	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
		
//		Random rand = new Random();
//		for(int i = 0; i < 10; i++) {
//			int val = rand.nextInt(100) +1;
//			list.add(val);
//		}
//		
//		System.out.println("정렬 전 : " + list);
//		
//		
//		Collections.sort(list);
//		System.out.println("정렬 후 : " + list);
//		
//		// 최대/최소 > 정렬하고 양끝 index 번째 숫자들
//		System.out.println(list.get(0));
//		System.out.println(list.get(list.size()-1));
//		
//		// 최대/최소 > 이건 정렬안하고 해도 됨
//		System.out.println(Collections.min(list));
//		System.out.println(Collections.max(list));
//		
		
		List<Integer> list = new ArrayList<>();
		
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			int val = rand.nextInt(50) + 1; // 0 <= x < 값
			// 중복 없이 > contains list 안에 동일한 val 값이 있는지
			if(list.contains(val)) {
				i--;
				continue;
			}
			list.add(val);
		}
		
		System.out.println(list);
		
	}
}


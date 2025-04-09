package day06.it.ac.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		 
		List<Integer> list = new ArrayList<>();
		
		// 등록1 - add(값);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// 등록2 - add(index, 값);
		// index 는 연속적이여야한다 list 에 값이 2개 들었다면 index 1
		// 마지막 index 가 1 일 때, add(3,10) 불가능 index 는 연속성이 있어야함
		// 만약 지정한 index 에 이미 값이 있다면 기존값이 뒤로 밀리고 삽입됨.
		list.add(5,10);
		
		// 치환 -> 현재 위치의 값을 변경 set (index, value);
		list.set(1, 7);
		
		// 삭제 - remove(index);
		// 전체삭제 -> clear();
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		// 출력1
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===========================================");
		// 출력2 -> 향상된 for 문 또는 forEach 문
		// 배열, list 계열만 사용가능
		for(int val : list) {
			System.out.println(val);
		}
		
		System.out.println("===========================================");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			// 현재 값을 추출하고 다음으로 이동
			System.out.println(iter.next());
		}
		
		
	}
}

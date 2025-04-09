package day06.it.ac.equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
객체의 동일 비교 할때는 2개의 메서드가 사용된다.
하나는 int hashCode();
다른 하나는 equals() 메서드가 실행됨
hahCode 가 다르다면 ? -> 그냥 다른 객체
hashCode 가 동일하다면 ? -> equals() 로 값을 비교 -> 동일하다면 같은 객체

Set >> Sorted Set 정렬되어있음
	HashSet()
		데이터를 hashing 기법을 이용하여 저장한다.
		hashing 기법이란? Map 에 들어오는 데이터의 hashCode 값을 비교하여 데이터의 중복여부를 판단하고, 저장하는 것
	LinkedHashSet()
*/

public class CompareObjectTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId("admin");
		p1.setName("관리자");
		
		Person p2 = new Person();
		p2.setId("admin");
		p2.setName("관리자");
		
		Person p3 = new Person();
		p3.setId("admin2");
		p3.setName("관리자2");
		
		List<Person> people = new ArrayList<>();
		people.add(p1);
		
		// list 는 contains 하면 hashCode는 비교하지않고 equals 로만 비교한다
		if(people.contains(p2)) {
			System.out.println("동일!");
		}
		
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set);
		System.out.println(set.size());

		
	}
}


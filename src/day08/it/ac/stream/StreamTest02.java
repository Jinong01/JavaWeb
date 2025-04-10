package day08.it.ac.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamTest02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Student> stList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			Student st = new Student();
		
			System.out.println("반 : ");
			st.setBan(scan.next());
			
			System.out.println("이름 : ");
			st.setMyName(scan.next());
			
			System.out.println("점수 : ");
			st.setScore(scan.nextInt());
			
			stList.add(st);
		}
		
		// 반 별로 묶기
		Map<String, List<Student>> groupBan = 
				// Student 의 클래스의 getBan 의 결과로 다시 grouping 한다 
				stList.stream().collect(Collectors.groupingBy(Student::getBan));
		
		// 출력
		groupBan.forEach( (ban, list) -> System.out.println(ban + ":" + list) );
		
		// 오름차순
		stList.stream()
		.sorted(Comparator.comparing(Student::getScore)) // comparing sort 하는 대상
		.forEach(System.out::println);
		
		// 내림차순
		stList.stream()
		.sorted(Comparator.comparing(Student::getScore).reversed())
		.forEach(System.out::println);
		
		// 스캐너 닫기
		scan.close();
	}

}

package day09.it.ac.time;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CancellationException;
import java.util.stream.Collectors;

import javax.sql.StatementEventListener;

public class StudentTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		System.out.println("몇명 학생 ? ");
		
		count = scan.nextInt();
			
		
		
		
		List<Student> list = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			Student st = new Student();
			
			System.out.println("이름 : ");
			st.setName(scan.next()); 
			System.out.println("점수 : ");
			st.setScore(scan.nextInt());
			
			list.add(st);
		}
		
		// 뒤에 forEach () 안에 내용은 찾아봤음
		list.stream().sorted(Comparator.comparing(Student :: getScore).reversed()).forEach(System.out :: println);
		
		list = list.stream().sorted(Comparator.comparing(Student :: getScore).reversed()).collect(Collectors.toList());
		list = list.stream().sorted(Comparator.comparing(Student :: getScore).reversed()).toList();

		System.out.println(list);
	
		scan.close();
	}

}

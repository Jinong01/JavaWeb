package day06.it.ac.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CompareMain {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in); // in 은 input 의 약자
	
		for(int i = 0; i < 3; i++){
			Student st = new Student();
			System.out.println((i+1)+"번 학생 이름 : ");
			st.setName(scan.next());
			System.out.println((i+1)+"번 학생 점수 : ");
			st.setScore(scan.nextInt());
			
			list.add(st);
		}
		
		scan.close();
		
		// 정렬
		Collections.sort(list);
		System.out.println(list);
	}
}

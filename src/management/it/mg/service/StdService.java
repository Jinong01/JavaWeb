package management.it.mg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import management.it.mg.store.FileStore;
import management.it.mg.vo.Student;

public class StdService {

	private Scanner scan;
	private List<Student> list;
	
	public StdService() {
		scan = new Scanner(System.in);
		this.init();
	}
	
	public void init() {
		list = new ArrayList<Student>();
		if(FileStore.isExistFile()) {
			list = FileStore.allStudent();
		}
	}
	
	public void start() {
		
		while(true) {
			try {
				
				this.menu();
				int menuNum = scan.nextInt();
				
				switch(menuNum) {
					case 1:
						addStudent();
						break;
					case 2:
						updateStudent();
						break;
					case 3:
						searchStudent();
						break;
					case 4:
						printAllStudent();
						break;
					case 5:
						// 시스템 강제 종료
						System.exit(0);
						break;
					default :
						System.out.println("없는 메뉴 입니다.");
				}
				
			} catch(Exception e) {
				System.out.println("입력이 잘 못 되었습니다.");
				scan.nextLine();
			}
			
		}
	}

	// 학생 등록
	private void addStudent() throws Exception{
		Student newBe = new Student();
		System.out.println("학생 이름 : ");
		newBe.setMyName(scan.next());
		System.out.println("학생 점수 : ");
		newBe.setScore(scan.nextInt());
		
		FileStore.addStudent(newBe);
		list.add(newBe);
		
		System.out.println("========== 학생정보가 등록되었습니다. ==========");
	}	
	
	// 학생 수정
	private void updateStudent() throws Exception {
		System.out.println("수정할 학생 이름 : ");
		String myName = scan.next();
		Student st = this.getStudent(myName);
		
		if(st == null) {
			System.out.println("해당 학생이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("변경할 점수 입력 : ");
		st.setScore(scan.nextInt());
		
		FileStore.updateStudent(list);
		System.out.println("========== 학생정보가 수정되었습니다. ==========");
	}
	
	// 학생 검색
	private void searchStudent() throws Exception{
		System.out.println("검색할 학생 이름 : ");
		String myName = scan.next();
		Student st = this.getStudent(myName);
		
		if(st == null) {
			System.out.println("해당 학생이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("이름 : " + st.getMyName() + ", 점수 : " + st.getScore());
	}
	
	// 학생 전체 출력
	private void printAllStudent() {
		if(list.size() == 0) {
			System.out.println("출력할 학생이 없습니다.");
			return;
		}
		
		for(Student st : list) {
			System.out.println("이름 : " + st.getMyName() + ", 점수 : " + st.getScore());
		}
	}
	
	// 학생이름으로 학생 존재 여부 
	public Student getStudent(String myName) throws Exception{
		/*
		 * Optional > get 		   ==> Student
		 * 			> orElse(null) ==> 객체가 없으면 null 반환
		 * 			> orThrow	   ==>
		 * */
		Student st = list.stream().filter(obj -> obj.getMyName().equals(myName))
				.findAny().orElse(null);
		
		return st;
	}
	
	public void menu() {
		System.out.println("=======================================");
		System.out.println("             학생 관리 프로그램             ");
		System.out.println("=======================================");
		System.out.println("==== 1.등록 2.수정 3.검색 4.전체출력 5.종료 ===");
	}
}

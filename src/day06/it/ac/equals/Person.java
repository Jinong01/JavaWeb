package day06.it.ac.equals;

import it.ac.list.Student;

public class Person {

	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// hashCode 오버라이딩
	public int hashCode() {
		System.out.println("===== 해시코드 비교 실행 =====");
		return id.hashCode();
	}
	
	public boolean equals(Object obj) {
		System.out.println("===== 값 비교 실행 =====");
		if(obj == null) {
			return false;
		}
		
		Person compare = (Person)obj;
		
		return this.getName().equals(compare.getName());
	}
}


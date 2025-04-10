package day08.it.ac.serial;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1956319229125975511L;
	private String myName;
	private String gender;
	
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("이름 : ").append(this.getMyName());
		sb.append(", 성별 : ").append(this.getGender());
		
		return sb.toString();
	}
	
	
}

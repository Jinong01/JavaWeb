package task.dto;

public class Member {

	private int num;
	private String name;
	private String depart;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("사번 : ").append(this.getNum());
		sb.append(", 부서 : ").append(this.getDepart());
		sb.append(", 이름 : ").append(this.getName());
		
		return sb.toString();
	}
	
	
	
}

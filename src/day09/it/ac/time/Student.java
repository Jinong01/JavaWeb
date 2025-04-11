package day09.it.ac.time;

public class Student {
	
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("이름 : ").append(this.getName());
		sb.append(", 점수 : ").append(this.getScore());
		
		return sb.toString();
	}
	
	
	
}

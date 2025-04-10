package day08.it.ac.stream;

public class Student {
	
	private String myName;
	private String ban;
	private int score;
	
	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public String getBan() {
		return ban;
	}
	
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("이름 : ").append(this.getMyName());
		sb.append(", 반 : ").append(this.getBan());
		sb.append(", 점수 : ").append(this.getScore());
		return sb.toString();
	}

    
}

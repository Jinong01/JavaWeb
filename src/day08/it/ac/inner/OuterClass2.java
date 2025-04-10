package day08.it.ac.inner;

public class OuterClass2 {

	private String myName;
	
	public static class Read{
		
		// static 클래스는 멤버 변수나 메서드 사용부ㄲ==ㅏ
//		public String getContents() {
//			return contens;
		
		private String myName;
		
		public String getMyName() {
			return myName;
		}
		
		public void setMyName(String myName) {
			this.myName = myName;
		}
	}
	
	public static void main(String[] args) {
		
		Read read = new Read();
		read.setMyName("고소미");
		System.out.println(read.getMyName());
	}
}
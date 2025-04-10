package day08.it.ac.inner;

public class OuterClass1 {

	private String myName;
	
	// 외부클래스의 변수나 메서드 사용 가능
	public class Inner{
		
		String innerName = "aa";
		
		public String getInnerName() {
			return innerName;
		}
	}
	
	public static void main(String[] args) {
		OuterClass1 outer = new OuterClass1();
		Inner in = outer.new Inner();
		
		System.out.println(in.getInnerName());
	}
}

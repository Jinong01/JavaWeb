package day06.it.ac.generic;

public class GenericMain {
	
	public static void main(String[] args) {
		
		Box<Integer> numBox = new Box<>();
		
		numBox.add(1);
		numBox.add(2);
		numBox.add(3);
		numBox.add(4);
		
		for(int i = 0; i < numBox.size(); i++) {
			System.out.println(numBox.get(i));
		}
		
		// 제네릭을 통해서 저장할 데이터를 선택할 수 있다
		Box<Double> numBox2 = new Box<>();
		numBox2.add(30.22);
		numBox2.add(10.31);
		numBox2.add(20.11);
		
		for(int i = 0; i < numBox2.size(); i++) {
			System.out.println(numBox2.get(i));
		}

	}
	
}


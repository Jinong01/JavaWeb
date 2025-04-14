package it.mg.builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		Car car = Car.builder().myName("싼타페").price("4000만원").oil("디젤").build();
		
		System.out.println(car);
	}
}

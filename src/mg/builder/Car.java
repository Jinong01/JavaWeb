package it.mg.builder;

public class Car {
	
	private String myName;
	private String price;
	private String oil;
	
	private Car(Builder builder) {
		this.myName = builder.myName;
		this.price = builder.price;
		this.oil = builder.oil;
	}
	
	public String getMyName() {
		return myName;
	}
	
	public String getPrice() {
		return price;
	}
	
	public String getOil() {
		return oil;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("이름 : " + this.getMyName() + ", ");
		sb.append("가격 : " + this.getPrice() + ", ");
		sb.append("오일 : " + this.getOil());
		
		return sb.toString();
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder{
		
		private String myName;
		private String price;
		private String oil;
		
		public Car build() {
			return new Car(this);
		}
		
		public Builder myName(String myName) {
			this.myName = myName;
			return this;
		}
		
		public Builder oil(String oil) {
			this.oil = oil;
			return this;
		}
		
		public Builder price(String price) {
			this.price = price;
			return this;
		}
		
	}
}

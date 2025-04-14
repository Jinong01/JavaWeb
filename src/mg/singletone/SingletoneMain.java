package it.mg.singletone;

public class SingletoneMain {

	public static void main(String[] args) {
		
		StdService st = new StdService();
		st.print();
		
		PrintService pt = new PrintService();
		pt.print();
	}
}

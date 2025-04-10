package day08.it.ac.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialTest02 {
	public static void main(String[] args) {
		
		try(FileInputStream in = new FileInputStream("object.dat");
				ObjectInputStream op = new ObjectInputStream(in)){
			
			while(in.available() != 0) {
				Student st = (Student)op.readObject();
				System.out.println(st);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

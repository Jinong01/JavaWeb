package day08.it.ac.serial;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialTest01 {

	public static void main(String[] args) {
		
		// 단점 - Object 하나 당 파일 1개 > ex) Student 따로 , Teacher 따로
		// 이렇게 적으면 try 대상이 () 안에 있는 것들이라 close 안해도됨 > 알아서 닫아줌
		try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("object.dat"));
				ObjectOutputStream os = new ObjectOutputStream(out)){
			
			Student st = new Student();
			st.setMyName("김영희");
			st.setGender("여자");
			
			Student st1 = new Student();
			st1.setMyName("김민수");
			st1.setGender("남자");
			// 객체를 전체 쓰기
			os.writeObject(st);
			os.writeObject(st1);
			System.out.println("객체 파일 쓰기 종료");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

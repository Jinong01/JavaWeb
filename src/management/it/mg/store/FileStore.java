package management.it.mg.store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import management.it.mg.vo.Student;

/**
 * 파일저장 관련 클래스
 */
public class FileStore {

	private final static String PATH = "c:\\student\\files\\";
	private final static String FILENAME = "student.txt";
	
	// 파일 존재 여부
	public static boolean isExistFile() {
		String path = PATH+FILENAME;
		File file = new File(path);
		return file.exists();
		}
	
	// 학생 등록
	public static void addStudent(Student st) {
		String path = PATH+FILENAME;
		
		File file = new File(path);
		
		// 저장 경로가 없을 경우
		if(!file.getParentFile().exists()) {
			// 폴더 구조대로 모두 만들어준다
			file.getParentFile().mkdirs();
		}
		
		try (FileOutputStream out = new FileOutputStream(path, true);
				OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8")){
			
			ow.write(st.getMyName() + ", " + st.getScore() + "\n");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 학생 수정
	public static void updateStudent(List<Student> list) {
		String path = PATH+FILENAME;
		
		File file = new File(path);
		
		// 저장 경로가 없을 경우
		if(!file.getParentFile().exists()) {
			// 폴더 구조대로 모두 만들어준다
			file.getParentFile().mkdirs();
		}
		
		try (FileOutputStream out = new FileOutputStream(path, false);
				OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8")){
			
			if(!list.isEmpty()) {
				for(Student st : list) {
					ow.write(st.getMyName() + ", " + st.getScore() + "\n");
				}
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 학생 전체 출력
	public static List<Student> allStudent(){
		String path = PATH+FILENAME;
		List<Student> list = new ArrayList<Student>();
		
		try (FileInputStream in = new FileInputStream(path);
				InputStreamReader sw = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(sw)){
			
			String str = "";
			while( (str = br.readLine()) != null ) {
				
				String[] info = str.split(",");
				Student st = new Student();
				st.setMyName(info[0].trim());
				st.setScore(Integer.parseInt(info[1].trim()));
				
				list.add(st);
			}
			
		} catch(Exception e) {
			System.out.println("파일경로에 파일이 없거나 처리중 오류가 발생했습니다.");
			e.printStackTrace();
		}
		return list;
	}
}

package task.view;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import task.controller.Controller;
import task.dto.Member;

public class View {
	
	Scanner scan = new Scanner(System.in);
	private static View view = new View();
    private View(){}
    public static View getInstance(){return view;}
    
    
    
    public void mainView() throws SQLException {
    	
    	
    	while(true) {
    		
    		System.out.println("1. 직원 등록");
    		System.out.println("2. 직원 보기");
    		System.out.println("3. 직원 수정");
    		System.out.println("4. 직원 삭제");
    		System.out.println("0. 종료");

    		
    		int choose = 0;
    		
    		try {
    			choose = scan.nextInt();
	   
    		} catch(Exception e) {
    			e.printStackTrace();
    			System.out.println("1-4 중에 입력하세요.");
                scan.nextLine();
                continue;
    		}

    		switch(choose){
    			case 1:
    				regist();
    				break;
    				
    			case 2:
    				show();
    				break;
    				
    			case 3:
    				update();
    				break;
    				
    			case 4:
    				delete();
    				break;
    				
    			case 0:
    				System.exit(0);
    		}
    	}
    }
    
    public void regist() throws SQLException {    	
    	try {
	    	System.out.println("직원 사번 : "); int num = scan.nextInt();
	    	System.out.println("직원 이름 : "); String name = scan.next();
	    	System.out.println("직원 부서 : "); String depart = scan.next();

	    	boolean result = Controller.getInstance().regist(num, name, depart);
	    	
	    	if (result) {System.out.println("직원 등록 성공!");}
	    	else {System.out.println("직원 등록 실패!");}
	    	
    	} catch(Exception e) {
    		e.printStackTrace();
            scan.nextLine();
    	}
 
    }
    
    public void show() throws SQLException {
    	List<Member> list = Controller.getInstance().show();
    	
    	if(list.isEmpty()) {System.out.println("등록된 직원이 없습니다.");}
    	else {
	    	Map<String, List<Member>> groupDepart =  
					list.stream().collect(Collectors.groupingBy(Member::getDepart));
	    	System.out.println("======= 부서별 조회 =======");
			groupDepart.forEach( (depart, groupList) -> System.out.println(depart+"부서" + ":" + groupList) );
	    	
			System.out.println("======= 직원 전체 조회 (사번 오름차순) =======");
	    	list.stream()
			.sorted(Comparator.comparing(Member::getNum)) // comparing sort 하는 대상
			.forEach(System.out::println);
    	}
    }
    
    public void update() throws SQLException {
    	
    	System.out.println("수정하고 싶은 직원 이름 : "); String name = scan.next();
    	System.out.println("수정할 이름 : "); String newName = scan.next();
    	System.out.println("수정할 부서 : "); String depart = scan.next();
    	
    	boolean result = Controller.getInstance().update(name, newName, depart);
    	
    	if(result){System.out.println("직원 수정 성공!");}
    	else {System.out.println("직원 수정 실패!");}
  

    }
    
    public void delete() throws SQLException {
    	System.out.println("삭제할 사람 이름 : "); String name = scan.next();
    	
    	boolean result = Controller.getInstance().delete(name);
    	
    	if(result) {System.out.println("직원 삭제 성공!");}
    	else {System.out.println("직원 삭제 실패!");}

    }
}

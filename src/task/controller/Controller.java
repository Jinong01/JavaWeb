package task.controller;

import java.sql.SQLException;
import java.util.List;

import task.dao.Dao;
import task.dto.Member;

public class Controller {

	private static Controller controller = new Controller();
    private Controller(){}
    public static Controller getInstance(){return controller;}
	
    public boolean regist(int num, String name, String depart) throws SQLException {
    	
    	Member member = new Member();
    	member.setNum(num);
    	member.setName(name);
    	member.setDepart(depart);
    	
    	return Dao.getInstance().regist(member);
    	
    }
    
    public List<Member> show() throws SQLException {
    	return Dao.getInstance().show();
    }
    
    public boolean update(String name, String newName, String depart) throws SQLException {
    	return Dao.getInstance().update(name, newName, depart);
    }
    
    public boolean delete(String name) throws SQLException {
    	
    	return Dao.getInstance().delete(name);
    }
	
    
    
    
    
}

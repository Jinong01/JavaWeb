package task.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import task.dto.Member;

public class Dao{
	
		private Connection conn;
		private static Dao instance = new Dao();
	    public static Dao getInstance() {return instance;}

		
	public Dao(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb", "root", "1234");
			System.out.println("로딩 성공");
		} catch (Exception e) {
			System.out.println("로딩 실패");
			e.printStackTrace();
			
		}
	}
	
	public void check() {
		
	}
	
	public boolean regist(Member member) throws SQLException {
		
		String sql = "insert into member (num, name, depart) values (?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, member.getNum());
		ps.setString(2, member.getName());
		ps.setString(3, member.getDepart());
		
		ps.execute();
		return true;
	}
	
	public List<Member> show() throws SQLException{
		String sql = "select * from member";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		List<Member> list = new ArrayList<Member>();
		while(rs.next()) {
			int num = rs.getInt("num");
            String name = rs.getString("name");
            String depart = rs.getString("depart");
            
            Member member = new Member();
            member.setNum(num);
            member.setName(name);
            member.setDepart(depart);
            
            list.add(member);
		}
		return list;
	}
	
	public boolean update(String name, String newName, String depart) throws SQLException{
		String sql = "update member set name = ?, depart = ? where name = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, newName);
		ps.setString(2, depart);
		ps.setString(3, name);
		
		int result = ps.executeUpdate();
		
		return result > 0;
	}
	

	public boolean delete(String name) throws SQLException{
		String sql = "delete from member where name = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, name);
		int result = ps.executeUpdate();
		
		return result > 0;
	}

	public Member getMember() throws SQLException{
		Member member = new Member();
		
		
		return member;
	}
	
}

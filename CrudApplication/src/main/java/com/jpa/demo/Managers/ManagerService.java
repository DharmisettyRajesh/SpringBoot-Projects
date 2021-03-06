package com.jpa.demo.Managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
	
	@Autowired
	JdbcTemplate jt; 
	
	public List<Manager> getall()
	{
		String sql="select * from manager";
		return jt.query(sql,(rs,rownum)->new Manager(
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4)
				));
	}
	public String addmanager(Manager m)
	{
		String sql="insert into manager values(?,?,?,?)";
		int i=jt.update(sql,m.getId(),m.getName(),m.getLead1(),m.getLead2());
		if(i>0)
		{
			return "data inserted";
		}
		else {
			return "data not inserted";
		}
		
	}
	public List<Employee> selectEmployee(Employee e)
	{
		String sql="select * from employee where leads='"+e.getLead()+"' and manager='"+e.getManager()+"'";
		return jt.query(sql,(rs,rownum)->new Employee(
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4)
				));
				
	}

}

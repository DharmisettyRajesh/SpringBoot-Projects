package com.jpa.demo.Example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService { 
	@Autowired
	JdbcTemplate obj;
	
	public String insert(Student s)
	{
		String sql="insert into student values(?,?,?,?)";
		int i= obj.update(sql,s.getId(),s.getName(),s.getAge(),s.getPhno()); 
		if(i>0)
		{
			return "query executed successfully";
		}
		else
		{
			return "invalid query";
		}
		
	}
	public List<Student> select()
	{
		String sql="select * from student";
		List<Student> obj1=obj.query(sql,(rs,rownum)->new Student(
				rs.getInt(1),
				rs.getString(2),
				rs.getInt(3),
				rs.getLong(4)
				));
		return obj1;
	}
//	public String update(Student s)
//	{
//		
//	}
//	public String delete(Student s)
//	{
//		
//	}

}

package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	
  public List<Map<String,String>> getAllData()
	{
	  List res = new ArrayList();
		Map m = new HashMap();
		m.put(101,"sam");
		m.put(102,"sai");
		m.put(103,"setty");
		m.put(104,"sarath");
		
		
		res.add(m);
		return res;
	}
	
}

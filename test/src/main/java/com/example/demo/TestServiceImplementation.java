package com.example.demo;

import java.util.List;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImplementation implements TestService {
	
	@Autowired
	TestDao tsDao;

	@Override
public List allData()
	{
		return tsDao.getAllData();
	}
}

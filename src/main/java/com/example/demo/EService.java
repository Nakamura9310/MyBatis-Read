package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EService {
	
	@Autowired
	EMapper mapper;
	
	public List<Employee> getList() {
		return mapper.find();
	}
	
}

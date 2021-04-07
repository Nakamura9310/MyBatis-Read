package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

import java.util.List;


@Controller
@AllArgsConstructor
public class EController {
	
	@Autowired
	private EService service;
	
	@GetMapping("/list")
	public String getEList(Model m) {
		List<Employee> employeeList =  service.getList();
		m.addAttribute("employee", employeeList);
		return "list";
		
	}

}

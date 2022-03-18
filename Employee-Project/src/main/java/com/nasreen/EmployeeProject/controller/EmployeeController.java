package com.nasreen.EmployeeProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nasreen.EmployeeProject.entity.Employee;
import com.nasreen.EmployeeProject.repository.EmployeeRepository;
@Controller
@ComponentScan(value="com.nasreen.EmployeeProject")
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;
	@RequestMapping(value="/home")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping(value="/create")
	public String create() {
		return "createEmployee.jsp";
	}
	@RequestMapping(value="/delete")
	public String delete() {
		return "delete.jsp";
	}
	@RequestMapping(value="/update")
	public String update() {
		return "update.jsp";
	}
	@RequestMapping(value="/search")
	public String display() {
		return "search.jsp";
	}
	@GetMapping("/adminlogin")
	public String login() {
		return "login.jsp";
	}
	@RequestMapping(value="/createemployee",method=RequestMethod.POST)
	public String createEmployee(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,@RequestParam int salary,@RequestParam String designation,ModelMap model) {
		repository.insertemployee(firstname,lastname,age,salary,designation);
		model.put("message","User is inserted");
		return "createEmployee.jsp";
	}
	@RequestMapping(value="/searchemployee")
	public String findEmployee(@RequestParam int id,ModelMap model) {
		Employee employee = repository.findById(id);
		if(employee==null) {
			model.put("message","User not found");
			return "search.jsp";
		}
		else {
		model.put("id",employee.getId());
		model.put("firstname",employee.getFirstname());
		model.put("lastname", employee.getLastname());
		model.put("age", employee.getAge());
		model.put("salary", employee.getSalary());
		model.put("designation",employee.getDesignation());
		return "details.jsp";
		}
		
	}
	@RequestMapping(value="/deleteemployee")
	public String deleteEmployee(@RequestParam int id,ModelMap model) {
		repository.deleteById(id);
		model.put("message","User is deleted");
		return "delete.jsp";
	}
	@RequestMapping(value="/updateemployee")
	public String updateEmployee(@RequestParam int id,@RequestParam int salary,ModelMap model) {
		repository.update(id,salary);
		model.put("message","User salary is updated");
		return "update.jsp";
	}


}

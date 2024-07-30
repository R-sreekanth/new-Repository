package com.shift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shift.employee.EmplyoeeEntity;
import com.shift.service.EmployeeService;

@RestController
public class Controller 
{
	@Autowired
	private EmployeeService serv;
	
	@PostMapping("/add")
	public ResponseEntity<String> addshift(@RequestBody EmplyoeeEntity entity)
	{
		String result=serv.addshift(entity);
		
		return new ResponseEntity<>(result,HttpStatus.CREATED) ;
		
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<EmplyoeeEntity>> getUser()
	{
		List<EmplyoeeEntity> emp=serv.getall();
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	@GetMapping("/show/{shiftid}")
	public EmplyoeeEntity getbyid(@PathVariable String shiftid)
	{
		 //serv.showbyid(shiftid);
		return serv.showbyid(shiftid);
	}
	
	
	
	@PutMapping("/update/{param}")
	public ResponseEntity<String>updateshift(@PathVariable String param,@RequestBody EmplyoeeEntity entity)
	{
		String result=serv.updateshift(param, entity);
		return new ResponseEntity<>(result,HttpStatus.OK); 
		
	}
	
	//@Transactional
	@DeleteMapping("/delete/{shiftid}")
	public String deleteshift(@PathVariable String shiftid) {
		// TODO Auto-generated method stub
		return serv.deleteByShiftid(shiftid);
	}
	

}

package com.shift.service;

import java.util.List;

import com.shift.employee.EmplyoeeEntity;


public interface EmployeeService 
{
	public String addshift(EmplyoeeEntity entity);
	
	public List<EmplyoeeEntity> getall();
	
	public EmplyoeeEntity showbyid(String shiftid);
	
	public String updateshift(String  param,EmplyoeeEntity entity);
	
	public String deleteByShiftid(String shiftid);

}

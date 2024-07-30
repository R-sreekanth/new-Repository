package com.shift.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shift.employee.EmplyoeeEntity;

public interface EmployeeRepo extends JpaRepository<EmplyoeeEntity,String>{

	Optional<EmplyoeeEntity> findByShiftName(String shiftName);
	Optional<EmplyoeeEntity> findByShiftid(String shiftid);
	
	public String deleteByShiftid(String shiftid);
	
	
	
}

package com.shift.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shift.employee.EmplyoeeEntity;
import com.shift.repo.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class ServiceImple implements EmployeeService 
{
	@Autowired
	private EmployeeRepo repo;
	
    @Override
	public String  addshift(EmplyoeeEntity entity) 
	{ 
		
		Optional<EmplyoeeEntity> shift=repo.findByShiftName(entity.getShiftName());
		if(shift.isPresent())
		
			return "shift with name is already is present";
		
		{
			
			if(entity.getAddPaidLeaveonExtraDay()==null)
			{
			entity.setAddPaidLeaveonExtraDay("noo");
			}
			if(entity.getAllowShortLeave()==null)
			{
			  entity.setAllowShortLeave("noo");
			}
			if(entity.getApplyHalfDayifLateInLimitExceeded()==null)
			{
				entity.setApplyHalfDayifLateInLimitExceeded("noo");
			}
			if(entity.getApplyLeaveOnHoliday()==null);
			{
				entity.setApplyLeaveOnHoliday("noo");
			}
			if(entity.getApplyLeaveOnWeekOff()==null)
			{
			entity.setApplyLeaveOnWeekOff("noo");
			}
			if(entity.getApplySandwichLeave()==null)
			{
			entity.setApplySandwichLeave("noo");
			}
			if(entity.getHasAlternateWeekOff()==null)
			{
			entity.setHasAlternateWeekOff("noo");
			}
			if(entity.getHasAutoWeekOff()==null)
			{
				entity.setHasAutoWeekOff("noo");
			}
			if(entity.getLateInEarlyOutApplyOnExtraDay()==null)
			{
			entity.setLateInEarlyOutApplyOnExtraDay("noo");
			}
			if(entity.getMaximumEarlyOut()==null)
			{
			entity.setMaximumEarlyOut(2);
			}
			if(entity.getMaximumLateIn()==null)
			{
			entity.setMaximumLateIn(2);
			}
			if(entity.getMultiplePunchInOutAllow()==null)
			{
			entity.setMultiplePunchInOutAllow("noo");
			}
			if(entity.getReasonOfEarlyOut()==null)
			{
			entity.setReasonOfEarlyOut("noo");
			}
			if(entity.getShiftName()==null)
			{
			entity.setShiftName("newshift");
			}
			if(entity.getTakeBreakSettings()==null)
			{
			entity.setTakeBreakSettings("noo");
			}
			if(entity.getWeekOffDays()==null)
			{
			entity.setWeekOffDays(4);
			}
			if(entity.getReasonOfLateIn()==null)
			{
			entity.setReasonOfLateIn("meeting");
			}
			if(entity.getRequiredOutOfRangeReason()==null)
			{
			entity.setRequiredOutOfRangeReason("ofyc_lunch");
			}
			
			repo.save(entity);
			
	}
		repo.save(entity);
		
		return "shift saved";
		 
	}

	@Override
	public List<EmplyoeeEntity> getall() 
	{
		return repo.findAll();

	}

	
	

	@Override
	public EmplyoeeEntity showbyid(String shiftid) {
		Optional<EmplyoeeEntity> optionalEmplyoee = repo.findByShiftid(shiftid);
		return optionalEmplyoee.orElse(null); // return null if not found, handle accordingly in your application
	}

	@Transactional
	@Override
	public String deleteByShiftid(String shiftid) {

		if (repo.existsById(shiftid)) {
			repo.deleteByShiftid(shiftid);

			return "User Deleted Successfully!";
		} else {
			return "User Not Found!";
		}
	}

	@Override
	public String updateshift(String param, EmplyoeeEntity entity) {
		// TODO Auto-generated method stub

		Optional<EmplyoeeEntity> id = repo.findById(param);
		Optional<EmplyoeeEntity> name = repo.findByShiftName(param);

		if (id.isPresent()) {

			System.out.println(id.get().getShiftName());
			return updateByShiftId(entity);
		}

		else {

			if (name.isPresent())

		
				return updateByShiftName(entity);
			

			else {
				return "Invalid parameter: " + param;
			}

		}

	}

	private String updateByShiftId(EmplyoeeEntity entity) {
		
		Optional<EmplyoeeEntity> optionalShift = repo.findByShiftid(entity.getShiftid());
		if (optionalShift.isPresent()) 
		{
			
			EmplyoeeEntity existingShift = optionalShift.get();
			// Update existing shift with new data
			 
			if(entity.getApplySandwichLeave()!=null)
				
				existingShift.setApplySandwichLeave(entity.getApplySandwichLeave());
			
			
	  if(entity.getHasAutoWeekOff()!=null)
				existingShift.setHasAutoWeekOff(entity.getHasAutoWeekOff());
			
		if(entity.getAllowShortLeave()!=null)
			existingShift.setAllowShortLeave(entity.getAllowShortLeave());
			
		
		
		if(entity.getApplyHalfDayifLateInLimitExceeded()!=null)
		{
			existingShift.setApplyHalfDayifLateInLimitExceeded(entity.getApplyHalfDayifLateInLimitExceeded());
		}
		
		if(entity.getHasAlternateWeekOff()!=null)
		existingShift.setHasAlternateWeekOff(entity.getHasAlternateWeekOff());
	
	if(entity.getHasAutoWeekOff()!=null)
		existingShift.setHasAutoWeekOff(entity.getHasAutoWeekOff());
	
	if(entity.getLateInEarlyOutApplyOnExtraDay()!=null)
		existingShift.setLateInEarlyOutApplyOnExtraDay(entity.getLateInEarlyOutApplyOnExtraDay());
	
	if(entity.getMaximumEarlyOut()!=null)
		
		existingShift.setMaximumEarlyOut(entity.getMaximumEarlyOut());
	if(entity.getMaximumLateIn()!=null)
		existingShift.setMaximumLateIn(entity.getMaximumLateIn());
	if(entity.getMultiplePunchInOutAllow()!=null)
		existingShift.setMultiplePunchInOutAllow(entity.getMultiplePunchInOutAllow());
	if(entity.getReasonOfEarlyOut()!=null)
		existingShift.setReasonOfEarlyOut(entity.getReasonOfEarlyOut());
	if(entity.getReasonOfLateIn()!=null)
		existingShift.setReasonOfLateIn(entity.getReasonOfLateIn());
	if(entity.getRequiredOutOfRangeReason()!=null)
		existingShift.setRequiredOutOfRangeReason(entity.getRequiredOutOfRangeReason());
	if(entity.getTakeBreakSettings()!=null)
		existingShift.setTakeBreakSettings(entity.getTakeBreakSettings());
	if(entity.getWeekOffDays()!=null)
		existingShift.setWeekOffDays(entity.getWeekOffDays());
	if(entity.getAddPaidLeaveonExtraDay()!=null)
		existingShift.setAddPaidLeaveonExtraDay(entity.getAddPaidLeaveonExtraDay());
	
		    repo.save(existingShift);
			
			
			return "Shift updated successfully." + entity.getShiftid();
		} else {
			
			return "Shift with ID not found and name of the shitf" + entity.getShiftid();
		}
	}
	
	//@Transactional
private String updateByShiftName(EmplyoeeEntity entity) {
		
		Optional<EmplyoeeEntity> optionalShift = repo.findByShiftName(entity.getShiftName());
		if (optionalShift.isPresent()) 
		{
			
			EmplyoeeEntity existingshift = optionalShift.get();
			
			
		  if(entity.getApplySandwichLeave()!=null)
				
					existingshift.setApplySandwichLeave(entity.getApplySandwichLeave());
				
				
		  if(entity.getHasAutoWeekOff()!=null)
					existingshift.setHasAutoWeekOff(entity.getHasAutoWeekOff());
				
			if(entity.getAllowShortLeave()!=null)
				existingshift.setAllowShortLeave(entity.getAllowShortLeave());
				
			
			
			if(entity.getApplyHalfDayifLateInLimitExceeded()!=null)
			{
				existingshift.setApplyHalfDayifLateInLimitExceeded(entity.getApplyHalfDayifLateInLimitExceeded());
			}
			
			if(entity.getHasAlternateWeekOff()!=null)
			existingshift.setHasAlternateWeekOff(entity.getHasAlternateWeekOff());
		
		if(entity.getHasAutoWeekOff()!=null)
			existingshift.setHasAutoWeekOff(entity.getHasAutoWeekOff());
		
		if(entity.getLateInEarlyOutApplyOnExtraDay()!=null)
			existingshift.setLateInEarlyOutApplyOnExtraDay(entity.getLateInEarlyOutApplyOnExtraDay());
		
		if(entity.getMaximumEarlyOut()!=null)
			existingshift.setMaximumEarlyOut(entity.getMaximumEarlyOut());
		if(entity.getMaximumLateIn()!=null)
			existingshift.setMaximumLateIn(entity.getMaximumLateIn());
		if(entity.getMultiplePunchInOutAllow()!=null)
			existingshift.setMultiplePunchInOutAllow(entity.getMultiplePunchInOutAllow());
		if(entity.getReasonOfEarlyOut()!=null)
			existingshift.setReasonOfEarlyOut(entity.getReasonOfEarlyOut());
		if(entity.getReasonOfLateIn()!=null)
			existingshift.setReasonOfLateIn(entity.getReasonOfLateIn());
		if(entity.getRequiredOutOfRangeReason()!=null)
			existingshift.setRequiredOutOfRangeReason(entity.getRequiredOutOfRangeReason());
		if(entity.getTakeBreakSettings()!=null)
			existingshift.setTakeBreakSettings(entity.getTakeBreakSettings());
		if(entity.getWeekOffDays()!=null)
			existingshift.setWeekOffDays(entity.getWeekOffDays());
		if(entity.getAddPaidLeaveonExtraDay()!=null)
			existingshift.setAddPaidLeaveonExtraDay(entity.getAddPaidLeaveonExtraDay());
		
		   
		
			repo.save(existingshift);
		  
		 
		
			return "Shift updated successfully."+ entity.getShiftName();
		} else {
			
			return "Shift with name not found: " + entity.getShiftName();
		}
	}

	

}

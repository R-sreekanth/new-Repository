package com.shift.employee;

import org.hibernate.annotations.GenericGenerator;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

//@Data
@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Table(name="shift_table")
public class EmplyoeeEntity 
{
	
	@Id
	@SequenceGenerator(name = "userid_sequence_table")
	@GeneratedValue(generator = "user-id-generator")
     @GenericGenerator(name = "user-id-generator", strategy = "com.shift.genertor.UserIdGenerator")
	private String shiftid;

	private String shiftName;
	
	private String hasAutoWeekOff;
	private Integer weekOffDays;
	private String hasAlternateWeekOff;
	private Integer maximumLateIn;
	private Integer maximumEarlyOut;
	private String applyHalfDayifLateInLimitExceeded;
	private String multiplePunchInOutAllow;
	private String requiredOutOfRangeReason;
	private String allowShortLeave;
	private String applySandwichLeave;
	private String takeBreakSettings;
	private String addPaidLeaveonExtraDay;
	private String lateInEarlyOutApplyOnExtraDay;
	private String ApplyLeaveOnHoliday;
	private String ApplyLeaveOnWeekOff;
	private String reasonOfLateIn;
	private String reasonOfEarlyOut;
	
	
	
	public EmplyoeeEntity(String shiftid, String shiftName, String hasAutoWeekOff, Integer weekOffDays,
			String hasAlternateWeekOff, Integer maximumLateIn, Integer maximumEarlyOut,
			String applyHalfDayifLateInLimitExceeded, String multiplePunchInOutAllow, String requiredOutOfRangeReason,
			String allowShortLeave, String applySandwichLeave, String takeBreakSettings, String addPaidLeaveonExtraDay,
			String lateInEarlyOutApplyOnExtraDay, String applyLeaveOnHoliday, String applyLeaveOnWeekOff,
			String reasonOfLateIn, String reasonOfEarlyOut) {
		super();
		this.shiftid = shiftid;
		this.shiftName = shiftName;
		this.hasAutoWeekOff = hasAutoWeekOff;
		this.weekOffDays = weekOffDays;
		this.hasAlternateWeekOff = hasAlternateWeekOff;
		this.maximumLateIn = maximumLateIn;
		this.maximumEarlyOut = maximumEarlyOut;
		this.applyHalfDayifLateInLimitExceeded = applyHalfDayifLateInLimitExceeded;
		this.multiplePunchInOutAllow = multiplePunchInOutAllow;
		this.requiredOutOfRangeReason = requiredOutOfRangeReason;
		this.allowShortLeave = allowShortLeave;
		this.applySandwichLeave = applySandwichLeave;
		this.takeBreakSettings = takeBreakSettings;
		this.addPaidLeaveonExtraDay = addPaidLeaveonExtraDay;
		this.lateInEarlyOutApplyOnExtraDay = lateInEarlyOutApplyOnExtraDay;
		this.ApplyLeaveOnHoliday = applyLeaveOnHoliday;
		this.reasonOfLateIn = reasonOfLateIn;
		this.reasonOfEarlyOut = reasonOfEarlyOut;
	}
	public String getShiftid() {
		return shiftid;
	}
	public void setShiftid(String shiftid) {
		this.shiftid = shiftid;
	}
	public String getShiftName() {
		return shiftName;
	}
	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}
	public String getHasAutoWeekOff() {
		return hasAutoWeekOff;
	}
	public void setHasAutoWeekOff(String hasAutoWeekOff) {
		this.hasAutoWeekOff = hasAutoWeekOff;
	}
	public Integer getWeekOffDays() {
		return weekOffDays;
	}
	public void setWeekOffDays(Integer weekOffDays) {
		this.weekOffDays = weekOffDays;
	}
	public String getHasAlternateWeekOff() {
		return hasAlternateWeekOff;
	}
	public void setHasAlternateWeekOff(String hasAlternateWeekOff) {
		this.hasAlternateWeekOff = hasAlternateWeekOff;
	}
	public Integer getMaximumLateIn() {
		return maximumLateIn;
	}
	public void setMaximumLateIn(Integer maximumLateIn) {
		this.maximumLateIn = maximumLateIn;
	}
	public Integer getMaximumEarlyOut() {
		return maximumEarlyOut;
	}
	public void setMaximumEarlyOut(Integer maximumEarlyOut) {
		this.maximumEarlyOut = maximumEarlyOut;
	}
	public String getApplyHalfDayifLateInLimitExceeded() {
		return applyHalfDayifLateInLimitExceeded;
	}
	public void setApplyHalfDayifLateInLimitExceeded(String applyHalfDayifLateInLimitExceeded) {
		this.applyHalfDayifLateInLimitExceeded = applyHalfDayifLateInLimitExceeded;
	}
	public String getMultiplePunchInOutAllow() {
		return multiplePunchInOutAllow;
	}
	public void setMultiplePunchInOutAllow(String multiplePunchInOutAllow) {
		this.multiplePunchInOutAllow = multiplePunchInOutAllow;
	}
	public String getRequiredOutOfRangeReason() {
		return requiredOutOfRangeReason;
	}
	public void setRequiredOutOfRangeReason(String requiredOutOfRangeReason) {
		this.requiredOutOfRangeReason = requiredOutOfRangeReason;
	}
	public String getAllowShortLeave() {
		return allowShortLeave;
	}
	public void setAllowShortLeave(String allowShortLeave) {
		this.allowShortLeave = allowShortLeave;
	}
	public String getApplySandwichLeave() {
		return applySandwichLeave;
	}
	public void setApplySandwichLeave(String applySandwichLeave) {
		this.applySandwichLeave = applySandwichLeave;
	}
	public String getTakeBreakSettings() {
		return takeBreakSettings;
	}
	public void setTakeBreakSettings(String takeBreakSettings) {
		this.takeBreakSettings = takeBreakSettings;
	}
	public String getAddPaidLeaveonExtraDay() {
		return addPaidLeaveonExtraDay;
	}
	public void setAddPaidLeaveonExtraDay(String addPaidLeaveonExtraDay) {
		this.addPaidLeaveonExtraDay = addPaidLeaveonExtraDay;
	}
	public String getLateInEarlyOutApplyOnExtraDay() {
		return lateInEarlyOutApplyOnExtraDay;
	}
	public void setLateInEarlyOutApplyOnExtraDay(String lateInEarlyOutApplyOnExtraDay) {
		this.lateInEarlyOutApplyOnExtraDay = lateInEarlyOutApplyOnExtraDay;
	}
	public String getApplyLeaveOnHoliday() {
		return ApplyLeaveOnHoliday;
	}
	public void setApplyLeaveOnHoliday(String applyLeaveOnHoliday) {
		ApplyLeaveOnHoliday = applyLeaveOnHoliday;
	}
	public String getApplyLeaveOnWeekOff() {
		return ApplyLeaveOnWeekOff;
	}
	public void setApplyLeaveOnWeekOff(String applyLeaveOnWeekOff) {
		ApplyLeaveOnWeekOff = applyLeaveOnWeekOff;
	}
	public String getReasonOfLateIn() {
		return reasonOfLateIn;
	}
	public void setReasonOfLateIn(String reasonOfLateIn) {
		this.reasonOfLateIn = reasonOfLateIn;
	}
	public String getReasonOfEarlyOut() {
		return reasonOfEarlyOut;
	}
	public void setReasonOfEarlyOut(String reasonOfEarlyOut) {
		this.reasonOfEarlyOut = reasonOfEarlyOut;
	}
	
	
	 
}



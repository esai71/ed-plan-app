package com.sai.entity;



public class InsuranceResponseBinding {	private Integer benefitAmt;
private String denialReason;

private String endDate;
private String name;
private String planName;
private String planStatus	;
private String ssn;


private String startDate;
public Integer getBenefitAmt() {
	return benefitAmt;
}
public void setBenefitAmt(Integer benefitAmt) {
	this.benefitAmt = benefitAmt;
}
public String getDenialReason() {
	return denialReason;
}
public void setDenialReason(String denialReason) {
	this.denialReason = denialReason;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPlanName() {
	return planName;
}
public void setPlanName(String planName) {
	this.planName = planName;
}
public String getPlanStatus() {
	return planStatus;
}
public void setPlanStatus(String planStatus) {
	this.planStatus = planStatus;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}

}

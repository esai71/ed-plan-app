package com.sai.entity;

public class InsuranceRequestBinding {
	private Integer age;
	private String email;	
	private String employmentStatus;	
	private Double income;
	private String kidsEligible;	
	private String name;
	private String planName;
	private String ssn;
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public String getKidsEligible() {
		return kidsEligible;
	}
	public void setKidsEligible(String kidsEligible) {
		this.kidsEligible = kidsEligible;
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
}

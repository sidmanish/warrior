package com.HelpForWarriors.bean;

public class SignUp {
	private int id;
	private String name;
	private String gender;
	private String adharNo;
	private String mobileNO;
	private String email;
	private String accountNo;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getMobileNO() {
		return mobileNO;
	}
	public void setMobileNO(String mobileNO) {
		this.mobileNO = mobileNO;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SignUp(String name, String gender, String adharNo, String mobileNO, String email, String accountNo,
			String password) {
		super();
		this.name = name;
		this.gender = gender;
		this.adharNo = adharNo;
		this.mobileNO = mobileNO;
		this.email = email;
		this.accountNo = accountNo;
		this.password = password;
	}
	
}
package com.HelpForWarriors.bean;

public class AdminLogin {
private String userName;
private String passward;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassward() {
	return passward;
}
public void setPassward(String passward) {
	this.passward = passward;
}
public AdminLogin(String userName, String passward) {
	super();
	this.userName = userName;
	this.passward = passward;
}
public AdminLogin() {
	super();
	// TODO Auto-generated constructor stub
}

}

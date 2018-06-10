package com.HelpForWarriors.bean;

public class WarriorDetails {
private String name;
private String rank;
private String address;
private String martyrDate;
public WarriorDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public WarriorDetails(String name, String rank, String address, String martyrDate) {
	super();
	this.name = name;
	this.rank = rank;
	this.address = address;
	this.martyrDate = martyrDate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMartyrDate() {
	return martyrDate;
}
public void setMartyrDate(String martyrDate) {
	this.martyrDate = martyrDate;
}
}

package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
@Table(name="cricketplayer")
public class CricketPlayer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int pid;
String pnm;
int age;
int noofyrs;
String city;
public CricketPlayer() {
	super();
	// TODO Auto-generated constructor stub
}
public CricketPlayer(int pid, String pnm, int age, int noofyrs, String city) {
	super();
	this.pid = pid;
	this.pnm = pnm;
	this.age = age;
	this.noofyrs = noofyrs;
	this.city = city;
}
@Override
public String toString() {
	return "CricketPlayer [pid=" + pid + ", pnm=" + pnm + ", age=" + age + ", noofyrs=" + noofyrs + ", city=" + city
			+ "]";
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPnm() {
	return pnm;
}
public void setPnm(String pnm) {
	this.pnm = pnm;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getNoofyrs() {
	return noofyrs;
}
public void setNoofyrs(int noofyrs) {
	this.noofyrs = noofyrs;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}

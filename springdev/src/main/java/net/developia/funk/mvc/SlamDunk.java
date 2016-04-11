package net.developia.funk.mvc;

import java.io.Serializable;

public class SlamDunk implements Serializable {
	
	private String team;
	private String name;
	private int age;
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "SlamDunk [team=" + team + ", name=" + name + ", age=" + age + "]";
	}
	
	

}

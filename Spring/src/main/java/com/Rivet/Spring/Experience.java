package com.Rivet.Spring;

public class Experience {
	
	private String experience;

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Experience(String experience) {
		super();
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Experience [experience=" + experience + "]";
	}
	
	

}

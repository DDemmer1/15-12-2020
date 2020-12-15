package de.demmer.dennis;

public class Hund {
	
	private int age;
	

	public Hund(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString() {
		return "Hund [ age: " + age + " ]";
	}
	

}

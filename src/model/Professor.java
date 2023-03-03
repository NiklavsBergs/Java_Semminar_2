package model;

public class Professor {
	private long p_id;
	private String name;
	private String surname;
	private String degree;
	private static long idCounter = 0;
	
	
	public Professor() {
		p_id = idCounter;
		name = "Vards";
		surname = "Uzvards";
		degree = "Grāds";
		idCounter++;
	}
	
	public Professor(long p_idIn, String nameIn, String surnameIn, String degreeIn) {
		p_id = idCounter;
		name = nameIn;
		surname = surnameIn;
		degree = degreeIn;
		idCounter++;
	}

	public long getP_id() {
		return p_id;
	}

	public void setP_id(long p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
}

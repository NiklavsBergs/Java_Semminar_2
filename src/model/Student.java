package model;

public class Student {
	private long st_id;
	private String name;
	private String surname;
	private Faculty faculty;
	private String persKods;
	private static long idCounter = 10000;
	
	public Student() {
		st_id = idCounter;
		name = "Vards";
		surname = "Uzvards";
		idCounter++;
	}
	
	public Student(long p_idIn, String nameIn, String surnameIn) {
		st_id = idCounter;
		name = nameIn;
		surname = surnameIn;
		idCounter++;
	}

	public long getSt_id() {
		return st_id;
	}

	public void setSt_id(long st_id) {
		this.st_id = st_id;
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
	
	
}

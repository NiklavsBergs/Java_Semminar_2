package model;

public class Student {
	private long st_id;
	private String name;
	private String surname;
	
	public Student() {
		st_id = 0;
		name = "Vards";
		surname = "Uzvards";
	}
	
	public Student(long p_idIn, String nameIn, String surnameIn) {
		st_id = p_idIn;
		name = nameIn;
		surname = surnameIn;
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

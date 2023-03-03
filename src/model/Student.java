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
}

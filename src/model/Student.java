package model;

public class Student {
	private long id;
	private String name;
	private String surname;
	private Faculty faculty;
	private String personCode;
	private static long idCounter = 10000;
	
	public Student() {
		id = idCounter;
		name = "Vards";
		surname = "Uzvards";
		personCode = "000000-00000";
		idCounter++;
	}
	
	public Student(long p_idIn, String nameIn, String surnameIn, String personCodeIn) {
		id = idCounter;
		name = nameIn;
		surname = surnameIn;
		personCode = personCodeIn;
		idCounter++;
	}

	public long getSt_id() {
		return id;
	}

	public void setSt_id(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	//Regex [A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+[ ]?([A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+)?
	public void setName(String name) {
		if(name.matches("[A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+[ ]?([A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+)?")) {
			this.name = name;
		}
		else {
			this.name = "Unknown";
		}
		
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}

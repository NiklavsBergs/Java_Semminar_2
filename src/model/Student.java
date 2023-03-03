package model;

public class Student {
	private long id;
	private String name;
	private String surname;
	private Faculty faculty;
	private String personCode;
	
	private static long idCounter = 0;
	
	public Student() {
		id = idCounter;
		name = "Vards";
		surname = "Uzvards";
		personCode = "000000-00000";
		idCounter++;
	}
	
	public Student(String nameIn, String surnameIn, String personCodeIn) {
		id = idCounter;
		name = nameIn;
		surname = surnameIn;
		personCode = personCodeIn;
		idCounter++;
	}

	public long getId() {
		return id;
	}
	
	public void setId() {
		id = idCounter;
		idCounter++;
	}

	public String getName() {
		return name;
	}

	//Regex [A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+[ ]?([A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+)?
	public void setName(String name) {
		if(name!=null && name.matches("[A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+[ ]?([A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+)?")) {
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
		if(surname!=null && surname.matches("[A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+[-]?([A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+)?")) {
			this.surname = surname;
		}
		else {
			this.surname = "Unknown";
		}
	}

	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		if(personCode!=null && personCode.matches("[0-9]{6}[-][0-9]{5}")) {
			this.personCode = personCode;
		}
		else {
			this.personCode = "000000-00000";
		}
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		if(faculty!=null) {
			this.faculty = faculty;
		}
		else {
			faculty = Faculty.other;
		}
		
	}
	
	
	
	
	
}

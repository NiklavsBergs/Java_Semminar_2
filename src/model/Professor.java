package model;

public class Professor {
	private long id;
	private String name;
	private String surname;
	private String degree;
	
	private static long idCounter = 0;
	
	
	public Professor() {
		setId();
		setName("Unknown");
		setSurname("Unknown");
		degree = "Unknown";
	}
	
	public Professor(String name, String surname, String degreeIn) {
		setId();
		setName(name);
		setSurname(surname);
		degree = degreeIn;
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public String toString() {
		return "" + id + ": " + name + " " + surname + ", " + degree;
	}
	
}

package model;

public class Professor {
	private long id;
	private String name;
	private String surname;
	private Degree degree;
	
	private static long idCounter = 10000;
	
	
	public Professor() {
		setId();
		setName("Unknown");
		setSurname("Unknown");
		setDegree(Degree.other);
	}
	
	public Professor(String name, String surname, Degree degree) {
		setId();
		setName(name);
		setSurname(surname);
		setDegree(degree);
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

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		if(degree!=null) {
			this.degree = degree;
		}
		else {
			degree = Degree.other;
		}
	}
	
	public String toString() {
		return "" + id + ": " + name + " " + surname + ", " + degree;
	}
	
}

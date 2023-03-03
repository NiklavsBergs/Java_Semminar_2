package model;

public class Professor {
	private long p_id;
	private String name;
	private String surname;
	private String degree;
	
	
	public Professor() {
		p_id = 0;
		name = "Vards";
		surname = "Uzvards";
		degree = "Grāds";
	}
	
	public Professor(long p_idIn, String nameIn, String surnameIn, String degreeIn) {
		p_id = p_idIn;
		name = nameIn;
		surname = surnameIn;
		degree = degreeIn;
	}
}

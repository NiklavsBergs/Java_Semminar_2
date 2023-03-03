package model;

public class Course {
	private long c_id;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	public Course() {
		c_id = 0;
		title = "Nosaukums";
		creditPoints = 1;
		professor = new Professor();
	}
	
	public Course(long c_idIn, String title, int creditPointsIn, Professor professorIn) {
		c_id = c_idIn;
		title = "Nosaukums";
		creditPoints = 1;
		professor = professorIn;
	}

	public long getC_id() {
		return c_id;
	}

	public void setC_id(long c_id) {
		this.c_id = c_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
}

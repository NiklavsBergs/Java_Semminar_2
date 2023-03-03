package model;

public class Course {
	private long id;
	private String title;
	private int creditPoints;
	private Professor professor;
	private static long idCounter = 0;
	
	public Course() {
		setId();
		setTitle("Nosaukums");
		setCreditPoints(1);
		setProfessor(new Professor());
	}
	
	public Course(String title, int creditPoints, Professor professor) {
		setId();
		setTitle(title);
		setCreditPoints(creditPoints);
		setProfessor(new Professor());
	}

	public long getId() {
		return id;
	}

	public void setId() {
		id = idCounter;
		idCounter++;
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
		if(creditPoints >= 0 && creditPoints <= 4) {
			this.creditPoints = creditPoints;
		}
		else {
			this.creditPoints = 0;
		}
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
}

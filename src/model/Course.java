package model;

public class Course {
	private long id;
	private String title;
	private int creditPoints;
	private CourseGradeType type;
	private Professor professor;
	private static long idCounter = 0;
	
	public Course() {
		setId();
		setTitle("Nosaukums");
		setCreditPoints(1);
		setType(CourseGradeType.other);
		setProfessor(new Professor());
	}
	
	public Course(String title, int creditPoints, CourseGradeType type, Professor professor) {
		setId();
		setTitle(title);
		setCreditPoints(creditPoints);
		setType(type);
		setProfessor(professor);
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
		if(title!=null && title.matches("[A-Z]{1}[a-zA-Z0-9\\sa-zēūīļķģšāčņžA-ZĒŪĪĻĶĢŠĀČŅŽ]+")) {
			this.title = title;
		}
		else {
			this.title = "Unknown";
		}
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(int creditPoints) {
		if(creditPoints > 0 && creditPoints < 21) {
			this.creditPoints = creditPoints;
		}
		else {
			this.creditPoints = 0;
		}
	}
	
	public CourseGradeType getType() {
		return type;
	}
	
	public void setType(CourseGradeType type) {
		if (type!=null) {
			this.type = type;
		}
		else {
			this.type = CourseGradeType.other;
		}
		
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		if (type!=null) {
			this.professor = professor;
		}
		else {
			this.professor = new Professor();
		}
		
	}
	
	public String toString() {
		return "" + id + ": " + title + ", " + creditPoints + "KP, " + professor.getName() + " " + professor.getSurname();
	}
}

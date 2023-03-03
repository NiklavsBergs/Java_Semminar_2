package service;

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
}

package model;

public class Grade {
	private long g_id;
	private int value;
	private Student student;
	private Course course;
	
	public Grade() {
		g_id = 0;
		value = 0;
		student = new Student();
		course = new Course();
	}
	
	public Grade(long g_idIn, int valueIn, Student studentIn, Course courseIn) {
		g_id = g_idIn;
		value = valueIn;
		student = studentIn;
		course = courseIn;
	}
}

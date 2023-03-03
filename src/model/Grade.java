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

	public long getG_id() {
		return g_id;
	}

	public void setG_id(long g_id) {
		this.g_id = g_id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}

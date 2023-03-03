package model;

public class Grade {
	private long id;
	private int value;
	private Student student;
	private Course course;
	private static long idCounter = 200000;
	
	public Grade() {
		setId();
		setValue(0);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	public Grade(int value, Student student, Course course) {
		setId();
		setValue(value);
		setStudent(student);
		setCourse(course);
	}

	public long getId() {
		return id;
	}

	public void setId() {
		id = idCounter;
		idCounter++;
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

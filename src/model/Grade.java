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
		if (value > 0 && value < 11) {
			this.value = value;
		}
		else {
			this.value = 0;
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		if (student!=null) {
			this.student = student;
		}
		else {
			this.student = new Student();
		}
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		if (course!=null) {
			this.course = course;
		}
		else {
			this.course = new Course();
		}
	}
	
	
}

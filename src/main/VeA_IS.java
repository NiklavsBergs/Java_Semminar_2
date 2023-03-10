package main;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.CourseGradeType;
import model.Degree;
import model.Faculty;
import model.Grade;
import model.Professor;
import model.Student;

public class VeA_IS {

	private static ArrayList<Professor> profList = new ArrayList<>();
	private static ArrayList<Student> studList = new ArrayList<>();
	private static ArrayList<Course> courseList = new ArrayList<>();
	private static ArrayList<Grade> gradeList = new ArrayList<>();
	
	public static void main(String[] args) {
	
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Jānis", "Ābols", Faculty.ITF, "121203-21662");
		System.out.println(st2);
		Student st3 = new Student("Līga", "Jaukā", Faculty.ITF, "121203-21668");
		System.out.println(st3);
		
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Janka", "Apse", Degree.Master);
		Professor pr3 = new Professor("Jana", "Vizule", Degree.Master);
		System.out.println(pr2);
		
		Course c1 = new Course("Math", 4, CourseGradeType.EXAM, pr2);
		Course c2 = new Course("English", 2, CourseGradeType.EXAM, pr3);
		
		System.out.println(c1);
		
		
		Grade gradeMath = new Grade(9, st2, c1);
		Grade gradeEng = new Grade(8, st2, c2);
		Grade gradeEng2 = new Grade(4, st3, c2);
		System.out.println(gradeMath);
		
		profList.add(pr1);
		profList.add(pr2);
		
		studList.addAll(Arrays.asList(st1, st2, st3));
		
		courseList.add(c1);
		courseList.add(c2);
		
		gradeList.addAll(Arrays.asList(gradeMath, gradeEng, gradeEng2));
		
		System.out.println();
		System.out.println(averageGrade(st2));
		System.out.println(averageCourseGrade(c2));
		System.out.println(profCoureCount(pr2, courseList));
		System.out.println();
		
		printList(gradeList);
		System.out.println();
		printList(studList);
		System.out.println();
		
		for(Student student : studList) {
			System.out.println(student.getName() + ": " + averageGrade(student));
		}
		
		System.out.println();
		for(Course course : courseList) {
			System.out.println(course.getTitle() + ": " + averageCourseGrade(course));
		}
	}
	
	private static float averageGrade(Student student) {
		if(student!=null) {
			int sum = 0;
			int count = 0;
			
			for (Grade grade : gradeList) {
				if(grade.getStudent().equals(student)) {
					sum += grade.getValue();
					count++;
				}
			}
			
			return (float)sum / count;
		}
		else {
			return 0;
		}
		
		
	}
	
	private static double averageGradeWeighted(Student student) {
		
		if(student!=null) {
			int sum = 0;
			int KP = 0;
			
			for (Grade grade : gradeList) {
				if(grade.getStudent().equals(student)) {
					sum += grade.getValue() * grade.getCourse().getCreditPoints();
					KP += grade.getCourse().getCreditPoints();
				}
			}
			
			return (float)sum / KP;
		}
		else {
			return 0;
		}
	}
	
	private static <T> void printList(ArrayList<T> list) {
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	private static double averageCourseGrade(Course course) {
		int sum = 0;
		int count = 0;
		
		for (Grade grade : gradeList) {
			if(grade.getCourse().equals(course)) {
				sum += grade.getValue();
				count++;
			}
		}
		
		return (double)sum / count;
	}
	
	private static int profCoureCount(Professor professor, ArrayList<Course> courseList) {
		long id = professor.getId();
		int count = 0;
		
		for (int i=0; i<courseList.size(); i++) {
			if(courseList.get(i).getProfessor().getId() == id) {
				count++;
			}
		}
		
		return count;
	}

}

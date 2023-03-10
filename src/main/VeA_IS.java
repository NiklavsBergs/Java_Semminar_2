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

	public static void main(String[] args) {
		ArrayList<Professor> profList = new ArrayList<>();
		ArrayList<Student> studList = new ArrayList<>();
		ArrayList<Course> courseList = new ArrayList<>();
		ArrayList<Grade> gradeList = new ArrayList<>();
		
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
		
		System.out.println(averageGrade(st2, gradeList));
		System.out.println(averageCourseGrade(c2, gradeList));
		System.out.println(profCoureCount(pr2, courseList));
		System.out.println();
		
		printList(gradeList);
		System.out.println();
		printList(studList);
	}
	
	static double averageGrade(Student students, ArrayList<Grade> gradeList) {
		long id = students.getId();
		int sum = 0;
		int count = 0;
		
		for (int i=0; i<gradeList.size(); i++) {
			if(gradeList.get(i).getStudent().getId() == id) {
				sum += gradeList.get(i).getValue();
				count++;
			}
		}
		
		return (double)sum / count;
	}
	
	static double averageGradeWeighted(Student students, ArrayList<Grade> gradeList) {
		long id = students.getId();
		int sum = 0;
		int KP = 0;
		
		for (int i=0; i<gradeList.size(); i++) {
			if(gradeList.get(i).getStudent().getId() == id) {
				sum += gradeList.get(i).getValue() * gradeList.get(i).getCourse().getCreditPoints();
				KP += gradeList.get(i).getCourse().getCreditPoints();
			}
		}
		
		return (double)sum / KP;
	}
	
	static <T> void printList(ArrayList<T> list) {
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	static double averageCourseGrade(Course course, ArrayList<Grade> gradeList) {
		long id = course.getId();
		int sum = 0;
		int count = 0;
		
		for (int i=0; i<gradeList.size(); i++) {
			if(gradeList.get(i).getCourse().getId() == id) {
				sum += gradeList.get(i).getValue();
				count++;
			}
		}
		
		return (double)sum / count;
	}
	
	static int profCoureCount(Professor professor, ArrayList<Course> courseList) {
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

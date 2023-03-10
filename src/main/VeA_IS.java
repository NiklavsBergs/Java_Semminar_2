package main;

import java.util.ArrayList;

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
		ArrayList<Student> courseList = new ArrayList<>();
		
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Jānis", "Ābols", Faculty.ITF, "121203-21662");
		System.out.println(st2);
		Student st3 = new Student("Jān4is", "Āb@ols", Faculty.ITF, "121203-21668");
		System.out.println(st3);
		
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Janka", "Apse", Degree.Master);
		System.out.println(pr2);
		
		Course math = new Course("Math", 4, CourseGradeType.EXAM, pr2);
		
		System.out.println(math);
		
		
		Grade gradeMath = new Grade(9, st2, math);
		System.out.println(gradeMath);
		
		profList.add(pr1);
		profList.add(pr2);
		
		studList.add(st1);
		studList.add(st2);
		studList.add(st3);
	}
	
	void averageGrade(ArrayList<Student> studList) {
		
	}
	

}

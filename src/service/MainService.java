package service;

import model.Degree;
import model.Faculty;
import model.Professor;
import model.Student;

public class MainService {
	
	public static void main(String[] args) {
		
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
	}
	
}

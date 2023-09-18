import java.util.ArrayList;
import java.util.Scanner;

/**
 * Example CourseGrades: a program to keep track of course
 * grades for a group of students.  Uses ArrayLists in a few
 * ways.
 *
 * @author Jim Teresco
 * @version Fall 2019
 */
public class CourseGrades {
    // We will have some instance variables to track the 
    // contents of the list of students and their grades
    // and a set of methods to interact with the list, which
    // is done from main, below.
    private ArrayList<StudentGrades> studentList;

    /**
     * Construct an empty CourseGrades.
     */
    public CourseGrades() {
        studentList = new ArrayList<StudentGrades>();
    }

    /**
     * Method to add a grade for a (possibly new) student.
     * 
     * @param name The student's name.
     * @param grade The grade to add for this student.
     */
    public void add(String name, double grade) {
        StudentGrades sg = findStudentGradesByName(name);

        if (sg != null) {
            sg.addGrade(grade);
        }
        else {
            sg = new StudentGrades(name);
            sg.addGrade(grade);
            studentList.add(sg);
        }
    }

    /**
     * Print out all of the students and their grades.
     */
    public void printAll() {
        for (StudentGrades sg : studentList) {
            System.out.println(sg);
        }
    }

    /*
     * Private helper method to look up the StudentGrades object
     * from the list that matches the name. Returns null if none.
     */ 
    private StudentGrades findStudentGradesByName(String name) {
        for (StudentGrades sg : studentList) {
            if (sg.getName().equals(name)) return sg;
        }

        return null;
    }

    /**
     * This is the main method for your program.
     * 
     * @param args No command line arguments are required.
     */
    public static void main(String[] args) {
        CourseGrades cg = new CourseGrades();
        
        cg.add("Linus", 83.5);
        cg.add("Snoopy", 95);
        cg.add("Linus", 91);
     }
}

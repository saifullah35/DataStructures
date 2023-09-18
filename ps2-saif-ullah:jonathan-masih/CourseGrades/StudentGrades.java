
import java.util.ArrayList;

/**
 * A class to track a student's name and a list of numeric grades for
 * that student.
 * 
 * @author Jim Teresco
 * @version Fall 2019
 */
public class StudentGrades {
    
    // we have a student's name and a list of that student's grades
    // as the fields for this class
    private String name;
    private ArrayList<Double> grades;
    
    /**
     * Construct a new student, who has no grades when starting out.
     * 
     * @param name The student's name.
     */
    public StudentGrades(String name) {
        this.name = name;
        grades = new ArrayList<Double>();
    }
    
    /**
     * Add a grade to a for the student.
     * 
     * @param The grade to add to this student's grade list.
     */
    public void addGrade(double grade) {
        grades.add(grade);
    }

    /**
     * Get this student's name.
     * 
     * @return The student's name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Determine equality of StudentGrades objects, defined such that two StudentGrades objects
     * are equal if they have the same name field
     * 
     * @param obj The other object.
     * @return true If this and obj have the same name field.
     */
    public boolean equals(Object obj) {
        StudentGrades other = (StudentGrades) obj;
        return other.name.equals(name);
    }
    
    /**
     * Returns a string representing the StudentGrade object.
     * 
     * @return Returns a string representing the StudentGrade object.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(name + ":");
        
        for (double score : grades) {
            s.append(" " + score);
        }
        
        return s.toString();
    }
}

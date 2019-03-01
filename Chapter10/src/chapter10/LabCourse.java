package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class LabCourse extends CollegeCourse{


    public LabCourse(Course department, Integer number, Integer credits) {
        super(department, number, credits);
        setFee(getFee()+50);
    }
    
    
    
}

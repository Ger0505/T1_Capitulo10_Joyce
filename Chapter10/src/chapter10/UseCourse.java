package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class UseCourse {
    public static void useCourse(){
        CollegeCourse collegeCourse = new CollegeCourse(Course.ART,31,2);
        LabCourse labCourse = new LabCourse(Course.BIO,1,4);
        
        System.out.println(collegeCourse.toString());
        System.out.println(labCourse.toString());
    }
}

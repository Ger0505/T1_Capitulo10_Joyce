package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class Faculty extends CollegeEmployee{
    private Boolean tenured;

    public Faculty(Boolean tenured, Integer social_security, Integer salary, String departament) {
        super(social_security, salary, departament);
        this.tenured = tenured;
    }

    @Override
    public String toString() {
        
        return "Faculty{" + "tenured=" + tenured + "}\n"+
                super.toString();
    }
    
    
}

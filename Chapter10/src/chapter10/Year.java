package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class Year{
    private Integer days;
    
    public Year(){
        this.days = 365;
    }
    
    public Year(Integer year){
        this.days = 366;
    }

    public Integer getDays() {
        return days;
    }

}

class UseYear {
    public static void useYear(){
        Year year = new Year();
        LeapYear leapYear = new LeapYear();
        System.out.println("Class Year="+year.getDays());
        System.out.println("Class Leap Year="+leapYear.getDays());
    }
}

class LeapYear extends Year {

    public LeapYear(){
        super(366);
    }
    
}
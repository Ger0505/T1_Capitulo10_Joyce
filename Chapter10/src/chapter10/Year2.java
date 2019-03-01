package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class Year2 {
    private Integer days;
    
    public Year2(){
        this.days = 365;
    }
    
    public Year2(Integer year){
        this.days = 366;
    }

    public Integer getDays() {
        return days;
    }
    
    public void daysElapsed(Integer month,Integer day){
        int par=0,days=0;
        for(int i=1;i<month;i++)
            if(i%2==0) par++;
        if(month>2){
            days+=(par-1)*30;
            days+=28;
        }else{
            days+=par*30;
        }
        days+=(month-par-1)*31;
        days+=(day-1);
        System.out.println(days+" dias han transcurrido en el año");
    }
}

class LeapYear2 extends Year2 {

    public LeapYear2(){
        super(366);
    }
    
    @Override
    public void daysElapsed(Integer month,Integer day){
        int par=0,days=0;
        for(int i=1;i<month;i++)
            if(i%2==0) par++;
        if(month>2){
            days+=(par-1)*30;
            days+=29;
        }else{
            days+=par*30;
        }
        days+=(month-par-1)*31;
        days+=(day-1);
        System.out.println(days+" dias han transcurrido en el año");
    }
    
}

class UseYear2 {
    public static void useYear(){
        Year2 year = new Year2();
        LeapYear2 leapYear = new LeapYear2();
        year.daysElapsed(5,5);
        leapYear.daysElapsed(5,5);
    }
}
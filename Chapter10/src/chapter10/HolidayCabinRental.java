package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class HolidayCabinRental extends CabinRental {

    public HolidayCabinRental(Integer number) {
        super(number);
        super.setRate(super.getRate()+150.0);
    }
    
    
}

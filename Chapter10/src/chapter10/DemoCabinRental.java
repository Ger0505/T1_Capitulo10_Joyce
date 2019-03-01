package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class DemoCabinRental {
    public static void demoCabinRental(){
        CabinRental cabinRental = new CabinRental(3);
        HolidayCabinRental h = new HolidayCabinRental(3);
        System.out.println("El cuarto No."+cabinRental.getNumber()+" cuesta $"+cabinRental.getRate());
        System.out.println("El cuarto No."+h.getNumber()+" cuesta $"+h.getRate());
    }
}

package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class Vehicle {
    private Integer wheels;
    private Integer gallons;

    public Vehicle(Integer wheels, Integer gallons) {
        this.wheels = wheels;
        this.gallons = gallons;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "wheels=" + wheels + ", gallons=" + gallons + '}';
    }
    
    
}

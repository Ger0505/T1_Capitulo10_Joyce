package chapter10_.gamezone;

/**
 *
 * @author Gerardo A A
 */
public class Alien {
    protected Integer eyes;
    protected String color;
    protected Integer arms;

    public Alien(Integer eyes, String color, Integer arms) {
        this.eyes = eyes;
        this.color = color;
        this.arms = arms;
    }

    @Override
    public String toString() {
        return "Alien{" + "eyes=" + eyes + ", color=" + color + ", name=" + arms + '}';
    }
    
    
}

package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class Horse {
    private String name;
    private String color;
    private Integer birth_year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(Integer birth_year) {
        this.birth_year = birth_year;
    }

    @Override
    public String toString() {
        return "Horse{" + "name=" + name + ", color=" + color + ", birth_year=" + birth_year + '}';
    }
    
    
}

class RaceHorse extends Horse{
    private Integer races;

    public Integer getRaces() {
        return races;
    }

    public void setRaces(Integer races) {
        this.races = races;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "RaceHorse{" + "races=" + races + '}';
    }

}

class DemoHorses {
    public static void demoHorses(){
        RaceHorse horse1 = new RaceHorse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setName("Blanco");
        horse1.setColor("Blanco");
        horse1.setBirth_year(1999);
        horse1.setRaces(10);
        horse2.setName("Manchas");
        horse2.setColor("Negro");
        horse2.setBirth_year(2009);
        horse2.setRaces(5);
        
        System.out.println(horse1.toString());
        System.out.println(horse2.toString());
    }
}
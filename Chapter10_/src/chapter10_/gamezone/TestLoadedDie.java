package chapter10_.gamezone;

/**
 *
 * @author Gerardo A A
 */
public class TestLoadedDie {
    public static void testLoadedDie(){
        int count=0;
        for(int i=0;i<1000;i++){
            Die die1 = new Die();
            Die die2 = new Die();
            if(die1.getValue()>die2.getValue())
                count++;
        }
        System.out.println("De 1000 tiros el dado 1 ganó "+count+" veces");
        count =0;
        for(int i=0;i<1000;i++){
            LoadedDie die1 = new LoadedDie();
            Die die2 = new Die();
            if(die1.getValue()>die2.getValue())
                count++;
        }
        System.out.println("De 1000 tiros el dado cargado ganó "+count+" veces");
    }
}

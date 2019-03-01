package chapter10_.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class DinnerEvent extends Event{
    
    public static final String[] menu1 ={"Sopa","Carne","Pastel"};
    public static final String[] menu2 ={"Sopa","Pescado","Pastel"};
    public static final String[] menu3 ={"Sopa","Ensalada","Pastel"};
    public static final String[][] menus ={menu1,menu2,menu3};
    private Integer no_menu;

    public DinnerEvent(String event_number, Integer guests,Integer menu){
        super(event_number, guests);
        this.no_menu=menu;
    }

    public Integer getNo_menu() {
        return no_menu;
    }
    
    
    
    public void getMenu(){
       for(String s:menus[this.no_menu-1]){
           System.out.println(s);
       }
    }

    @Override
    public String toString() {
        return "DinnerEvent{" + "menu=" + menus[no_menu-1] + "}\n"+super.toString();
    }
    
    
}

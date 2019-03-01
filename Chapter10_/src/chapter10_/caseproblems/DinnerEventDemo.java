package chapter10_.caseproblems;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class DinnerEventDemo {
    public static void dinnerEventDemo(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<DinnerEvent> eventos = new ArrayList<>();
        eventos.add(new DinnerEvent("B445",140,3));
        eventos.add(new DinnerEvent("A345",100,2));
        eventos.add(new DinnerEvent("A345",100,2));
        eventos.add(new DinnerEvent("F300",210,1));
        System.out.println("------");
        System.out.println("Ordenar por:");
        System.out.println("1. No. de Evento");
        System.out.println("2. No. de invitados");
        System.out.println("3. No. de menu");
        System.out.print("Escoger[1-3]:");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                    burbleEvent(eventos);
                    break;
            case 2: burbleGuests(eventos);
                    break;
            case 3: burbleMenu(eventos);
                    break;
        }
        
        for(DinnerEvent d:eventos){
            System.out.println(d.toString());
        }
    }
    
    private static void burbleGuests(ArrayList<DinnerEvent> eventos){
        DinnerEvent aux = null;
        for(int i =0;i<eventos.size()-1;i++){
            for(int j =0 ;j<eventos.size()-1;j++){
                if(eventos.get(j).getGuests()>eventos.get(j+1).getGuests()){
                    aux = eventos.get(j);
                    eventos.set(j,eventos.get(j+1));
                    eventos.set(j+1, aux);
                }
            }
        }
    }
    
    private static void burbleMenu(ArrayList<DinnerEvent> eventos){
        DinnerEvent aux = null;
        for(int i =0;i<eventos.size()-1;i++){
            for(int j =0 ;j<eventos.size()-1;j++){
                if(eventos.get(j).getNo_menu()>eventos.get(j+1).getNo_menu()){
                    aux = eventos.get(j);
                    eventos.set(j,eventos.get(j+1));
                    eventos.set(j+1, aux);
                }
            }
        }
    }
    
    private static void burbleEvent(ArrayList<DinnerEvent> eventos){
        DinnerEvent aux = null;
        for(int i =0;i<eventos.size()-1;i++){
            for(int j =0 ;j<eventos.size()-1;j++){
                if(eventos.get(j).getEvent_number().compareTo(eventos.get(j+1).getEvent_number()) < 0){
                    aux = eventos.get(j);
                    eventos.set(j,eventos.get(j+1));
                    eventos.set(j+1, aux);
                }
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

/**
 *
 * @author Gerardo A A
 */
public class UseCarRental {
    public static void useCarRental(){
        CarRental carro = new CarRental("Gerardo",3127,CarRental.FULL_SIZE,2);
        LuxuryRental luxu = new  LuxuryRental("Maria",4224,CarRental.ECONOMY,3,true);
        
        System.out.println(carro.toString());
        System.out.println(luxu.toString());
        
    }
}

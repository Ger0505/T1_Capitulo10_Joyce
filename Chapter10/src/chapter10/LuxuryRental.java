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
public class LuxuryRental extends CarRental{

    public LuxuryRental(String name, Integer zip_code, String size, Integer days,Boolean chauffeur) {
        super(name, zip_code, size, days,chauffeur);
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Chauffer: $"+200+" adicionales");
        System.out.println("");
    }

    @Override
    public String toString() {
        return "LuxuryRental{"+super.toString();
    }
    
    
}

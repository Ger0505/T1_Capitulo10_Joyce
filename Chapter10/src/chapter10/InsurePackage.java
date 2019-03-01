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
public class InsurePackage extends Package{
    
    public InsurePackage(Integer weight, String method) {
        super(weight, method);
    }
    
    private void Insure(){
        Double insure = getCost();
        if(insure>=0 && insure<=1)
            setCost(insure+2.45);
        else if(insure>1 && insure<=3)
            setCost(insure+3.95);
        else if(insure>3)
            setCost(insure+5.55);
    }
    
    
    
}

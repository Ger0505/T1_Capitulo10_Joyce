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
public class CabinRental {
    private Integer number;
    private Double  rate;

    public CabinRental(Integer number) {
        this.number = number;
        if(number==1 || number==2 || number==3)
            this.rate = 950.0;
        else
            this.rate = 1100.0;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
    
    

    public Integer getNumber() {
        return number;
    }

    public Double getRate() {
        return rate;
    }
    
    
}

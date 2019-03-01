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
public class CarRental {
    public static final String ECONOMY = "Economy";
    public static final String MIDSIZE = "MIDSIZE";
    public static final String FULL_SIZE = "Full Size";
    
    private String name;
    private Integer zip_code;
    private String size;
    private Double fee;
    private Integer days;
    private Double total_fee;

    public CarRental(String name, Integer zip_code, String size, Integer days) {
        this.name = name;
        this.zip_code = zip_code;
        this.size = size;
        this.days = days;
        calculateFee();
        this.total_fee = days*this.fee;
    }
    
    public CarRental(String name, Integer zip_code, String size, Integer days,Boolean chauffeur){
        this.name = name;
        this.zip_code = zip_code;
        this.size = size;
        this.days = days;
        this.fee =79.99;
        if(chauffeur)
            this.fee+=200;
        this.total_fee = days*this.fee;
    }
    
    private void calculateFee(){
        if(this.size.equals(ECONOMY))
            this.fee = 29.99;
        else if (this.size.equals(MIDSIZE))
            this.fee = 38.99;
        else if (this.size.equals(FULL_SIZE))
            this.fee = 43.50;
    }
    
    public void display(){
        System.out.println(" Size       Cost");
        System.out.println("ECONOMY    $29.99");
        System.out.println("MIDSIZE    $38.99");
        System.out.println("ECONOMY    $43.50");
        System.out.println(".................");
    }

    @Override
    public String toString() {
        display();
        return "CarRental{" + "name=" + name + ", zip_code=" + zip_code + ", size=" + size + ", days=" + days +"\n fee=" + fee + ", total_fee=" + total_fee + '}';
    }
    
    
}

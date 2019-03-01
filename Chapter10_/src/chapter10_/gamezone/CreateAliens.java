/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10_.gamezone;

/**
 *
 * @author Gerardo A A
 */
public class CreateAliens {
    public static void createAliens(){
        Martian mars = new Martian();
        Jupiterian jupiterian = new Jupiterian();
        
        System.out.println(mars.toString());
        System.out.println(jupiterian.toString());
    }
}

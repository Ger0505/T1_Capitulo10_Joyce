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
public class LoadedDie extends Die{
    public static final Integer HIGHEST_DIE_VALUE=6;
    public static final Integer LOWEST_DIE_VALUE=2;
    public LoadedDie() {
        this.value = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
        LOWEST_DIE_VALUE);
    }

    @Override
    public Integer getValue() {
        return super.getValue(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

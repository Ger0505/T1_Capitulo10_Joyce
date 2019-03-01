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
public class Die {
    public static final Integer HIGHEST_DIE_VALUE=6;
    public static final Integer LOWEST_DIE_VALUE=1;
    
    protected Integer value;

    public Die() {
        this.value = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
        LOWEST_DIE_VALUE);
    }

    public Integer getValue() {
        return value;
    }
    
}

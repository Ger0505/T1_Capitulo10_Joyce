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
public class Student extends Person{
    private String field;
    private Double average;

    public Student(String field, Double average) {
        this.field = field;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" + "field=" + field + ", average=" + average + "}\n"+
                super.toString();
    }
    
    
}

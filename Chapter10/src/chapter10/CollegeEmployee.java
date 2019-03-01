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
public class CollegeEmployee extends Person{
    private Integer social_security;
    private Integer salary;
    private String departament;

    public CollegeEmployee(Integer social_security, Integer salary, String departament) {
        this.social_security = social_security;
        this.salary = salary;
        this.departament = departament;
    }

    
    @Override
    public String toString() {

        return "CollegeEmployee{" + "social_security=" + social_security + ", salary=" + salary + ", departament=" + departament + "}\n"+
               super.toString();
    }
    
    
}

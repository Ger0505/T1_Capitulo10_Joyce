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
public class CollegeCourse {
    
    private Course department;
    private Integer number;
    private Integer credits;
    private Integer fee;

    public CollegeCourse(Course department, Integer number, Integer credits) {
        this.department = department;
        this.number = number;
        this.credits = credits;
        this.fee = 120;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "CollegeCourse{" + "department=" + department + ", number=" + number + ", credits=" + credits + ", fee=" + fee + '}';
    }  
    
}

enum Course{
        ENG,SPA,MATH,IT,ART,BIO,CHM,CIS,PHY;
    }

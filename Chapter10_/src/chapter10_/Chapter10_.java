/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10_;

import chapter10_.caseproblems.DinnerEventDemo;
import chapter10_.caseproblems.LessonWithRentalDemo;
import chapter10_.gamezone.CreateAliens;
import chapter10_.gamezone.TestLoadedDie;

/**
 *
 * @author Gerardo A A
 */
public class Chapter10_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //GAME ZONE
        CreateAliens.createAliens();
        TestLoadedDie.testLoadedDie();
        //CASE PROBLEMS
        DinnerEventDemo.dinnerEventDemo();
        LessonWithRentalDemo.lessonWithRentalDemo();
    }
    
}

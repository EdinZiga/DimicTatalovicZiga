/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence_diagram_example;

/**
 *
 * @author kanita
 */
public class Driver {
    
    public static void main(String[] args) {
        
        Driver.registerStudent();
    }
    
    public static void registerStudent() {
        
        Student studentEmma = new Student();
        Course aiCourse = new Course();
        Seminar mlSeminar = new Seminar("ML", aiCourse);
      
       
        boolean enrolmentStatus  = mlSeminar.enrollStudent(studentEmma);
         //if ...aiCourse
        
    }
}

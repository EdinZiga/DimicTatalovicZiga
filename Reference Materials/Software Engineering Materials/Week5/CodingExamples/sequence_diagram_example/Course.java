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
public class Course {
    
    public boolean isStudentEligible(Student s) {
       int h =  s.getSeminarHistory();
       if (h == 0) {
           return false;
       }else 
           return true;
    }
    
}

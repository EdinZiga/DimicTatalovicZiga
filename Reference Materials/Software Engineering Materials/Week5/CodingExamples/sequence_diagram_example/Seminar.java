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
public class Seminar {
    
    private Course course;
    private String name;
    
    public Seminar(String seminarName, Course cn) {
        this.course = cn;
        name = seminarName;
    }
    
    
    public boolean enrollStudent(Student s1) {
        return course.isStudentEligible(s1);
        
    }
}

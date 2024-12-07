/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.util.ArrayList;

/**
 * //composition
 * @author kanita
 */
public class House {
    
    private ArrayList<Room> rooms;
    
     public House() {
       rooms = new ArrayList<Room>(); 
       rooms.add(new Room());
    }
     
   
}

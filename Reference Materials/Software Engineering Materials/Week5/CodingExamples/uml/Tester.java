 
package uml;

/**
 *
 * @author kanita
 */
public class Tester {
    
    public static void main(String[] args) {
        
        Engine brandNew = new Engine();
        
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        
        myCar1.setEngine(brandNew);
        myCar1 = myCar2;//here the object referenced by myCar1 will be garbege collected. but brandNew Engine will not be
        
        
        House myH1 = new House();
        House myH2 = new House();
        myH1= myH2;//here the object referenced by myH1 will be garbege collected, as well as myH1 rooms
        
        
    }
    
}

package flight.system;

//Create class:
public class Aircraft{

// Attributes:
    String manufc; // aircraft manufacturer
    double weight; // aircraft weight in lbs
    String engine; // engine type
    double trusth; // total trusth of engines
    double fuelcp; // aircraft fuel capacity in lbs
    int passen; // passengers capacity
    int crewcp; // crew capacity
    double speedx; // aircraft speed
    double speedl; // aircraft limit speed - nm

// Class behavior:
    void speedup(){
        speedx = speedx+35;
    }
    void speedow(){
        speedx = speedx-35;
    }//

}

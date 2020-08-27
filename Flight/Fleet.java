package flight;

// Main method:
    public class Fleet{
    public static void main(String[] args){

// Creating instances of the aircraft class:
   Aircraft a319 = new Aircraft();
   Aircraft a320 = new Aircraft();
   Aircraft a330 = new Aircraft();
   Aircraft a380 = new Aircraft();
   Aircraft b737 = new Aircraft();
   Aircraft b777 = new Aircraft();
   Aircraft b747 = new Aircraft();
   Aircraft c208 = new Aircraft();
   Aircraft c220 = new Aircraft();
   Aircraft c750 = new Aircraft();
   // Data definition:
   // A319
    a319.manufc = "Airbus";
    a319.weight = 129600.0;
    a319.engine = "PW1100G-JM";
    a319.trusth = (33000)*2;
    a319.fuelcp = 6280;
    a319.passen = 160;
    a319.crewcp = 5;
    a319.speedl = 400;
    // A320
    a320.manufc = "Airbus";
    a320.weight = 138400.0;
    a320.engine = "PW1100G-JM";
    a320.trusth = (33000)*2;
    a320.fuelcp = 6280;
    a320.passen = 180;
    a320.crewcp = 5;
    a320.speedl = 380;
    // A330
    a330.manufc = "Airbus";
    a330.weight = 381400.0;
    a330.engine = "PW4000";
    a330.trusth = (68000)*2;
    a330.fuelcp = 25765;
    a330.passen = 277;
    a330.crewcp = 5;
    a330.speedl = 480;
    //
    System.out.println("Aircraft Flight Project");
    System.out.println("========================");
    System.out.println("");
    System.out.println("---------------------------------------");
    System.out.println("Aircraft fleet");
    System.out.println("--------------------------------------");
    System.out.println("A319: ");
    System.out.println("Weight: "+a319.weight+" Engine: "+a319.engine+" Trusth: "+a319.trusth);
    System.out.println("Fuel capacity: "+a319.fuelcp+"lbs.");
    System.out.println("Passengers: "+a319.passen+" Crew: "+a319.crewcp);
    System.out.println("--------------------------------------");
    System.out.println("A320: ");
    System.out.println("Weight: "+a320.weight+" Engine: "+a320.engine+" Trusth: "+a320.trusth);
    System.out.println("Fuel capacity: "+a320.fuelcp+"lbs.");
    System.out.println("Passengers: "+a320.passen+" Crew: "+a320.crewcp);
    System.out.println("---------------------------------------");
    System.out.println("A330: ");
    System.out.println("Weight: "+a330.weight+" Engine: "+a330.engine+" Trusth: "+a330.trusth);
    System.out.println("Fuel capacity: "+a330.fuelcp+"lbs.");
    System.out.println("Passengers: "+a330.passen+" Crew: "+a330.crewcp);
    System.out.println("---------------------------------------");
//
// A319 TEST
// Aircraft A319 speed up to limit:
   System.out.println(" ");
   System.out.println("=========================");
   System.out.println("Aiburs A319 speed status: ");

   System.out.println("Aiburs A319 speed UP: ");
      while (a319.speedx  < a319.speedl){
            a319.speedup();
            System.out.println(a319.speedx+" knots");
        }
// Aircraft A319 spped slowing down to 0:
    System.out.println(" ");
    double speedcheck = a319.speedx;
        System.out.println("Airbus A319 slowing down: ");
        while (a319.speedx > 0){
            a319.speedow();
            System.out.println(a319.speedx+"knots");
        }
    }
}

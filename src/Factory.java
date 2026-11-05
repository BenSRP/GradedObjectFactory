public class Factory {


    //    public boolean isOpen = true;
//    public int yearFounded = 2026;
//
//    //instance variables
//    //always use public
//    //todo: make 2 variables called isOpen and yearFounded what data
//    // string - hold words, puncuatuion, sentences
//    //have to use quotes
//    public String owner = "Ben";
    //special variable called an object
//objects are made from classes we create
//objects are the house, classes are the blueprints
    public int Canada;

    //public Pumpkin pumpkin1;
//
//    public Pumpkin pumpkin2;
//
//    public Pumpkin pumpkin3;
//
//public int randomSize;
//
    public Canada Canada1;
    public Canada Canada2;

    public static void main(String[] args) {
        Factory a = new Factory();
        // new Factory();
    }


    //special method: constructor
    public Factory() {
//        System.out.println("Welcome to Ben's Factory");

//        System.out.println ("the year founded is ....");
//        System.out.println (yearFounded);
//        System.out.println("it is" + isOpen +"that the factory is open");
//        System.out.println("the owner is " +owner);

        Canada1 = new Canada(true, 1000000, "Drake May");
        Canada1.Affordability(1000000);
        Canada1.election("Mr. Hales");
        Canada1.Season(true);

        Canada1.Printinfo();

        Canada2 = new Canada ();
        Canada2.Affordability(500000);




//        pumpkin1 = new Pumpkin(20, true, "Orange");
//        System.out.println(pumpkin1.color);
//        //todo: print out the rest of the pumpkin's instance variables
//        //bonus challenge: print out words to explain the variables
//        System.out.println(pumpkin1.size);
//        System.out.println(pumpkin1.isJackolantern);
//
//        randomSize = (int)(Math.random() * 31); //range 0-30
//        pumpkin2 = new Pumpkin(67, false, "White");
//        System.out.println("random " + pumpkin2.size);
//        System.out.println(pumpkin2.color);
//       pumpkin2.color = "Blue";
//        pumpkin2.size = 20;
//        pumpkin2.size = pumpkin1.size * 2;
//        System.out.println(pumpkin2.size);
//        System.out.println(pumpkin2.color);
//        pumpkin2.printInfo();
//
//        pumpkin3 = new Pumpkin(100, true, "Green");
//        System.out.println(pumpkin3.color);
//        pumpkin3.color = "White";
//        pumpkin3.size = pumpkin2.size * pumpkin1.size;
//        System.out.println(pumpkin3.color);
//        System.out.println(pumpkin3.size);
//
//
//        pumpkin1.sizemultiplier (5);

    }


}



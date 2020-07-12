package com.company;

public class Main {

    public static void main(String[] args) {
//	    MotherBoard motherboard = new MotherBoard("B-450", "Gigabyte", 2);
//	    Case theCase = new Case("Delux", "ATX", 500);
//        Monitor monitor = new Monitor("samsung", "S19B150", 60);
//        Pc pc = new Pc(motherboard, theCase, monitor);


        Wall wall1 = new Wall("East", "White");
        Wall wall2 = new Wall("West", "White");
        Wall wall3 = new Wall("North", "White");
        Wall wall4 = new Wall("South", "White");

        Door door = new Door("Wood", 1);
        Window window = new Window(1,"large");

        BedRoom bedroom = new BedRoom(wall1, wall2, wall3, wall4, window, door);

        bedroom.openDoor();
        bedroom.IsWindowOpen();
    }
}

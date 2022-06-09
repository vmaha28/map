package com.fastrack;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        First second = new First();

        Clock clok1 = new Clock();
        clok1.setHour(18);
        clok1.setMinute(30);
        Clock clock2 = new Clock();


        System.out.println(clok1.getTime());
        System.out.println((clock2.getTime()));
        System.out.println(clok1.getHour());
        Door door1 = new Door(true, false);
        Door door2 = new Door(false, true);
        Door door3 = new Door(true);
        System.out.println(door3.isOpened());

        if (door1.isOpened()) {
            System.out.println("Door is open");
        } else {
            System.out.println("door is closed");
        }

        Door door5= new Door(true, true);

        Door door6= new Door(false);
        door6.closeDoor();
        door6.closeDoor();

        AccesModifiers accesModifiers= new AccesModifiers();


        System.out.println("Done");

    }
}

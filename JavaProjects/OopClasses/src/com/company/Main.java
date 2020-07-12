package com.company;

public class Main {

    public static void main(String[] args) {
//	    Account bobsaccount = new Account();
//
//	    bobsaccount.deposite(100);
//        bobsaccount.deposite(150);
//        bobsaccount.withdraw(50);
//        bobsaccount.withdraw(200);
//        bobsaccount.withdraw(10);

//        Car porsche = new Car("carrera", "blue", "v6", 4, 2);
//
//        System.out.println(porsche.getColour());
//        System.out.println(porsche.getModel());

        VipPerson person1 = new VipPerson();
        System.out.println("Person1 " + person1.getName());
        System.out.println(person1.getAccountLimit());
        System.out.println(person1.getEmail());

        VipPerson person2 = new VipPerson("samsung", 1000000);
        System.out.println("person2 " + person2.getName());
        System.out.println(person2.getAccountLimit());
        System.out.println(person2.getEmail());

        VipPerson person3 = new VipPerson("microlab", 2000000, "microlab@email.com");
        System.out.println("person3 " + person3.getName());
        System.out.println(person3.getAccountLimit());
        System.out.println(person3.getEmail());

    }
}

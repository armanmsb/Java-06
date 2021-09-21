package com.company;

public class Classroom {

    public static void main(String[] args) {

        Wilder wilder1 = new Wilder("Eldor", true);
        Wilder wilder2 = new Wilder("Christiane", false);
        Wilder wilder3 = new Wilder("David", true);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }
}

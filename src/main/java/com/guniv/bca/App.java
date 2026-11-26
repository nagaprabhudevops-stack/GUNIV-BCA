package com.guniv.bca;

public class App {

    public String greet(String name) {
        return "Helloo, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greet("GUNIV-BCA"));
    }
}

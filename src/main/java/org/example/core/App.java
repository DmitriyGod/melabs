package org.example.core;

public class App {
    public static void task1() {
        IO.println("Hello, World!");
    }

    public static void task2() {
        final var x = Double.parseDouble(IO.readln("first number: "));
        final var y = Double.parseDouble(IO.readln("second number: "));
        final var z = Double.parseDouble(IO.readln("third number: "));

        IO.println("Numbers production: " + (x * y * z));
        IO.println("Numbers average: " + (x * y * z) / 3);
        IO.println("Numbers max: " + Math.max(x, Math.max(y, z)) );
    }

}

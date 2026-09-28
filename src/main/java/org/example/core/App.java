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



    public static void task4() {
        IO.println("Give parameters for equation ax^2 + bx + c = 0");
        final var a = Double.parseDouble(IO.readln("a: "));
        final var b = Double.parseDouble(IO.readln("b: "));
        final var c = Double.parseDouble(IO.readln("c: "));

        final var D = Math.pow(b, 2) - 4 * a * c;

        IO.println("Discriminant: " + D);

        if (D < 0) IO.println("No roots in real numbers");
        else if (D == 0) IO.println("Root: " + - b / (2 * a));
        else {
            IO.println("Root1: " + (-b + Math.sqrt(D)) / (2 * a));
            IO.println("Root2: " + (-b - Math.sqrt(D)) / (2 * a));
        }
    }

    public static void task3() {
        final var x = Integer.parseInt(IO.readln("first number: "));
        final var y = Integer.parseInt(IO.readln("second number: "));
        final var z = Integer.parseInt(IO.readln("third number: "));

        IO.println("Numbers production: " + (x * y * z));
        IO.println("Numbers average: " + (x * y * z) / 3);
        IO.println("Numbers max: " + Math.max(x, Math.max(y, z)) );
    }

    public static void task5() {
        // о, сделал!
    }
}

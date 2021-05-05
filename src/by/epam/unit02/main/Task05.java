package by.epam.unit02.main;

import static java.lang.Math.*;

public class Task05 {

    public static void main(String[] args) {
        double x = 30.0;
        double y = 60.0;
        double r = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

        System.out.println("The result of expression is " + r + ".");
    }
}

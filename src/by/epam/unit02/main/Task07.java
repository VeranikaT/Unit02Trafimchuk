package by.epam.unit02.main;

public class Task07 {

    public static void main(String[] args) {
        int a = -4;
        int b = 3;
        int c = 0;
        double ra, rb, rc;
        String sa, sb, sc;

        if (a >= 0) {
            ra = Math.pow(a, 2);
            sa = "positive or null";
        } else {
            ra = Math.pow(a, 4);
            sa = "negative";
        }

        if (b >= 0) {
            rb = Math.pow(b, 2);
            sb = "positive or null";
        } else {
            rb = Math.pow(b, 4);
            sb = "negative";
        }

        if (c >= 0) {
            rc = Math.pow(c, 2);
            sc = "positive or null";
        } else {
            rc = Math.pow(c, 4);
            sc = "negative";
        }

        System.out.println("The result for a is " + ra + "." + " The number was " + sa + ".");
        System.out.println("The result for b is " + rb + "." + " The number was " + sb + ".");
        System.out.println("The result for c is " + rc + "." + " The number was " + sc + ".");
    }
}

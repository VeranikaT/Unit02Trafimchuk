package by.epam.unit02.main;

public class Task09 {
    private static double f(int x) {
        if (x <= -3) {
            return 9;
        }
        if (x > 3) {
            return (1 / (Math.pow(x, 2) + 1));
        }
        return x;
    }

    public static void main(String[] args) {
        double x = 5;
        System.out.println(f((int) x));
    }
}

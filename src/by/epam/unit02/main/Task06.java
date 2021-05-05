package by.epam.unit02.main;

public class Task06 {

    public static void main(String[] args) {
        int M = 125;
        int N = 4;
        double x = (double) M / N;
        int y = (int) (x % 10);
        int o = (int) (x * 10 % 10);
        System.out.println("The result is " + x + ".");
        System.out.println("The smallest number of integer part is " + y + " and the biggest number of fractional part is " + o + ".");
    }
}

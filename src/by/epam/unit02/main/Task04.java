package by.epam.unit02.main;

public class Task04 {

    public static void main(String[] args) {
        int x1 = 8;
        int x2 = 12;
        int y1 = 13;
        int y2 = 16;
// при решении этой задачи нужно учитывать, что координата x2 , может быть раньше x1 , или они обе м.б. отрицательными, т.е. работать с модулями чисел.
        double a = x2 - x1;
        double b = y2 - y1;

        double l = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Length between two points is " + l + ".");
    }
}

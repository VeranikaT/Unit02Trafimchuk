package by.epam.unit02.main;

public class Task03 {

    public static void main(String[] args) {
        int numberOfSeconds = 30000;
        int HH = numberOfSeconds / 3600;
        numberOfSeconds = numberOfSeconds - HH*3600;
        int MM = numberOfSeconds / 60;
        numberOfSeconds = numberOfSeconds - MM*60;
        int SS = numberOfSeconds;
        System.out.println(HH+"ч" +MM+"мин"+SS+"с.");
    }
}

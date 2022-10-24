package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane su=new Airplane("Сухой", 2020, 25.5, 137.7);
        su.info();
        su.fillUp(20.3);
        su.setYear(2022);
        su.info();
    }
}

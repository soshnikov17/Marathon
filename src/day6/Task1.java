package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car=new Car();
        car.info();
        car.setYear(2015);
        System.out.println(car.yearDifference(2020));
    }
}

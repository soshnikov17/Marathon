package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1=new Airplane("Mig",1999,25.6,137);
        Airplane airplane2=new Airplane("Su", 2005,27.7,54.3);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}

package day6;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    double getFuel(){
        return fuel;
    }

    Airplane(String producer, int year, double length, double weight){
        this.producer=producer;
        this.year=year;
        this.length=length;
        this.weight=weight;
    }

    void setYear(int year){
        this.year=year;
    }

    void setLength(double length){
        this.length=length;
    }

    void info(){
        System.out.println("Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+" ,количество топлива в баке: "+fuel);
    }

    void fillUp(double size){
        fuel+=size;
    }
}

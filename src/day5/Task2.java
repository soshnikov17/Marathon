package day5;

class Motorbike {
    private int year;
    private String color;
    private String model;

    Motorbike(int year, String color, String model){
        this.year=year;
        this.color=color;
        this.model=model;
    }

    int getYear(){
        return year;
    }

    String getColor(){
        return color;
    }

    String getModel(){
        return model;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Motorbike yamaha=new Motorbike(1994,"Синий", "YZF");
        System.out.println("Цвет мотоцикла: "+yamaha.getColor());
        System.out.println("Модель мотоцикла: "+yamaha.getModel());
        System.out.println("Год выпуска мотоцикла: "+yamaha.getYear());
    }
}

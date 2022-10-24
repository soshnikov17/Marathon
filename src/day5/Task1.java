package day5;

class Car {
    private int year;
    private String color;
    private String model;

    void setColor(String color){
        this.color=color;
    }

    void setYear(int year){
        this.year=year;
    }

    void setModel(String model){
        this.model=model;
    }

    String getColor(){
        return color;
    }

    String getModel(){
        return model;
    }

    int getYear(){
        return year;
    }
}

public class Task1 {

    public static void main(String[] args) {
       Car lada=new Car();
       lada.setColor("Красный");
       lada.setModel("2121");
       lada.setYear(1994);
       System.out.println("Цвет машины: "+lada.getColor());
       System.out.println("Модель машины: "+lada.getModel());
       System.out.println("Год выпуска машмны: "+lada.getYear());
    }

}


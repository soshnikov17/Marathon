package day6;

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

    void info(){
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int yearInput){
        return Math.abs(yearInput-year);
    }
}

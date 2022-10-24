package day6;

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

    void info(){
        System.out.println("Это автомобиль");
    }

    int yearDifference(int yearInput){
        return Math.abs(yearInput-year);
    }
}


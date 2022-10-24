package day7;

public class Task2 {
    public static void main(String[] args) {
        Player.info();
        Player vasya=new Player(90);
        Player.info();
        Player vasya1=new Player(92);
        Player vasya2=new Player(96);
        Player vasya3=new Player(95);
        Player vasya4=new Player(99);
        Player vasya5=new Player(100);
        Player.info();
        vasya.run();
        vasya.run();
        vasya.run();
        vasya.run();
        vasya.run();
        vasya.run();
        vasya.run();
        vasya.run();
        vasya.run();
        vasya.run();
        vasya.run();
        System.out.println(vasya.getStamina());
        Player.info();

    }
}

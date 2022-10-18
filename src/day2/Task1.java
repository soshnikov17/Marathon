package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int a= console.nextInt();
        if (a<0)
            System.out.println("Ошибка ввода");
        else if (a>0&&a<5)
            System.out.println("Малоэтажный дом");
        else if (a>4&&a<9)
            System.out.println("Среднеэтажный дом");
        else if (a>8)
            System.out.println("Многоэтажный дом");
    }
}

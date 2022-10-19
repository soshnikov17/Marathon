package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        while(true){
            double x=console.nextDouble();
            double y=console.nextDouble();
            if(y==0) {
                break;
            }
            System.out.println(x/y);
        }
    }
}

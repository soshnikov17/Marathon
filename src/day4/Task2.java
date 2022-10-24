package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int count0=0;
        int sum=0;
        Random random= new Random();
        int[] array=new int[100];
        for (int i:array) {
            array[i]=random.nextInt(10000);
            if(array[i]<min) {
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]%10==0){
                sum+=array[i];
                count0++;
            }
        }
        System.out.println("Минимальное число в массиве: "+min);
        System.out.println("Максимальное число в массиве: "+max);
        System.out.println("Количество чисел в массиве, которые оканчиваются на ноль: "+count0);
        System.out.println("Сумма чисел, которые оканчиваются на ноль: "+sum);
    }
}

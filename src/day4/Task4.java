package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int n=10;
        Random random=new Random();
        int[]array=new int[n];
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            array[i]= random.nextInt(100);
            System.out.print(array[i]+" ");
        }

        int sumThree=0;
        int sumThreeMax=0;
        int indexMax=0;
        System.out.print("\nСуммы трех соседних чисел: ");
        for (int i = 0; i <n-2; i++) {
            sumThree=array[i]+array[i+1]+array[i+2];
            System.out.print(sumThree+" ");
            if(sumThreeMax<sumThree){
                sumThreeMax=sumThree;
                indexMax=i;
            }
        }
        System.out.println("\nМаксимальная сумма тройки: "+sumThreeMax);
        System.out.println("Индекс первого элемента максимальной тройки: "+indexMax);
    }
}

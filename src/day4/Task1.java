package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int count1=0;
        int odd=0;
        int even=0;
        int sum=0;
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array =new int[n];
        System.out.println("Введено число: "+n+". Сформирован следующий массив");

        for (int i:array) {
            array[i]= random.nextInt(12);
            System.out.print(array[i]+" ");
            sum+=array[i];
            if (array[i]==1)
                count1++;
            if (array[i]%2==0)
                odd++;
            if (array[i]%2!=0)
                even++;
        }
        System.out.println();
        System.out.println("Длина массива: "+array.length);
        System.out.println("Количество чисел равных одному: "+count1);
        System.out.println("Количество четных чисел: "+odd);
        System.out.println("Количество четных чисел: "+even);
        System.out.println("Сумма всех чисел: "+sum);
    }
}

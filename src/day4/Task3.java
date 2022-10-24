package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int n=12;
        int m=8;
        Random random=new Random();
        int[][] matrix=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=random.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int maxSumIndex=0;
        int sumLineMax=0;
        for (int i = 0; i <n; i++) {
            int sumLine=0;
            for (int j = 0; j <m; j++) {
                sumLine+=matrix[i][j];
            }
            if(sumLineMax<sumLine) {
                sumLineMax = sumLine;
                maxSumIndex=i;
            }
        }
        System.out.println("Номер строки с максимальным индексом: "+maxSumIndex);
    }
}

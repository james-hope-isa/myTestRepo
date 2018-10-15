package pl.infoshare;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        int []arrayFor=new.int[1000];
//
//        for (int i =0;i<1000;i++)
//        {
//            arrayFor[i]=i+1;
//        }
//
//        for(int element: arrayFor) {
//            System.out.println(element);
//        }

//        PETLA 2D
//
//
//        int[][] array2D=new int[10][10];
//
//        for(int i=0 ; i<array2D.length ; i++){
//            System.out.println("I'm in row no. "+i);
//            for (int j=0 ; j<array2D.length; j++){
//                System.out.println("I'm in a column no. "+j);
//
//

//        int[][] array2D = new int[10][10];
//
//        for (int i = 1; i < array2D.length + 1; i++) {
//            System.out.print(i + ". ");
//            for (int j = 1; j < array2D.length + 1; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


        int[] array=new int[11];

        Random random = new Random();
        int randomInt = random.nextInt(100 ) +1;



        for (int i=0;i<array.length;i++)
            {
            array[i]= random.nextInt(100 ) +1;
            }

            for (int i=0;i<array.length;i++)
            {
                if(i%2 !=0)
                {
                    System.out.println("Index no. " + i +"\tvalue: " + array[i]);
                }
            }

            char[][] arrayStars= new char [10][10];

            for(int i=0;i<arrayStars.length;i++){
                for(int j=0;j<arrayStars.length;j++){
                    arrayStars[i][j]='*';
                }
            }

            for(int i=0;i<arrayStars.length;i++){
                for (int j = 0 ; j<arrayStars.length; j++) {
                    if (i % 2 == 0) {
                        System.out.print(arrayStars[i][j]);
                    } else System.out.print(" ");
                }
                    System.out.println();

            }


    }
}

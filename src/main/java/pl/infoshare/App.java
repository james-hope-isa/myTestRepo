package pl.infoshare;

import java.sql.SQLOutput;
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

        int[][] array2D = new int[10][10];

        for (int i = 1; i < array2D.length + 1; i++) {
            System.out.print(i + ". ");
            for (int j = 1; j < array2D.length + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

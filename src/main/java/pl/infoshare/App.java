package pl.infoshare;

import javax.swing.plaf.basic.BasicLookAndFeel;
import java.io.File;
import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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

        /*

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




            int Answer= new Random().nextInt(10 ) +1;
        Scanner scanner = new Scanner(System.in);

        while(true) {


            System.out.println("Podaj liczbe od 1 do 10 tylko bez sciemniania");
            int Number = scanner.nextInt();

            if (Number < 1 || Number > 10) {
                System.out.println("Mialo byc bez sciemniania!");
            }

            if (Number == Answer){ System.out.println("DOBRZE!");
            break;}
            else System.out.println("Pudlo");
        }

        /*
        Random rng = new Random(); // Ideally just create one instance globally
// Note: use LinkedHashSet to maintain insertion order
        Set<Integer> generated = new LinkedHashSet<Integer>();
        while (generated.size() < 6)
        {
            Integer next = rng.nextInt(49) + 1;
            // As we're adding to a set, this will automatically do a containment check
            generated.add(next);
        }

      Integer[] a =  (Integer[])generated.toArray();

        for (Integer elem:
             generated) {
            for (int item:
                 array) {
                item == elem
            }
        }

        */


        File file=new File("/home/trener/Desktop/moj.txt");


    }
}

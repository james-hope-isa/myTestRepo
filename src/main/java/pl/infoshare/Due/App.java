package pl.infoshare.Due;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

        //Zadanie 1

        /*
        String[] Imiona=new String[5];
        Imiona[0]="Kasia";
        Imiona[1]="Basia";
        Imiona[2]="Asia";
        Imiona[3]="Stasia";
        Imiona[4]="Ola";

        PrintWriter pw = new PrintWriter("./Imiona.txt");
        for (String imie:
             Imiona) {
            pw.print(imie + "\n");
        }
        pw.close();
    */

     //Zadanie 1 na List<String>

     /*
        List<String> list = Files.readAllLines(Paths.get("./Imiona.txt"));

        Files.write(Paths.get("./TMP"), list);
     */

     //Zadanie 2

        /*

        System.out.println("Podaj imie: ");
        Scanner sc = new Scanner(System.in);
        String imie=sc.nextLine();

        System.out.println("Podaj nazwisko: ");
        Scanner sc1 = new Scanner(System.in);
        String nazwisko=sc.nextLine();

        PrintWriter pw = new PrintWriter("./Imie_i_Nazwisko");
        pw.print(imie + " ");
        pw.print(nazwisko);
        pw.close();

        */

        //Zadanie 3

        /*


       // for(int k=1;k<=2;k++)
      //  {
            int[] numbers1 = new int[100];
            Random r1 = new Random();

            //dziadoskie robienie foreacha z fora
            int i1 = 0;
            for (int num : numbers1) {
                numbers1[i1] = r1.nextInt(100) + 1;
                i1++;
            }
            PrintWriter pw1 = new PrintWriter("./Liczby1.txt");
            for (int numerki : numbers1) {
                pw1.print(numerki + "\n");
            }
            pw1.close();

        int[] numbers2 = new int[100];
        Random r2 = new Random();

        //dziadoskie robienie foreacha z fora
        int i2 = 0;
        for (int num : numbers2) {
            numbers2[i2] = r2.nextInt(100) + 1;
            i2++;
        }
        PrintWriter pw2 = new PrintWriter("./Liczby2.txt");
        for (int numerki : numbers2) {
            pw2.print(numerki + "\n");
        }
        pw2.close();

        int counter=0;
        for (int num1:numbers1) {
            for (int num2:numbers2) {
                if (num1 == num2)
                    counter++;
                 }
            }
            System.out.println(counter);

      //  }

      */

        
      }
}



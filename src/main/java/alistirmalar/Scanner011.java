package alistirmalar;

import java.util.Scanner;

public class Scanner011 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
       int sayi1 =input.nextInt();
       int sayi2 = input.nextInt();

        System.out.print(sayi1+sayi2);

        System.out.println(sayi1*sayi2);

        System.out.println(sayi1/sayi2);

        System.out.println(sayi1-sayi2);

    }
}

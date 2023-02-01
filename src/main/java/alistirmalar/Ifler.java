package alistirmalar;

import java.util.Scanner;

public class Ifler {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir karakter");

        char ch = input.next().charAt(0);
        int num = input.nextInt();
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("buyuk harf...");
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("kucuk harf");
        } else {
            System.out.println("kucuk harf");
        }

        //example 2:

        if (num % 2 == 0) {
            System.out.println("cift sayi");
        } else {
            System.out.println("teksayi");
        }

        int num11 = input.nextInt();
        int sayi = input.nextInt();


        if (num11 > 0) {
            System.out.println("cift");
        } else if (num11 < 0) {
            System.out.println("negatif");

        } else {
            System.out.println("baskasi");
        }
    }
}

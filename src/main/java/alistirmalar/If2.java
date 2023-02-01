package alistirmalar;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("kacinci gun oldugunu giriniz");
        byte num = input.nextByte();

        if (num == 1) {
            System.out.println("sunday");
        } else if (num == 2) {
            System.out.println("manday");
        } else if (num == 3) {
            System.out.println("carsamba");
        } else if (num == 4) {
            System.out.println("persembe");
        } else if (num == 5) {
            System.out.println("cuma");
        } else if (num == 6) {
            System.out.println("cumartesi");
        } else {
            System.out.println(" hatali giris yaptiniz Lutfen 1 ile 6 arasinda bir sayi giriniz");
        }


    }
}

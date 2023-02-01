package alistirmalar;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Alistir {
    public static void main(String[] args) {

        /*
              Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Alemci ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */


        Scanner input = new Scanner(System.in);
        System.out.println("passwirdunuzu giriniz");
        String pwd =input.nextLine();

        char ilkHarf = pwd.charAt(0);

        if( ilkHarf>='A' && ilkHarf<='Z') {

            if (ilkHarf=='A'){

                System.out.println("gecerli Password");
            }else{
                System.out.println("gecersiz password cunku buyuk harf A degil");
            }


        } else if (ilkHarf>='a' && ilkHarf<='z' ) {

            if (ilkHarf =='z'){
                System.out.println("gecerli password");

            }else{
                System.out.println(" gecersiz password cunku harf  'z'  degil ");
            }
        }else{
            System.out.println("ilk karakter harf olmali");
        }

        for (int i = 100; i >=50; i--) {
            if (i>50){
                System.out.println(i);
            }


        }

        }



    }



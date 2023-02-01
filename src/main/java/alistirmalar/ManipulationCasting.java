package alistirmalar;

import java.util.Locale;

public class ManipulationCasting {
    public static void main(String[] args) {



        byte age =12;
        int ageInt= age; //AUTOWIDENING

        long weight =234;
        short weightInt =(short)weight;

        double number=12.234;
        short numberShort=(short) number;//buyuk kutuyu kucuge sigdirdik

        short num =260;
        byte numByte =(byte)num;

        int a=12;
        int b=5;

        int temp=0;// swap yer degistirme
         temp =a;
         a=b;
         b=temp;
        System.out.println("a: " + a);

        String s ="java is easy";

      String uper = s.toUpperCase();

        System.out.println(uper);

           char firstChar =s.charAt(0);
        System.out.println(firstChar);

        char second=s.charAt(1);
       char last= s.charAt(10);
        System.out.println("" +second+last);//as
        
        
       int sLength = s.length();
        System.out.println("sLength = " + sLength);//12

        String ilk = s.substring(0,4);
        System.out.println(ilk);
        String iki = s.substring(5,7);
        System.out.println(iki);
        String easy = s.substring(8,12);
        System.out.println(easy);
        String sub = s.substring(0,12);
        System.out.println("sub = " + sub);

       String sub2 = s.substring(8);
        System.out.println(sub2);

        boolean mon = s.contains("money");// money varmi -icerir mi
        System.out.println(mon);
          String s12 ="   ALi can"    ;
           String trim = s12.trim();
         System.out.println(trim);


    }

}

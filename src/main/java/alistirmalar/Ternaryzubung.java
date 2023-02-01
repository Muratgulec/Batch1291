package alistirmalar;

public class Ternaryzubung {
    public static void main(String[] args) {

        int a = 5;
        a += 2;
        System.out.println(a);//increment 7

        int b = 10;
        b += 5;
        b += 5;
        System.out.println(b);

        int c = 15;
        c -= 10;
        System.out.println(c);//decrement 5
        int m = 15;
        int n = ++m;// m=16 n=16 done

        int s = 10;
        int r = 20;
        int k1 = s < 7 ? a++ : b++;
        System.out.println(k1);

        int o = 5;
        int p = -6;
        Object r3 = (o > 0 && p > 0) || (o < 0 && p < 0) ? o * p : "farkli isaretler  ";

        System.out.println(r3);

        //  sayinin uc basamakli olup olmadigi kontrol edelim.
        int h = 436;

        String u = h > 99 && h < 1000 ? p + "uc basamakli" : p + "uc basamakli degil";
        System.out.println(u);

        String day = "sali";

        if (day.equalsIgnoreCase("pazartesi")) {
            System.out.println(1);
        } else if (day.equalsIgnoreCase("sali")) {
            System.out.println(2);
        } else if (day.equalsIgnoreCase("carsmba")) {
            System.out.println(4);
        } else if (day.equalsIgnoreCase("persembe")) {
            System.out.println(5);
        } else if (day.equalsIgnoreCase("cuma")) {
            System.out.println(6);
        }else {
            System.out.println("lutfen gecerli bir gun giriniz");
        }






    }


}

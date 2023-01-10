package day05typecastingstringmanipulations;

public class alistirma {
    public static void main(String[] args) {


        int b =10;
        b +=5;
        System.out.println(b);

        int c =10;
        c -=5;
        System.out.println(c);
        int d =12;
        d *=2;
        System.out.println("d = " + d);


        int e=32;
        e /=2;
        System.out.println("e = " + e);

        int a=10;
        int k =20;
         int r1 = a<b ? a++: ++b;
        System.out.println(r1);
        System.out.println(a);
        System.out.println("r1 = " + r1);

         int m =5;
         int n =6;

        //Object h1 =(m>0 && n>0) || (m<0 && n<0) ? m+n :"farkli sayidir";
        System.out.println(m+n);


        String s = "Learn Java earn money";
        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.

            boolean son = s.endsWith("money");
            System.out.println(son);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String  s3 = s.replace("money",  "dollar");
        System.out.println(s3);

       // Example 13: "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz.

            String ef = s.replace("earn","win");
        System.out.println(ef);



        //Example 4: "s" String'indeki "a" harflerini "*" a ceviriniz.

        String fe = s.replace("a", "*");
        System.out.println(fe);
        System.out.println(fe);
        System.out.println(fe);



        }











    }


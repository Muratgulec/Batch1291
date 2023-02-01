package practice_nighttime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OlineAlisveris {


    static List<String> urunListesi=new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static  double toplamOdeme;
    static  Scanner input = new Scanner(System.in);



    public static void main(String[] args) {

        urunListesi.add("ayakkabi : urun kodu : 1");
        urunListesi.add("canta    : urun kodu : 2");
        urunListesi.add("saat      : urun kodu : 3");
        urunListesi.add("bilezik   : urun kodu : 4");
        urunListesi.add("toka     : urun kodu :  5");


        urunFiyatlari.add(10.0);
        urunFiyatlari.add(20.0);
        urunFiyatlari.add(30.0);
        urunFiyatlari.add(15.0);
        urunFiyatlari.add(60.0);


        System.out.println("urunListesi =" + urunListesi);

        musteriSecim();



    }

    private static void musteriSecim() {
        System.out.println("lutfen sectiginiz urunun kodunu giriniz");
        int secim = input.nextInt();
        System.out.println("sectiginiz urunden kac adet alacaksiniz");
        int adet = input.nextInt();


        double urunTutari = adet*urunFiyatlari.get(secim-1);


        toplamOdeme+=urunTutari;
        System.out.println("Alisverse devam ise 1: \nodeme icin 2: basin");
        int devammi= input.nextInt();



    }


}

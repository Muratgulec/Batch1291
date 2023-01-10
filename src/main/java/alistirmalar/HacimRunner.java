package alistirmalar;

public class HacimRunner {

    public static void main(String[] args) {





        Hacim hacim =new Hacim();//obje yaptik


        int kup=hacim.hacimHesapla(5);
        int karePrizma=hacim.hacimHesapla(5,6);
        int dikdortgenPrizma=hacim.hacimHesapla(5,6,7);

        System.out.println("kup = " + kup);
        System.out.println("karePrizma = " + karePrizma);
        System.out.println("dikdortgenPrizma = " + dikdortgenPrizma);

    }
}
